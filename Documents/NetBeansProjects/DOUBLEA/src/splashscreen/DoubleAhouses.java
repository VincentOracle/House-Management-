/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashscreen;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vincent-Oracle
 */
public class DoubleAhouses extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement stmt;
   Statement stmts;
    /**
     * Creates new fo rm receptionist
     */
    public DoubleAhouses() {
        initComponents();
        createConection();
    }

   void createConection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
        }
            catch(ClassNotFoundException|SQLException ex){
                    
                  }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Housescategory = new javax.swing.ButtonGroup();
        housestatus = new javax.swing.ButtonGroup();
        panelreceptionist = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        btncheckA = new javax.swing.JButton();
        btncheckB = new javax.swing.JButton();
        btncheckC = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        sep2 = new javax.swing.JSeparator();
        lbb = new javax.swing.JLabel();
        lba = new javax.swing.JLabel();
        txtAallocated = new javax.swing.JTextField();
        txtAavailable = new javax.swing.JTextField();
        lbc = new javax.swing.JLabel();
        lbd = new javax.swing.JLabel();
        lbe = new javax.swing.JLabel();
        lbf = new javax.swing.JLabel();
        txtBallocated = new javax.swing.JTextField();
        txtBavailable = new javax.swing.JTextField();
        txtCallocated = new javax.swing.JTextField();
        txtCavailable = new javax.swing.JTextField();
        btnreferA = new javax.swing.JButton();
        btnreferB = new javax.swing.JButton();
        btnreferC = new javax.swing.JButton();
        lblreceptionist = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lowincome = new javax.swing.JRadioButton();
        middleincome = new javax.swing.JRadioButton();
        highincome = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houses = new javax.swing.JTable();
        no = new javax.swing.JCheckBox();
        yes = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtHousenumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbolowincome = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combowmidle = new javax.swing.JComboBox<>();
        comboboxhigh = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        txtYES = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelreceptionist.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));
        panelreceptionist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        a.setText("LOW INCOME ESTATE");
        panelreceptionist.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b.setText("MIDDLE INCOME ESTATE");
        panelreceptionist.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        c.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        c.setText("HIGH INCOME ESTATE");
        panelreceptionist.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        btncheckA.setFont(new java.awt.Font("Segoe UI Light", 3, 12)); // NOI18N
        btncheckA.setText("CHECK");
        btncheckA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckAActionPerformed(evt);
            }
        });
        panelreceptionist.add(btncheckA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, -1));

        btncheckB.setFont(new java.awt.Font("Segoe UI Light", 3, 12)); // NOI18N
        btncheckB.setText("CHECK");
        panelreceptionist.add(btncheckB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 100, -1));

        btncheckC.setFont(new java.awt.Font("Segoe UI Light", 3, 12)); // NOI18N
        btncheckC.setText("CHECK");
        panelreceptionist.add(btncheckC, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 590, 100, 30));
        panelreceptionist.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        panelreceptionist.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));
        panelreceptionist.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 650, 0));
        panelreceptionist.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));
        panelreceptionist.add(sep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 410, 10));

        lbb.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lbb.setText("Available");
        panelreceptionist.add(lbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        lba.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lba.setText("Allocated");
        panelreceptionist.add(lba, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));
        panelreceptionist.add(txtAallocated, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, 30));

        txtAavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAavailableActionPerformed(evt);
            }
        });
        panelreceptionist.add(txtAavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 120, 30));

        lbc.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lbc.setText("Allocated");
        panelreceptionist.add(lbc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        lbd.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lbd.setText("Available");
        panelreceptionist.add(lbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        lbe.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lbe.setText("Allocated");
        panelreceptionist.add(lbe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        lbf.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        lbf.setText("Available");
        panelreceptionist.add(lbf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));
        panelreceptionist.add(txtBallocated, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, 30));
        panelreceptionist.add(txtBavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 130, 30));
        panelreceptionist.add(txtCallocated, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, 30));
        panelreceptionist.add(txtCavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 120, 30));

        btnreferA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreferA.setText("REFERE A");
        btnreferA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreferAMouseClicked(evt);
            }
        });
        btnreferA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreferAActionPerformed(evt);
            }
        });
        panelreceptionist.add(btnreferA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, -1));

        btnreferB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreferB.setText("REFERE B");
        btnreferB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreferBMouseClicked(evt);
            }
        });
        panelreceptionist.add(btnreferB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        btnreferC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreferC.setText("REFERE C");
        btnreferC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreferCMouseClicked(evt);
            }
        });
        btnreferC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreferCActionPerformed(evt);
            }
        });
        panelreceptionist.add(btnreferC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 100, -1));

        lblreceptionist.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblreceptionist.setForeground(java.awt.Color.red);
        lblreceptionist.setText("Receptionist");
        panelreceptionist.add(lblreceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));
        panelreceptionist.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 10, 610));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("DOUBLE A HOUSES");
        panelreceptionist.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 350, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\icons8-home-64.png")); // NOI18N
        panelreceptionist.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 90, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\icons8-pay-date-64.png")); // NOI18N
        panelreceptionist.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 90, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel21.setForeground(java.awt.Color.red);
        jLabel21.setText("HOUSES STATES");
        panelreceptionist.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 200, -1));

        jLabel16.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel16.setText("LOW INCOME HOUSES");
        panelreceptionist.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 170, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\ground.png")); // NOI18N
        jLabel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        panelreceptionist.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 160, 80));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\beding.png")); // NOI18N
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 204), 2, true));
        panelreceptionist.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 170, 80));

        jLabel19.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel19.setText("MIDDLE INCOME HOUSES");
        panelreceptionist.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\n\\Documents\\rental.png")); // NOI18N
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 204), 2, true));
        panelreceptionist.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 170, 80));

        jLabel20.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel20.setText("HIGH INCOME HOUSES");
        panelreceptionist.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, -1, -1));

        Housescategory.add(lowincome);
        lowincome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lowincome.setText("LOW INCOME");
        panelreceptionist.add(lowincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        Housescategory.add(middleincome);
        middleincome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        middleincome.setText("MIDDLE INCOME");
        panelreceptionist.add(middleincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        Housescategory.add(highincome);
        highincome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        highincome.setText("HIGH INCOME");
        panelreceptionist.add(highincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, -1, -1));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        houses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        houses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        houses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hse Serial No", "Hse Number", "HSE Category", "Occupation Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houses);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 540, 130));

        housestatus.add(no);
        no.setText("NO");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        housestatus.add(yes);
        yes.setText("YES");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(txtHousenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("House number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cbolowincome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Size >", "SMALL SIZE", "MEDIUM SIZE" }));
        jPanel1.add(cbolowincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, 200, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("SELECT HOUSES CATEGORY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        combowmidle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Size >", "MEDIUM SIZE", "BIG SIZE" }));
        jPanel1.add(combowmidle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        comboboxhigh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Size >", "BIG SIZE" }));
        jPanel1.add(comboboxhigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, -1));

        reset.setText("RESET");
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 540, 90));
        jPanel1.add(txtYES, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 50, 30));
        jPanel1.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 50, 30));

        jLabel7.setText("T0TAL NUMBER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel8.setText("TOTAL VACANT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel9.setText("TOTAL OCCUPIED");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 292, 60, 30));

        panelreceptionist.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 780, 330));
        panelreceptionist.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 390, -1));

        jButton1.setText("NEXT");
        panelreceptionist.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, -1, -1));
        panelreceptionist.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, -1, -1));
        panelreceptionist.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));
        panelreceptionist.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 760, -1));

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 15, -1, -1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 10));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 780, 280));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 102), 3, true));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 610));

        panelreceptionist.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1210, 720));
        panelreceptionist.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 880, -1));

        getContentPane().add(panelreceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 1220, 750));

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.Color.yellow);
        jTextField2.setForeground(java.awt.Color.yellow);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncheckAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncheckAActionPerformed

    private void txtAavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAavailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAavailableActionPerformed

    private void btnreferAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreferAMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Agents agent= new Agents();
        agent.setVisible(true);

    }//GEN-LAST:event_btnreferAMouseClicked

    private void btnreferAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreferAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreferAActionPerformed

    private void btnreferBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreferBMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Agents agent= new Agents();
        agent.setVisible(true);
    }//GEN-LAST:event_btnreferBMouseClicked

    private void btnreferCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreferCMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Agents agent= new Agents();
        agent.setVisible(true);
    }//GEN-LAST:event_btnreferCMouseClicked

    private void btnreferCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreferCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreferCActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
       if(lowincome.isSelected()){
           DefaultTableModel tableModel= (DefaultTableModel)houses.getModel();
           combowmidle.setEnabled(false);
          comboboxhigh.setEnabled(false);
           cbolowincome.setEnabled(true);
     try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
                stmts = connection.createStatement();
               
                ResultSet rs=stmts.executeQuery("SELECT * FROM lowincomehses ");
              while(rs.next()){
               String  HouseSerialNumber=rs.getString("HouseSerialNumber");
               String HouseNumber=rs.getString("HouseNumber");
              String HouseCategory=rs.getString( "Category");
              String OccupationStatus=rs.getString("OccupationStatus");
               tableModel.addRow(new Object[]{HouseSerialNumber,HouseNumber,HouseCategory,OccupationStatus});  
               String sql="SELECT count(HouseSerialNumber) FROM lowincomehses ";
               String total=rs.getString("HouseSerialNumber");
               txtYES.setText(total);
               String occupied="SELECT count(OccupationStatus) FROM lowincomehses WHERE OccupationStatus=YES ";
               stmt=connection.prepareStatement(occupied);
              // rs=stmt.executeQuery();
               String occup=rs.getString("OccupationStatus");
                rs=stmt.executeQuery();
               jTextField3.setText(occup);
            }
                stmts.close();
                
            }
            catch(ClassNotFoundException|SQLException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e);
            }
       }
       if(middleincome.isSelected()){
         comboboxhigh.setEnabled(false); 
         cbolowincome.setEnabled(false);
         combowmidle.setEnabled(true);
           
          DefaultTableModel tableModel= (DefaultTableModel)houses.getModel();
     try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
                stmts = connection.createStatement();
                ResultSet rs=stmts.executeQuery("SELECT * FROM middleincomehses ");
              while(rs.next()){
               String  HouseSerialNumber=rs.getString("HouseSerialNumber");
               String HouseNumber=rs.getString("HouseNumber");
              String HouseCategory=rs.getString( "Category");
              String OccupationStatus=rs.getString("OccupationStatus");
               tableModel.addRow(new Object[]{HouseSerialNumber,HouseNumber,HouseCategory,OccupationStatus});  
               String sql="SELECT count(HouseSerialNumber) FROM middleincomehses";
               String total=rs.getString("HouseSerialNumber");
               txtYES.setText(total);
            }
                stmts.close();
                
            }
            catch(ClassNotFoundException|SQLException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e);
            }       
           
       }
       if(highincome.isSelected()){ 
         comboboxhigh.setEnabled(true); 
         cbolowincome.setEnabled(false);
        combowmidle.setEnabled(false);
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
                stmts = connection.createStatement();
                ResultSet rs=stmts.executeQuery("SELECT * FROM highincomehses ");
              while(rs.next()){
               String  HouseSerialNumber=rs.getString("HouseSerialNumber");
               String HouseNumber=rs.getString("HouseNumber");
              String HouseCategory=rs.getString( "Category");
              String OccupationStatus=rs.getString("OccupationStatus");
             // tableModel model=new tableModel();
               DefaultTableModel tableModel= (DefaultTableModel)houses.getModel();
               tableModel.addRow(new Object[]{HouseSerialNumber,HouseNumber,HouseCategory,OccupationStatus}); 
                String sql="SELECT count(HouseSerialNumber) FROM highincomehses";
               String total=rs.getString("HouseSerialNumber");
               txtYES.setText(total);
            }
                stmts.close();
                
            }
            catch(ClassNotFoundException|SQLException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e);
            }
           
           
           
           
           
           
       }
       
       
        /*   try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
            int idnumbers=Integer.parseInt(txtIDs.getText());   
            String firstname = txtFirstname.getText().toString();
            String secondname=txtSecondname.getText().toString();
            String lastname=txtLastname.getText().toString();
            String resident=txtResident.getText().toString();
            String email=txtEmail.getText().toString();
           String occcupation=txtOccupation.getText().toString();
           String date =txtday.getText().toString()+"/"+txtmonth.getText().toString()+"/"+txtyear.getText().toString();    
              PreparedStatement  insert =conn.prepareStatement("INSERT INTO lowincomehses VALUES(?,?,?,?,?,?,?,?,?)");
               
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
                 // gender="male";
                  insert.setString(9,male.getText());
                  
                }
                else if(female.isSelected()){
                  //  gender="female";
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
       */
    }//GEN-LAST:event_viewActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
 if(lowincome.isSelected()){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               int tablerow=houses.getSelectedRow();
               String tableValue=(houses.getModel().getValueAt(tablerow, 0).toString());
               String query="UPDATE lowincomehses SET HouseNumber=?,Category=?,OccupationStatus=? WHERE  HouseSerialNumber="+tableValue;
               PreparedStatement update =connection.prepareStatement(query);
               update.setString(1,txtHousenumber.getText());
             String housecategory=cbolowincome.getSelectedItem().toString();
             update.setString(2, housecategory);
             if(yes.isSelected()){
                  update.setString(3,yes.getText());
                
                }
                else {
                      update.setString(3,no.getText());
                }   
             update.executeUpdate();
             DefaultTableModel lowincome=(DefaultTableModel)houses.getModel();
             lowincome.setRowCount(0);
           //  sow_lowincome();
             JOptionPane.showMessageDialog(null,"Update Successfull !!!");       
 }
  catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
                e.printStackTrace();
  }
}
if(middleincome.isSelected()){
    try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/doubleadbs","root","vincent");
               int tablerow=houses.getSelectedRow();
               String tableValue=(houses.getModel().getValueAt(tablerow, 0).toString());
               String query="UPDATE middleincomehses SET HouseNumber=?,Category=?,OccupationStatus=? WHERE  HouseSerialNumber="+tableValue;
               PreparedStatement update =connection.prepareStatement(query);
               update.setString(1,txtHousenumber.getText());
             String housecategory=combowmidle.getSelectedItem().toString();
             update.setString(2, housecategory);
             if(yes.isSelected()){
                  update.setString(3,yes.getText());
                
                }
                else {
                      update.setString(3,no.getText());
                }   
             update.executeUpdate();
             DefaultTableModel lowincome=(DefaultTableModel)houses.getModel();
             lowincome.setRowCount(0);
             JOptionPane.showMessageDialog(null,"Update Successfull !!!");       
 }
  catch(ClassNotFoundException|SQLException e ){
                JOptionPane.showMessageDialog(null,e);
                e.printStackTrace();
  }
}
    }//GEN-LAST:event_updateActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
