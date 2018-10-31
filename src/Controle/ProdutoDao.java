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
public class ProdutoDao extends Conexao{

public int salvarProduto(Produto p) {
    try {
        this.conectar();
        return this.insertSQL("INSERT INTO tb_produto ("
                + "pd_produto, "
                 +"pd_quantidade,"
                + "pd_tipo_produto,"
                + "pd_p_compra,"
                + "pd_p_venda"
                + ") VALUES ("
                + "'"+p.getProduto()+"',"
                + "'"+p.getQuantidade()+"',"
                + "'"+p.getTipoProduto()+"',"
                + "'"+p.getpCompra()+"',"
                + "'"+p.getpVenda()+"'"
                        + ");"
                        
        );
        
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }finally{
        this.fecharConexao();
    }
}  

public boolean excluirProduto(int pIdProduto) {
    try{
        this.conectar();
        return  this.executarUpdateDeleteSQL(
        
        "DELETE FROM tb_produto WHERE pd_idproduto ='"+pIdProduto+"'"
        );
    }catch(Exception e){
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

public boolean alterarProduto(Produto p) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL("UPDATE tb_produto SET "
                + "pd_produto =' "+p.getProduto()+"',"
                 +"pd_quantidade ='"+p.getQuantidade()+"',"
                + "pd_tipo_produto ='"+p.getTipoProduto()+"',"
                + "pd_p_compra ='"+p.getpCompra()+"',"
                + "pd_p_venda ='"+p.getpVenda()+"'"
                + " WHERE pd_idproduto ='"+p.getIdProduto()+"'"
                    
        );
        
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
} 
//retornar o produto pelo codigo
public Produto retornarProduto(int pIdProduto){
    Produto prod = new Produto();
    try{
        this.conectar();
        this.executarSQL("SELECT "
                + "pd_idproduto, "
                + "pd_produto,"
                + "pd_quantidade,"
                + "pd_tipo_produto,"
                + "pd_p_compra,"
                + "pd_p_venda "
                + "FROM tb_produto WHERE pd_idproduto = '"+pIdProduto+"';");
        while (this.getResultSet().next()) {
           prod.setIdProduto(this.getResultSet().getInt(1));
           prod.setProduto(this.getResultSet().getString(2));
           prod.setQuantidade(this.getResultSet().getInt(3));
           prod.setTipoProduto(this.getResultSet().getString(4));
           prod.setpCompra(this.getResultSet().getDouble(5));
           prod.setpVenda(this.getResultSet().getDouble(6));
            
        }
        
    }catch(Exception e){
        e.printStackTrace();
        
    }finally{
        this.fecharConexao();
    }
    return prod;
}
   //retornar a lista de produtos
public ArrayList<Produto> retornarListaProduto(){
    ArrayList<Produto> listaProduto = new ArrayList<>();
    Produto prod = new Produto();
    try{
         this.conectar();
        this.executarSQL("SELECT "
                + "pd_idproduto,  "
                + "pd_produto,"
                + "pd_quantidade,"
                + "pd_tipo_produto,"
                + "pd_p_compra,"
                + "pd_p_venda "
                + "FROM tb_produto;");
        while (this.getResultSet().next()) {
           prod = new Produto();
           prod.setIdProduto(this.getResultSet().getInt(1));
           prod.setProduto(this.getResultSet().getString(2));
           prod.setQuantidade(this.getResultSet().getInt(3));
           prod.setTipoProduto(this.getResultSet().getString(4));
           prod.setpCompra(this.getResultSet().getDouble(5));
           prod.setpVenda(this.getResultSet().getDouble(6));
           listaProduto.add(prod);
    
}
}catch(Exception e){
    e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaProduto;
    
}
}