/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.HibernateUtil;
import Modelo.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Tomas Mufume
 */
public class UsuarioDao {
    public static boolean criarUsuario(String n_usuario, String nome, String morada, int contacto, String email, String n_acesso){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Usuario usuario = new Usuario();
        usuario.setNUsuario(n_usuario);
        usuario.setNome(nome);
        usuario.setMorada(morada);
        usuario.setContacto(contacto);
        usuario.setEmail(email);
        usuario.setNAcesso(n_acesso);
        sessao.save(usuario);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
        
    
   }
    
    
     public static boolean actualizarUsuario(int id, String n_usuario, String nome, String morada, int contacto, String email, String n_acesso){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Usuario usuario = (Usuario)sessao.createCriteria(Usuario.class)
        .add(Restrictions.eq("idusuario", id)).uniqueResult();
        usuario.setIdusuario(id);
        usuario.setNUsuario(n_usuario);
        usuario.setNome(nome);
        usuario.setMorada(morada);
        usuario.setContacto(contacto);
        usuario.setEmail(email);
        usuario.setNAcesso(n_acesso);
        sessao.update(usuario);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
     
     public static boolean eliminarUsuario(int id){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try{
        Usuario usuario = (Usuario)sessao.createCriteria(Usuario.class)
        .add(Restrictions.eq("idusuario", id)).uniqueResult();
        sessao.delete(usuario);
        sessao.getTransaction().commit();
        
        return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
            sessao.getTransaction().rollback();
            return false;
        }
     }
    
    public static List<Usuario> ListarUsuarios(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
        return usuarios;
        
    }
}
