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

import lojadino.Classes.Cliente;
import lojadino.Classes.ModeloTabela;



/**
 *
 * @author Ailton
 */
public final class ConsultaClientes extends javax.swing.JFrame {
    Cliente novoCliente = new Cliente(); //acessar os atributos da classe cliente
    SQL conectar = new SQL();
    public ConsultaClientes() {
        initComponents();
        preencherTabela("select * from cadastrocliente order by nome");       
        
    }
    private void buscarCliente(Cliente novoCliente){
        this.conectar.conectaBanco();
        
        String consultaCpf = (String) this.consultaCpf.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "cpf,"
                    + "sexo,"
                    + "endereco,"
                    + "cidade,"
                    + "estado,"
                    + "email,"
                    + "nascimento,"
                    + "telefone"
                 + " FROM"
                     + " cadastrocliente"
                 + " WHERE"
                     + " cpf = '" + consultaCpf + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoCliente.setNome(this.conectar.getResultSet().getString(1));
                novoCliente.setCpf(this.conectar.getResultSet().getString(2));
                novoCliente.setSexo(this.conectar.getResultSet().getString(3));
                novoCliente.setEndereco(this.conectar.getResultSet().getString(4));
                novoCliente.setCidade(this.conectar.getResultSet().getString(5));
                novoCliente.setEstado(this.conectar.getResultSet().getString(6));
                novoCliente.setEmail(this.conectar.getResultSet().getString(7));
                novoCliente.setNascimento(this.conectar.getResultSet().getString(8));
                novoCliente.setTelefone(this.conectar.getResultSet().getString(9));
           }
            
