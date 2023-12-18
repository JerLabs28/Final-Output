/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
        initComponents();
        customizeTextFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail_Num = new javax.swing.JTextField();
        jPassHide = new javax.swing.JPasswordField();
        jShowpass = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        btnForgot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnForgot1 = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("WELCOME BACK!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Signin to your Account!");

        txtEmail_Num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail_Num.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail_Num.setText("Enter email or phone number");

        jPassHide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPassHide.setForeground(new java.awt.Color(153, 153, 153));
        jPassHide.setText("Password");

        jShowpass.setText("Show password");
        jShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowpassActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 102));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(51, 0, 102));
        btnSignUp.setText("Register now!");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnForgot.setBackground(new java.awt.Color(51, 0, 255));
        btnForgot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForgot.setForeground(new java.awt.Color(51, 0, 102));
        btnForgot.setText("Sign Up");
        btnForgot.setBorder(null);
        btnForgot.setBorderPainted(false);
        btnForgot.setContentAreaFilled(false);
        btnForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("________________________________________________________________________________");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email Addess or Phone number ");

        btnForgot1.setBackground(new java.awt.Color(51, 0, 255));
        btnForgot1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnForgot1.setText("Forgot password?");
        btnForgot1.setBorder(null);
        btnForgot1.setBorderPainted(false);
        btnForgot1.setContentAreaFilled(false);
        btnForgot1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgot1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jShowpass)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail_Num, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                .addComponent(jPassHide))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnForgot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnForgot)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPassHide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShowpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForgot)
                    .addComponent(btnForgot1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        btnLogin1.setBackground(new java.awt.Color(51, 0, 102));
        btnLogin1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("HOTEL RESERVATION J&D");
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String emailNum = txtEmail_Num.getText();
        String password = String.valueOf(jPassHide.getPassword());

        if (emailNum.isEmpty() || emailNum.equals("Email or phone number") || password.isEmpty() || password.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Please enter both email/number and password!", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            if (emailNum.isEmpty() || emailNum.equals("Email or phone number")) {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            if (password.isEmpty() || password.equals("Password")) {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Darel Briones\\Downloads\\Darel-Gwapo-main\\Darel-Gwapo-main\\Briones_RegisterLogIn\\RESERVATION ACCOUNT INFORMATION\\" + txtEmail_Num.getText() + ".txt"))) {
        String line;
        boolean loggedIn = false;
        String emailLine = "Email/Num.: " + emailNum;
        String passLine = "Password: " + password;
        while ((line = reader.readLine()) != null) {
            if (line.equals(emailLine)) {
                String nextLine = reader.readLine();
                if (nextLine != null && nextLine.equals(passLine)) {
                    loggedIn = true;
                    break;
                }
            }
        }

        if (loggedIn) {
            txtEmail_Num.setText("Email or phone number");
            jPassHide.setText("Password");
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            HotelReservation x = new HotelReservation();
            x.transferEmailNum(emailNum);
            x.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email/number or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "File does not exist or an error occurred!", "File Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        JOptionPane.showMessageDialog(this, "Balik buhat account uyy!", "Wakoy labot, muna bungwon man!", JOptionPane.WARNING_MESSAGE);
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnForgotActionPerformed
    public String getEmailNumText() {
        return txtEmail_Num.getText();
    }

    private void jShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowpassActionPerformed
        if(jShowpass.isSelected()){
            jPassHide.setEchoChar((char)0);
        }else{
            jPassHide.setEchoChar('*');
        }
    }//GEN-LAST:event_jShowpassActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnForgot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgot1ActionPerformed
    
     private void customizeTextFields() {

    txtEmail_Num.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().equals("Email or phone number")) {
                txtEmail_Num.setText("");
                txtEmail_Num.setForeground(Color.BLACK);
            }
            txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().isEmpty()) {
                txtEmail_Num.setText("Email or phone number");
                txtEmail_Num.setForeground(Color.GRAY);
            }
        }
    });

    jPassHide.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.equals("Password")) {
                jPassHide.setText("");
                jPassHide.setEchoChar('*');
                jPassHide.setForeground(Color.BLACK);
            }
            jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.isEmpty()) {
                jPassHide.setText("Password");
                jPassHide.setEchoChar((char) 0);
                jPassHide.setForeground(Color.GRAY);
            }
        }
    });
}
    
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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnForgot1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassHide;
    private javax.swing.JCheckBox jShowpass;
    private javax.swing.JTextField txtEmail_Num;
    // End of variables declaration//GEN-END:variables
}
