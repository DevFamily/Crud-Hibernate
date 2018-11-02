/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.paineis;

import Controle.FornecedorControle;
import Modelo.Fornecedor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author TM
 */
public class PnlFornecedores extends javax.swing.JPanel {
     ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    FornecedorControle controleFornecedores = new FornecedorControle();
    Fornecedor fornecedores = new Fornecedor();
    String saveUpdate ;

    /**
     * Creates new form PnVenda
     */
    public PnlFornecedores() {
        initComponents();
        carregarFornecedores();
        habilitarCampos(false);
       
        jScrollPane1.getViewport().setBackground(Color.white );
    }
    
    
   



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public  void carregarFornecedores(){
        listaFornecedores = controleFornecedores.retornarListaFornecedorController();
        DefaultTableModel modelo = (DefaultTableModel)tblFornecedor.getModel();
        modelo.setNumRows(0);
        //inserir clientes na tabelaa
        int cont = listaFornecedores.size();
        for (int i=0; i<cont; i++){
            modelo.addRow(new Object[]{
            listaFornecedores.get(i).getIdfornecedor(),
            listaFornecedores.get(i).getNome(),
            listaFornecedores.get(i).getMorada(),
            listaFornecedores.get(i).getContacto(),
            listaFornecedores.get(i).getEmail(),
        });
        }
        
    }
      
      public void habilitarCampos(boolean go){
          txtNomeFornecedor.setEnabled(go);
          txtMoradaFornecedor.setEnabled(go);
          txtEmailFornecedor.setEnabled(go);
          txtContactoFornecedor.setEnabled(go);
          bSalvarFornecedor.setEnabled(go);
          }
      
