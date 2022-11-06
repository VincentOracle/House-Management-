/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashscreen;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Estates extends javax.swing.JFrame {
    Connection conn;
    Connection connect;
PreparedStatement insert;
PreparedStatement stmts;
    public Estates() {
        initComponents();
        createConection();
    }
void createConection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
        }
            catch(ClassNotFoundException|SQLException ex){
                    
                  }
    }
    @SuppressWarnings("unchecked")
    
    public  void setColor(Estates f){
        
        f.setBackground(Color.red);
        
    }
     public void resetColor(Estates f){
        
        f.setBackground(Color.green);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSplitPane3 = new javax.swing.JSplitPane();
        rdioemployeegroup = new javax.swing.ButtonGroup();
        rdiogendergroup = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        radioemployees = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel49 = new javax.swing.JLabel();
        rdiomanager = new javax.swing.JRadioButton();
        jSplitPane6 = new javax.swing.JSplitPane();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        rdioreception = new javax.swing.JRadioButton();
        rdioagents = new javax.swing.JRadioButton();
        radioasst = new javax.swing.JRadioButton();
        rdioaccount = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtemployeecommission = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtemployeegrossamount = new javax.swing.JTextField();
        btncomission = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        txtemployeefirstname = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtemployeetotalsalary = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtemployeesecondname = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtemployeelastname = new javax.swing.JTextField();
        txtemployeeID = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtofficerent = new javax.swing.JTextField();
        txtvehiclemaintainance = new javax.swing.JTextField();
        txtmiscellanious = new javax.swing.JTextField();
        txtfuel = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        comboxday = new javax.swing.JComboBox<>();
        comboxmonth = new javax.swing.JComboBox<>();
        comboxyear = new javax.swing.JComboBox<>();
        txtdays = new javax.swing.JTextField();
        txtmonths = new javax.swing.JTextField();
        txtyears = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        selectpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboHigh = new javax.swing.JComboBox<>();
        comboMiddle = new javax.swing.JComboBox<>();
        comboLow = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        rdioaccountant = new javax.swing.JRadioButton();
        rdioofficeasst = new javax.swing.JRadioButton();
        rdioreceptionist = new javax.swing.JRadioButton();
        rdioagent = new javax.swing.JRadioButton();
        rdiolandlord = new javax.swing.JRadioButton();
        jSeparator12 = new javax.swing.JSeparator();
        jSplitPane4 = new javax.swing.JSplitPane();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        txtIDs = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        comboyear = new javax.swing.JComboBox<>();
        combomonth = new javax.swing.JComboBox<>();
        comboday = new javax.swing.JComboBox<>();
        jSplitPane5 = new javax.swing.JSplitPane();
        txtFirstname = new javax.swing.JTextField();
        txtSecondname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtResident = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnallocate = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        btnreallocate = new javax.swing.JButton();
        count = new javax.swing.JTextField();
        txtday = new javax.swing.JTextField();
        txtmonth = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        txtequiptment = new javax.swing.JTextField();
        lblpayments = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("DOUBLE A ESTATES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 390, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("SELECT POSITION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 24));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 272, 260, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 250, -1));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 490));
        getContentPane().add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 10, 760));
        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 10, 710));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.blue);
        jLabel49.setText("EMPLOYEES");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        radioemployees.add(rdiomanager);
        rdiomanager.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rdiomanager.setText("MANAGER");
        rdiomanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdiomanagerActionPerformed(evt);
            }
        });
        getContentPane().add(rdiomanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        getContentPane().add(jSplitPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 10, 500));
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel52.setForeground(java.awt.Color.blue);
        jLabel52.setText("PAYMENTS");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.blue);
        jLabel53.setText("EXPENDITURE");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 91, -1, 20));

        radioemployees.add(rdioreception);
        rdioreception.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rdioreception.setText("RECEPTIONIST");
        getContentPane().add(rdioreception, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        radioemployees.add(rdioagents);
        rdioagents.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rdioagents.setText("AGENT");
        getContentPane().add(rdioagents, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        radioemployees.add(radioasst);
        radioasst.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        radioasst.setText("OFFICE ASSISTANT");
        getContentPane().add(radioasst, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        radioemployees.add(rdioaccount);
        rdioaccount.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rdioaccount.setText("ACCOUNTANT");
        getContentPane().add(rdioaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel54.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel54.setText("GROSS AMOUNT");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jLabel55.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel55.setText("COMMISION");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));
        getContentPane().add(txtemployeecommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 140, 30));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setText("OFFICE EQUIPTMENT");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(java.awt.Color.red);
        jLabel57.setText("CATEGORY");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));
        getContentPane().add(txtemployeegrossamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 140, 30));

        btncomission.setBackground(java.awt.Color.cyan);
        btncomission.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncomission.setText("CALCULATE COMMISSION");
        btncomission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomissionActionPerformed(evt);
            }
        });
        getContentPane().add(btncomission, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 190, -1));

        jLabel59.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel59.setText("FIRST NAME");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));
        getContentPane().add(txtemployeefirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 140, 30));

        jLabel60.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel60.setForeground(java.awt.Color.blue);
        jLabel60.setText("TOTAL SALARY:");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        txtemployeetotalsalary.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 2, true));
        getContentPane().add(txtemployeetotalsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 90, 40));

        jLabel61.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel61.setText("SECOND NAME");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));
        getContentPane().add(txtemployeesecondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 140, 30));

        jLabel62.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel62.setText("LAST NAME");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));
        getContentPane().add(txtemployeelastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 140, 30));
        getContentPane().add(txtemployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 30));

        jLabel63.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel63.setText("EMPLOYEE ID");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));
        getContentPane().add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 310, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setText("OFFICE RENT");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setText("VEHICLE MAINTAIN");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setText("FUEL");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("MISCELLANIOUS");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));
        getContentPane().add(txtofficerent, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 90, 30));
        getContentPane().add(txtvehiclemaintainance, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 90, 30));
        getContentPane().add(txtmiscellanious, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 90, 30));
        getContentPane().add(txtfuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 90, 30));

        jButton8.setBackground(java.awt.Color.green);
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("RECORD");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));
        getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 520, 10));

        jButton10.setBackground(java.awt.Color.green);
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setText("ALLOCATE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 615, 180, 30));
        getContentPane().add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 210, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(java.awt.Color.red);
        jLabel58.setText("AMOUNT");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel68.setText("SELECT");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("DATE");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        comboxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboxday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxdayActionPerformed(evt);
            }
        });
        getContentPane().add(comboxday, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 60, -1));

        comboxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "JAN", "FEB", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCTO", "NOVE", "DEC" }));
        comboxmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxmonthActionPerformed(evt);
            }
        });
        getContentPane().add(comboxmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 70, -1));

        comboxyear.setEditable(true);
        comboxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YEAR", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));
        comboxyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxyearActionPerformed(evt);
            }
        });
        getContentPane().add(comboxyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 60, -1));

        txtdays.setBorder(new javax.swing.border.LineBorder(java.awt.Color.pink, 2, true));
        getContentPane().add(txtdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 60, 30));

        txtmonths.setBorder(new javax.swing.border.LineBorder(java.awt.Color.pink, 2, true));
        getContentPane().add(txtmonths, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 70, 30));

        txtyears.setBorder(new javax.swing.border.LineBorder(java.awt.Color.pink, 2, true));
        getContentPane().add(txtyears, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 60, 30));

        jButton7.setBackground(java.awt.Color.green);
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("RECORD");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, 30));
        getContentPane().add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 592, 310, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("=");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 20, -1));

        selectpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        selectpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("SELECT ESTATE CATEGORY");
        selectpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel48.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel48.setText("LOW INCOME");
        selectpanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel9.setText("MIDDLE INCOME");
        selectpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel10.setText("HIGH INCOME");
        selectpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        comboHigh.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        comboHigh.setForeground(java.awt.Color.magenta);
        comboHigh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SIZE", "BIG SIZE" }));
        comboHigh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        comboHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHighActionPerformed(evt);
            }
        });
        selectpanel.add(comboHigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 90, 30));

        comboMiddle.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        comboMiddle.setForeground(java.awt.Color.magenta);
        comboMiddle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SIZE", "MEDIUM SIZE", "BIG SIZE" }));
        comboMiddle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        comboMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMiddleActionPerformed(evt);
            }
        });
        selectpanel.add(comboMiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 30));

        comboLow.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        comboLow.setForeground(java.awt.Color.magenta);
        comboLow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SIZE", "SMALL SIZE", "MEDIUM SIZE" }));
        comboLow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        comboLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLowActionPerformed(evt);
            }
        });
        selectpanel.add(comboLow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\beding.png")); // NOI18N
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        selectpanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\rental.png")); // NOI18N
        jLabel15.setText(" ");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        selectpanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\rentalB.png")); // NOI18N
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        selectpanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 130, 100));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 255));
        jLabel36.setText("ADD EMPLOYEE");
        selectpanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        rdioemployeegroup.add(rdioaccountant);
        rdioaccountant.setText("ACCOUNTANT");
        rdioaccountant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioaccountantActionPerformed(evt);
            }
        });
        selectpanel.add(rdioaccountant, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        rdioemployeegroup.add(rdioofficeasst);
        rdioofficeasst.setText("OFFICE ASST");
        rdioofficeasst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioofficeasstActionPerformed(evt);
            }
        });
        selectpanel.add(rdioofficeasst, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        rdioemployeegroup.add(rdioreceptionist);
        rdioreceptionist.setText("RECEPTIONIST");
        rdioreceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioreceptionistActionPerformed(evt);
            }
        });
        selectpanel.add(rdioreceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        rdioemployeegroup.add(rdioagent);
        rdioagent.setText("AGENT");
        rdioagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioagentActionPerformed(evt);
            }
        });
        selectpanel.add(rdioagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        rdioemployeegroup.add(rdiolandlord);
        rdiolandlord.setText("MANAGER");
        rdiolandlord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdiolandlordActionPerformed(evt);
            }
        });
        selectpanel.add(rdiolandlord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        selectpanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 480, 10));
        selectpanel.add(jSplitPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 10, 150));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("Marital Status");
        selectpanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, 20));

        buttonGroup3.add(jCheckBox1);
        jCheckBox1.setText("Maried");
        selectpanel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        buttonGroup3.add(jCheckBox2);
        jCheckBox2.setText("Not married");
        selectpanel.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        buttonGroup3.add(jCheckBox3);
        jCheckBox3.setText("Divorced");
        selectpanel.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        txtIDs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        selectpanel.add(txtIDs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("ID Number");
        selectpanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setText("Select gender");
        selectpanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        rdiogendergroup.add(male);
        male.setText("Male");
        selectpanel.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        rdiogendergroup.add(female);
        female.setText("Female");
        selectpanel.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        rdiogendergroup.add(other);
        other.setText("Other");
        selectpanel.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("DATE OF BIRTH");
        selectpanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        comboyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YEAR", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "20003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        comboyear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        comboyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboyearActionPerformed(evt);
            }
        });
        selectpanel.add(comboyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 70, -1));

        combomonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "JAN", "FEB", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));
        combomonth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        combomonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomonthActionPerformed(evt);
            }
        });
        selectpanel.add(combomonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 70, -1));

        comboday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboday.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        comboday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodayActionPerformed(evt);
            }
        });
        selectpanel.add(comboday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 60, -1));
        selectpanel.add(jSplitPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 10, 200));

        txtFirstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });
        selectpanel.add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, 30));

        txtSecondname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        selectpanel.add(txtSecondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 100, 30));

        txtLastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        selectpanel.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 100, 30));

        txtResident.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        selectpanel.add(txtResident, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 100, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Area of Resident");
        selectpanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("First Name");
        selectpanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Second Name");
        selectpanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Last Name");
        selectpanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        btnallocate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnallocate.setText("ALLOCATE");
        btnallocate.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        btnallocate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnallocateMouseClicked(evt);
            }
        });
        btnallocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallocateActionPerformed(evt);
            }
        });
        selectpanel.add(btnallocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 140, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Occupation");
        selectpanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtOccupation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));
        selectpanel.add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 100, 30));

        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        selectpanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 150, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Email address");
        selectpanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        btnreallocate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreallocate.setText("RE-ALLOCATE");
        btnreallocate.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        btnreallocate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreallocateMouseClicked(evt);
            }
        });
        selectpanel.add(btnreallocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 140, 30));

        count.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 2, true));
        count.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countMouseClicked(evt);
            }
        });
        selectpanel.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 30));

        txtday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        selectpanel.add(txtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 50, 30));

        txtmonth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        selectpanel.add(txtmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 50, 30));

        txtyear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        selectpanel.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 60, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("UPDATE");
        jButton9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        selectpanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 565, 90, 30));
        selectpanel.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 530, 10));

        getContentPane().add(selectpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 550, 700));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText(" PAYMENTS AND EXPENDITURE");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 30));
        getContentPane().add(txtequiptment, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 90, 30));

        lblpayments.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblpayments.setForeground(java.awt.Color.red);
        lblpayments.setText("PAYMENTS");
        lblpayments.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.pink));
        lblpayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpaymentsMouseClicked(evt);
            }
        });
        getContentPane().add(lblpayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        check.setText("CHECK");
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 80, 30));

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\symantec.png")); // NOI18N
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 100, 80));

        jButton1.setBackground(java.awt.Color.green);
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 60, 30));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 92, -1, 0));

        jSeparator10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 82, 530, 10));

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setText("LANDLORD");
        button1.setToolTipText("Login as Landlord");
        button1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button1MouseDragged(evt);
            }
        });
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button1MousePressed(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 210, 30));

        button2.setText("MANAGER");
        button2.setToolTipText("Login as Manager");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, 30));

        button4.setText("RECEPTIONIST");
        button4.setToolTipText("Login as Receptionist");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 30));

        button3.setText("AGENT");
        button3.setToolTipText("Login as an Agent");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 230, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 172, -1, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 10));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\manager.png")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\IT.gif")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 680));

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 51, 51));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
        button3.setToolTipText("Click to login as an Agent");
          Agents agent= new Agents();
        agent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked

        // TODO add your handling code here:
        DoubleAhouses houses=new DoubleAhouses();
        houses.setVisible(true);
       this.dispose();
      
    }//GEN-LAST:event_button4MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
        Agents agent= new Agents();
        agent.setVisible(true);
        this.dispose();
        button2.setToolTipText("Click to log in as Landlord");
    }//GEN-LAST:event_button2MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_button1MouseClicked

    private void button1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MousePressed
        // TODO add your handling code here:
       
                
    }//GEN-LAST:event_button1MousePressed

    private void button1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseDragged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_button1MouseDragged

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        // TODO add your handling code here:
        Payments pay=new Payments();
        pay.setVisible(true);
        this.dispose();
        this.hide();
    }//GEN-LAST:event_checkMouseClicked

    private void lblpaymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpaymentsMouseClicked
        // TODO add your handling code here:
        Payments pay= new Payments();
        pay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblpaymentsMouseClicked

    private void countMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_countMouseClicked

    private void btnreallocateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreallocateMouseClicked
        // TODO add your handling code here:
        selectpanel.setVisible(true);
        txtFirstname.setText(" ");
        txtSecondname.setText(" ");
        txtLastname.setText(" ");
        txtOccupation.setText("");
        txtResident.setText(" ");
        txtEmail.setText(" ");
        txtIDs.setText(" ");
        txtday.setText("");
        txtmonth.setText("");
        txtyear.setText("");

        //btnreallocate.setVisible(false);
    }//GEN-LAST:event_btnreallocateMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnallocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallocateActionPerformed
        if(txtFirstname!=null|| txtSecondname!=null||txtLastname!=null||txtEmail!=null||txtOccupation!=null||txtIDs!=null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
            int idnumbers=Integer.parseInt(txtIDs.getText());   
            String firstname = txtFirstname.getText().toString();
            String secondname=txtSecondname.getText().toString();
            String lastname=txtLastname.getText().toString();
            String resident=txtResident.getText().toString();
            String email=txtEmail.getText().toString();
           String occcupation=txtOccupation.getText().toString();
           String date =txtday.getText().toString()+"/"+txtmonth.getText().toString()+"/"+txtyear.getText().toString();    
              PreparedStatement  insert =conn.prepareStatement("INSERT INTO landlord VALUES(?,?,?,?,?,?,?,?,?)");
               
             // String  gender="male";
              insert.setInt(1,idnumbers);
                insert.setString(2,firstname );
                insert.setString(3,secondname);
                insert.setString(4,lastname);
                insert.setString(5,resident);
                insert.setString(6,email);
                insert.setString(7,occcupation);
                insert.setString(8,date);    
                if(male.isSelected()){
              
                  insert.setString(9,male.getText());
                  
                }
                else if(female.isSelected()){
                 
                      insert.setString(9,female.getText());
                }
                else//(other.isSelected())
                   // gender="Other";
                    insert.setString(9,other.getText());
                
               // insert.setString(8,gender);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Allocation Successful!!!");
                insert.close();
                if(txtFirstname!=null&&txtSecondname!=null){
                    btnreallocate.setVisible(true);
                }
                else{
                   
                     //JOptionPane.showMessageDialog(null, "Please fill all the fields"," ",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
                e.printStackTrace();
               
            }
        
        }
        
        else{
         
            btnreallocate.setVisible(true);
        }
        if(evt.getSource()!=button1&&evt.getSource()==txtFirstname){

            if(evt.getSource()==btnallocate){
                selectpanel.setVisible(false);
                JOptionPane.showMessageDialog(null,"Allocation successfull!!!!","      Process complete",JOptionPane.INFORMATION_MESSAGE);
                btnallocate.setVisible(true);
                btnreallocate.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnallocateActionPerformed

    private void btnallocateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnallocateMouseClicked
        // TODO add your handling code here:
        if(txtFirstname==null|| txtSecondname==null||txtLastname==null||txtEmail==null||txtOccupation==null||txtIDs==null){
           
        }
        else{

            btnreallocate.setVisible(true);
        }

    }//GEN-LAST:event_btnallocateMouseClicked

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()!=button1&&evt.getSource()==txtFirstname&&evt.getSource()==comboLow){
            JOptionPane.showMessageDialog(null,"SELECT POSITION FIRST","SELECT YOUR POSITION",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void combodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodayActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==comboday){
            txtday.setText(comboday.getSelectedItem().toString());
    }//GEN-LAST:event_combodayActionPerformed
    }
    private void combomonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomonthActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==combomonth){
            txtmonth.setText(combomonth.getSelectedItem().toString());
    }//GEN-LAST:event_combomonthActionPerformed
    }
    private void comboyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboyearActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==comboyear){
            txtyear.setText(comboyear.getSelectedItem().toString());
    }//GEN-LAST:event_comboyearActionPerformed
    }
    private void rdiolandlordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdiolandlordActionPerformed
        if(evt.getSource()==rdiolandlord){
            JOptionPane.showConfirmDialog(null,"Do you want to add a landlord?");
            JOptionPane.showMessageDialog(null,"Enter the details");
        }

    }//GEN-LAST:event_rdiolandlordActionPerformed

    private void rdioagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioagentActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==rdioagent){
            JOptionPane.showConfirmDialog(null,"Do you want to add an Agent?");
            JOptionPane.showMessageDialog(null,"Enter the details");
        }

    }//GEN-LAST:event_rdioagentActionPerformed

    private void rdioreceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioreceptionistActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==rdioreceptionist){
            JOptionPane.showConfirmDialog(null,"Do you want to add a receptionist?");
            JOptionPane.showMessageDialog(null,"Enter the details");
        }
    }//GEN-LAST:event_rdioreceptionistActionPerformed

    private void rdioofficeasstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioofficeasstActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==rdioofficeasst){
            JOptionPane.showConfirmDialog(null,"Do you want to add an office assistant?");
            JOptionPane.showMessageDialog(null,"Enter the details");
        }
    }//GEN-LAST:event_rdioofficeasstActionPerformed

    private void rdioaccountantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioaccountantActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==rdioaccountant){
            JOptionPane.showConfirmDialog(null,"Do you want to add an accountant?");
            JOptionPane.showMessageDialog(null,"Enter the details");
        }
    }//GEN-LAST:event_rdioaccountantActionPerformed

    private void comboLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLowActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==comboLow){
            count.setText(comboLow.getSelectedItem().toString());
    }//GEN-LAST:event_comboLowActionPerformed
    }
    private void comboMiddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMiddleActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==comboMiddle){
            count.setText(comboMiddle.getSelectedItem().toString());
    }//GEN-LAST:event_comboMiddleActionPerformed
    }
    private void comboHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHighActionPerformed
   if(evt.getSource()==comboHigh){
            count.setText(comboHigh.getSelectedItem().toString());
    }//GEN-LAST:event_comboHighActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        selectpanel.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         String date = txtdays.getText().toString()+"/"+txtmonths.getText().toString()+"/"+txtyears.getText().toString();    
         int officeequiptment=Integer.parseInt(txtequiptment.getText());
         int officerent=Integer.parseInt(txtofficerent.getText());
         int vehiclemaintainance=Integer.parseInt(txtvehiclemaintainance.getText());
         int fuelamount=Integer.parseInt(txtfuel.getText());
         int miscellaniuosamount=Integer.parseInt(txtmiscellanious.getText());
      
            PreparedStatement  insert=conn.prepareStatement("INSERT INTO expenses VALUES(?,?,?,?,?,?)");
               insert.setString(1,date);
               insert.setInt(2,Integer.parseInt(txtequiptment.getText()));
                insert.setInt(3,Integer.parseInt(txtofficerent.getText()));
                insert.setInt(4,Integer.parseInt(txtvehiclemaintainance.getText()));
                insert.setInt(5,Integer.parseInt(txtfuel.getText()));
                insert.setInt(6,Integer.parseInt(txtmiscellanious.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Expenses allocation  Successful!!!");
                insert.close();
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter Expenditure amount");
            }
     else{
         JOptionPane.showMessageDialog(null,"Enter expenditure  amount ");
     }
       }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter Expenditure amount"); 
    }                                            
    }//GEN-LAST:event_jButton8ActionPerformed

    private void rdiomanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdiomanagerActionPerformed
        
        
    }//GEN-LAST:event_rdiomanagerActionPerformed

    private void btncomissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomissionActionPerformed
     
    
        
    }//GEN-LAST:event_btncomissionActionPerformed

    private void comboxdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxdayActionPerformed
       if(evt.getSource()==comboxday){
            txtdays.setText(comboxday.getSelectedItem().toString());
       }
    }//GEN-LAST:event_comboxdayActionPerformed

    private void comboxmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxmonthActionPerformed
         if(evt.getSource()==comboxmonth){
            txtmonths.setText(comboxmonth.getSelectedItem().toString());
       }
    }//GEN-LAST:event_comboxmonthActionPerformed

    private void comboxyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxyearActionPerformed
          if(evt.getSource()==comboxyear){
            txtyears.setText(comboxyear.getSelectedItem().toString());
          }
    }//GEN-LAST:event_comboxyearActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  if(rdiomanager.isSelected()){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         int employeeID=Integer.parseInt(txtemployeeID.getText());
         String firstname = txtemployeefirstname.getText();
         String secondname=txtemployeesecondname.getText();
         String lastname=txtemployeelastname.getText(); 
         int employeegrossamount=Integer.parseInt(txtemployeegrossamount.getText());
         int commission=Integer.parseInt(txtemployeecommission.getText());
         int emloyeetotalsalary=Integer.parseInt(txtemployeetotalsalary.getText());
         
            PreparedStatement  insert =conn.prepareStatement("INSERT INTO managersalaries VALUES(?,?,?,?,?,?,?)");
                insert.setInt(1,Integer.parseInt(txtemployeeID.getText()));
                insert.setString(2,txtemployeefirstname.getText());
                insert.setString(3,txtemployeesecondname.getText());
                insert.setString(4,txtemployeelastname.getText());
                insert.setInt(5,Integer.parseInt(txtemployeegrossamount.getText()));
                insert.setInt(6,Integer.parseInt(txtemployeecommission.getText()));
                insert.setInt(7,Integer.parseInt(txtemployeetotalsalary.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salary allocation  Successful!!!");
                insert.close();
                
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter manager details");
                }
     else{
         JOptionPane.showMessageDialog(null,"Enter manager  details ");
     }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter manager details");

            } 
    }//GEN-LAST:event_jButton7ActionPerformed
     
  else if(rdioaccount.isSelected()){
      
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         int employeeID=Integer.parseInt(txtemployeeID.getText());
         String firstname = txtemployeefirstname.getText();
         String secondname=txtemployeesecondname.getText();
         String lastname=txtemployeelastname.getText(); 
         int employeegrossamount=Integer.parseInt(txtemployeegrossamount.getText());
         int commission=Integer.parseInt(txtemployeecommission.getText());
         int emloyeetotalsalary=Integer.parseInt(txtemployeetotalsalary.getText());
          PreparedStatement  insert =conn.prepareStatement("INSERT INTO accountantsalaries VALUES(?,?,?,?,?,?,?)");
                insert.setInt(1,Integer.parseInt(txtemployeeID.getText()));
                insert.setString(2,txtemployeefirstname.getText());
                insert.setString(3,txtemployeesecondname.getText());
                insert.setString(4,txtemployeelastname.getText());
                insert.setInt(5,Integer.parseInt(txtemployeegrossamount.getText()));
                insert.setInt(6,Integer.parseInt(txtemployeecommission.getText()));
                insert.setInt(7,Integer.parseInt(txtemployeetotalsalary.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salary allocation  Successful!!!");
                insert.close();
                
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter Accountant details");
                }
     else{
         JOptionPane.showMessageDialog(null,"Enter Accountant details ");
     }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter Accountant details");
                    
    }                                        
      
  }
  
  else if(rdioreception.isSelected()){
      
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         int employeeID=Integer.parseInt(txtemployeeID.getText());
         String firstname = txtemployeefirstname.getText();
         String secondname=txtemployeesecondname.getText();
         String lastname=txtemployeelastname.getText(); 
         int employeegrossamount=Integer.parseInt(txtemployeegrossamount.getText());
         int commission=Integer.parseInt(txtemployeecommission.getText());
         int emloyeetotalsalary=Integer.parseInt(txtemployeetotalsalary.getText());
         
            PreparedStatement  insert =conn.prepareStatement("INSERT INTO receptionistsalaries VALUES(?,?,?,?,?,?,?)");
                insert.setInt(1,Integer.parseInt(txtemployeeID.getText()));
                insert.setString(2,txtemployeefirstname.getText());
                insert.setString(3,txtemployeesecondname.getText());
                insert.setString(4,txtemployeelastname.getText());
                insert.setInt(5,Integer.parseInt(txtemployeegrossamount.getText()));
                insert.setInt(6,Integer.parseInt(txtemployeecommission.getText()));
                insert.setInt(7,Integer.parseInt(txtemployeetotalsalary.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salary allocation  Successful!!!");
                insert.close();
                
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter receptionist details");
                }
     else{
         JOptionPane.showMessageDialog(null,"Enter receptionist   details ");
     }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter receptionist  details");
                    
    }                                        
     
  }
  
  else if(radioasst.isSelected()){
      
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         int employeeID=Integer.parseInt(txtemployeeID.getText());
         String firstname = txtemployeefirstname.getText();
         String secondname=txtemployeesecondname.getText();
         String lastname=txtemployeelastname.getText(); 
         int employeegrossamount=Integer.parseInt(txtemployeegrossamount.getText());
         int commission=Integer.parseInt(txtemployeecommission.getText());
         int emloyeetotalsalary=Integer.parseInt(txtemployeetotalsalary.getText());
         
            PreparedStatement  insert =conn.prepareStatement("INSERT INTO officeassistantsalaries VALUES(?,?,?,?,?,?,?)");
                insert.setInt(1,Integer.parseInt(txtemployeeID.getText()));
                insert.setString(2,txtemployeefirstname.getText());
                insert.setString(3,txtemployeesecondname.getText());
                insert.setString(4,txtemployeelastname.getText());
                insert.setInt(5,Integer.parseInt(txtemployeegrossamount.getText()));
                insert.setInt(6,Integer.parseInt(txtemployeecommission.getText()));
                insert.setInt(7,Integer.parseInt(txtemployeetotalsalary.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salary allocation  Successful!!!");
                insert.close();
                
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter officeassistant details");
                }
     else{
         JOptionPane.showMessageDialog(null,"Enter officeassistant details ");
     }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter officeassistant details");
                    
    }                                        
     
  }
  
  else {//(rdioagents.isSelected()){
      
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
         if(txtemployeefirstname!=null&&txtemployeesecondname!=null){ 
         int employeeID=Integer.parseInt(txtemployeeID.getText());
         String firstname = txtemployeefirstname.getText();
         String secondname=txtemployeesecondname.getText();
         String lastname=txtemployeelastname.getText(); 
         int employeegrossamount=Integer.parseInt(txtemployeegrossamount.getText());
         int commission=Integer.parseInt(txtemployeecommission.getText());
         int emloyeetotalsalary=Integer.parseInt(txtemployeetotalsalary.getText());
         
            PreparedStatement  insert =conn.prepareStatement("INSERT INTO agentsalaries VALUES(?,?,?,?,?,?,?)");
                insert.setInt(1,Integer.parseInt(txtemployeeID.getText()));
                insert.setString(2,txtemployeefirstname.getText());
                insert.setString(3,txtemployeesecondname.getText());
                insert.setString(4,txtemployeelastname.getText());
                insert.setInt(5,Integer.parseInt(txtemployeegrossamount.getText()));
                insert.setInt(6,Integer.parseInt(txtemployeecommission.getText()));
                insert.setInt(7,Integer.parseInt(txtemployeetotalsalary.getText()));
                insert.executeUpdate();
                JOptionPane.showMessageDialog(null,"Salary allocation  Successful!!!");
                insert.close();
                
                }
     else if(txtemployeefirstname==null||txtemployeesecondname==null||txtemployeelastname==null||txtemployeegrossamount==null) {
                    JOptionPane.showMessageDialog(null,"Enter agents details");
                }
     else{
         JOptionPane.showMessageDialog(null,"Enter agents  details ");
     }
            }
            catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e); 
                 JOptionPane.showMessageDialog(null,"Enter Agents details");
                    
    }                                        
  }
 
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnallocate;
    public static javax.swing.JButton btncomission;
    private javax.swing.JButton btnreallocate;
    private javax.swing.JButton button1;
    private static javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton check;
    private javax.swing.JComboBox<String> comboHigh;
    private javax.swing.JComboBox<String> comboLow;
    private javax.swing.JComboBox<String> comboMiddle;
    private javax.swing.JComboBox<String> comboday;
    private javax.swing.JComboBox<String> combomonth;
    private javax.swing.JComboBox<String> comboxday;
    private javax.swing.JComboBox<String> comboxmonth;
    private javax.swing.JComboBox<String> comboxyear;
    private javax.swing.JComboBox<String> comboyear;
    private javax.swing.JTextField count;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
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
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JLabel lblpayments;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JRadioButton radioasst;
    private javax.swing.ButtonGroup radioemployees;
    private javax.swing.JRadioButton rdioaccount;
    private javax.swing.JRadioButton rdioaccountant;
    public javax.swing.JRadioButton rdioagent;
    private javax.swing.JRadioButton rdioagents;
    private javax.swing.ButtonGroup rdioemployeegroup;
    private javax.swing.ButtonGroup rdiogendergroup;
    public javax.swing.JRadioButton rdiolandlord;
    public static javax.swing.JRadioButton rdiomanager;
    private javax.swing.JRadioButton rdioofficeasst;
    private javax.swing.JRadioButton rdioreception;
    private javax.swing.JRadioButton rdioreceptionist;
    public static javax.swing.JPanel selectpanel;
    private javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtIDs;
    private javax.swing.JTextField txtLastname;
    public javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtResident;
    public static javax.swing.JTextField txtSecondname;
    public javax.swing.JTextField txtday;
    private javax.swing.JTextField txtdays;
    public static javax.swing.JTextField txtemployeeID;
    public static javax.swing.JTextField txtemployeecommission;
    public static javax.swing.JTextField txtemployeefirstname;
    public static javax.swing.JTextField txtemployeegrossamount;
    public static javax.swing.JTextField txtemployeelastname;
    public static javax.swing.JTextField txtemployeesecondname;
    public static javax.swing.JTextField txtemployeetotalsalary;
    private javax.swing.JTextField txtequiptment;
    public static javax.swing.JTextField txtfuel;
    public static javax.swing.JTextField txtmiscellanious;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtmonths;
    public javax.swing.JTextField txtofficerent;
    public static javax.swing.JTextField txtvehiclemaintainance;
    public javax.swing.JTextField txtyear;
    private javax.swing.JTextField txtyears;
    // End of variables declaration//GEN-END:variables
}
