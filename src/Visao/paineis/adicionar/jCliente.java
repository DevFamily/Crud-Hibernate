/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.paineis.adicionar;



import javax.swing.JOptionPane;



/**
 *
 * @author Tomas Mufume
 */
public class jCliente extends javax.swing.JFrame {

    /**
     * Creates new form jCliente
     */
    public jCliente() {
        initComponents();
         this.setLocationRelativeTo(null);
         
         
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new rojeru_san.RSMTextFull();
        txtMorada = new rojeru_san.RSMTextFull();
        txtContacto = new rojeru_san.RSMTextFull();
        txtEmail = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jlCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Cliente");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Add New_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 408, -1));

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtNome.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNome.setPlaceholder("");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 274, -1));

        txtMorada.setBackground(new java.awt.Color(204, 204, 204));
        txtMorada.setForeground(new java.awt.Color(0, 0, 0));
        txtMorada.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtMorada.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMorada.setPlaceholder("");
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 273, -1));

        txtContacto.setBackground(new java.awt.Color(204, 204, 204));
        txtContacto.setForeground(new java.awt.Color(0, 0, 0));
        txtContacto.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtContacto.setBotonColor(new java.awt.Color(0, 0, 0));
        txtContacto.setPlaceholder("");
        jPanel1.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 273, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtEmail.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEmail.setPlaceholder("");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 273, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Morada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 50, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 76, 42));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 76, 42));

        rSButton1.setBackground(new java.awt.Color(102, 102, 102));
        rSButton1.setText("Adicionar");
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 150, -1));

        rSButton2.setBackground(new java.awt.Color(102, 102, 102));
        rSButton2.setText("Cancelar");
        rSButton2.setColorHover(new java.awt.Color(255, 0, 102));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, -1));

        jlCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 396, -1, 21));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
         if ((txtEmail.getText().contains("@")) && 
(txtEmail.getText().contains(".")) && 
(!txtEmail.getText().contains(" "))) {
 
String usuario = new String(txtEmail.getText().substring(0, 
txtEmail.getText().lastIndexOf('@')));
 
            String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf
('@') + 1, txtEmail.getText().length()));
 
            if ((usuario.length() >=1) && (!usuario.contains("@")) && 
(dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >= 
1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {
 
            jlCliente.setText("");
 
            } else {
 
                jlCliente.setText("E-mail Inválido");
 
                jlCliente.requestFocus();
 
            }
 
        } else {
 
            jlCliente.setText("E-mail Inválido");
 
           jlCliente.requestFocus();
 
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
      
    }//GEN-LAST:event_rSButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlCliente;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSMTextFull txtContacto;
    private rojeru_san.RSMTextFull txtEmail;
    private rojeru_san.RSMTextFull txtMorada;
    private rojeru_san.RSMTextFull txtNome;
    // End of variables declaration//GEN-END:variables
 }
