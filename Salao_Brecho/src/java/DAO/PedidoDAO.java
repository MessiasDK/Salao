/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelos.Pedido;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;



/**
 *
 * @author DELL
 */
public class PedidoDAO {
    public void inserirPedido(Pedido pedido) {
        Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(pedido);
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

    public void actualizarPedido(Pedido pedido) {
                Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(pedido);
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

    public void apagarPedido(Pedido pedido) {
               Session sessao=null;
        try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.delete(pedido);
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

    public List<Pedido> apresentarPedido() {
        Session sessao=null;
        List<Pedido>listaPedidos=null;
        try {
            sessao=HibernateUtil.getSessionFactory().openSession();
            Query query=sessao.createQuery("from Pedido");
            listaPedidos=(List<Pedido>)query.list();
            
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sessao!=null){
                sessao.close();
            }
        } 
        return listaPedidos;
    }
}
