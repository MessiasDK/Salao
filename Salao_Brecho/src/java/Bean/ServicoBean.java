/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ServicoDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelos.Servico;

/**
 *
 * @author DELL
 */
@ManagedBean
@RequestScoped
public class ServicoBean {
private Servico servico;

    private boolean skip;
    private List<Servico> servicos;

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public List<Servico> getServicos() {
        ServicoDAO dao=new ServicoDAO();
        servicos=dao.apresentarServico();
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
    
    /**
     * Creates a new instance of ServicoBean
     */
    public ServicoBean() {
        servico=new Servico();
        
    }

    public void inserir(){
        ServicoDAO dao=new ServicoDAO();
        dao.inserirServico(servico);
        servico=new Servico();
        addMessage("Servico inserido com sucesso");
    } 
    public void modificar(){
        ServicoDAO dao=new ServicoDAO();
        dao.actualizarServico(servico);
        servico=new Servico();
        addMessage("Servico modificado com sucesso");
    }
        public void eliminar(){
        ServicoDAO dao=new ServicoDAO();
        dao.apagarServico(servico);
        servico=new Servico();
        addMessage("Servico eliminado com sucesso");
    }
    public void addMessage(String summary){
        FacesMessage messagem=new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, messagem);
    }
}
