/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelos.Artigo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;



/**
 *
 * @author DELL
 */
public class ArtigoDAO {
    public void inserirArtigo(Artigo artigo) {
        Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(artigo);
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

    public void actualizarArtigo(Artigo artigo) {
                Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(artigo);
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

    public void apagarArtigo(Artigo artigo) {
               Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(artigo);
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

    public List<Artigo> apresentarArtigo() {
        Session sessao=null;
        List<Artigo>listaArtigos=null;
        try {
            sessao=HibernateUtil.getSessionFactory().openSession();
            Query query=sessao.createQuery("from Artigo");
            listaArtigos=(List<Artigo>)query.list();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sessao!=null){
                sessao.close();
            }
        } 
        return listaArtigos;
    }
}
