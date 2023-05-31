package beans;


import DAO.ClienteDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import modelos.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClienteBean {
private Cliente cliente;

    private boolean skip;
    private List<Cliente> clientes;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        ClienteDAO dao=new ClienteDAO();
        clientes=dao.apresentarCliente();
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
        cliente=new Cliente();
        
    }

    public void inserir(){
        ClienteDAO dao=new ClienteDAO();
        dao.inserirCliente(cliente);
        cliente=new Cliente();
        addMessage("Cliente inserido com sucesso");
    } 
    public void modificar(){
        ClienteDAO dao=new ClienteDAO();
        dao.actualizarCliente(cliente);
        cliente=new Cliente();
        addMessage("Cliente modificado com sucesso");
    }
        public void eliminar(){
        ClienteDAO dao=new ClienteDAO();
        dao.apagarCliente(cliente);
        cliente=new Cliente();
        addMessage("Cliente eliminado com sucesso");
    }
    public void addMessage(String summary){
        FacesMessage messagem=new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, messagem);
    }
    
    
    
    

    
    
    
    
    
    
}
