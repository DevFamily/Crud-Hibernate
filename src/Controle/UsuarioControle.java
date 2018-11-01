/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class UsuarioControle {
    private UsuarioDao daoUsuario = new UsuarioDao();

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioController(Usuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdusuario
    * return ModelUsuario
    */
    public Usuario getUsuarioController(int pIdusuario){
        return this.daoUsuario.retornarUsuarioDAO(pIdusuario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pIdusuario
    * return ArrayList
    */
    public ArrayList<Usuario> getListaUsuarioController(){
        return this.daoUsuario.retornarListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioController(Usuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdusuario
    * return boolean
    */
    public boolean excluirUsuarioController(int pIdusuario){
        return this.daoUsuario.excluirUsuarioDAO(pIdusuario);
    }

    public boolean getValidarUsuarioController(Usuario pModelUsuario) {
       return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
         }
    
}
