/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controle.Fornecedor;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Tomas Mufume
 */
public class DaoFornecedor {
     // Métodos definidos para classe DAOCliente
    // Lembre-se que SHIFT+ALT+F ajusa a endentação de todo o código automaticamente. 
 
    public void armazenar(Fornecedor fornecedor) {
 
        // AGORA É PRECISO ENVIAR O cliente PARA o BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.save(fornecedor);      // Acumula a operação de gravação do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Fornecedor armazenado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public void alterar(Fornecedor fornecedor) {
 
        // VAMOS ATUALIZAR O cliente PARA o BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.merge(fornecedor);      // Acumula a operação de alteração do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public void excluir(Fornecedor fornecedor) {
 
        // VAMOS EXCLUIR O cliente do BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.delete(fornecedor);    // Acumula a operação de exclusão do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public void listar() {
 
        // VAMOS listar OS clientes do BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 
       try {
 
            session.beginTransaction(); // Abre-se uma transação
            // Cria-se uma lista de fornecedores a partir do BD
            List listaFornecedores = session.createQuery("From Fornecedor").list();
            
            for (Iterator it = listaFornecedores.iterator(); it.hasNext();) {
                Fornecedor fornecedor = (Fornecedor) it.next();
                System.out.println("Nome do fornecedor: " + fornecedor.getId());
                System.out.println("Nome do fornecedor: " + fornecedor.getNomeFornecedor());
                System.out.println("Nome do fornecedor: " + fornecedor.getMoradaFornecedor());
                System.out.println("Nome do fornecedor: " + fornecedor.getEmailFornecedor());
                
            }
 
            JOptionPane.showMessageDialog(null, "Fornecedores listados com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
    
}
