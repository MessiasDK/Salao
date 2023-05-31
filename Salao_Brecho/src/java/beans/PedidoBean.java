package beans;


import DAO.PedidoDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import modelos.Pedido;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PedidoBean {
private Pedido pedido;

    private boolean skip;
    private List<Pedido> pedidos;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<Pedido> getPedidos() {
        PedidoDAO dao=new PedidoDAO();
        pedidos=dao.apresentarPedido();
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    /**
     * Creates a new instance of PedidoBean
     */
    public PedidoBean() {
        pedido=new Pedido();
        
    }

    public void inserir(){
        PedidoDAO dao=new PedidoDAO();
        dao.inserirPedido(pedido);
        pedido=new Pedido();
        addMessage("Pedido inserido com sucesso");
    } 
    public void modificar(){
        PedidoDAO dao=new PedidoDAO();
        dao.actualizarPedido(pedido);
        pedido=new Pedido();
        addMessage("Pedido modificado com sucesso");
    }
        public void eliminar(){
        PedidoDAO dao=new PedidoDAO();
        dao.apagarPedido(pedido);
        pedido=new Pedido();
        addMessage("Pedido eliminado com sucesso");
    }
    public void addMessage(String summary){
        FacesMessage messagem=new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, messagem);
    }
    
    
    
    

    
    
    
    
    
    
}
