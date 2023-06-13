package modelos;
// Generated Jun 11, 2023 4:14:04 PM by Hibernate Tools 4.3.1



/**
 * Artigo generated by hbm2java
 */
public class Artigo  implements java.io.Serializable {


     private int id;
     private String nome;
     private double preco;
     private int quantidade;
   
     private String cor;
     private String tamanho;

    public Artigo() {
    }

    public Artigo(int id, String nome, double preco, int quantidade, String cor, String tamanho) {
       this.id = id;
       this.nome = nome;
       this.preco = preco;
       this.quantidade = quantidade;
      
       this.cor = cor;
       this.tamanho = tamanho;
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
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }




}

