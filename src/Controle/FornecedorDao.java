/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;


import Modelo.Fornecedor;
import Modelo.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Atália Mufume
 */
public class FornecedorDao {
     public static boolean criarFornecedor(String nome, String morada, int contacto, String email){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Fornecedor  fornecedor = new Fornecedor();
        fornecedor.setNome(nome);
        fornecedor.setMorada(morada);
        fornecedor.setContacto(contacto);
        fornecedor.setEmail(email);
        sessao.save(fornecedor);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
        
    
   }
    
    
     public static boolean actualizarFornecedor(int id, String nome, String morada, int contacto, String email){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Fornecedor fornecedor = (Fornecedor)sessao.createCriteria(Fornecedor.class)
        .add(Restrictions.eq("idfornecedor", id)).uniqueResult();
        fornecedor.setIdfornecedor(id);
        fornecedor.setNome(nome);
        fornecedor.setMorada(morada);
        fornecedor.setContacto(contacto);
        fornecedor.setEmail(email);
        sessao.update(fornecedor);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
     
     public static boolean eliminarFornecedor(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Fornecedor fornecedor = (Fornecedor)sessao.createCriteria(Fornecedor.class)
        .add(Restrictions.eq("idfornecedor", id)).uniqueResult();
        sessao.delete(fornecedor);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
    
    public static List<Fornecedor> ListarFornecedores(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Fornecedor> fornecedor = sessao.createCriteria(Fornecedor.class).list();
        return fornecedor;
        
    }
    
}
    

