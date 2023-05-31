package beans;


import DAO.FuncionarioDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import modelos.Funcionario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class FuncionarioBean {
private Funcionario funcionario;

    private boolean skip;
    private List<Funcionario> funcionarios;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getFuncionarios() {
        FuncionarioDAO dao=new FuncionarioDAO();
        funcionarios=dao.apresentarFuncionario();
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    /**
     * Creates a new instance of FuncionarioBean
     */
    public FuncionarioBean() {
        funcionario=new Funcionario();
        
    }

    public void inserir(){
        FuncionarioDAO dao=new FuncionarioDAO();
        dao.inserirFuncionario(funcionario);
        funcionario=new Funcionario();
        addMessage("Funcionario inserido com sucesso");
    } 
    public void modificar(){
        FuncionarioDAO dao=new FuncionarioDAO();
        dao.actualizarFuncionario(funcionario);
        funcionario=new Funcionario();
        addMessage("Funcionario modificado com sucesso");
    }
        public void eliminar(){
        FuncionarioDAO dao=new FuncionarioDAO();
        dao.apagarFuncionario(funcionario);
        funcionario=new Funcionario();
        addMessage("Funcionario eliminado com sucesso");
    }
    public void addMessage(String summary){
        FacesMessage messagem=new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, messagem);
    }
    
    
    
    

    
    
    
    
    
    
}
