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
public class VendaDao extends Conexao{
     /**
    * grava Venda
    * @param pModelVenda
    * return int
    */
    public int salvarVendaDAO(Venda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_vendas ("
                    + "fk_cliente,"
                    + "vd_data_venda,"
                    + "vd_valor_liquido,"
                    + "vd_valor_bruto,"
                    + "vd_desconto"
                + ") VALUES ("
                    + "'" + pModelVenda.getCliente() + "',"
                    + "'" + pModelVenda.getVdDataVenda() + "',"
                    + "'" + pModelVenda.getVdValorLiquido() + "',"
                    + "'" + pModelVenda.getVdValorBruto() + "',"
                    + "'" + pModelVenda.getVdDesconto() + "'"
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
    * recupera Venda
    * @param pIdVendas
    * return ModelVenda
    */
    public Venda getVendaDAO(int pIdVendas){
        Venda modelVenda = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "vd_data_venda,"
                    + "vd_valor_liquido,"
                    + "vd_valor_bruto,"
                    + "vd_desconto"
                 + " FROM"
                     + " tb_vendas"
                 + " WHERE"
                     + " pk_id_vendas = '" + pIdVendas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVendas(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVdDataVenda(this.getResultSet().getDate(3));
                modelVenda.setVdValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVdValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVdDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * return ArrayList
    */
    public ArrayList<Venda> getListaVendaDAO(){
        ArrayList<Venda> listamodelVenda = new ArrayList();
        Venda modelVenda = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "vd_data_venda,"
                    + "vd_valor_liquido,"
                    + "vd_valor_bruto,"
                    + "vd_desconto"
                 + " FROM"
                     + " tb_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new Venda();
                modelVenda.setIdVendas(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVdDataVenda(this.getResultSet().getDate(3));
                modelVenda.setVdValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVdValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVdDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * return boolean
    */
    public boolean atualizarVendaDAO(Venda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_vendas SET "
                    + "pk_id_vendas = '" + pModelVenda.getIdVendas() + "',"
                    + "fk_cliente = '" + pModelVenda.getCliente() + "',"
                    + "vd_data_venda = '" + pModelVenda.getVdDataVenda() + "',"
                    + "vd_valor_liquido = '" + pModelVenda.getVdValorLiquido() + "',"
                    + "vd_valor_bruto = '" + pModelVenda.getVdValorBruto() + "',"
                    + "vd_desconto = '" + pModelVenda.getVdDesconto() + "'"
                + " WHERE "
                    + "pk_id_vendas = '" + pModelVenda.getIdVendas() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Venda
    * @param pIdVendas
    * return boolean
    */
    public boolean excluirVendaDAO(int pIdVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_vendas "
                + " WHERE "
                    + "pk_id_vendas = '" + pIdVendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
}
