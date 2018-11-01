/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.VendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class VendasProdutosControle {
     private VendasProdutosDao daoVendasProdutos = new VendasProdutosDao();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(VendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * return ModelVendasProdutos
    */
    public VendasProdutos getVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProduto
    * return ArrayList
    */
    public ArrayList<VendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(VendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }
    
}
