/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.paineis.adicionar;





/**
 *
 * @author Tomas Mufume
 */
public class jFornecedorEditar extends javax.swing.JFrame {

    /**
     * Creates new form jCliente
     */
    public jFornecedorEditar() {
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
        txtTelefone = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddFornecedor = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new rojeru_san.RSMTextFull();
        jlFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Fornecedor");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Add New_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 90));

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtNome.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNome.setPlaceholder("");
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 274, -1));

        txtMorada.setBackground(new java.awt.Color(204, 204, 204));
        txtMorada.setForeground(new java.awt.Color(255, 255, 255));
        txtMorada.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtMorada.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMorada.setPlaceholder("");
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 275, -1));

        txtTelefone.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtTelefone.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTelefone.setPlaceholder("");
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 270, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 57, 47));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Morada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 74, 42));

        btnAddFornecedor.setBackground(new java.awt.Color(102, 102, 102));
        btnAddFornecedor.setText("Adicionar");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, -1));

        rSButton2.setBackground(new java.awt.Color(102, 102, 102));
        rSButton2.setText("Cancelar");
        rSButton2.setColorHover(new java.awt.Color(255, 0, 102));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 74, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtEmail.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEmail.setPlaceholder("");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 271, -1));

        jlFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlFornecedor.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jlFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 403, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 410));

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
 
            jlFornecedor.setText("");
 
            } else {
 
               jlFornecedor.setText("E-mail Inválido");
 
                jlFornecedor.requestFocus();
 
            }
 
        } else {
 
            jlFornecedor.setText("E-mail Inválido");
 
           jlFornecedor.requestFocus();
 
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
      
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnAddFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlFornecedor;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSMTextFull txtEmail;
    private rojeru_san.RSMTextFull txtMorada;
    private rojeru_san.RSMTextFull txtNome;
    private rojeru_san.RSMTextFull txtTelefone;
    // End of variables declaration//GEN-END:variables
    

}         
