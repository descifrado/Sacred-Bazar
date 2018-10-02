package Server_Side;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class adminLogin extends javax.swing.JFrame
{

    public adminLogin() 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=400;
        int wd=550;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht);
        this.setTitle("SACRED BAZAR: ADMIN LOG IN");
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
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        LILabel = new javax.swing.JLabel();
        PASSLAbel = new javax.swing.JLabel();
        UNTF = new javax.swing.JTextField();
        LIBT = new javax.swing.JButton();
        BKBT = new javax.swing.JButton();
        PASSTF = new javax.swing.JPasswordField();
        AILbel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(80, 20, 60, 60);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("HELLO ADMIN....!!");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(180, 30, 280, 40);

        LILabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LILabel.setText("Log In Id");
        jPanel1.add(LILabel);
        LILabel.setBounds(30, 140, 70, 20);

        PASSLAbel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PASSLAbel.setText("Password");
        jPanel1.add(PASSLAbel);
        PASSLAbel.setBounds(30, 220, 70, 17);

        UNTF.setBackground(new java.awt.Color(215, 218, 243));
        UNTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(UNTF);
        UNTF.setBounds(170, 140, 150, 30);

        LIBT.setBackground(new java.awt.Color(204, 204, 255));
        LIBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LIBT.setText("LOG IN");
        LIBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIBTActionPerformed(evt);
            }
        });
        jPanel1.add(LIBT);
        LIBT.setBounds(30, 300, 90, 40);

        BKBT.setBackground(new java.awt.Color(204, 204, 255));
        BKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BKBT.setText("EXIT");
        BKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BKBT);
        BKBT.setBounds(240, 300, 90, 40);

        PASSTF.setBackground(new java.awt.Color(215, 218, 243));
        PASSTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(PASSTF);
        PASSTF.setBounds(170, 220, 150, 30);

        AILbel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.jpg"))); // NOI18N
        jPanel1.add(AILbel);
        AILbel.setBounds(370, 100, 160, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LIBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIBTActionPerformed
        // TODO add your handling code here:
        String logid=UNTF.getText();
        String pass=PASSTF.getText();
        if(UNTF.getText().isEmpty() && PASSTF.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter The Credentials");
        }
        else if(logid.equals("modi@descifrado") && pass.equals("anuj@1234"))
        {
            JOptionPane.showMessageDialog(this,"Welcome Back Descifrado: The ADMIN");
            new adminPage().show();
            this.dispose();
        }
    }//GEN-LAST:event_LIBTActionPerformed

    private void BKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BKBTActionPerformed

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AILbel;
    private javax.swing.JButton BKBT;
    private javax.swing.JButton LIBT;
    private javax.swing.JLabel LILabel;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel PASSLAbel;
    private javax.swing.JPasswordField PASSTF;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JTextField UNTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
