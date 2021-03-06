/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.paineis;

import Controle.ProdutoControle;
import Modelo.Produto;
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
public class pnlEstoque extends javax.swing.JPanel {
ArrayList<Produto> listaProduto = new ArrayList<>();
    ProdutoControle controleProdutos = new ProdutoControle();
    Produto produtos = new Produto();
    String saveUpdate;
    
    /**
     * Creates new form PnVenda
     */
    public pnlEstoque() {
        initComponents();
        carregarProdutos();
        habilitarCampos(false);
        jScrollPane1.getViewport().setBackground(Color.white );
    }
    
      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
      public  void carregarProdutos(){
        listaProduto = controleProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel)tblEstoque.getModel();
        modelo.setNumRows(0);
        //inserir produtos na tabelaa
        int cont = listaProduto.size();
        for (int i=0; i<cont; i++){
            modelo.addRow(new Object[]{
            listaProduto.get(i).getIdProduto(),
            listaProduto.get(i).getProduto(),
            listaProduto.get(i).getQuantidade(),
            listaProduto.get(i).getTipoProduto(),
            listaProduto.get(i).getpCompra(),
            listaProduto.get(i).getpVenda(),
        });
        }
        
    }
      
      public void habilitarCampos(boolean go){
          txtProduto.setEnabled(go);
          txtQuantidade.setEnabled(go);
          txtPrecoAquisicao.setEnabled(go);
          txtPrecoVenda.setEnabled(go);
          }
      
      public void clean(){
          txtProduto.setText("");
          txtQuantidade.setText("");
          txtPrecoVenda.setText("");
          txtPrecoAquisicao.setText("");
      }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtProduto = new rojeru_san.RSMTextFull();
        jLabel12 = new javax.swing.JLabel();
        txtPrecoAquisicao = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new rojeru_san.RSMTextFull();
        jLabel13 = new javax.swing.JLabel();
        txtPrecoVenda = new rojeru_san.RSMTextFull();
        jLabel9 = new javax.swing.JLabel();
        cbTipoProduto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        bSalvarProduto = new rojeru_san.RSButton();
        nProduto = new rojeru_san.RSButton();
        bCancelarProduto = new rojeru_san.RSButton();
        bExcluirProduto = new rojeru_san.RSButton();
        bActualizarProduto = new rojeru_san.RSButton();
        btnPesquisar = new rojeru_san.RSButton();
        txtPesquisar = new rojeru_san.RSMTextFull();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTOQUE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/paineis/Trolley_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel4.setAlignmentX(10.0F);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Produto");

        txtProduto.setBackground(new java.awt.Color(204, 204, 204));
        txtProduto.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtProduto.setBotonColor(new java.awt.Color(0, 0, 0));
        txtProduto.setPlaceholder("");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Preço de Aquisição");

        txtPrecoAquisicao.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecoAquisicao.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecoAquisicao.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtPrecoAquisicao.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPrecoAquisicao.setPlaceholder("");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Quantidade");

        txtQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtQuantidade.setBotonColor(new java.awt.Color(0, 0, 0));
        txtQuantidade.setPlaceholder("");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Preço de Venda");

        txtPrecoVenda.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecoVenda.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecoVenda.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtPrecoVenda.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPrecoVenda.setPlaceholder("");
        txtPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de Produto");

        cbTipoProduto.setBackground(new java.awt.Color(204, 204, 204));
        cbTipoProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumo", "Cerveja", "Wisk", "Vinho", "Refrigerante" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fornecedor");

        cbFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        cbFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carlos", "Mateus", "Ribeiro", "Fenias", "Bombe" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTipoProduto, 0, 199, Short.MAX_VALUE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPrecoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecoAquisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        bSalvarProduto.setBackground(new java.awt.Color(102, 102, 102));
        bSalvarProduto.setText("Salvar");
        bSalvarProduto.setToolTipText("Salvar Produto");
        bSalvarProduto.setColorHover(new java.awt.Color(51, 51, 51));
        bSalvarProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarProdutoActionPerformed(evt);
            }
        });

        nProduto.setBackground(new java.awt.Color(102, 102, 102));
        nProduto.setText("Novo");
        nProduto.setToolTipText("Novo Produto");
        nProduto.setColorHover(new java.awt.Color(51, 51, 51));
        nProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nProdutoActionPerformed(evt);
            }
        });

        bCancelarProduto.setBackground(new java.awt.Color(102, 102, 102));
        bCancelarProduto.setText("Cancelar");
        bCancelarProduto.setToolTipText("Cancelar ");
        bCancelarProduto.setColorHover(new java.awt.Color(51, 51, 51));
        bCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarProdutoActionPerformed(evt);
            }
        });

        bExcluirProduto.setBackground(new java.awt.Color(102, 102, 102));
        bExcluirProduto.setText("Excluir");
        bExcluirProduto.setToolTipText("Excluir Produto");
        bExcluirProduto.setColorHover(new java.awt.Color(51, 51, 51));
        bExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirProdutoActionPerformed(evt);
            }
        });

        bActualizarProduto.setBackground(new java.awt.Color(102, 102, 102));
        bActualizarProduto.setText("Actulizar");
        bActualizarProduto.setToolTipText("Actualizar Produto");
        bActualizarProduto.setColorHover(new java.awt.Color(51, 51, 51));
        bActualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarProdutoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bActualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bActualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisar.setToolTipText("Pesquisar");
        txtPesquisar.setBordeColorFocus(new java.awt.Color(102, 102, 102));
        txtPesquisar.setBotonColor(new java.awt.Color(255, 0, 51));
        txtPesquisar.setPlaceholder("Pesquisar");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Tipo de Produto", "Preço de Compra", "Preço de Venda", "Fornecedor", "Data", "Total de Compras", "Total de Vendas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tblEstoque.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblEstoque.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tblEstoque.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tblEstoque.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        tblEstoque.setGrosorBordeFilas(0);
        tblEstoque.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(tblEstoque);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nProdutoActionPerformed
    this.habilitarCampos(true);
    saveUpdate = "salvar";
       
    }//GEN-LAST:event_nProdutoActionPerformed

    private void bCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarProdutoActionPerformed
        this.habilitarCampos(false);
        this.clean();
       
        
    }//GEN-LAST:event_bCancelarProdutoActionPerformed

    private void bSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarProdutoActionPerformed
       if(saveUpdate.equals("salvar")){
        this.salvarProduto();   
       }else if(saveUpdate.equals("alterar")){
         this.alterarProduto();  
       }
        
       
       
    }//GEN-LAST:event_bSalvarProdutoActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel model = (DefaultTableModel)this.tblEstoque.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(model);
        this.tblEstoque.setRowSorter(classificador);
        String test = txtPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(test, 1));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaActionPerformed

    private void bExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirProdutoActionPerformed
       int linha =  tblEstoque.getSelectedRow();
       int codigoProduto = (int)tblEstoque.getValueAt(linha,0);
       
       if(controleProdutos.excluirProdutoController(codigoProduto)){
           JOptionPane.showMessageDialog(this, "Produto Excluido com sucesso! ");
           this.carregarProdutos();
           this.habilitarCampos(false);
       }else{
          JOptionPane.showMessageDialog(this, "Erro ao Excluir Produto! ");  
       }
    }//GEN-LAST:event_bExcluirProdutoActionPerformed

    private void bActualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarProdutoActionPerformed
       saveUpdate = "alterar";
        int linha = this.tblEstoque.getSelectedRow();
        try{
            int cproduto = (int)this.tblEstoque.getValueAt(linha,0);
            
            //recuperar os dados da base de dados
            produtos = controleProdutos.retornarProdutoController(cproduto);
            
            //colocar na interface
            
            this.txtProduto.setText(produtos.getProduto());
            this.txtQuantidade.setText(String.valueOf(produtos.getQuantidade()));
           this.cbTipoProduto.setSelectedItem(produtos.getTipoProduto());
            this.txtPrecoAquisicao.setText(String.valueOf(produtos.getpCompra()));
            this.txtPrecoVenda.setText(String.valueOf(produtos.getpVenda()));
            //this.cbFornecedor.setSelectedItem(produtos.getFornecedor()));
            this.habilitarCampos(true);
            
        }catch(Exception o){
            JOptionPane.showMessageDialog(this,"Nenhum registo selecionado! ");
        }
    }//GEN-LAST:event_bActualizarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton bActualizarProduto;
    private rojeru_san.RSButton bCancelarProduto;
    private rojeru_san.RSButton bExcluirProduto;
    private rojeru_san.RSButton bSalvarProduto;
    private rojeru_san.RSButton btnPesquisar;
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JComboBox<String> cbTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButton nProduto;
    public rojerusan.RSTableMetro tblEstoque;
    private rojeru_san.RSMTextFull txtPesquisar;
    private rojeru_san.RSMTextFull txtPrecoAquisicao;
    private rojeru_san.RSMTextFull txtPrecoVenda;
    private rojeru_san.RSMTextFull txtProduto;
    private rojeru_san.RSMTextFull txtQuantidade;
    // End of variables declaration//GEN-END:variables