if(evt.getSource()==yes){
    int x=1;
        while(evt.getSource()==yes){
        this.txtYES.setText(Integer.toString(x));
        if(x==15){
            break;
        }
    x++;
    }
    }//GEN-LAST:event_yesActionPerformed
    }
    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        if(evt.getSource()==no){
    
        
    }//GEN-LAST:event_noActionPerformed
    }
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
            java.util.logging.Logger.getLogger(DoubleAhouses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoubleAhouses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoubleAhouses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoubleAhouses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoubleAhouses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Housescategory;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    public javax.swing.JButton btncheckA;
    public javax.swing.JButton btncheckB;
    public javax.swing.JButton btncheckC;
    public javax.swing.JButton btnreferA;
    public javax.swing.JButton btnreferB;
    public javax.swing.JButton btnreferC;
    private javax.swing.JLabel c;
    private javax.swing.JComboBox<String> cbolowincome;
    private javax.swing.JComboBox<String> comboboxhigh;
    private javax.swing.JComboBox<String> combowmidle;
    private javax.swing.JRadioButton highincome;
    private javax.swing.JTable houses;
    private javax.swing.ButtonGroup housestatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lba;
    private javax.swing.JLabel lbb;
    private javax.swing.JLabel lbc;
    private javax.swing.JLabel lbd;
    private javax.swing.JLabel lbe;
    private javax.swing.JLabel lbf;
    public javax.swing.JLabel lblreceptionist;
    private javax.swing.JRadioButton lowincome;
    private javax.swing.JRadioButton middleincome;
    private javax.swing.JCheckBox no;
    public static javax.swing.JPanel panelreceptionist;
    private javax.swing.JButton reset;
    private javax.swing.JSeparator sep2;
    public javax.swing.JTextField txtAallocated;
    public javax.swing.JTextField txtAavailable;
    public javax.swing.JTextField txtBallocated;
    public javax.swing.JTextField txtBavailable;
    public javax.swing.JTextField txtCallocated;
    public javax.swing.JTextField txtCavailable;
    public static javax.swing.JTextField txtHousenumber;
    public static javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtYES;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    public static javax.swing.JCheckBox yes;
    // End of variables declaration//GEN-END:variables

}
