/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.principal;

import Visao.paineis.pnlEstoque;
import java.awt.Toolkit;
import javax.swing.JFrame;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Tomas Mufume
 */
public class Menu extends javax.swing.JFrame {
    pnlEstoque pe = new pnlEstoque();
    /**
     * Creates new form Menu
     */
    public Menu() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        pe.carregarProdutos();
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nt.png")));
        rsutilities.RSUtilities.setCentrarVentana(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btVendas = new rojerusan.RSButtonIconI();
        btInicio = new rojerusan.RSButtonIconI();
        btClientes = new rojerusan.RSButtonIconI();
        btFornecedores = new rojerusan.RSButtonIconI();
        btEstoque = new rojerusan.RSButtonIconI();
        btUsuarios = new rojerusan.RSButtonIconI();
        btConfiguraoes = new rojerusan.RSButtonIconI();
        btSobre = new rojerusan.RSButtonIconI();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        pnlInicio1 = new Visao.paineis.pnlInicio();
        pnlVendas1 = new Visao.paineis.pnlVendas();
        pnlClientes1 = new Visao.paineis.pnlClientes();
        pnlFornecedores1 = new Visao.paineis.PnlFornecedores();
        pnlEstoque1 = new Visao.paineis.pnlEstoque();
        pnlUsuarios1 = new Visao.paineis.pnlUsuarios();
        pnlConfiguracoes1 = new Visao.paineis.pnlConfiguracoes();
        pnlSobre1 = new Visao.paineis.pnlSobre();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Stock - Tchikupene Bottle Store");

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 153, 153));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 102, 102));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.HORIZONTAL);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/go.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        btVendas.setBackground(new java.awt.Color(0, 102, 102));
        btVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Sell Stock_50px.png"))); // NOI18N
        btVendas.setText("VENDAS");
        btVendas.setColorHover(new java.awt.Color(102, 102, 102));
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });

        btInicio.setBackground(new java.awt.Color(0, 102, 102));
        btInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Home_50px.png"))); // NOI18N
        btInicio.setText("INÍCIO");
        btInicio.setColorHover(new java.awt.Color(102, 102, 102));
        btInicio.setSelected(true);
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        btClientes.setBackground(new java.awt.Color(0, 102, 102));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/User Groups_100px.png"))); // NOI18N
        btClientes.setText("CLIENTES");
        btClientes.setToolTipText("");
        btClientes.setColorHover(new java.awt.Color(102, 102, 102));
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btFornecedores.setBackground(new java.awt.Color(0, 102, 102));
        btFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Delivery_50px.png"))); // NOI18N
        btFornecedores.setText("FORNECEDORES");
        btFornecedores.setColorHover(new java.awt.Color(102, 102, 102));
        btFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedoresActionPerformed(evt);
            }
        });

        btEstoque.setBackground(new java.awt.Color(0, 102, 102));
        btEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Trolley_50px.png"))); // NOI18N
        btEstoque.setText("ESTOQUE");
        btEstoque.setColorHover(new java.awt.Color(102, 102, 102));
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });

        btUsuarios.setBackground(new java.awt.Color(0, 102, 102));
        btUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/User Account_100px.png"))); // NOI18N
        btUsuarios.setText("USUÁRIOS");
        btUsuarios.setColorHover(new java.awt.Color(102, 102, 102));
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });

        btConfiguraoes.setBackground(new java.awt.Color(0, 102, 102));
        btConfiguraoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Settings_50px.png"))); // NOI18N
        btConfiguraoes.setText("CONFIGURAÇÕES");
        btConfiguraoes.setColorHover(new java.awt.Color(102, 102, 102));
        btConfiguraoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiguraoesActionPerformed(evt);
            }
        });

        btSobre.setBackground(new java.awt.Color(0, 102, 102));
        btSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/About_50px.png"))); // NOI18N
        btSobre.setText("SOBRE NÓS");
        btSobre.setColorHover(new java.awt.Color(102, 102, 102));
        btSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btConfiguraoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btConfiguraoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSlider.setBackground(new java.awt.Color(102, 102, 102));

        pnlInicio1.setName("pnlInicio1"); // NOI18N
        pnlSlider.add(pnlInicio1, "card2");

        pnlVendas1.setName("pnlVendas1"); // NOI18N
        pnlSlider.add(pnlVendas1, "card5");

        pnlClientes1.setName("pnlClientes1"); // NOI18N
        pnlSlider.add(pnlClientes1, "card3");

        pnlFornecedores1.setName("pnlFornecedores1"); // NOI18N
        pnlSlider.add(pnlFornecedores1, "card4");

        pnlEstoque1.setName("pnlEstoque1"); // NOI18N
        pnlSlider.add(pnlEstoque1, "card6");

        pnlUsuarios1.setName("pnlUsuarios1"); // NOI18N
        pnlSlider.add(pnlUsuarios1, "card7");

        pnlConfiguracoes1.setName("pnlConfiguracoes1"); // NOI18N
        pnlSlider.add(pnlConfiguracoes1, "card8");

        pnlSobre1.setName("pnlSobre1"); // NOI18N
        pnlSlider.add(pnlSobre1, "card9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        if(!btInicio.isSelected()){
            btInicio.setSelected(true);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected(false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlInicio1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btInicioActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
       if(!btClientes.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected(false);
            btClientes.setSelected(true);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlClientes1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btClientesActionPerformed

    private void btFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedoresActionPerformed
      if(!btFornecedores.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected( true);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlFornecedores1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btFornecedoresActionPerformed

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
       if(!btVendas.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(true);
            btEstoque.setSelected(false);
            btFornecedores.setSelected( false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlVendas1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btVendasActionPerformed
    
    
    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
        if(!btEstoque.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(true);
            btFornecedores.setSelected( false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlEstoque1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btEstoqueActionPerformed
    
    
    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
       if(!btUsuarios.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected( false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(true);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlUsuarios1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void btConfiguraoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiguraoesActionPerformed
       if(!btConfiguraoes.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected( false);
            btClientes.setSelected(false);
            btSobre.setSelected(false);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(true);
            
            pnlSlider.setPanelSlider(1, pnlConfiguracoes1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btConfiguraoesActionPerformed

    private void btSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSobreActionPerformed
        if(!btSobre.isSelected()){
            btInicio.setSelected(false);
            btVendas.setSelected(false);
            btEstoque.setSelected(false);
            btFornecedores.setSelected( false);
            btClientes.setSelected(false);
            btSobre.setSelected(true);
            btUsuarios.setSelected(false);
            btConfiguraoes.setSelected(false);
            
            pnlSlider.setPanelSlider(1, pnlSobre1, rojeru_san.RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btClientes;
    private rojerusan.RSButtonIconI btConfiguraoes;
    private rojerusan.RSButtonIconI btEstoque;
    private rojerusan.RSButtonIconI btFornecedores;
    private rojerusan.RSButtonIconI btInicio;
    private rojerusan.RSButtonIconI btSobre;
    private rojerusan.RSButtonIconI btUsuarios;
    private rojerusan.RSButtonIconI btVendas;
    private Visao.paineis.pnlClientes pnlClientes1;
    private Visao.paineis.pnlConfiguracoes pnlConfiguracoes1;
    private Visao.paineis.pnlEstoque pnlEstoque1;
    private Visao.paineis.PnlFornecedores pnlFornecedores1;
    private Visao.paineis.pnlInicio pnlInicio1;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private Visao.paineis.pnlSobre pnlSobre1;
    private Visao.paineis.pnlUsuarios pnlUsuarios1;
    private Visao.paineis.pnlVendas pnlVendas1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables
}