           if(novoCliente.getCpf()==""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }finally{
            consultanome.setText(novoCliente.getNome());
            consultacpf.setText(novoCliente.getCpf());
            consultaendereco.setText(novoCliente.getEndereco());
            consultacidade.setText(novoCliente.getCidade());
            consultaestado.setSelectedItem(novoCliente.getEstado());
            consultatelefone.setText(novoCliente.getTelefone());
            consultasexo.setSelectedItem(novoCliente.getSexo());
            consultaemail.setText(novoCliente.getEmail());
            consultadata.setText(novoCliente.getNascimento());
            this.conectar.fechaBanco();   
        }               
    }
     private void limparCamposCadastro(){
            consultaCpf.setText("");
            consultacpf.setText("");
            consultanome.setText("");
            consultasexo.setSelectedItem("");
            consultaendereco.setText("");
            consultacidade.setText("");
            consultaestado.setSelectedItem("");
            consultatelefone.setText("");
            consultaemail.setText("");
            consultadata.setText("");
       
    }
       private void deletarCliente(Cliente novoCliente){
        this.conectar.conectaBanco();
        String consultaCpf = this.consultaCpf.getText();        
        if("".equals(novoCliente.getCpf())){
                JOptionPane.showMessageDialog(null, "Digite um CPF válido");
           }else{
        try {            
            this.conectar.updateSQL(
                "DELETE FROM cadastrocliente "
                + " WHERE "
                    + "cpf = '" + consultaCpf + "'"
                + ";"            
            );
             if(novoCliente.getCpf()==""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
           }
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente");
           
        }finally{
            this.conectar.fechaBanco();
           
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");            
        }     
        
    }
       }
      
       public void atualizarCliente(Cliente novoCliente){
        this.conectar.conectaBanco();
        String consultaCpf = this.consultaCpf.getText();
        if("".equals(novoCliente.getCpf())){
                JOptionPane.showMessageDialog(null, "Digite um CPF válido");
           }
        else{
        try {
            this.conectar.updateSQL(
                "UPDATE cadastrocliente SET "                    
                    + "nome = '" + consultanome.getText() + "',"
                    + "cpf = '" + consultacpf.getText() + "',"
                    + "sexo = '" + consultasexo.getSelectedItem()+ "',"
                    + "endereco = '" + consultaendereco.getText() + "',"
                    + "cidade = '" + consultacidade.getText() + "',"                   
                    + "estado = '" + consultaestado.getSelectedItem()+ "',"
                    + "telefone = '" + consultatelefone.getText()+ "',"
                    + "email = '" + consultaemail.getText() + "',"
                    + "nascimento = '" + consultadata.getText() + "',"
                    + "estado = '" + consultaestado.getSelectedItem()+ "'"
                + " WHERE "
                    + "cpf = '" + consultaCpf + "'"
                + ";"
            );
              
        }catch(Exception e){
            System.out.println("Erro ao atualizar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente");
           
        }finally{
            this.conectar.fechaBanco();
           
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
        }
        
    }
       }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprodutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        consultaCpf = new javax.swing.JFormattedTextField();
        btpesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        consultanome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        consultaendereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        consultacidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        consultaemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        consultacpf = new javax.swing.JFormattedTextField();
        consultasexo = new javax.swing.JComboBox<>();
        consultaestado = new javax.swing.JComboBox<>();
        consultadata = new javax.swing.JFormattedTextField();
        consultatelefone = new javax.swing.JFormattedTextField();
        txtatualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Clientes");
        setResizable(false);

        jtprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jtprodutos);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Clientes Cadastrados");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Filtro de Pesquisa");

        jLabel4.setText("CPF");

        try {
            consultaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/lupa.png"))); // NOI18N
        btpesquisar.setText("Pesquisar");
        btpesquisar.setToolTipText("Pesquisar Cliente");
        btpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/broom.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setToolTipText("Limpar CPF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Nome");

        consultanome.setOpaque(false);

        jLabel6.setText("CPF");

        jLabel7.setText("Sexo");

        jLabel8.setText("Endereço");

        consultaendereco.setOpaque(false);

        jLabel9.setText("Cidade");

        consultacidade.setOpaque(false);

        jLabel10.setText("Estado");

        jLabel11.setText("E-mail");

        consultaemail.setOpaque(false);

        jLabel12.setText("Data Nascimento");

        jLabel13.setText("Telefone");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/reload.png"))); // NOI18N
        jButton3.setText("Atualizar Dados");
        jButton3.setToolTipText("Atualzar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/caixote-de-lixo.png"))); // NOI18N
        jButton4.setText("Deletar Cliente");
        jButton4.setToolTipText("Deletar Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            consultacpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        consultacpf.setOpaque(false);

        consultasexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não definido", "Masculino", "Feminino" }));
        consultasexo.setBorder(null);

        consultaestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            consultadata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        consultadata.setOpaque(false);

        try {
            consultatelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        consultatelefone.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(consultacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consultasexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(consultanome)
                            .addComponent(consultaendereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(consultaemail, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consultacidade, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(consultadata, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(consultaestado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(consultatelefone)
                                .addContainerGap())
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(400, 400, 400)))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultasexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultadata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultatelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btpesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(consultaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpesquisar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/refresh.png"))); // NOI18N
        txtatualizar.setToolTipText("Atualizar Tabela");
        txtatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(txtatualizar)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtatualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Clientes");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/logo_dino.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisarActionPerformed
      buscarCliente(novoCliente);
    }//GEN-LAST:event_btpesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limparCamposCadastro();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente exluir os dados?");
        if(resposta == JOptionPane.YES_OPTION){
            deletarCliente(novoCliente);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatualizarActionPerformed
        preencherTabela("select * from cadastrocliente order by nome");  
    }//GEN-LAST:event_txtatualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja atualizar os dados?");
       
        if (resposta == JOptionPane.YES_OPTION){
            atualizarCliente(novoCliente); 
        }
    }//GEN-LAST:event_jButton3ActionPerformed
 public void preencherTabela(String Sql){
      ArrayList dados = new ArrayList();
      String [] colunas = new String[] {"Nome","CPF","Telefone"}; 
      conectar.conectaBanco();
      conectar.executarSQL(Sql);
      try {
          conectar.resultSet.first();
          do {              
              dados.add(new Object[]{conectar.resultSet.getString("nome"),conectar.resultSet.getString("cpf"),conectar.resultSet.getString("telefone")});
              
          } while (conectar.resultSet.next());
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Nenhum cliente cadastrado!");
         
      }
      ModeloTabela modelo = new ModeloTabela(dados, colunas);
      jtprodutos.setModel(modelo);
      jtprodutos.getColumnModel().getColumn(0).setPreferredWidth(123);
      jtprodutos.getColumnModel().getColumn(0).setResizable(false);
      
      jtprodutos.getColumnModel().getColumn(1).setPreferredWidth(120);
      jtprodutos.getColumnModel().getColumn(1).setResizable(false);
      
      jtprodutos.getColumnModel().getColumn(2).setPreferredWidth(120);
      jtprodutos.getColumnModel().getColumn(2).setResizable(false);
      
  
     
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
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaClientes().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpesquisar;
    private javax.swing.JFormattedTextField consultaCpf;
    private javax.swing.JTextField consultacidade;
    private javax.swing.JFormattedTextField consultacpf;
    private javax.swing.JFormattedTextField consultadata;
    private javax.swing.JTextField consultaemail;
    private javax.swing.JTextField consultaendereco;
    private javax.swing.JComboBox<String> consultaestado;
    private javax.swing.JTextField consultanome;
    private javax.swing.JComboBox<String> consultasexo;
    private javax.swing.JFormattedTextField consultatelefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtprodutos;
    private javax.swing.JButton txtatualizar;
    // End of variables declaration//GEN-END:variables
}
