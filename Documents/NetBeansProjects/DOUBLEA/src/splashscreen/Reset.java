/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashscreen;


import javax.swing.*;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reset extends javax.swing.JFrame {

 Connection connect;
PreparedStatement stmt;
   
    public class Mysqlconnection{
      
    }
    public Reset() {
        initComponents();
        createConnection();
    }
void createConnection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
        }
            catch(ClassNotFoundException|SQLException ex){
                    
                  }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrestusername = new javax.swing.JTextField();
        txtrestnewpassword = new javax.swing.JTextField();
        txtrestconfirmpassword = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtnewfirstname = new javax.swing.JTextField();
        txtmiddlename = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSplitPane3 = new javax.swing.JSplitPane();
        btnokay = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtconfirmpassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        txtnewid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtrestoldpassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\padloc.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 70, 50));

        jLabel3.setBackground(java.awt.Color.green);
        jLabel3.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setText("NEW USER OR RESET CREDENTIALS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 380, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\icons8-manager-64.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 50));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 80, 20));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel6.setText("New password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 110, 20));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel7.setText("Confirm password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 110, -1));
        getContentPane().add(txtrestusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 30));
        getContentPane().add(txtrestnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 30));
        getContentPane().add(txtrestconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 30));

        btncreate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btncreate.setText("CREATE");
        btncreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncreateMouseClicked(evt);
            }
        });
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 100, -1));

        Panel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 2, true));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\coolenvironment.png")); // NOI18N
        Panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 150));

        jLabel10.setText("jLabel10");
        Panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 135, -1, 0));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("CREATE");
        Panel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 500, 220));

        lblReset.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        lblReset.setForeground(java.awt.Color.red);
        lblReset.setText("Reset/Ceate successful!!");
        getContentPane().add(lblReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, 30));
        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 10, 230));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 110, 40));

        jLabel12.setText("Middle Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 80, 20));

        jLabel13.setText("Last Name");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("Sign Up");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 90, 30));
        getContentPane().add(txtnewfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 120, 30));
        getContentPane().add(txtmiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 120, 30));
        getContentPane().add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 920, 10));
        getContentPane().add(jSplitPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 10, 230));

        btnokay.setText("OKAY");
        btnokay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnokayMouseClicked(evt);
            }
        });
        btnokay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokayActionPerformed(evt);
            }
        });
        getContentPane().add(btnokay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 170, 30));

        jLabel16.setText("First Name");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));
        getContentPane().add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 20, 130));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 452, 490, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 440, -1));

        jLabel11.setText("Enter password");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        jLabel15.setText("Confirm password");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));
        getContentPane().add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 130, 30));

        jLabel17.setText("Enter ID No.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));
        getContentPane().add(txtnewid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("RESET/CREATE NEW ACCOUNT ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 280, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("RESET");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 80, -1));
        getContentPane().add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 130, 30));

        jLabel20.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel20.setText("Old password");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        getContentPane().add(txtrestoldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\gift.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 150));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\VIN.gif")); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 30, 1060, 220));

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 940, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreateActionPerformed

    private void btncreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateMouseClicked
        // TODO add your handling code here:
        Panel2.setVisible(false);
        lblReset.setVisible(false);
        txtnewfirstname.setVisible(true);
        txtmiddlename.setVisible(true);
        txtlastname.setVisible(true);
        txtnewid.setVisible(true);
        txtnewpassword.setVisible(true);
       txtconfirmpassword.setVisible(true);
       btnokay.setVisible(true);
        Login log= new Login();
      
    }//GEN-LAST:event_btncreateMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Login loger= new Login();
        loger.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
       Panel2.setVisible(true);
        //jButton3.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void btnokayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokayMouseClicked
        // TODO add your handling code here:
       // panel10.setVisible(true);
        jButton3.setEnabled(false);
        btncreate.setEnabled(false);
        btnokay.setVisible(false);
        lblReset.setVisible(true);
       
    }//GEN-LAST:event_btnokayMouseClicked

    private void btnokayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokayActionPerformed
     // TODO add your handling code here:
     try{
     int ID= Integer.parseInt(txtnewid.getText());
     String Firstname =txtnewfirstname.getText();
     String Secondname =txtmiddlename.getText();
     String Lastname =txtlastname.getText();
     String Password =txtnewpassword.getText();
     String Confirmpassword =txtconfirmpassword.getText();
     
     PreparedStatement stmt =connect.prepareStatement("INSERT INTO signup VALUES(?,?,?,?,?,?)");
     stmt.setInt(1, ID);
     stmt.setString(2, Firstname);
     stmt.setString(3,Secondname);
     stmt.setString(4,Lastname);
     stmt.setString(5,Password);
     stmt.setString(6,Confirmpassword);
     stmt.executeUpdate();
     JOptionPane.showMessageDialog(null,"SIGNUP SUCCESSFUL!!!");
    JOptionPane.showMessageDialog(null,"Created Successfully!!!");
     stmt.close();
     
     }
     catch(SQLException ex){
         
     }
    }//GEN-LAST:event_btnokayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
     String Username =txtrestusername.getText();       
     String Oldpassword =txtrestoldpassword.getText();
    String Newpassword =txtrestnewpassword.getText();
    String Confirmpassword =txtrestconfirmpassword.getText();
     PreparedStatement stmt =connect.prepareStatement("INSERT INTO reset VALUES(?,?,?,?)");
     stmt.setString(1,Username);
     stmt.setString(2,Oldpassword);
     stmt.setString(3,Newpassword);
     stmt.setString(4,Confirmpassword);
     stmt.executeUpdate();
     JOptionPane.showMessageDialog(null,"RESET SUCCESSFUL!!!");
     JOptionPane.showMessageDialog(null,"Created Successfully!!!");
     stmt.close();
     
     }
     catch(SQLException ex){
         
     }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset().setVisible(true);
                txtnewfirstname.setVisible(false);
                txtmiddlename.setVisible(false);
                txtlastname.setVisible(false);
                txtnewid.setVisible(false);
                 txtnewpassword.setVisible(false);
               txtconfirmpassword.setVisible(false);
               btnokay.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel2;
    private javax.swing.JButton btncreate;
    public static javax.swing.JButton btnokay;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    public static javax.swing.JLabel lblReset;
    public static javax.swing.JPasswordField txtconfirmpassword;
    public static javax.swing.JTextField txtlastname;
    public static javax.swing.JTextField txtmiddlename;
    public static javax.swing.JTextField txtnewfirstname;
    private static javax.swing.JTextField txtnewid;
    public static javax.swing.JTextField txtnewpassword;
    private javax.swing.JTextField txtrestconfirmpassword;
    private javax.swing.JTextField txtrestnewpassword;
    private javax.swing.JTextField txtrestoldpassword;
    public javax.swing.JTextField txtrestusername;
    // End of variables declaration//GEN-END:variables
}
