/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino;
;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        txtsenha1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLogar = new javax.swing.JButton();
        txtCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DinoStore");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 420, 778, 0);
        getContentPane().add(txtsenha1);
        txtsenha1.setBounds(200, 210, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Acessar Sistema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 40, 320, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Login CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 100, 120, 20);

        txtlogin.setToolTipText("CPF");
        txtlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtlogin);
        txtlogin.setBounds(200, 120, 240, 30);
        txtlogin.getAccessibleContext().setAccessibleName("CPF");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 180, 50, 25);

        txtLogar.setBackground(new java.awt.Color(255, 255, 255));
        txtLogar.setText("Logar");
        txtLogar.setBorder(null);
        txtLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogarActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogar);
        txtLogar.setBounds(200, 270, 90, 30);

        txtCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        txtCadastrar.setText("Cadastrar");
        txtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadastrar);
        txtCadastrar.setBounds(330, 270, 110, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel11.setText("D");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 10, 17, 33);

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel12.setText("i");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 40, 34, 33);

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel13.setText("n");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 70, 15, 33);

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel14.setText("o");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 100, 15, 33);

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel15.setText("S");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(30, 140, 11, 33);

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel16.setText("t");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 170, 9, 33);

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel17.setText("o");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(30, 200, 15, 33);

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel18.setText("r");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(30, 230, 9, 33);

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel19.setText("e");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(30, 270, 12, 33);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(480, 0, 80, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojadino/background1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 350);

        jLabel5.setText("jLabel5");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 0, 140, 340);

        setSize(new java.awt.Dimension(576, 392));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastrarActionPerformed
        new CadastroClientes().setVisible(true);
    }//GEN-LAST:event_txtCadastrarActionPerformed

    private void txtLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogarActionPerformed
        if(txtlogin.getText().equals("teste") && txtsenha1.getText().equals("1234")){
        new TelaPrincipal().setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha inválidos");
        }
    }//GEN-LAST:event_txtLogarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton txtCadastrar;
    private javax.swing.JButton txtLogar;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha1;
    // End of variables declaration//GEN-END:variables
}