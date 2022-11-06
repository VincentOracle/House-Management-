/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashscreen;

import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
public class Agents extends javax.swing.JFrame {
Connection connect;
PreparedStatement stmts;
PreparedStatement stamts;
    /**
     * Creates new form Agents
     */
    public Agents() {
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

        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        agents = new javax.swing.ButtonGroup();
        pay = new javax.swing.ButtonGroup();
        addbtngrp = new javax.swing.ButtonGroup();
        btnremove = new javax.swing.ButtonGroup();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        panellandlord = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtusernameadd = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIDadd = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        rdioA = new javax.swing.JRadioButton();
        rdioB = new javax.swing.JRadioButton();
        rdioC = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlagent = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        agentA = new javax.swing.JRadioButton();
        AgentB = new javax.swing.JRadioButton();
        AgentC = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtagentusername = new javax.swing.JTextField();
        txtagentid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        combobox1 = new javax.swing.JComboBox<>();
        combobox2 = new javax.swing.JComboBox<>();
        combobox3 = new javax.swing.JComboBox<>();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtsecondname = new javax.swing.JTextField();
        datechooser = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        datechoose = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        txtroom = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        btnalocate = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 2, 3, new java.awt.Color(51, 0, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1130, 27));

        panellandlord.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        panellandlord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("MANAGER");
        panellandlord.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\landlord.png")); // NOI18N
        panellandlord.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 120));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Enter username");
        panellandlord.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText(" ID Number.");
        panellandlord.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, -1));

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panellandlord.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
        panellandlord.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));
        panellandlord.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, 30));

        jLabel16.setText("ESTATES");
        panellandlord.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));
        panellandlord.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 300, 10));

        jCheckBox1.setText("Low Income");
        panellandlord.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jCheckBox2.setText("Middle Income");
        panellandlord.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jCheckBox3.setText("High Income");
        panellandlord.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));
        panellandlord.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));
        panellandlord.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, 10));
        panellandlord.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 150, 0));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("REMOVE AGENT");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText(" Username");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel1.add(txtusernameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Agent ID No.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(txtIDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 150, 30));

        jButton9.setBackground(java.awt.Color.green);
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("DONE");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, -1));

        addbtngrp.add(rdioA);
        rdioA.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rdioA.setForeground(java.awt.Color.red);
        rdioA.setText("AGENT A");
        jPanel1.add(rdioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        addbtngrp.add(rdioB);
        rdioB.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rdioB.setForeground(java.awt.Color.red);
        rdioB.setText("AGENT B");
        jPanel1.add(rdioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        addbtngrp.add(rdioC);
        rdioC.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rdioC.setForeground(java.awt.Color.red);
        rdioC.setText("AGENT C");
        jPanel1.add(rdioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(java.awt.Color.blue);
        jLabel13.setText("ADD OR REMOVE AGENT");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        btnA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnA.setText("ADD AGENT");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, -1));

        panellandlord.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 240));

        getContentPane().add(panellandlord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 530));
        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 10, 510));

        pnlagent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        pnlagent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("AGENTS");
        pnlagent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\group.png")); // NOI18N
        pnlagent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, 100));

        agents.add(agentA);
        agentA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agentA.setForeground(java.awt.Color.red);
        agentA.setText("AGENT A");
        pnlagent.add(agentA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        agents.add(AgentB);
        AgentB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgentB.setForeground(java.awt.Color.red);
        AgentB.setText("AGENT B");
        pnlagent.add(AgentB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        agents.add(AgentC);
        AgentC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgentC.setForeground(java.awt.Color.red);
        AgentC.setText("AGENT C");
        pnlagent.add(AgentC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Username");
        pnlagent.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        pnlagent.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 430, 10));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("ID Number");
        pnlagent.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        pnlagent.add(txtagentusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 30));
        pnlagent.add(txtagentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 110, 30));

        jButton4.setText("OK");
        pnlagent.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel19.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel19.setForeground(java.awt.Color.red);
        jLabel19.setText("ALLOCATE TENANT");
        pnlagent.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 210, 20));

        jLabel20.setText("Low Income");
        pnlagent.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel21.setText("Middle Income");
        pnlagent.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel22.setText("High Income");
        pnlagent.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "1A", "2A", "3A", "4A", "5A", "6A", "7A", "8A", "9A", "10A", "11A", "12A", "13A", "14A", "15A" }));
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        pnlagent.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "1B", "2B", "3B", "3B", "4B", "5B", "6B", "7B", "8B", "9B", "10B", "11B", "12B", "13B", "14B", "15B" }));
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });
        pnlagent.add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        combobox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "11C", "12C", "13C", "14C", "15C" }));
        combobox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox3ActionPerformed(evt);
            }
        });
        pnlagent.add(combobox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        pnlagent.add(jSplitPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 10, 320));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setForeground(java.awt.Color.blue);
        jLabel23.setText("TENANT DETAILS");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Firstname");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Secondname");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("DATE OF ALLOCATION");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel4.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));
        jPanel4.add(txtsecondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));
        jPanel4.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 30, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Telephone Number");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel4.add(txttelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("ID Number");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        jPanel4.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 30));
        jPanel4.add(datechoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        pnlagent.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 160, 320));

        jLabel29.setText("Room is:");
        pnlagent.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        pnlagent.add(txtroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 120, 30));
        pnlagent.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));
        pnlagent.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, -1));

        jButton8.setText("BACK");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        pnlagent.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 100, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\back.png")); // NOI18N
        pnlagent.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 60, 30));

        getContentPane().add(pnlagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 430, 520));
        getContentPane().add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 10, 520));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 102));
        jLabel4.setText("TENANT PAYMENTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\paid.png")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, 90));

        jLabel30.setText("SELECT MODE OF PAYMENT");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        pay.add(jRadioButton1);
        jRadioButton1.setText("Cash");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        pay.add(jRadioButton2);
        jRadioButton2.setText("M-Pesa");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        pay.add(jRadioButton3);
        jRadioButton3.setText("PayPal");
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel32.setBackground(new java.awt.Color(255, 0, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\cash.png")); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 60));

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\Mpesas.png")); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 230, 50));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 230, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\ppal.png")); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 230, 50));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 320, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 330, 10));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel35.setText("AMOUNT");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel36.setText("BALANCE");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txtamount.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel3.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 90, 30));

        jTextField16.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 90, 30));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 330, 10));

        jButton7.setText("PAY");
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 340, -1));
        jPanel3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        btnalocate.setText("ALLOCATE");
        btnalocate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalocateMouseClicked(evt);
            }
        });
        btnalocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalocateActionPerformed(evt);
            }
        });
        jPanel3.add(btnalocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 340, 510));

        jButton6.setText("SUBMIT");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        Payments pay= new Payments();
        pay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        pnlagent.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        Payments pay = new Payments();
        pay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed

    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
