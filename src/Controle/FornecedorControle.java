/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class FornecedorControle {
    private FornecedorDao daoFornecedor = new FornecedorDao();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pIdfornecedor
    * return ModelFornecedor
    */
    public Fornecedor retornarFornecedorController(int pIdfornecedor){
        return this.daoFornecedor.retornarFornecedorDAO(pIdfornecedor);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pIdfornecedor
    * return ArrayList
    */
    public ArrayList<Fornecedor> retornarListaFornecedorController(){
        return this.daoFornecedor.retornarListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pIdfornecedor
    * return boolean
    */
    public boolean excluirFornecedorController(int pIdfornecedor){
        return this.daoFornecedor.excluirFornecedorDAO(pIdfornecedor);
    }
    
}
