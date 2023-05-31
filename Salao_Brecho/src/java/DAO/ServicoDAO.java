/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelos.Servico;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;



/**
 *
 * @author DELL
 */
public class ServicoDAO {
    public void inserirServico(Servico servico) {
        Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(servico);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public void actualizarServico(Servico servico) {
                Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(servico);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public void apagarServico(Servico servico) {
               Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(servico);
            sessao.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            sessao.getTransaction().rollback();
        }finally{
            if(sessao!=null){
                sessao.close();
            }
        }
    }

    public List<Servico> apresentarServico() {
        Session sessao=null;
        List<Servico>listaServicos=null;
        try {
            sessao=HibernateUtil.getSessionFactory().openSession();
            Query query=sessao.createQuery("from Servico");
            listaServicos=(List<Servico>)query.list();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sessao!=null){
                sessao.close();
            }
        } 
        return listaServicos;
    }
}
