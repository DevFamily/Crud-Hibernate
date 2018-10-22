/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.HibernateUtil;
import Modelo.Usuario;
import org.hibernate.Session;

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
    
}
