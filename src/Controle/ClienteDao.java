/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import Modelo.HibernateUtil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Atália Mufume
 */
public class ClienteDao {
        public static boolean criarCliente(String nome, String morada, int contacto, String email){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setMorada(morada);
        cliente.setContacto(contacto);
        cliente.setEmail(email);
        sessao.save(cliente);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
        
    
   }
    
    
     public static boolean actualizarCliente(int id, String nome, String morada, int contacto, String email){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Cliente cliente = (Cliente)sessao.createCriteria(Cliente.class)
        .add(Restrictions.eq("idcliente", id)).uniqueResult();
        cliente.setIdcliente(id);
        cliente.setNome(nome);
        cliente.setMorada(morada);
        cliente.setContacto(contacto);
        cliente.setEmail(email);
        sessao.update(cliente);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
     
     public static boolean eliminarCliente(int id, String nome, String morada, int contacto, String email){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Cliente cliente = (Cliente)sessao.createCriteria(Cliente.class)
        .add(Restrictions.eq("idcliente", id)).uniqueResult();
        sessao.delete(cliente);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
    
    public static List<Cliente> ListarClientes(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Cliente> cliente = sessao.createCriteria(Cliente.class).list();
        return cliente;
        
    }
    
}
