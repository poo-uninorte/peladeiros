package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBens.BeansPeladeiros;
import modeloBens.ModeloTabela;
import modeloConnection.ConexaoBD;
import modeloDao.DaoPeladeiros;

/**
 *
 * @author F-BRAGA
 */
public class TelaPeladeiro extends javax.swing.JFrame {
    ConexaoBD conex = new ConexaoBD();
    BeansPeladeiros pa = new BeansPeladeiros();
    DaoPeladeiros dao = new DaoPeladeiros();
    int flag=0;
    int resposta = 0;
    
    public TelaPeladeiro() {
        initComponents();
        preencherBairros();
        preencherTabela("SELECT pe_cod, pe_nome, pe_telefone, pe_rua, bai_nome FROM peladeiros INNER JOIN bairro on peBai_cod = bai_cod ORDER BY pe_nome");
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldLongitude = new javax.swing.JTextField();
        jTextFieldLatitude = new javax.swing.JTextField();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCodPe = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePeladeiro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome");

        jTextFieldNomeP.setEnabled(false);

        jLabel3.setText("Telefone");

        jTextFieldTelefone.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Rua");

        jLabel6.setText("Bairro");

        jLabel7.setText("Longitude");

        jLabel8.setText("Latitude");

        jTextFieldRua.setEnabled(false);

        jTextFieldLongitude.setEnabled(false);

        jTextFieldLatitude.setEnabled(false);

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBairro.setEnabled(false);
        jComboBoxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldRua)
                    .addComponent(jComboBoxBairro, 0, 468, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLatitude))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRua)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldLatitude))
                .addGap(25, 25, 25))
        );

        jLabel4.setText("Endereço");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel9.setText("Pesquisar");

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo");

        jTextFieldCodPe.setEnabled(false);

        jTablePeladeiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTablePeladeiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePeladeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePeladeiroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePeladeiro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(171, 171, 171))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonNovo)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodPe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCodPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Peladeiros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(822, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNomeP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Nome para continuar");
            jTextFieldNomeP.requestFocus();
        }else if(jTextFieldTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Telefone para continuar");
            jTextFieldTelefone.requestFocus();
        }else if(jTextFieldRua.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha a Rua para continuar");
            jTextFieldRua.requestFocus(); 
        }else if(jTextFieldLatitude.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha a Latitude para continuar");
            jTextFieldLatitude.requestFocus();     
        }else if(jTextFieldLongitude.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha a Longitude para continuar");
            jTextFieldLongitude.requestFocus(); 
        }else 
         if(flag==1){
        
        pa.setNomePe(jTextFieldNomeP.getText());
        pa.setTelefonePe(jTextFieldTelefone.getText());
        pa.setRuaPe(jTextFieldRua.getText());
        pa.setLatitudePe(jTextFieldLatitude.getText());
        pa.setLongitudePe(jTextFieldLongitude.getText());
        pa.setNomeBairro((String) jComboBoxBairro.getSelectedItem());
        dao.Salvar(pa);
        preencherTabela("SELECT pe_cod, pe_nome, pe_telefone, pe_rua, bai_nome FROM peladeiros INNER JOIN bairro on peBai_cod = bai_cod ORDER BY pe_nome");
        flag = 1;

        jTextFieldNomeP.setEnabled(!true);
        jTextFieldRua.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldLatitude.setEnabled(!true);
        jTextFieldLongitude.setEnabled(!true);
        jComboBoxBairro.setEnabled(!true);
        
        jButtonCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        jTextFieldCodPe.setText("");
        jTextFieldNomeP.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldLatitude.setText("");
        jTextFieldLongitude.setText("");  
        
         }else{
        pa.setNomePe(jTextFieldNomeP.getText());
        pa.setTelefonePe(jTextFieldTelefone.getText());
        pa.setRuaPe(jTextFieldRua.getText());
        pa.setLatitudePe(jTextFieldLatitude.getText());
        pa.setLongitudePe(jTextFieldLongitude.getText());
        pa.setNomeBairro((String) jComboBoxBairro.getSelectedItem());
        pa.setCodPe(Integer.parseInt(jTextFieldCodPe.getText()));
        dao.Alterar(pa);
        preencherTabela("SELECT pe_cod, pe_nome, pe_telefone, pe_rua, bai_nome FROM peladeiros INNER JOIN bairro on peBai_cod = bai_cod ORDER BY pe_nome");
        jTextFieldCodPe.setText("");
        jTextFieldNomeP.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldLatitude.setText("");
        jTextFieldLongitude.setText("");  
             
         }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
            flag = 1;

        jTextFieldNomeP.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldLatitude.setEnabled(true);
        jTextFieldLongitude.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        jTextFieldNomeP.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldLatitude.setEnabled(true);
        jTextFieldLongitude.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        jTextFieldNomeP.setEnabled(!true);
        jTextFieldRua.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldLatitude.setEnabled(!true);
        jTextFieldLongitude.setEnabled(!true);
        jComboBoxBairro.setEnabled(!true);
        
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(!false);
        jButtonAlterar.setEnabled(!false);
        
        pa.setPesquisar(jTextFieldPesquisar.getText());
        BeansPeladeiros pa1 = dao.buscaPeladeiro(pa);
        jTextFieldNomeP.setText(pa1.getNomePe());
        jTextFieldCodPe.setText(String.valueOf(pa1.getCodPe()));
        jTextFieldTelefone.setText(pa1.getTelefonePe());
        jTextFieldRua.setText(pa1.getRuaPe());
        jTextFieldLongitude.setText(pa1.getLongitudePe());
        jTextFieldLatitude.setText(pa1.getLatitudePe());
        jComboBoxBairro.setSelectedItem(pa1.getNomeBairro());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
        pa.setCodPe(Integer.parseInt(jTextFieldCodPe.getText()));
        dao.Excluir(pa);   
        preencherTabela("SELECT pe_cod, pe_nome, pe_telefone, pe_rua, bai_nome FROM peladeiros INNER JOIN bairro on peBai_cod = bai_cod ORDER BY pe_nome");
        jTextFieldCodPe.setText("");
        jTextFieldNomeP.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldLatitude.setText("");
        jTextFieldLongitude.setText("");       
        
        jTextFieldNomeP.setEnabled(!true);
        jTextFieldRua.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldLatitude.setEnabled(!true);
        jTextFieldLongitude.setEnabled(!true);
        jComboBoxBairro.setEnabled(!true);
        
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(!true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTablePeladeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePeladeiroMouseClicked
        String nome_peladeiro =""+jTablePeladeiro.getValueAt(jTablePeladeiro.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT *FROM peladeiros WHERE pe_nome='"+nome_peladeiro+"'");
        try {
            conex.rs.first();
            jTextFieldCodPe.setText(String.valueOf(conex.rs.getInt("pe_cod")));
            jTextFieldNomeP.setText(conex.rs.getString("pe_nome"));
            jTextFieldTelefone.setText(conex.rs.getString("pe_telefone"));
            jTextFieldRua.setText(conex.rs.getString("pe_rua"));
            jTextFieldLongitude.setText(conex.rs.getString("pe_longitude"));
            jTextFieldLatitude.setText(conex.rs.getString("pe_latitude"));
            ConexaoBD conexPesquisa = new ConexaoBD();
            conexPesquisa.conexao();
            conexPesquisa.executaSql("SELECT * FROM bairro WHERE bai_cod ="+conex.rs.getInt("peBai_cod"));
            conexPesquisa.rs.first();
            jComboBoxBairro.setSelectedItem(conexPesquisa.rs.getString("bai_nome"));
            conexPesquisa.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados"+ex);
        }
    }//GEN-LAST:event_jTablePeladeiroMouseClicked

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldCodPe.setText("");
        jTextFieldNomeP.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldLatitude.setText("");
        jTextFieldLongitude.setText("");       
                
        jTextFieldNomeP.setEnabled(!true);
        jTextFieldRua.setEnabled(!true);
        jTextFieldTelefone.setEnabled(!true);
        jTextFieldLatitude.setEnabled(!true);
        jTextFieldLongitude.setEnabled(!true);
        jComboBoxBairro.setEnabled(!true);
        
        jButtonCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBairroActionPerformed
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"ID", "nome", "telefone", "rua", "bairro"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("pe_cod"), conex.rs.getString("pe_nome"),conex.rs.getString("pe_telefone"),conex.rs.getString("pe_rua"),conex.rs.getString("bai_nome")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Insira um local cadastrado!");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTablePeladeiro.setModel(modelo);
        jTablePeladeiro.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTablePeladeiro.getColumnModel().getColumn(0).setResizable(false);
        jTablePeladeiro.getColumnModel().getColumn(1).setPreferredWidth(280);
        jTablePeladeiro.getColumnModel().getColumn(1).setResizable(false);
        jTablePeladeiro.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTablePeladeiro.getColumnModel().getColumn(2).setResizable(false);
        jTablePeladeiro.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTablePeladeiro.getColumnModel().getColumn(3).setResizable(false);
        jTablePeladeiro.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTablePeladeiro.getColumnModel().getColumn(4).setResizable(false);
        
        jTablePeladeiro.getTableHeader().setReorderingAllowed(false);
        jTablePeladeiro.setAutoResizeMode(jTablePeladeiro.AUTO_RESIZE_OFF);
        jTablePeladeiro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconectar();
    }
    
    
    
    public void preencherBairros(){
        conex.conexao();
        conex.executaSql("SELECT * FROM bairro ORDER BY bai_nome");
        try {
            conex.rs.first();
            jComboBoxBairro.removeAllItems();
            do{
               jComboBoxBairro.addItem(conex.rs.getString("bai_nome")); 
            }while(conex.rs.next());   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher Bairros"+ex);
        }
        conex.desconectar();
    }
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
            java.util.logging.Logger.getLogger(TelaPeladeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPeladeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPeladeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPeladeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPeladeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePeladeiro;
    private javax.swing.JTextField jTextFieldCodPe;
    private javax.swing.JTextField jTextFieldLatitude;
    private javax.swing.JTextField jTextFieldLongitude;
    private javax.swing.JTextField jTextFieldNomeP;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