      public void clean(){
          txtNomeFornecedor.setText("");
          txtMoradaFornecedor.setText("");
          txtContactoFornecedor.setText("");
          txtEmailFornecedor.setText("");
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nFornecedor = new rojeru_san.RSButton();
        btactualizar = new rojeru_san.RSButton();
        btExcluirFornecedor = new rojeru_san.RSButton();
        bSalvarFornecedor = new rojeru_san.RSButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeFornecedor = new rojeru_san.RSMTextFull();
        jLabel12 = new javax.swing.JLabel();
        txtEmailFornecedor = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        txtMoradaFornecedor = new rojeru_san.RSMTextFull();
        txtContactoFornecedor = new rojeru_san.RSMTextFull();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new rojerusan.RSTableMetro();
        bCancelar = new rojeru_san.RSButton();
        btnPesquisar = new rojeru_san.RSButton();
        txtPesquisar = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 171));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORNECEDORES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Delivery_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nFornecedor.setBackground(new java.awt.Color(102, 102, 102));
        nFornecedor.setText("Novo");
        nFornecedor.setToolTipText("Novo Fornecedor");
        nFornecedor.setColorHover(new java.awt.Color(51, 51, 51));
        nFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nFornecedorActionPerformed(evt);
            }
        });

        btactualizar.setBackground(new java.awt.Color(102, 102, 102));
        btactualizar.setText("Actualizar");
        btactualizar.setToolTipText("Actualizar dados do Fornecedor");
        btactualizar.setColorHover(new java.awt.Color(51, 51, 51));
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });

        btExcluirFornecedor.setBackground(new java.awt.Color(102, 102, 102));
        btExcluirFornecedor.setText("Excluir");
        btExcluirFornecedor.setToolTipText("Excluir Fornecedor");
        btExcluirFornecedor.setColorHover(new java.awt.Color(51, 51, 51));
        btExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFornecedorActionPerformed(evt);
            }
        });

        bSalvarFornecedor.setBackground(new java.awt.Color(102, 102, 102));
        bSalvarFornecedor.setText("Salvar");
        bSalvarFornecedor.setToolTipText("Salvar Fornecedor");
        bSalvarFornecedor.setColorHover(new java.awt.Color(51, 51, 51));
        bSalvarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel4.setAlignmentX(10.0F);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Nome do Cliente");

        txtNomeFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeFornecedor.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtNomeFornecedor.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNomeFornecedor.setPlaceholder("");
        txtNomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeFornecedorKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Email");

        txtEmailFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailFornecedor.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtEmailFornecedor.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEmailFornecedor.setPlaceholder("");
        txtEmailFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailFornecedorKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Morada");

        txtMoradaFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        txtMoradaFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtMoradaFornecedor.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtMoradaFornecedor.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMoradaFornecedor.setPlaceholder("");
        txtMoradaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMoradaFornecedorKeyTyped(evt);
            }
        });

        txtContactoFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        txtContactoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtContactoFornecedor.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtContactoFornecedor.setBotonColor(new java.awt.Color(0, 0, 0));
        txtContactoFornecedor.setPlaceholder("");
        txtContactoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoFornecedorActionPerformed(evt);
            }
        });
        txtContactoFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoFornecedorKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Contacto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMoradaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContactoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(1, 1, 1)))
                        .addGap(10, 10, 10))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(txtMoradaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Morada", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedor.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tblFornecedor.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblFornecedor.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tblFornecedor.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tblFornecedor.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        tblFornecedor.setGrosorBordeFilas(0);
        tblFornecedor.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(tblFornecedor);

        bCancelar.setBackground(new java.awt.Color(102, 102, 102));
        bCancelar.setText("Cancelar");
        bCancelar.setToolTipText("Cancelar ");
        bCancelar.setColorHover(new java.awt.Color(51, 51, 51));
        bCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(102, 102, 102));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/imagens/Search_40px.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.setColorHover(new java.awt.Color(51, 51, 51));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.setBorder(null);
        txtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisar.setText("Pesquisar");
        txtPesquisar.setBordeColorFocus(new java.awt.Color(102, 102, 102));
        txtPesquisar.setBotonColor(new java.awt.Color(255, 0, 51));
        txtPesquisar.setPlaceholder("Pesquisar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel model = (DefaultTableModel)this.tblFornecedor.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(model);
        this.tblFornecedor.setRowSorter(classificador);
        String test = txtPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(test, 1));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.habilitarCampos(false);
        this.clean();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void txtContactoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoFornecedorActionPerformed

    private void bSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarFornecedorActionPerformed
        if(saveUpdate.equals("salvar")){
            this.salvarFornecedores();
        }else if(saveUpdate.equals("alterar")){
            this.alterarFornecedores();
        }
    }//GEN-LAST:event_bSalvarFornecedorActionPerformed

    private void btExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFornecedorActionPerformed
        int linha =  tblFornecedor.getSelectedRow();

        int codigoFornecedor = (int)tblFornecedor.getValueAt(linha,0);

        if(controleFornecedores.excluirFornecedorController(codigoFornecedor)){
            JOptionPane.showMessageDialog(this, "Fornecedor Excluido com sucesso! ");
            this.carregarFornecedores();
            this.habilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Excluir Fornecedor! ");
        }
    }//GEN-LAST:event_btExcluirFornecedorActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed
        saveUpdate = "alterar";
        int linha = this.tblFornecedor.getSelectedRow();
        try{
            int cFornecedor = (int)this.tblFornecedor.getValueAt(linha,0);

            //recuperar os dados da base de dados
            fornecedores = controleFornecedores.retornarFornecedorController(cFornecedor);

            //colocar na interface

            this.txtNomeFornecedor.setText(fornecedores.getNome());
            this.txtMoradaFornecedor.setText(fornecedores.getMorada());
            this.txtContactoFornecedor.setText(String.valueOf(fornecedores.getContacto()));
            this.txtEmailFornecedor.setText(fornecedores.getEmail());
            //this.cbFornecedor.setSelectedItem(produtos.getFornecedor()));
        this.habilitarCampos(true);

        }catch(Exception o){
            JOptionPane.showMessageDialog(this,"Nenhum registo selecionado! ");
        }
    }//GEN-LAST:event_btactualizarActionPerformed

    private void nFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nFornecedorActionPerformed
        this.habilitarCampos(true);
        saveUpdate = "salvar";
    }//GEN-LAST:event_nFornecedorActionPerformed

    private void txtContactoFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoFornecedorKeyTyped
                                               
        String caracter ="ABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvwyz@!§#$%^&*()-_+=][|;'º.,''´´«»></?`~\\{}:"; 
        if(caracter.contains(evt.getKeyChar()+"")){
        evt.consume();
       JOptionPane.showMessageDialog(null," USAR NUMEROS ");
       
   }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoFornecedorKeyTyped

    private void txtMoradaFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoradaFornecedorKeyTyped
         String caracter ="@!#$%^&*()-_+=][|;'º.,''´´«»></?`~\\{}:"; 
         if(caracter.contains(evt.getKeyChar()+"")){
         evt.consume();
         JOptionPane.showMessageDialog(null," nao podes usar  caracteres especiais");
   }            // TODO add your handling code here:
                                     

        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoradaFornecedorKeyTyped

    private void txtNomeFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFornecedorKeyTyped
         String caracter ="0987654321@!#$%^&*()-_+=][|;'º.,''´´«»></?`~\\{}:"; 
         if(caracter.contains(evt.getKeyChar()+"")){
         evt.consume();
         JOptionPane.showMessageDialog(null," nao podes usar numero nem caracteres especiais");
   }    
                                     

        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFornecedorKeyTyped

    private void txtEmailFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailFornecedorKeyTyped
         String caracter ="!#$%^&*()-_+=][|;'º,''´´«»></?`~\\{}:"; 
         if(caracter.contains(evt.getKeyChar()+"")){
         evt.consume();
         JOptionPane.showMessageDialog(null," USAR LETRAS NUMEROS E [.@] ");
   }     
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFornecedorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton bCancelar;
    private rojeru_san.RSButton bSalvarFornecedor;
    private rojeru_san.RSButton btExcluirFornecedor;
    private rojeru_san.RSButton btactualizar;
    private rojeru_san.RSButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButton nFornecedor;
    private rojerusan.RSTableMetro tblFornecedor;
    private rojeru_san.RSMTextFull txtContactoFornecedor;
    private rojeru_san.RSMTextFull txtEmailFornecedor;
    private rojeru_san.RSMTextFull txtMoradaFornecedor;
    private rojeru_san.RSMTextFull txtNomeFornecedor;
    private rojeru_san.RSMTextFull txtPesquisar;
    // End of variables declaration//GEN-END:variables
