package beans;


import DAO.ArtigoDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import modelos.Artigo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ArtigoBean {
private Artigo artigo;

    
    private List<Artigo> artigos;

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public List<Artigo> getArtigos() {
        ArtigoDAO dao=new ArtigoDAO();
        artigos=dao.apresentarArtigo();
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }
    
    /**
     * Creates a new instance of ArtigoBean
     */
    public ArtigoBean() {
        artigo=new Artigo();
        
    }

    public void inserir(){
        ArtigoDAO dao=new ArtigoDAO();
        dao.inserirArtigo(artigo);
        artigo=new Artigo();
        addMessage("Artigo inserido com sucesso");
    } 
    public void modificar(){
        ArtigoDAO dao=new ArtigoDAO();
        dao.actualizarArtigo(artigo);
        artigo=new Artigo();
        addMessage("Artigo modificado com sucesso");
    }
        public void eliminar(){
        ArtigoDAO dao=new ArtigoDAO();
        dao.apagarArtigo(artigo);
        artigo=new Artigo();
        addMessage("Artigo eliminado com sucesso");
    }
    public void addMessage(String summary){
        FacesMessage messagem=new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, messagem);
    }
    
    
    
    

    
    
    
    
    
    
}
