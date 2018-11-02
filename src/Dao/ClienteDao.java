/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Cocexao.Conexao;
import Cocexao.Conexao;
import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class ClienteDao extends Conexao{
    
      /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(Cliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_cliente("
                    + "cl_nome,"
                    + "cl_morada,"
                    + "cl_contacto,"
                    + "cl_email"
                    + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getMorada() + "',"
                    + "'" + pModelCliente.getContacto()+"',"
                    + "'" + pModelCliente.getEmail() + "'"
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
    * recupera Cliente
    * @param pIdCliente
    * return ModelCliente
    */
    public Cliente retornarClienteDAO(int pIdCliente){
        Cliente modelCliente = new Cliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cl_idcliente,"
                    + "cl_nome,"
                    + "cl_morada,"
                    + "cl_contacto,"
                    + "cl_email"
                 + " FROM"
                     + " tb_cliente"
                 + " WHERE"
                     + " cl_idcliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setMorada(this.getResultSet().getString(3));
                modelCliente.setContacto(this.getResultSet().getInt(4));
                modelCliente.setEmail(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * return ArrayList
    */
    public ArrayList<Cliente> retornarListaClienteDAO(){
        ArrayList<Cliente> listamodelCliente = new ArrayList();
        Cliente modelCliente = new Cliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "cl_idcliente,"
                    + "cl_nome,"
                    + "cl_morada,"
                    + "cl_contacto,"
                    + "cl_email"
                 + " FROM"
                     + " tb_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new Cliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setMorada(this.getResultSet().getString(3));
                modelCliente.setContacto(this.getResultSet().getInt(4));
                modelCliente.setEmail(this.getResultSet().getString(5));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(Cliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_cliente SET "
                    + "cl_nome = '" + pModelCliente.getNome() + "',"
                    + "cl_morada = '" + pModelCliente.getMorada() + "',"
                    + "cl_contacto = '" + pModelCliente.getContacto() + "',"
                    + "cl_email = '" + pModelCliente.getEmail() + "'"
                + " WHERE "
                    + "cl_idcliente = '" + pModelCliente.getIdCliente() + "'"
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
    * exclui Cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_cliente "
                + " WHERE "
                    + "cl_idcliente = '" + pIdCliente + "'"
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
