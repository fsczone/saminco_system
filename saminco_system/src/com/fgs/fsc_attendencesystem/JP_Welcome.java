/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fgs.fsc_attendencesystem;

import java.awt.Color;
import javax.swing.GroupLayout;

/**
 *
 * @author Pamitha Gayashan
 */
public class JP_Welcome extends javax.swing.JPanel {

    /**
     * Creates new form Welcome
     */
    public JP_Welcome() {
        initComponents();

        lb_Email.setVisible(false);
        lb_Password.setVisible(false);
        pf_Password.setEchoChar((char) 0);
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
        lb_Email = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        lb_Password = new javax.swing.JLabel();
        pf_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        bt_Login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 118, 210));
        setPreferredSize(new java.awt.Dimension(1366, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 87, 155));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Email.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Email.setText("User Name");
        jPanel1.add(lb_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 295, 16));

        tf_Email.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tf_Email.setForeground(new java.awt.Color(102, 102, 102));
        tf_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Email.setText("User Name");
        tf_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_EmailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_EmailMousePressed(evt);
            }
        });
        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 295, 30));

        lb_Password.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Password.setText("Password");
        jPanel1.add(lb_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 295, 16));

        pf_Password.setForeground(new java.awt.Color(102, 102, 102));
        pf_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pf_Password.setText("Password");
        pf_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_PasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_PasswordMousePressed(evt);
            }
        });
        jPanel1.add(pf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 295, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1485535779_lock.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 128, 128));

        jCheckBox1.setBackground(new java.awt.Color(1, 87, 155));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Attendance System");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setFocusPainted(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        bt_Login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bt_Login.setText("LOGIN");
        bt_Login.setBorderPainted(false);
        bt_Login.setFocusPainted(false);
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 299, 340, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/017-512.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 512, 512));
    }// </editor-fold>//GEN-END:initComponents

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    private void tf_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_EmailMouseClicked

    }//GEN-LAST:event_tf_EmailMouseClicked

    private void pf_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_PasswordMouseClicked

    }//GEN-LAST:event_pf_PasswordMouseClicked

    private void tf_EmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_EmailMousePressed
        String tfgettext = tf_Email.getText();

        if (tfgettext.equals("User Name")) {
            tf_Email.setText("");
            lb_Email.setVisible(true);
            tf_Email.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_EmailMousePressed

    private void pf_PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_PasswordMousePressed

        String pw = new String(pf_Password.getPassword());

        if (pw.equals("Password")) {
            pf_Password.setText("");
            pf_Password.setEchoChar('*');
            lb_Password.setVisible(true);
            pf_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_PasswordMousePressed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        try {
            
            String pass = new String(pf_Password.getPassword());
            
            Attendance attendance = new Attendance();

            index.JP_main.removeAll();
            GroupLayout layout = new GroupLayout(index.JP_main);
            index.JP_main.setLayout(layout);

            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(attendance, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(attendance, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Login;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Password;
    private javax.swing.JPasswordField pf_Password;
    private javax.swing.JTextField tf_Email;
    // End of variables declaration//GEN-END:variables
}
