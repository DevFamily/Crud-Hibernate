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
public class UsuarioDao extends Conexao{
    
    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioDAO(Usuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_usuario ("
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha,"
                    + "us_acesso"
                + ") VALUES ("
                    + "'"+pModelUsuario.getNome()+"',"
                    + "'"+pModelUsuario.getLogin()+"',"
                    + "'"+pModelUsuario.getSenha()+"',"
                    + "'"+pModelUsuario.getAcesso()+"'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuario
    * @param pIdusuario
    * return ModelUsuario
    */
    public Usuario retornarUsuarioDAO(int pIdusuario){
        Usuario modelUsuario = new Usuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "us_idusuario,"
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha,"
                    + "us_acesso"
                 + " FROM tb_usuario WHERE us_idusuario = '"+pIdusuario+"';");

            while(this.getResultSet().next()){
                modelUsuario.setIdusuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setLogin(this.getResultSet().getString(3));
                modelUsuario.setSenha(this.getResultSet().getString(4));
                modelUsuario.setAcesso(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * return ArrayList
    */
    public ArrayList<Usuario> retornarListaUsuarioDAO(){
        ArrayList<Usuario> listamodelUsuario = new ArrayList();
        Usuario modelUsuario = new Usuario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "us_idusuario,"
                    + "us_nome,"
                    + "us_login,"
                    + "us_senha,"
                    + "us_acesso"
                 + " FROM tb_usuario;");

            while(this.getResultSet().next()){
                modelUsuario = new Usuario();
                modelUsuario.setIdusuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setLogin(this.getResultSet().getString(3));
                modelUsuario.setSenha(this.getResultSet().getString(4));
                modelUsuario.setAcesso(this.getResultSet().getString(5));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioDAO(Usuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tb_usuario SET "
                    + "nome = '" + pModelUsuario.getNome() + "',"
                    + "login = '" + pModelUsuario.getLogin() + "',"
                    + "senha = '" + pModelUsuario.getSenha() + "',"
                    + "acesso = '" + pModelUsuario.getAcesso() + "'"
                + " WHERE us_idusuario = '"+pModelUsuario.getIdusuario()+"'"
              
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Usuario
    * @param pIdusuario
    * return boolean
    */
    public boolean excluirUsuarioDAO(int pIdusuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_usuario WHERE us_idusuario = '" + pIdusuario + "'"
               
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
}
