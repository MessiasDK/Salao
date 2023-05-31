package modelos;
// Generated May 31, 2023 9:40:29 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private int id;
     private String nome;
     private Date marcacao;
     private int idCliente;
     private int idServico;
     private double preco;

    public Pedido() {
    }

    public Pedido(int id, String nome, Date marcacao, int idCliente, int idServico, double preco) {
       this.id = id;
       this.nome = nome;
       this.marcacao = marcacao;
       this.idCliente = idCliente;
       this.idServico = idServico;
       this.preco = preco;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getMarcacao() {
        return this.marcacao;
    }
    
    public void setMarcacao(Date marcacao) {
        this.marcacao = marcacao;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdServico() {
        return this.idServico;
    }
    
    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }




}


