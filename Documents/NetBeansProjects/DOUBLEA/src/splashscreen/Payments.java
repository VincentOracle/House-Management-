/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
//import java.sql.createStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.util.Date;

public class Payments extends javax.swing.JFrame {
   ResultSet rs;
    Connection connect;
    Statement stmt;
   PreparedStatement stmts;
    public Payments() {
        initComponents();
        ShowDate();
        ShowTime();
    }

    void createConnection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
        }
            catch(ClassNotFoundException|SQLException ex){
                    
                    } 
    }
    void ShowDate(){
        SimpleDateFormat sd= new SimpleDateFormat("dd-MM-YYYY");
        Date d=new Date();
        date.setText(sd.format(d));
    }
    void ShowTime(){
        new Timer(0,new ActionListener(){
            @Override
         public void actionPerformed(ActionEvent  e){
             SimpleDateFormat sd= new SimpleDateFormat("hh:mm:ss a");
        Date d=new Date();
        timer.setText(sd.format(d));
        
         }  
       }).start();
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resettable = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        officeequpt = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        timer = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jLabel33 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("DOUBLE A PAYMENT RECORDS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jTextField1.setBackground(java.awt.Color.red);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1350, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\icons8-search-24.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 40, 30));

        jSplitPane1.setBackground(new java.awt.Color(102, 0, 0));
        jSplitPane1.setForeground(new java.awt.Color(153, 0, 51));
        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 10, 450));

        jSplitPane2.setBackground(new java.awt.Color(0, 51, 51));
        jSplitPane2.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 10, 450));
        getContentPane().add(jSplitPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 10, 450));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("INVOICE/STATEMENTS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 160, -1));

        resettable.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 2, true));
        resettable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resettable.setForeground(java.awt.Color.blue);
        resettable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATE", "TENANT NAME", "AMOUNT", "BALANCE"
            }
        ));
        jScrollPane1.setViewportView(resettable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, 160));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("SELECT DATE");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 320, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("RECEIPT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 300, 170));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 50, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.green, java.awt.Color.pink, java.awt.Color.blue, java.awt.Color.red));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 120, 60));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("EXPENSES");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 110, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("SALARIES");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("AMOUNT COLLECTED TO THE LANDLORD");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.magenta, 2));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 130, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL IS:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("PROFIT GENERATED");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1380, 10));

        panel5.setBackground(new java.awt.Color(0, 153, 153));
        panel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 1, true));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\maner.png")); // NOI18N
        panel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 299, 240, 100));
        panel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 232, 311, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -40, -1, 20));

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\wp2761418-gif-animation-wallpaper.gif")); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        panel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 840, 300));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\PAY.gif")); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        panel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 550, 300));

        getContentPane().add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 1060, 300));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel15.setText("MANAGER");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel16.setText("LANDLORD");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel17.setText("AGENT");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 50, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel18.setText("RECEPTIONIST");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel19.setText("OFFICE ASSISTANT");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel20.setText("ACCOUNTANT");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 100, 30));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 100, 30));

        jTextField11.setText(" ");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 100, 30));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 100, 30));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 100, 30));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 100, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("OFFICE EQUIPTMENT");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("OFFICE RENT");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("FUEL");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("VEHICLE MAINTAINANCE");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("MISCELLENIOUS");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));
        getContentPane().add(officeequpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 120, 30));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 120, 30));
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 120, 30));
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 120, 30));
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 120, 30));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel28.setForeground(java.awt.Color.red);
        jLabel28.setText("AGENTS AND ESTATES CATEGORY");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 542, 1380, 10));

        jLabel29.setBackground(new java.awt.Color(102, 0, 102));
        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\totalmo.png")); // NOI18N
        jLabel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 0), 2, true));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 160, 140));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 382, 260, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 310, -1));

        jLabel35.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.red);
        jLabel35.setText("RECORD TYPE");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 490, 10));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("TOTAL EXPENSES AMOUNT");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        jTextField32.setBorder(new javax.swing.border.LineBorder(java.awt.Color.pink, 2, true));
        getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 130, 40));

        timer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(51, 0, 153));
        timer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        getContentPane().add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        date.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 153));
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, 150, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 153));
        jLabel42.setText("Date");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 60, 20));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 204));
        jLabel43.setText("Time");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton2.setText("PRINT");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 90, -1));

        generate.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        generate.setText("GENERATE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel4.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 150, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton4.setText("RESTART");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 130, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 120, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton5.setText("PRINT");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 150, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1370, 60));

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jTabbedPane1.setForeground(new java.awt.Color(204, 0, 0));

        jTable1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TENANTS ID", "ROOM(Low)", "TOTAL PAID", "BALANCE", "DATE PAID", "STATUS"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane1.addTab("LOW INCOME HOUSES", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TENANT ID", "ROOM(Midd)", "TOTAL PAID", "BALANCE", "DATE PAID", "STATUS"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jTabbedPane1.addTab("MIDDLE INCOME HOUSES", jScrollPane4);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TENANT ID", "ROOM(High)", "TOTAL PAID", "BALANCE", "DATE PAID", "STATUS"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTabbedPane1.addTab("HIGH INCOME HOUSES", jScrollPane3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 490, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText(" AMOUNT COLLECTED");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 80, 30));

        jLabel7.setText("AGENT A");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel8.setText("AGENT B");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel31.setText("AGENT C");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 80, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 80, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\maner.png")); // NOI18N
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 0), 2, true));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 250, 60));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\pear.png")); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 440, 180, 60));
        getContentPane().add(jSplitPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 10, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel33.setText("DEFAULTERS");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 30));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 80, 30));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 342, 80, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("VACANT HOUSES");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        panel5.setVisible(false);
      //  panel6.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
       this.dispose();
        Login log= new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panel5.setVisible(false);
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String sum ="SELECT SUM(Officeequiptment)  FROM expenses ";
               String rentsum ="SELECT SUM(rent)  FROM expenses ";
                stmts=connect.prepareStatement(sum);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Officeequiptment)");
                    officeequpt.setText(summation);
                }
      }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
           try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String sum ="SELECT SUM(Officerent)  FROM expenses ";
              // String rentsum ="SELECT SUM(rent)  FROM expenses ";
                stmts=connect.prepareStatement(sum);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Officerent)");
                    jTextField16.setText(summation);
                }
           }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
          try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String sumi="SELECT SUM(Vehiclemaintainance)  FROM expenses ";
                stmts=connect.prepareStatement(sumi);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Vehiclemaintainance)");
                   jTextField17.setText(summation);
                
                }
           }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String sumt="SELECT SUM(Fuel) FROM expenses ";
                stmts=connect.prepareStatement(sumt);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Fuel)");
                  jTextField18.setText(summation);
                
                }
           }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
          try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String summ="SELECT SUM(Miscellanious)  FROM expenses ";
    
                stmts=connect.prepareStatement(summ);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Miscellanious)");
                 jTextField20.setText(summation);
                }
           }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
           try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               String sum ="SELECT SUM(Totalsalary)  FROM managersalaries ";
               String rentsum ="SELECT SUM(Totalsalary)  FROM managersalaries";
                stmts=connect.prepareStatement(sum);
                rs=stmts.executeQuery();
                if(rs.next()){
                    String summation=rs.getString("SUM(Totalsalary)");
                    jTextField4.setText(summation);
                   // JOptionPane.showMessageDialog(null,"Summation successfull");
                }
      }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel= (DefaultTableModel)resettable.getModel();
     try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
                stmt = connect.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT * FROM reset ");
              while(rs.next()){
                String username=rs.getString("Username");
                String Oldpassword=rs.getString("Opassword");
                String Newpassword=rs.getString("Npassword");
               String Confirmpassword=rs.getString("Cpassword");
               
               tableModel.addRow(new Object[]{username,Oldpassword,Newpassword,Confirmpassword});
               
               
               
            }
                stmt.close();
                
            }
            catch(ClassNotFoundException|SQLException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_generateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton generate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField officeequpt;
    private javax.swing.JPanel panel5;
    private javax.swing.JTable resettable;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables

   
}
