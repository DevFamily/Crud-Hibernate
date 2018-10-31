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
public class Usuario {
    int idUsuario;
    String n_usuario;
    String nome;
    String morada;
    int Contacto;
    String email;
    String n_aceeso;

    public Usuario(int idUsuario, String n_usuario, String nome, String morada, int Contacto, String email, String n_aceeso) {
        this.idUsuario = idUsuario;
        this.n_usuario = n_usuario;
        this.nome = nome;
        this.morada = morada;
        this.Contacto = Contacto;
        this.email = email;
        this.n_aceeso = n_aceeso;
    }
    
    
}
