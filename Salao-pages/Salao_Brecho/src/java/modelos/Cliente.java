package modelos;
// Generated Jun 11, 2023 4:14:04 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int id;
     private String nome;
     private String apelido;
     private String endereco;
     private Date maracao;
     private String sexo;

    public Cliente() {
    }

    public Cliente(int id, String nome, String apelido, String endereco, Date maracao, String sexo) {
       this.id = id;
       this.nome = nome;
       this.apelido = apelido;
       this.endereco = endereco;
       this.maracao = maracao;
       this.sexo = sexo;
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
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Date getMaracao() {
        return this.maracao;
    }
    
    public void setMaracao(Date maracao) {
        this.maracao = maracao;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




}


