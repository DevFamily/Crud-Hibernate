/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.splash;




import Controle.UsuarioControle;
import Modelo.Usuario;
import Visao.principal.Menu;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Atália Mufume
 */
public class Entrar extends javax.swing.JFrame {
    UsuarioControle controleUsuarios = new UsuarioControle();
    Usuario usuarios = new Usuario();

    /**
     * Creates new form Entrar
     */
    public Entrar() {
        initComponents();
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nt.png")));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new rojeru_san.RSMTextFull();
        btnEntrar = new rojeru_san.RSButton();
        txtSenha = new rojeru_san.RSMPassView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/splash/Male Use_100px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Senha :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 60, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/splash/Close Window_64px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, 40));

        txtLogin.setBackground(new java.awt.Color(102, 102, 102));
        txtLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtLogin.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtLogin.setBotonColor(new java.awt.Color(0, 0, 0));
        txtLogin.setPlaceholder("Introduzir o nome de Usuário");
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 320, -1));

        btnEntrar.setBackground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.setColorHover(new java.awt.Color(255, 0, 102));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, -1));

        txtSenha.setBackground(new java.awt.Color(102, 102, 102));
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtSenha.setBotonColor(new java.awt.Color(0, 0, 0));
        txtSenha.setPlaceholder("Introduzir a Senha");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(544, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       usuarios.setLogin(txtLogin.getText());
       usuarios.setSenha(String.valueOf(txtSenha.getPassword()));
        if(controleUsuarios.getValidarUsuarioController(usuarios)){
            new Menu().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Credenciais Inválidos","Aviso",JOptionPane.WARNING_MESSAGE);
        }
//       Menu p = new Menu();
//       p.setVisible(true);
//       this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSMTextFull txtLogin;
    private rojeru_san.RSMPassView txtSenha;
    // End of variables declaration//GEN-END:variables
}