private void salvarFornecedores(){
        fornecedores.setNome(this.txtNomeFornecedor.getText());
        fornecedores.setMorada(this.txtMoradaFornecedor.getText());
        fornecedores.setContacto(Integer.parseInt(this.txtContactoFornecedor.getText()));
        fornecedores.setEmail(this.txtEmailFornecedor.getText());        
       if (controleFornecedores.salvarFornecedorController(fornecedores)>0){
           JOptionPane.showMessageDialog(this,"Fornecedor salvo com sucesso! ");

           this.carregarFornecedores();
           this.clean();
           this.habilitarCampos(false);
           
       }else{
           JOptionPane.showMessageDialog(this,"Erro ao salvar Fornecedor! ");
           
       }
    
}
private void alterarFornecedores(){
        fornecedores.setNome(this.txtNomeFornecedor.getText());
        fornecedores.setMorada(this.txtMoradaFornecedor.getText());
        fornecedores.setContacto(Integer.parseInt(this.txtContactoFornecedor.getText()));
        fornecedores.setEmail(this.txtEmailFornecedor.getText());
        
       if (controleFornecedores.atualizarFornecedorController(fornecedores)){
           JOptionPane.showMessageDialog(this,"Fornecedor alterado com sucesso! ");

           this.carregarFornecedores();
           this.clean();
           this.habilitarCampos(false);
           
       }else{
           JOptionPane.showMessageDialog(this,"Erro ao alterar Fornecedor! ");
           
       }
    
}
}
