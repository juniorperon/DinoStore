package lojadino;

public class CadastroProdutos extends javax.swing.JFrame {


    private int id;
    private String nome;
    private String especie;
    private String nascimento;
    private String alimentacao;
    private int tamanho;
    private int sexo;
    
    public CadastroProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jPanel2 = new javax.swing.JPanel();
        CadastroDinossauros = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        txtAlimentacao = new javax.swing.JTextField();
        Nascimento = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        Especie = new javax.swing.JLabel();
        Alimentacao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JComboBox<>();
        Tamanho = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        txtEspecie = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
=======
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Dinossauro");
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
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        CadastroDinossauros.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        CadastroDinossauros.setText("Cadastro Dinossauros");

        Nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Nome.setText("Nome");

        Nascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Nascimento.setText("Nascimento");

        voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/Imagens/close.png"))); // NOI18N
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

        Especie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Especie.setText("Especie");

        Alimentacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Alimentacao.setText("Alimentação");

        txtTamanho.setEditable(true);
        txtTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande", "ExtraGrande" }));
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });

        Tamanho.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Tamanho.setText("Tamanho");

        Sexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sexo.setText("Sexo");

        txtSexo.setEditable(true);
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não definido", "Masculino", "Feminino" }));
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nascimento)
                            .addComponent(Nome)
                            .addComponent(Especie)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alimentacao)
                    .addComponent(txtAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamanho)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexo))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(CadastroDinossauros)
                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(CadastroDinossauros)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(Alimentacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especie)
                    .addComponent(Tamanho))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Nascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Sexo)
                        .addGap(9, 9, 9)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
=======

        jPanel1.setToolTipText("Cadastro");
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Alimentação");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 140, 100, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(490, 170, 150, 22);

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Comprimento");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 200, 100, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(490, 230, 150, 22);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Altura");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 270, 120, 20);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(490, 300, 150, 22);

        jLabel10.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Peso");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 330, 90, 20);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(490, 360, 150, 22);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cadastro de Dinossauros");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 60, 420, 50);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 140, 100, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 170, 150, 22);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 230, 150, 22);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Especie");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 200, 110, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 300, 150, 22);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data de Nascimento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 270, 120, 20);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nacionalidade");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 330, 120, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 360, 150, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(183, 420, 120, 22);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 420, 110, 22);

        jRadioButton1.setText("Macho");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(610, 50, 70, 20);

        jRadioButton2.setText("Femea");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(610, 90, 70, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/background1.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 450);
>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
<<<<<<< HEAD
=======

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

>>>>>>> 4cef3eea7a3dacfaf159e58934bcab38be547186
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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
        
    }
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

    }//GEN-LAST:event_voltarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
  
    }//GEN-LAST:event_cadastrarActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed

    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed

    }//GEN-LAST:event_txtSexoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alimentacao;
    private javax.swing.JLabel CadastroDinossauros;
    private javax.swing.JLabel Especie;
    private javax.swing.JLabel Nascimento;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Tamanho;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAlimentacao;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JComboBox<String> txtTamanho;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