private void salvarProduto(){
        produtos.setProduto(this.txtProduto.getText());
        produtos.setQuantidade(Integer.parseInt(this.txtQuantidade.getText()));
        produtos.setTipoProduto(this.cbTipoProduto.getSelectedItem().toString());
        produtos.setpCompra(Double.parseDouble(this.txtPrecoAquisicao.getText()));
        produtos.setpVenda(Double.parseDouble(this.txtPrecoVenda.getText()));
        
       if (controleProdutos.salvarProdutoController(produtos)>0){
           JOptionPane.showMessageDialog(this,"Produto salvo com sucesso! ");

           this.carregarProdutos();
           this.clean();
           this.habilitarCampos(false);
           
       }else{
           JOptionPane.showMessageDialog(this,"Erro ao salvar Produto! ");
           
       }
    
}
private void alterarProduto(){
        produtos.setProduto(this.txtProduto.getText());
        produtos.setQuantidade(Integer.parseInt(this.txtQuantidade.getText()));
        produtos.setTipoProduto(this.cbTipoProduto.getSelectedItem().toString());
        produtos.setpCompra(Double.parseDouble(this.txtPrecoAquisicao.getText()));
        produtos.setpVenda(Double.parseDouble(this.txtPrecoVenda.getText()));
        
       if (controleProdutos.alterarProdutoController(produtos)){
           JOptionPane.showMessageDialog(this,"Produto alterado com sucesso! ");

           this.carregarProdutos();
           this.clean();
           this.habilitarCampos(false);
           
       }else{
           JOptionPane.showMessageDialog(this,"Erro ao alterar Produto! ");
           
       }
    
}
}
