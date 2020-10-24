
package lojadino;

public class CadastroClientes extends javax.swing.JFrame {


    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String nascimento;
    private String endereco;
    private String estado;
    private String cidade;
    private String sexo;
    
    public CadastroClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CadastroClientes = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        Nascimento = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Email = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEstado = new javax.swing.JComboBox<>();
        Estado = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        Telefone = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
=======
        primeiropainel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txtcancelar = new javax.swing.JButton();
        txtcadastrar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtsenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroCliente");
        setBackground(getBackground());
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
<<<<<<< HEAD

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/logo_dino.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("DINOSTORE");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Trazendo o diferencial em dinossauros até você");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        CadastroClientes.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        CadastroClientes.setText("Cadastro Clientes");

        Nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Nome.setText("Nome");

        Nascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Nascimento.setText("Nascimento");

        Voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/close.png"))); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/cadastrar.png"))); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Email.setText("Email");

        Endereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Endereco.setText("Endereço");

        txtEstado.setEditable(true);
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
=======

        primeiropainel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        primeiropainel.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel7.setText("Usuario");
        primeiropainel.add(jLabel7);
        jLabel7.setBounds(490, 110, 70, 20);

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        primeiropainel.add(txtusuario);
        txtusuario.setBounds(490, 140, 150, 20);

        jLabel8.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel8.setText("Cidade");
        primeiropainel.add(jLabel8);
        jLabel8.setBounds(490, 170, 80, 20);
        primeiropainel.add(jTextField6);
        jTextField6.setBounds(490, 200, 150, 20);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel9.setText("Endereco");
        primeiropainel.add(jLabel9);
        jLabel9.setBounds(490, 240, 50, 20);
        primeiropainel.add(jTextField7);
        jTextField7.setBounds(490, 270, 150, 20);

        jLabel10.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel10.setText("Senha");
        primeiropainel.add(jLabel10);
        jLabel10.setBounds(490, 300, 40, 20);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Clientes");
        primeiropainel.add(jLabel2);
        jLabel2.setBounds(170, 30, 350, 50);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setText("Nome");
        primeiropainel.add(jLabel3);
        jLabel3.setBounds(170, 110, 40, 20);
        primeiropainel.add(txtnome);
        txtnome.setBounds(170, 140, 150, 20);
        primeiropainel.add(jTextField2);
        jTextField2.setBounds(170, 200, 150, 20);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        primeiropainel.add(jLabel4);
        jLabel4.setBounds(170, 170, 50, 20);
        primeiropainel.add(jTextField3);
        jTextField3.setBounds(170, 270, 150, 20);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento");
        primeiropainel.add(jLabel5);
        jLabel5.setBounds(170, 240, 120, 20);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel6.setText("Telefone");
        primeiropainel.add(jLabel6);
        jLabel6.setBounds(170, 300, 50, 20);
        primeiropainel.add(jTextField4);
        jTextField4.setBounds(170, 330, 150, 20);

        txtcancelar.setBackground(new java.awt.Color(255, 255, 255));
        txtcancelar.setText("Cancelar");
        txtcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcancelarActionPerformed(evt);
            }
        });
        primeiropainel.add(txtcancelar);
        txtcancelar.setBounds(530, 390, 90, 23);

        txtcadastrar.setBackground(new java.awt.Color(255, 255, 255));
        txtcadastrar.setText("Cadastrar");
        txtcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadastrarActionPerformed(evt);
            }
        });
        primeiropainel.add(txtcadastrar);
        txtcadastrar.setBounds(200, 390, 90, 23);

        jRadioButton1.setText("Masculino");
        primeiropainel.add(jRadioButton1);
        jRadioButton1.setBounds(550, 50, 71, 23);

        jRadioButton2.setText("Feminino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        Estado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Estado.setText("Estado");

        Cidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Cidade.setText("Cidade");

        txtSexo.setEditable(true);
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não definido", "Masculino", "Feminino" }));
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        Telefone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Telefone.setText("Telefone");

        Sexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sexo.setText("Sexo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nascimento)
                                        .addComponent(Nome)
                                        .addComponent(Email)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(104, 104, 104))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cidade)
                    .addComponent(Sexo)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastroClientes)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastroClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(Estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade)
                    .addComponent(Nascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(Sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
=======
        primeiropainel.add(jRadioButton2);
        jRadioButton2.setBounds(660, 50, 70, 23);

        txtsenha.setText("jPasswordField1");
        primeiropainel.add(txtsenha);
        txtsenha.setBounds(490, 330, 150, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/background1.jpg"))); // NOI18N
        primeiropainel.add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 450);
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addComponent(primeiropainel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(primeiropainel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186
        );

        primeiropainel.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
        /**
=======
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_txtcancelarActionPerformed

    private void txtcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadastrarActionPerformed
            this.nome = txtnome.getText();
       new Login().setVisible(true);
        
    }//GEN-LAST:event_txtcadastrarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        this.cidade = txtusuario.getText();// TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    /**
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186
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
    
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed

    }//GEN-LAST:event_VoltarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

    }//GEN-LAST:event_CadastrarActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed

    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed

    }//GEN-LAST:event_txtSexoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel CadastroClientes;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Nascimento;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtTelefone;
=======
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel primeiropainel;
    private javax.swing.JButton txtcadastrar;
    private javax.swing.JButton txtcancelar;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186
    // End of variables declaration//GEN-END:variables
}
