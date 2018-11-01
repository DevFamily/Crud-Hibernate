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
public class Fornecedor {
    private int idfornecedor;
    private String nome;
    private String morada;
    private int contacto;
    private String email;

    /**
    * Construtor
    */
    public Fornecedor(){
    }

    /**
    * seta o valor de idfornecedor
    * @param pIdfornecedor
    */
    public void setIdfornecedor(int pIdfornecedor){
        this.idfornecedor = pIdfornecedor;
    }
    /**
    * return pk_idfornecedor
    */
    public int getIdfornecedor(){
        return this.idfornecedor;
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
    * seta o valor de morada
    * @param pMorada
    */
    public void setMorada(String pMorada){
        this.morada = pMorada;
    }
    /**
    * return morada
    */
    public String getMorada(){
        return this.morada;
    }

    /**
    * seta o valor de contacto
    * @param pContacto
    */
    public void setContacto(int pContacto){
        this.contacto = pContacto;
    }
    /**
    * return contacto
    */
    public int getContacto(){
        return this.contacto;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * return email
    */
    public String getEmail(){
        return this.email;
    }
    
}
