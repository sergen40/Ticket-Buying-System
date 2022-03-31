/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ticketbuyingsystem;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Main extends javax.swing.JFrame {

    String col[] = {"Ticket No", "Name", "Surname", "From", "To", "Class", "Ticket Type", "Age Type", "Date", "Time", "Comment", "Email", "Sms", "Price"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0);
    int activeRow = -1;

    String trainCol[] = {"From", "To", "Date", "Time"};
    DefaultTableModel trainTableModel = new DefaultTableModel(trainCol, 0);
    int trainActiveRow = -1;

    public void Clear() {
        txtTicketNo.setText("");
        txtNameResult.setText("");
        txtSurnameResult.setText("");
        txtFromResult.setText("");
        txtToResult.setText("");
        txtClassResult.setText("");
        txtTicketTypeResult.setText("");
        txtAgeTypeResult.setText("");
        txtDateResult.setText("");
        txtTimeResult.setText("");
        txtCommentResult.setText("");
        txtPrice.setText("");
        chkEmail.setSelected(false);
        chkSms.setSelected(false);
    }

    public Main() {
        initComponents();
        Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(di.width / 2 - this.getSize().width / 2, di.height / 2 - this.getSize().height / 2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classGroup = new javax.swing.ButtonGroup();
        ticketTypeGroup = new javax.swing.ButtonGroup();
        ageGroup = new javax.swing.ButtonGroup();
        pnlTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlTicketTypes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        radioStandardClass = new javax.swing.JRadioButton();
        radioEconomyClass = new javax.swing.JRadioButton();
        radioFirstClass = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radioSingleTicket = new javax.swing.JRadioButton();
        radioReturnTicket = new javax.swing.JRadioButton();
        radioAdult = new javax.swing.JRadioButton();
        radioChild = new javax.swing.JRadioButton();
        cbxTo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxDate = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbxTime = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbxFrom = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        pnlTicketInfo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtClassResult = new javax.swing.JTextField();
        txtTicketTypeResult = new javax.swing.JTextField();
        txtAgeTypeResult = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFromResult = new javax.swing.JTextField();
        txtToResult = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDateResult = new javax.swing.JTextField();
        txtTimeResult = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTicketNo = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        chkSms = new javax.swing.JCheckBox();
        chkEmail = new javax.swing.JCheckBox();
        btnInsert = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCommentResult = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNameResult = new javax.swing.JTextField();
        txtSurnameResult = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        pnlTicketList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrains = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        pnlTrainSearchList = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTrainSearchList = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameTicket"); // NOI18N

        pnlTitle.setBackground(new java.awt.Color(204, 204, 255));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTitle.setName("mainPanel"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Train Ticketing System");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlTicketTypes.setBackground(new java.awt.Color(204, 204, 255));
        pnlTicketTypes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTicketTypes.setName("mainPanel"); // NOI18N
        pnlTicketTypes.setPreferredSize(new java.awt.Dimension(700, 800));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Class");

        classGroup.add(radioStandardClass);
        radioStandardClass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioStandardClass.setText("Standard");

        classGroup.add(radioEconomyClass);
        radioEconomyClass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioEconomyClass.setText("Economy");

        classGroup.add(radioFirstClass);
        radioFirstClass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioFirstClass.setText("First Class");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Ticket Type");

        ticketTypeGroup.add(radioSingleTicket);
        radioSingleTicket.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioSingleTicket.setText("Single");

        ticketTypeGroup.add(radioReturnTicket);
        radioReturnTicket.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioReturnTicket.setText("Return");

        ageGroup.add(radioAdult);
        radioAdult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioAdult.setText("Adult");

        ageGroup.add(radioChild);
        radioChild.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioChild.setText("Child");

        cbxTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Istanbul", "Ankara", "Izmir", "Antalya", "Bursa" }));
        cbxTo.setSelectedIndex(1);
        cbxTo.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("From");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("To");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        txtComment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtComment);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Comment");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Age Type");

        cbxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.01.2021", "11.01.2021", "12.01.2021", "13.01.2021", "14.01.2021" }));
        cbxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Date");

        cbxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "12:00", "14:00", "16:00" }));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Time");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Surname");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Name");

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Istanbul", "Ankara", "Izmir", "Antalya", "Bursa" }));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 204, 204));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Ticket Type");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlTicketTypesLayout = new javax.swing.GroupLayout(pnlTicketTypes);
        pnlTicketTypes.setLayout(pnlTicketTypesLayout);
        pnlTicketTypesLayout.setHorizontalGroup(
            pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel19)))
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioStandardClass, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(radioEconomyClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                                        .addComponent(radioSingleTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(radioAdult)
                                        .addGap(10, 10, 10)
                                        .addComponent(radioChild))
                                    .addComponent(radioReturnTicket)))
                            .addComponent(radioFirstClass)
                            .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)))))
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketTypesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch)
                            .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxTo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        pnlTicketTypesLayout.setVerticalGroup(
            pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioStandardClass)
                            .addComponent(radioSingleTicket)
                            .addComponent(radioChild)
                            .addComponent(radioAdult)))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioReturnTicket)
                    .addComponent(radioEconomyClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioFirstClass)
                .addGap(18, 18, 18)
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cbxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(cbxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTicketTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTicketTypesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addGap(353, 353, 353))
        );

        pnlTicketInfo.setBackground(new java.awt.Color(204, 204, 255));
        pnlTicketInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTicketInfo.setName("mainPanel"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Class");

        txtClassResult.setEditable(false);
        txtClassResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClassResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTicketTypeResult.setEditable(false);
        txtTicketTypeResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTicketTypeResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtAgeTypeResult.setEditable(false);
        txtAgeTypeResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAgeTypeResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Ticket Type");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Age Type");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("From");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("To");

        txtFromResult.setEditable(false);
        txtFromResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFromResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtToResult.setEditable(false);
        txtToResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtToResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Date");

        txtDateResult.setEditable(false);
        txtDateResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimeResult.setEditable(false);
        txtTimeResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimeResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Time");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Ticket No");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Price");

        txtTicketNo.setEditable(false);
        txtTicketNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTicketNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrice.setEditable(false);
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        chkSms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkSms.setText("Send SMS");

        chkEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkEmail.setText("Send E-Mail");

        btnInsert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtCommentResult.setEditable(false);
        txtCommentResult.setColumns(20);
        txtCommentResult.setRows(5);
        txtCommentResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtCommentResult);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Comment");

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Surname");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Name");

        txtNameResult.setEditable(false);
        txtNameResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNameResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSurnameResult.setEditable(false);
        txtSurnameResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSurnameResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setBackground(new java.awt.Color(255, 204, 204));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Ticket Info");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlTicketInfoLayout = new javax.swing.GroupLayout(pnlTicketInfo);
        pnlTicketInfo.setLayout(pnlTicketInfoLayout);
        pnlTicketInfoLayout.setHorizontalGroup(
            pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(23, 23, 23)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                                .addComponent(chkEmail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkSms, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTicketInfoLayout.createSequentialGroup()
                                    .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addComponent(txtDateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTimeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTicketInfoLayout.createSequentialGroup()
                                    .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSurnameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel24)
                                            .addGap(55, 55, 55)
                                            .addComponent(txtNameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(39, 39, 39)
                                    .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFromResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtToResult, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(86, 86, 86))
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketInfoLayout.createSequentialGroup()
                                .addComponent(txtClassResult, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTicketTypeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgeTypeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlTicketInfoLayout.setVerticalGroup(
            pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgeTypeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTicketTypeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClassResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFromResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtSurnameResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtToResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtTimeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkEmail)
                            .addComponent(chkSms)))
                    .addGroup(pnlTicketInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addGap(6, 6, 6)
                .addGroup(pnlTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );

        pnlTicketList.setBackground(new java.awt.Color(204, 204, 255));
        pnlTicketList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTicketList.setName("mainPanel"); // NOI18N

        tblTrains.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket No", "Name", "Surname", "From", "To", "Class", "Ticket Type", "Age Type", "Date", "Time", "Comment", "Email", "Sms", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTrains.setFocusable(false);
        tblTrains.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTrains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrainsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTrains);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ticket List");

        javax.swing.GroupLayout pnlTicketListLayout = new javax.swing.GroupLayout(pnlTicketList);
        pnlTicketList.setLayout(pnlTicketListLayout);
        pnlTicketListLayout.setHorizontalGroup(
            pnlTicketListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTicketListLayout.setVerticalGroup(
            pnlTicketListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketListLayout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTrainSearchList.setBackground(new java.awt.Color(204, 204, 255));
        pnlTrainSearchList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTrainSearchList.setName("mainPanel"); // NOI18N

        tblTrainSearchList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTrainSearchList.setFocusable(false);
        tblTrainSearchList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTrainSearchList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrainSearchListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTrainSearchList);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Train List");

        javax.swing.GroupLayout pnlTrainSearchListLayout = new javax.swing.GroupLayout(pnlTrainSearchList);
        pnlTrainSearchList.setLayout(pnlTrainSearchListLayout);
        pnlTrainSearchListLayout.setHorizontalGroup(
            pnlTrainSearchListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(pnlTrainSearchListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTrainSearchListLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlTrainSearchListLayout.setVerticalGroup(
            pnlTrainSearchListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrainSearchListLayout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTrainSearchListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTrainSearchListLayout.createSequentialGroup()
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTicketTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTicketInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlTicketList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTrainSearchList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTicketTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTicketInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTrainSearchList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTicketList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (txtTicketNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "There is not ticket info. Please search train and add ticket info");
        } else {

            String email, sms;
            if (chkEmail.isSelected()) {
                email = "Yes";
            } else {
                email = "No";
            }
            if (chkSms.isSelected()) {
                sms = "Yes";
            } else {
                sms = "No";
            }
            SystemClass systemClass = new SystemClass();
            systemClass.setTableModel(tableModel);
            tableModel = systemClass.Add(txtTicketNo.getText(), txtName.getText(), txtSurname.getText(), txtFromResult.getText(), txtToResult.getText(),
                    txtClassResult.getText(), txtTicketTypeResult.getText(), txtAgeTypeResult.getText(),
                    txtDateResult.getText(), txtTimeResult.getText(), txtCommentResult.getText(),
                    email, sms, txtPrice.getText());
            tblTrains.setModel(tableModel);

        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (activeRow >= 0) {
            SystemClass systemClass = new SystemClass();
            systemClass.setTableModel(tableModel);
            systemClass.Delete(activeRow);
            tblTrains.setModel(tableModel);
            Clear();

        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblTrainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrainsMouseClicked
        int index = tblTrains.getSelectedRow();
        if (index >= 0) {
            activeRow = index;
            TableModel model = tblTrains.getModel();

            txtTicketNo.setText(model.getValueAt(index, 0).toString());
            txtNameResult.setText(model.getValueAt(index, 1).toString());
            txtSurnameResult.setText(model.getValueAt(index, 2).toString());
            txtFromResult.setText(model.getValueAt(index, 3).toString());
            txtToResult.setText(model.getValueAt(index, 4).toString());
            txtClassResult.setText(model.getValueAt(index, 5).toString());
            txtTicketTypeResult.setText(model.getValueAt(index, 6).toString());
            txtAgeTypeResult.setText(model.getValueAt(index, 7).toString());
            txtDateResult.setText(model.getValueAt(index, 8).toString());
            txtTimeResult.setText(model.getValueAt(index, 9).toString());
            txtCommentResult.setText(model.getValueAt(index, 10).toString());
            if (model.getValueAt(index, 11).toString() == "Yes") {
                chkEmail.setSelected(true);
            } else {
                chkEmail.setSelected(false);
            }
            if (model.getValueAt(index, 12).toString() == "Yes") {
                chkSms.setSelected(true);
            } else {
                chkSms.setSelected(false);
            }
            txtPrice.setText(model.getValueAt(index, 13).toString());

        }
    }//GEN-LAST:event_tblTrainsMouseClicked

    private void tblTrainSearchListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrainSearchListMouseClicked
        int index = tblTrainSearchList.getSelectedRow();
        if (index >= 0) {

            TableModel model = tblTrainSearchList.getModel();

            Random rand = new Random();
            String ticketNo = rand.nextInt(9999) + "";
            txtTicketNo.setText(ticketNo);

            txtNameResult.setText(txtName.getText());
            txtSurnameResult.setText(txtSurname.getText());

            txtFromResult.setText(model.getValueAt(index, 0).toString());
            txtToResult.setText(model.getValueAt(index, 1).toString());
            txtDateResult.setText(model.getValueAt(index, 2).toString());
            txtTimeResult.setText(model.getValueAt(index, 3).toString());

            radioStandardClass.setActionCommand("Standard");
            radioEconomyClass.setActionCommand("Economy");
            radioFirstClass.setActionCommand("First Class");
            radioSingleTicket.setActionCommand("Single");
            radioReturnTicket.setActionCommand("Return");
            radioAdult.setActionCommand("Adult");
            radioChild.setActionCommand("Child");

            txtClassResult.setText(classGroup.getSelection().getActionCommand()); //selectedClass.getText();
            txtTicketTypeResult.setText(ticketTypeGroup.getSelection().getActionCommand());//selectedTicketType.getText();
            txtAgeTypeResult.setText(ageGroup.getSelection().getActionCommand());//selectedAge.getText();

            txtCommentResult.setText(txtComment.getText());

            double price = 0;
            switch (txtClassResult.getText()) {
                case "Economy":
                    EconomyTrain economyTrain = new EconomyTrain();
                    price = economyTrain.CalculatePrice();
                    economyTrain.info();
                    break;
                case "Standard":
                    StandardTrain standardTrain = new StandardTrain();
                    price = standardTrain.CalculatePrice();
                    standardTrain.info();
                    break;
                case "First Class":
                    FirstClassTrain firstClassTrain = new FirstClassTrain();
                    price = firstClassTrain.CalculatePrice();
                    firstClassTrain.info();
                    firstClassTrain.giveGift();
                    break;
            }
            txtPrice.setText(price + "");

        }

    }//GEN-LAST:event_tblTrainSearchListMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String from = cbxFrom.getSelectedItem().toString();
        String to = cbxTo.getSelectedItem().toString();
        String date = cbxDate.getSelectedItem().toString();
        String time = cbxTime.getSelectedItem().toString();

        SystemClass systemClass = new SystemClass();
        systemClass.setTrainTableModel(trainTableModel);
        ArrayList<TrainInfo> trainList = systemClass.getTrainList();
        TrainInfo searchTrain = new TrainInfo(from, to, date, time);

        trainTableModel = systemClass.Search(searchTrain);
        tblTrainSearchList.setModel(trainTableModel);
        if (trainTableModel.getRowCount() == 0){
            Clear();
            JOptionPane.showMessageDialog(null, "No Data found");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ageGroup;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxDate;
    private javax.swing.JComboBox<String> cbxFrom;
    private javax.swing.JComboBox<String> cbxTime;
    private javax.swing.JComboBox<String> cbxTo;
    private javax.swing.JCheckBox chkEmail;
    private javax.swing.JCheckBox chkSms;
    private javax.swing.ButtonGroup classGroup;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlTicketInfo;
    private javax.swing.JPanel pnlTicketList;
    private javax.swing.JPanel pnlTicketTypes;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTrainSearchList;
    private javax.swing.JRadioButton radioAdult;
    private javax.swing.JRadioButton radioChild;
    private javax.swing.JRadioButton radioEconomyClass;
    private javax.swing.JRadioButton radioFirstClass;
    private javax.swing.JRadioButton radioReturnTicket;
    private javax.swing.JRadioButton radioSingleTicket;
    private javax.swing.JRadioButton radioStandardClass;
    private javax.swing.JTable tblTrainSearchList;
    private javax.swing.JTable tblTrains;
    private javax.swing.ButtonGroup ticketTypeGroup;
    private javax.swing.JTextField txtAgeTypeResult;
    private javax.swing.JTextField txtClassResult;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtCommentResult;
    private javax.swing.JTextField txtDateResult;
    private javax.swing.JTextField txtFromResult;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameResult;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtSurnameResult;
    private javax.swing.JTextField txtTicketNo;
    private javax.swing.JTextField txtTicketTypeResult;
    private javax.swing.JTextField txtTimeResult;
    private javax.swing.JTextField txtToResult;
    // End of variables declaration//GEN-END:variables
}