if(rdioA.isSelected()){
       try{
        String username = txtusernameadd.getText();
      PreparedStatement stamts =connect.prepareStatement("INSERT INTO agentspasworda VALUES(?,?)");
         int addusernameidnumber=Integer.parseInt(txtIDadd.getText());
        
       stamts.setString(1,username);
       stamts.setString(2,txtIDadd.getText());
        stamts.executeUpdate();
        JOptionPane.showMessageDialog(null,"Successfully added in A !!");  
        stamts.close();    
}
catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex);
    
}   
}
else if(rdioB.isSelected()){
       try{
        String username = txtusernameadd.getText().toString();
        int addusernameidnumber=Integer.parseInt(txtIDadd.getText());
        
       PreparedStatement stamts =connect.prepareStatement("INSERT INTO agentspaswordb VALUES(?,?)");
       stamts.setString(1,username);
       stamts.setString(2,txtIDadd.getText());
        stamts.executeUpdate();
        JOptionPane.showMessageDialog(null,"Successfully added in B !!");  
        stamts.close();    
}
catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex);
    
}   
}
       else if (rdioC.isSelected()){
       try{
        String username = txtusernameadd.getText().toString();
        int addusernameidnumber=Integer.parseInt(txtIDadd.getText());
        
       PreparedStatement stamts =connect.prepareStatement("INSERT INTO agentspaswordc VALUES(?,?)");
       stamts.setString(1,username);
       stamts.setString(2,txtIDadd.getText());
        stamts.executeUpdate();
        JOptionPane.showMessageDialog(null,"Successfully added in C !!");  
        stamts.close();    
}
catch(SQLException ex){
    JOptionPane.showMessageDialog(null,ex);
  }  
       
    }//GEN-LAST:event_btnAActionPerformed
       else{
           JOptionPane.showMessageDialog(null, "Select the Agent first!!!");
       }
    }
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        Estates estate= new Estates();
        estate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void btnalocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalocateActionPerformed
        try{
            String firstname = txtfirstname.getText().toString();
            String secondname=txtsecondname.getText().toString();
            int telephonenumber=Integer.parseInt(txttelephone.getText());
            int idnumber=Integer.parseInt(txtID.getText());
            int amount=Integer.parseInt(txtamount.getText());

            PreparedStatement stmts =connect.prepareStatement("INSERT INTO agentlowtenantdetails VALUES(?,?,?,?,?,?)");
            stmts.setString(1,firstname);
            stmts.setString(2,secondname);
            SimpleDateFormat  sdf= new SimpleDateFormat("YYYY-MM-dd");
            String date= sdf.format(datechoose.getDate());
            stmts.setString(3,date);
            stmts.setString(4,txttelephone.getText());
            stmts.setString(5,txtID.getText());
            stmts.setString(6,txtamount.getText());
            stmts.executeUpdate();
            JOptionPane.showMessageDialog(null,"Allocation successfull!!");
            JOptionPane.showMessageDialog(null,txtroom.getText().toString(),"ROOM NUMBER IS:",JOptionPane.INFORMATION_MESSAGE);
            stmts.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);

        }

    }//GEN-LAST:event_btnalocateActionPerformed

    private void btnalocateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalocateMouseClicked

    }//GEN-LAST:event_btnalocateMouseClicked

    private void combobox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==combobox3){
            txtroom.setText(combobox3.getSelectedItem().toString());
        }
    }//GEN-LAST:event_combobox3ActionPerformed

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==combobox2){
            txtroom.setText(combobox2.getSelectedItem().toString());
        }
    }//GEN-LAST:event_combobox2ActionPerformed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==combobox1){
            txtroom.setText(combobox1.getSelectedItem().toString());
        }

    }//GEN-LAST:event_combobox1ActionPerformed
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AgentB;
    private javax.swing.JRadioButton AgentC;
    private javax.swing.ButtonGroup addbtngrp;
    private javax.swing.JRadioButton agentA;
    private javax.swing.ButtonGroup agents;
    private javax.swing.JButton btnA;
    public static javax.swing.JButton btnalocate;
    private javax.swing.ButtonGroup btnremove;
    public static javax.swing.JComboBox<String> combobox1;
    public static javax.swing.JComboBox<String> combobox2;
    public static javax.swing.JComboBox<String> combobox3;
    private com.toedter.calendar.JDateChooser datechoose;
    public static javax.swing.JTextField datechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JPanel panellandlord;
    private javax.swing.ButtonGroup pay;
    public javax.swing.JPanel pnlagent;
    private javax.swing.JRadioButton rdioA;
    private javax.swing.JRadioButton rdioB;
    private javax.swing.JRadioButton rdioC;
    public javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtIDadd;
    private javax.swing.JTextField txtagentid;
    public javax.swing.JTextField txtagentusername;
    public static javax.swing.JTextField txtamount;
    public static javax.swing.JTextField txtfirstname;
    public static javax.swing.JTextField txtroom;
    public static javax.swing.JTextField txtsecondname;
    public javax.swing.JTextField txttelephone;
    public static javax.swing.JTextField txtusernameadd;
    // End of variables declaration//GEN-END:variables

    
}
