
package View;

import Controle.ContatosControl;
import Controle.UsuarioControl;
import Model.ContatosModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaContatos extends javax.swing.JInternalFrame {
    private UsuarioControl userName;
    private ContatosControl controle;    
       
    public TelaContatos() {
        initComponents(); 
        DefaultTableModel modelo = (DefaultTableModel) jTable_Itens.getModel();
        jTable_Itens.setRowSorter(new TableRowSorter(modelo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        editBuscar = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editNome = new javax.swing.JTextField();
        bSalvar = new javax.swing.JButton();
        bNovo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        editCodPais = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        editDDD = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        editTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        editCelular = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Itens = new javax.swing.JTable();
        bDeletar = new javax.swing.JButton();

        setClosable(true);
        setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("BUSCAR :");

        bBuscar.setText("BUSCAR");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(editBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(editBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bBuscar))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("NOME :");

        bSalvar.setText("SALVAR");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bNovo.setText("NOVO");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        jLabel4.setText("DDD : ");

        editCodPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(+55)", "(+54)", "(+1)" }));

        jLabel5.setText("COD.PAIS:");

        try {
            editDDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("TELEFONE : ");

        try {
            editTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("CELULAR : ");

        try {
            editCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(editCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(editTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(editDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(12, 12, 12)
                                    .addComponent(editCodPais, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editCodPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(editTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(editCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovo)
                    .addComponent(bSalvar)
                    .addComponent(editNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "COD.PAIS", "DDD", "TELEFONE", "CELULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Itens.setName(""); // NOI18N
        jTable_Itens.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable_ItensFocusGained(evt);
            }
        });
        jTable_Itens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ItensMouseClicked(evt);
            }
        });
        jTable_Itens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ItensKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_ItensKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Itens);
        if (jTable_Itens.getColumnModel().getColumnCount() > 0) {
            jTable_Itens.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable_Itens.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable_Itens.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable_Itens.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable_Itens.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        bDeletar.setText("Deletar Item");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bDeletar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 530, 518);
    }// </editor-fold>//GEN-END:initComponents

 
    private void carregarGrid(){
        DefaultTableModel modelo = (DefaultTableModel) jTable_Itens.getModel();
                modelo.setNumRows(0);//Zerar tabela
                for (ContatosModel p: controle.getItensLista()){                  
                    modelo.addRow(new Object[]{
                        p.getId(),
                        p.getNome(),
                        p.getCod_pais(),
                        p.getDdd(),
                        p.getTelefone(),
                        p.getCelular()
                    });
                }       
    }
    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
            if (editCodPais.getEditor().equals("")){
                JOptionPane.showMessageDialog(null, "Campo Codigo Pais não está Preenchido !!");
                return;
            }
            if (editDDD.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Campo DDD não está Preenchido !!");
                editDDD.grabFocus();
                return;
            }
            if (editNome.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Campo Nome não está Preenchido !!");
                editNome.grabFocus();
                return;
            }
        try {
            if (controle == null){
                controle = new ContatosControl();            
            }
            /*Carrega Classe dados Tela*/
            controle.novo();
            if (jTable_Itens.getSelectedRow() != -1){
                controle.getEntidade().setId((Integer)jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),0));
            }
            controle.getEntidade().setNome(editNome.getText().toUpperCase());
            controle.getEntidade().setCod_pais(editCodPais.getSelectedItem().toString());
            controle.getEntidade().setDdd(editDDD.getText().toUpperCase());
            controle.getEntidade().setTelefone(editTelefone.getText().toUpperCase());
            controle.getEntidade().setCelular(editCelular.getText().toUpperCase());            
            controle.getEntidade().setUsuario_ID(userName.getUserLogado().getId());
            /*Salva e Recarega Classe com dados do Banco*/
            controle.salvar();
            controle.buscarItens(userName.getUserLogado().getId(),editNome.getText().toUpperCase());
            carregarGrid();
            jTable_Itens.setRowSelectionInterval(0, 0);
            jTable_Itens.grabFocus();
                
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Salvar : " + ex);
        }     
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        if (controle == null){
                controle = new ContatosControl();            
            }
        controle.novo();        
        editNome.setText("");
        //editCodPais.setText("");
        editDDD.setText("");
        editTelefone.setText("");
        editCelular.setText("");   
        editDDD.grabFocus();
        DefaultTableModel modelo = (DefaultTableModel) jTable_Itens.getModel();
        modelo.setNumRows(0);//Zerar tabela
    }//GEN-LAST:event_bNovoActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (controle == null){
                controle = new ContatosControl();            
            }
        try {           
            controle.buscarItens(userName.getUserLogado().getId(),editBuscar.getText());            
            carregarGrid(); 
            if (controle.getItensLista().size() > 0 ){
                jTable_Itens.setRowSelectionInterval(0, 0);
                jTable_Itens.grabFocus();
            }else{
                editNome.setText("");
                //editCodPais.setText("");
                editDDD.setText("");
                editTelefone.setText("");
                editCelular.setText(""); 
            }
            editBuscar.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Buscar : " + ex);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void jTable_ItensKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ItensKeyReleased
        if (jTable_Itens.getSelectedRow() != -1){
            editNome.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),1).toString());
            editCodPais.setName(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),2).toString());
            editDDD.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),3).toString());
            editTelefone.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),4).toString());
            editCelular.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),5).toString());            
        }
    }//GEN-LAST:event_jTable_ItensKeyReleased

    private void jTable_ItensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ItensKeyPressed
        
    }//GEN-LAST:event_jTable_ItensKeyPressed

    private void jTable_ItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ItensMouseClicked
       if (jTable_Itens.getSelectedRow() != -1){
            editNome.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),1).toString());
            editCodPais.setName(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),2).toString());
            editDDD.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),3).toString());
            editTelefone.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),4).toString());
            editCelular.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),5).toString());         
        }
    }//GEN-LAST:event_jTable_ItensMouseClicked

    private void jTable_ItensFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable_ItensFocusGained
        if (jTable_Itens.getSelectedRow() != -1){
            editNome.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),1).toString());
            editCodPais.setName(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),2).toString());
            editDDD.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),3).toString());
            editTelefone.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),4).toString());
            editCelular.setText(jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),5).toString());         
        }
    }//GEN-LAST:event_jTable_ItensFocusGained

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        if (jTable_Itens.getSelectedRow() != -1){             
            if (controle == null){
                controle = new ContatosControl();            
            }
            try {
                JFrame frame = new JFrame();    
                int resposta = JOptionPane.showConfirmDialog(frame,"Deseja deletar Contato ("+
                        jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),1).toString()+")",
                        "Exclusão", JOptionPane.YES_NO_OPTION);   
                if (resposta == JOptionPane.YES_OPTION) {                    
                    controle.novo();
                    controle.getEntidade().setId((Integer)jTable_Itens.getValueAt(jTable_Itens.getSelectedRow(),0));
                    controle.deletar();
                    controle.buscarItens(userName.getUserLogado().getId(),"");
                    carregarGrid();
                    jTable_Itens.setRowSelectionInterval(0, 0);
                    jTable_Itens.grabFocus();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Deletar : " + ex);
            }      
        }
    }//GEN-LAST:event_bDeletarActionPerformed

    public UsuarioControl getUserName() {
        return userName;
    }

    public void setUserName(UsuarioControl userName) {
        this.userName = userName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bDeletar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bSalvar;
    private javax.swing.JTextField editBuscar;
    private javax.swing.JFormattedTextField editCelular;
    private javax.swing.JComboBox<String> editCodPais;
    private javax.swing.JFormattedTextField editDDD;
    private javax.swing.JTextField editNome;
    private javax.swing.JFormattedTextField editTelefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Itens;
    // End of variables declaration//GEN-END:variables
}
