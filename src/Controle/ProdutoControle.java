/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Produto;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class ProdutoControle {
    private ProdutoDao produtoDao = new ProdutoDao();
    
    //Salvar Produtos controller
    public int salvarProdutoController(Produto p ){
        return this.produtoDao.salvarProduto(p);
       
    }
    //Excluir Produtos pelo codigo
    public boolean excluirProdutoController(int pCodigo){
        return this.produtoDao.excluirProduto(pCodigo);
    }
    // Alterar um produto
    public boolean alterarProdutoController(Produto p){
        return this.produtoDao.alterarProduto(p);
    }
    //retornar produto pelo codigo
    public Produto retornarProdutoController(int pCodigo){
        return this.produtoDao.retornarProduto(pCodigo );
    }
    // retornar uma lista de produtos 
    public  ArrayList <Produto> retornarListaProdutoController(){
        return this.produtoDao.retornarListaProduto();
    }
}
