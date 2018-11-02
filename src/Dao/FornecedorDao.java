/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Cocexao.Conexao;
import Modelo.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author FLAVIO RICARDO
 */
public class FornecedorDao extends Conexao{

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorDAO(Fornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_fornecedor ("
                    + "pk_idfornecedor,"
                    + "nome,"
                    + "morada,"
                    + "contacto,"
                    + "email"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getIdfornecedor() + "',"
                    + "'" + pModelFornecedor.getNome() + "',"
                    + "'" + pModelFornecedor.getMorada() + "',"
                    + "'" + pModelFornecedor.getContacto() + "',"
                    + "'" + pModelFornecedor.getEmail() + "'"
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
    * recupera Fornecedor
    * @param pIdfornecedor
    * return ModelFornecedor
    */
    public Fornecedor getFornecedorDAO(int pIdfornecedor){
       Fornecedor modelFornecedor = new Fornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_idfornecedor,"
                    + "nome,"
                    + "morada,"
                    + "contacto,"
                    + "email"
                 + " FROM"
                     + " tb_fornecedor"
                 + " WHERE"
                     + " pk_idfornecedor = '" + pIdfornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setIdfornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setMorada(this.getResultSet().getString(3));
                modelFornecedor.setContacto(this.getResultSet().getInt(4));
                modelFornecedor.setEmail(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * return ArrayList
    */
    public ArrayList<Fornecedor> getListaFornecedorDAO(){
        ArrayList<Fornecedor> listamodelFornecedor = new ArrayList();
        Fornecedor modelFornecedor = new Fornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_idfornecedor,"
                    + "nome,"
                    + "morada,"
                    + "contacto,"
                    + "email"
                 + " FROM"
                     + " tb_fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new Fornecedor();
                modelFornecedor.setIdfornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setMorada(this.getResultSet().getString(3));
                modelFornecedor.setContacto(this.getResultSet().getInt(4));
                modelFornecedor.setEmail(this.getResultSet().getString(5));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorDAO(Fornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_fornecedor SET "
                    + "pk_idfornecedor = '" + pModelFornecedor.getIdfornecedor() + "',"
                    + "nome = '" + pModelFornecedor.getNome() + "',"
                    + "morada = '" + pModelFornecedor.getMorada() + "',"
                    + "contacto = '" + pModelFornecedor.getContacto() + "',"
                    + "email = '" + pModelFornecedor.getEmail() + "'"
                + " WHERE "
                    + "pk_idfornecedor = '" + pModelFornecedor.getIdfornecedor() + "'"
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
    * exclui Fornecedor
    * @param pIdfornecedor
    * return boolean
    */
    public boolean excluirFornecedorDAO(int pIdfornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_fornecedor "
                + " WHERE "
                    + "pk_idfornecedor = '" + pIdfornecedor + "'"
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

