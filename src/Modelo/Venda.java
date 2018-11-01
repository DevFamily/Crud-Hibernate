/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Tomas Mufume
 */
public class Venda {
    
    private int idVendas;
    private int cliente;
    private Date vdDataVenda;
    private double vdValorLiquido;
    private double vdValorBruto;
    private double vdDesconto;

    /**
    * Construtor
    */
    public Venda(){}

    /**
    * seta o valor de idVendas
    * @param pIdVendas
    */
    public void setIdVendas(int pIdVendas){
        this.idVendas = pIdVendas;
    }
    /**
    * return pk_idVendas
    */
    public int getIdVendas(){
        return this.idVendas;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de vdDataVenda
    * @param pVdDataVenda
    */
    public void setVdDataVenda(Date pVdDataVenda){
        this.vdDataVenda = pVdDataVenda;
    }
    /**
    * return vdDataVenda
    */
    public Date getVdDataVenda(){
        return this.vdDataVenda;
    }

    /**
    * seta o valor de vdValorLiquido
    * @param pVdValorLiquido
    */
    public void setVdValorLiquido(double pVdValorLiquido){
        this.vdValorLiquido = pVdValorLiquido;
    }
    /**
    * return vdValorLiquido
    */
    public double getVdValorLiquido(){
        return this.vdValorLiquido;
    }

    /**
    * seta o valor de vdValorBruto
    * @param pVdValorBruto
    */
    public void setVdValorBruto(double pVdValorBruto){
        this.vdValorBruto = pVdValorBruto;
    }
    /**
    * return vdValorBruto
    */
    public double getVdValorBruto(){
        return this.vdValorBruto;
    }

    /**
    * seta o valor de vdDesconto
    * @param pVdDesconto
    */
    public void setVdDesconto(double pVdDesconto){
        this.vdDesconto = pVdDesconto;
    }
    /**
    * return vdDesconto
    */
    public double getVdDesconto(){
        return this.vdDesconto;
    }

    
}
