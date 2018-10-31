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
public class Produto {
    private int idProduto;
    private String produto;
    private int quantidade;
    private String tipoProduto;
    private double pCompra;
    private double pVenda;
    

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the pCompra
     */
    public double getpCompra() {
        return pCompra;
    }

    /**
     * @param pCompra the pCompra to set
     */
    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    /**
     * @return the pVenda
     */
    public double getpVenda() {
        return pVenda;
    }

    /**
     * @param pVenda the pVenda to set
     */
    public void setpVenda(double pVenda) {
        this.pVenda = pVenda;
    }
    
    
    
}
