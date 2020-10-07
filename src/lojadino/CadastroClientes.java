
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
    private String senha;
    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(getBackground());

        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 110, 70, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(490, 140, 150, 20);

        jLabel8.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel8.setText("Cidade");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 170, 80, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(490, 200, 150, 20);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel9.setText("Endereco");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 240, 50, 20);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(490, 270, 150, 20);

        jLabel10.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel10.setText("Senha");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 300, 40, 20);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(490, 330, 150, 20);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Clientes");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 30, 350, 50);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 110, 40, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 140, 150, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 200, 150, 20);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 170, 50, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 270, 150, 20);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setText("Data de Nascimento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 240, 120, 20);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel6.setText("Telefone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 300, 50, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 330, 150, 20);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 390, 73, 23);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(530, 390, 73, 23);

        jRadioButton1.setText("Masculino");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(550, 50, 71, 23);

        jRadioButton2.setText("Feminino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(660, 50, 70, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/background1.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
