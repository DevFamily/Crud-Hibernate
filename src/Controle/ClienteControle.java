/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Tomas Mufume
 */
public class ClienteControle {
     private ClienteDao daoCliente = new ClienteDao();

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteController(Cliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * return ModelCliente
    */
    public Cliente getClienteController(int pIdCliente){
        return this.daoCliente.retornarClienteDAO(pIdCliente);
    }

    /**
    * recupera uma lista deCliente
    * @param pIdCliente
    * return ArrayList
    */
    public ArrayList<Cliente> getListaClienteController(){
        return this.daoCliente.retornarListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(Cliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
    
}
