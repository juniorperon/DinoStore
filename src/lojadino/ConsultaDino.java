/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import Conexão.SQL;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import lojadino.Classes.ModeloTabela;

import lojadino.Classes.Produtos;


/**
 *
 * @author Ailton
 */
public final class ConsultaDino extends javax.swing.JFrame {

    SQL conectar = new SQL();
    Produtos novoProduto = new Produtos();
    public ConsultaDino() {    
        initComponents();
        preencherTabela("select * from cadastroproduto order by id_prd");
      
    }
     private void buscarProduto(Produtos novoProduto){
        this.conectar.conectaBanco();
        
        String consultaid = (String) this.consultaid.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id_prd,"            
                    + "nome_prd,"
                    + "alimentacao,"
                    + "especie,"
                    + "tamanho,"
                    + "valor_prd,"
                    + "sexo_prd"
                 + " FROM"
                     + " cadastroproduto"
                 + " WHERE"
                     + " id_prd = '" + consultaid + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoProduto.setCodigo(this.conectar.getResultSet().getString(1));
                novoProduto.setNome(this.conectar.getResultSet().getString(2));
                novoProduto.setALimentacao(this.conectar.getResultSet().getString(3));
                novoProduto.setEspecie(this.conectar.getResultSet().getString(4));
                novoProduto.setTamanho(this.conectar.getResultSet().getString(5));
                novoProduto.setValor(this.conectar.getResultSet().getString(6));
                novoProduto.setSexo(this.conectar.getResultSet().getString(7));
               

            
             }
          
         
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            
            
            
        }finally{
            
            consultanome.setText(novoProduto.getNome());
            consultaespecie.setText(novoProduto.getEspecie());
            consultavalor1.setText(novoProduto.getValor());
            consultasexo.setSelectedItem(novoProduto.getSexo());
            consultaalimentacao.setSelectedItem((String)novoProduto.getAlimentacao());
            consultatamanho.setSelectedItem((String)novoProduto.getTamanho());
            
    
        }   
           if((novoProduto.getNome()== "")){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
           }
    };
        private void LimparCampo(){
           
            consultaalimentacao.setSelectedItem("");
            consultanome.setText("");
            consultasexo.setSelectedItem("");
            consultatamanho.setSelectedItem("");
            consultavalor1.setText("");
            consultaespecie.setText("");
         
    
    }
     
 
    
       private void deletarProduto(Produtos novoProduto){
        this.conectar.conectaBanco();
        String consultaid = this.consultaid.getText();       
        if("".equals(novoProduto.getNome())){
                JOptionPane.showMessageDialog(null, "Digite um código válido");
           }else{
      
        try {            
            this.conectar.updateSQL(
                "DELETE FROM cadastroproduto "
                + " WHERE "
                    + "id_prd = '" + consultaid + "'"
                + ";"            
            );
             if(consultanome.equals("")){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
           }
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto");
           
        }finally{
            this.conectar.fechaBanco();
           
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso");            
        }
        }
        
    }
       
       
      
       public void AtualizarProduto(Produtos novoProduto){
        this.conectar.conectaBanco();
        String consultaid = this.consultaid.getText();
        if("".equals(novoProduto.getNome())){
                JOptionPane.showMessageDialog(null, "Digite um código válido");
           }
        else{
        try {
            this.conectar.updateSQL(
                "UPDATE cadastroproduto SET "                    
                    + "nome_prd = '" + consultanome.getText() + "',"
                    + "alimentacao = '" + consultaalimentacao.getSelectedItem()+ "',"
                    + "especie = '" + consultaespecie.getText() + "',"
                    + "tamanho = '" + consultatamanho.getSelectedItem()+ "',"                   
                    + "valor_prd = '" + consultavalor1.getText()+ "',"
                    + "sexo_prd = '" + consultasexo.getSelectedItem()+ "'"
                    
                + " WHERE "
                    + "id_prd = '" + consultaid + "'"
                + ";"
            );
              
        }catch(Exception e){
            System.out.println("Erro ao atualizar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente");
           
        }finally{
            this.conectar.fechaBanco();
           
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
        }
        
    }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btpesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        consultavalor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        consultanome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        consultaespecie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        consultavalor1 = new javax.swing.JFormattedTextField();
        consultaalimentacao = new javax.swing.JComboBox<>();
        consultasexo = new javax.swing.JComboBox<>();
        consultatamanho = new javax.swing.JComboBox<>();
        consultaid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprodutos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtatualizar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Produto");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Filtro de Pesquisa");

        jLabel4.setText("Código");

        btpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/lupa.png"))); // NOI18N
        btpesquisar.setText("Pesquisar");
        btpesquisar.setToolTipText("Pesquisar Produto");
        btpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/broom.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setToolTipText("Limpar CÓDIGO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        consultavalor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Nome");

        consultanome.setOpaque(false);

        jLabel6.setText("Valor");

        jLabel7.setText("Alimentação");

        jLabel8.setText("Especie");

        consultaespecie.setOpaque(false);

        jLabel10.setText("Sexo");

        jLabel13.setText("Tamanho");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/reload.png"))); // NOI18N
        jButton3.setText("Atualizar Dados");
        jButton3.setToolTipText("Atualzar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/caixote-de-lixo.png"))); // NOI18N
        jButton4.setText("Deletar Produto");
        jButton4.setToolTipText("Deletar PRODUTO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            consultavalor1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        consultavalor1.setOpaque(false);

        consultaalimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnívoros", "Onívoros", "Herbívoros" }));
        consultaalimentacao.setBorder(null);

        consultasexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não definido", "Macho", "Femea" }));

        consultatamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande", "Extra Grande" }));

        javax.swing.GroupLayout consultavalorLayout = new javax.swing.GroupLayout(consultavalor);
        consultavalor.setLayout(consultavalorLayout);
        consultavalorLayout.setHorizontalGroup(
            consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultavalorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(consultavalorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultaespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultanome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultavalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultasexo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(consultaalimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addComponent(consultatamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        consultavalorLayout.setVerticalGroup(
            consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultavalorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultatamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaalimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultasexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultavalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consultavalorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel3))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(0, 9, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(consultaid, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btpesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultavalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btpesquisar)
                    .addComponent(jButton2)
                    .addComponent(consultaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultavalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ESPECIE", "VALOR"
            }
        ));
        jtprodutos.setColumnSelectionAllowed(true);
        jtprodutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtprodutos);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Produtos Cadastrados");

        txtatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/refresh.png"))); // NOI18N
        txtatualizar.setToolTipText("Atualizar Campo");
        txtatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatualizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Consulta de Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(104, 104, 104)
                        .addComponent(txtatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisarActionPerformed
        buscarProduto(novoProduto);
    }//GEN-LAST:event_btpesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimparCampo();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja atualizar os dados?");

        if (resposta == JOptionPane.YES_OPTION){
            AtualizarProduto(novoProduto);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja atualizar os dados?");

        if (resposta == JOptionPane.YES_OPTION){
            deletarProduto(novoProduto);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatualizarActionPerformed
        preencherTabela("select * from cadastroproduto order by id_prd");   // TODO add your handling code here:
    }//GEN-LAST:event_txtatualizarActionPerformed
 public void preencherTabela(String Sql){
      ArrayList dados = new ArrayList();
      String [] colunas = new String[] {"ID","Nome","Especie","Valor"}; 
      conectar.conectaBanco();
      conectar.executarSQL(Sql);
      try {
          conectar.resultSet.first();
          do {              
              dados.add(new Object[]{conectar.resultSet.getString("id_prd"),
                                    conectar.resultSet.getString("nome_prd"),
                                    conectar.resultSet.getString("especie"),
                                    conectar.resultSet.getString("valor_prd")});
              
          } while (conectar.resultSet.next());
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Nenhum produto cadastrado!");
         
      }
      ModeloTabela modelo = new ModeloTabela(dados, colunas);
      jtprodutos.setModel(modelo);
      jtprodutos.getColumnModel().getColumn(0).setPreferredWidth(30);
      jtprodutos.getColumnModel().getColumn(0).setResizable(false);
      
      jtprodutos.getColumnModel().getColumn(1).setPreferredWidth(146);
      jtprodutos.getColumnModel().getColumn(1).setResizable(false);
      
      jtprodutos.getColumnModel().getColumn(2).setPreferredWidth(146);
      jtprodutos.getColumnModel().getColumn(2).setResizable(false);
      
      jtprodutos.getColumnModel().getColumn(3).setPreferredWidth(142);
      jtprodutos.getColumnModel().getColumn(3).setResizable(false);
      
     

      jtprodutos.getTableHeader().setReorderingAllowed(false);
      jtprodutos.setAutoResizeMode(jtprodutos.AUTO_RESIZE_OFF);
      jtprodutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      conectar.fechaBanco();
  };
 
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
            java.util.logging.Logger.getLogger(ConsultaDino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConsultaDino().setVisible(true);
        });
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpesquisar;
    private javax.swing.JComboBox<String> consultaalimentacao;
    private javax.swing.JTextField consultaespecie;
    private javax.swing.JTextField consultaid;
    private javax.swing.JTextField consultanome;
    private javax.swing.JComboBox<String> consultasexo;
    private javax.swing.JComboBox<String> consultatamanho;
    private javax.swing.JPanel consultavalor;
    private javax.swing.JFormattedTextField consultavalor1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtprodutos;
    private javax.swing.JToggleButton txtatualizar;
    // End of variables declaration//GEN-END:variables
}
