/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Venda;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class VendaControle {
    private VendaDao daoVenda = new VendaDao();

    /**
    * grava Venda
    * @param pModelVenda
    * return int
    */
    public int salvarVendaController(Venda pModelVenda){
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }

    /**
    * recupera Venda
    * @param pIdVendas
    * return ModelVenda
    */
    public Venda getVendaController(int pIdVendas){
        return this.daoVenda.getVendaDAO(pIdVendas);
    }

    /**
    * recupera uma lista deVenda
    * @param pIdVendas
    * return ArrayList
    */
    public ArrayList<Venda> getListaVendaController(){
        return this.daoVenda.getListaVendaDAO();
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * return boolean
    */
    public boolean atualizarVendaController(Venda pModelVenda){
        return this.daoVenda.atualizarVendaDAO(pModelVenda);
    }

    /**
    * exclui Venda
    * @param pIdVendas
    * return boolean
    */
    public boolean excluirVendaController(int pIdVendas){
        return this.daoVenda.excluirVendaDAO(pIdVendas);
    }
    
}
