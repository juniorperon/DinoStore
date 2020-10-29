/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cadastroDino = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        nascimento = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        txtSexo = new javax.swing.JComboBox<>();
        txttelefone = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        txtnasc = new javax.swing.JFormattedTextField();
        nome1 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        txtsenha = new javax.swing.JPasswordField();
        endereco1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        cadastroDino.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cadastroDino.setText("Cadastro Clientes");

        nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        email.setText("Email");

        voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/cadastrar.png"))); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        nascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nascimento.setText("Nascimento");

        endereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereco.setText("Endereço");

        estado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        estado.setText("Estado");

        sexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sexo.setText("Sexo");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não definido", "Masculino", "Feminino" }));

        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });

        telefone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        telefone.setText("Telefone");

        cidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cidade.setText("Cidade");

        try {
            txtnasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nome1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome1.setText("CPF");

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        endereco1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereco1.setText("Senha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(cadastroDino)
                .addGap(150, 150, 150))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtendereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nascimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txttelefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnasc, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
                        .addComponent(sexo)
                        .addComponent(estado)
                        .addComponent(cidade)
                        .addComponent(txtCidade)
                        .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcpf)
                        .addComponent(nome1)
                        .addComponent(txtsenha))
                    .addComponent(endereco1))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroDino)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(nome1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nascimento)
                    .addComponent(sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(endereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtendereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (txtNome.getText().equals("") 
                || txtCidade.getText().equals("")
                    || txtcpf.getText().equals("") 
                        || txtendereco.getText().equals("")
                            || txtnasc.getText().equals("")                                                              
                                    || txtemail.getText().equals("")
                                        || txttelefone.getText().equals("")
                                           || txtsenha.getPassword().equals("")
                                               || txtSexo.equals(0)){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
                                    
        }else {
            JOptionPane.showMessageDialog(rootPane, "Usuário Cadastrado com Sucesso!");
            txtCidade.setText("");
            txtNome.setText("");
            txtcpf.setText("");
            txtendereco.setText("");
            txtnasc.setText("");
            txtEstado.setSelectedIndex(0);
            txtSexo.setSelectedIndex(0);
            txtemail.setText("");
            txttelefone.setText("");
            txtsenha.setText("");
        }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel cadastroDino;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel endereco1;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtnasc;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
