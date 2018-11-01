/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Tomas Mufume
 */
public class Usuario {
    private int idusuario;
    private String nome;
    private String login;
    private String senha;
    private String acesso;

    /**
    * Construtor
    */
    public Usuario(){}

    /**
    * seta o valor de idusuario
    * @param pIdusuario
    */
    public void setIdusuario(int pIdusuario){
        this.idusuario = pIdusuario;
    }
    /**
    * return pk_idusuario
    */
    public int getIdusuario(){
        return this.idusuario;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * return senha
    */
    public String getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de acesso
    * @param pAcesso
    */
    public void setAcesso(String pAcesso){
        this.acesso = pAcesso;
    }
    /**
    * return acesso
    */
    public String getAcesso(){
        return this.acesso;
    }

   
    
    
}
