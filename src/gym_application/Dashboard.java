/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_application;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamila
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    private PreparedStatement pst;
    private final Connection conn;
    private ResultSet rs;

    public Dashboard() {
        initComponents();
        conn = DbConnect.DbConnect();
        try {
            String Sql = "SELECT CUSTOMER_CODE FROM gym_customer ORDER BY CUSTOMER_ID DESC LIMIT 1";
            pst = conn.prepareStatement(Sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String old_no = rs.getString("CUSTOMER_CODE");
                String hit_no = old_no.substring(0,4);
                Integer new_no = Integer.parseInt(old_no.substring(2)) + 1;
                System.out.print(new_no + 1);
                System.out.print(hit_no);
                lbl_userCode.setText(hit_no + new_no);
            } else {
                lbl_userCode.setText("GC001");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_home = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_new_user = new javax.swing.JButton();
        btn_payments = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        btn_emp_details = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tab_home = new javax.swing.JTabbedPane();
        panel_home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_add_user = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_contact = new javax.swing.JLabel();
        lbl_reg_date = new javax.swing.JLabel();
        lbl_weight = new javax.swing.JLabel();
        lbl_height = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        date_reg = new com.toedter.calendar.JDateChooser();
        txt_weight = new javax.swing.JTextField();
        txt_height = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        lb_bmicalc = new javax.swing.JLabel();
        lbl_userCode = new javax.swing.JLabel();
        label_validate_contact_No = new javax.swing.JLabel();
        lbl_customer_code_name = new javax.swing.JLabel();
        panel_payment = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        select_userID = new javax.swing.JComboBox<>();
        lbl_cus_name = new javax.swing.JLabel();
        txt_customer_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_contact_no = new javax.swing.JTextField();
        lbl_last_pay_date = new javax.swing.JLabel();
        date_last_pay = new com.toedter.calendar.JDateChooser();
        lbl_pay_amount = new javax.swing.JLabel();
        txt_pay_amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_reset_pay = new javax.swing.JButton();
        panel_report = new javax.swing.JPanel();
        panel_employee = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        lbl_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setBackground(new java.awt.Color(168, 132, 201));

        btn_home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_new_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_user.setText("Add New User");
        btn_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_userActionPerformed(evt);
            }
        });

        btn_payments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_payments.setText("Payment");
        btn_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentsActionPerformed(evt);
            }
        });

        btn_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_report.setText("Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_emp_details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_emp_details.setText("Employee Details");
        btn_emp_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_detailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_dashboardLayout = new javax.swing.GroupLayout(lbl_dashboard);
        lbl_dashboard.setLayout(lbl_dashboardLayout);
        lbl_dashboardLayout.setHorizontalGroup(
            lbl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_dashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(lbl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lbl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_new_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_payments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_emp_details, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        lbl_dashboardLayout.setVerticalGroup(
            lbl_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_dashboardLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(btn_home)
                .addGap(41, 41, 41)
                .addComponent(btn_new_user)
                .addGap(46, 46, 46)
                .addComponent(btn_payments)
                .addGap(39, 39, 39)
                .addComponent(btn_emp_details)
                .addGap(39, 39, 39)
                .addComponent(btn_report)
                .addGap(62, 62, 62))
        );

        lbl_home.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        lbl_home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 630, 50));

        panel_home.setBackground(new java.awt.Color(215, 186, 242));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panel_homeLayout = new javax.swing.GroupLayout(panel_home);
        panel_home.setLayout(panel_homeLayout);
        panel_homeLayout.setHorizontalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
        );
        panel_homeLayout.setVerticalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_homeLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        tab_home.addTab("", panel_home);

        lbl_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_name.setText("Name");

        lbl_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_address.setText("Address");

        lbl_contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_contact.setText("Contact No");

        lbl_reg_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_reg_date.setText("Registration Date");

        lbl_weight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_weight.setText("Weight (Kg)");

        lbl_height.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_height.setText("Height (Cm)");

        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });
        txt_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contactKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contactKeyReleased(evt);
            }
        });

        date_reg.setDateFormatString("dd-MM-YYYY");

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        lb_bmicalc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_bmicalc.setText("BMI");

        lbl_userCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_customer_code_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_customer_code_name.setText("Customer Code");

        javax.swing.GroupLayout panel_add_userLayout = new javax.swing.GroupLayout(panel_add_user);
        panel_add_user.setLayout(panel_add_userLayout);
        panel_add_userLayout.setHorizontalGroup(
            panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_userLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_customer_code_name)
                    .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_name)
                        .addComponent(lbl_address)
                        .addComponent(lbl_contact)
                        .addComponent(lbl_reg_date)
                        .addComponent(lbl_weight)
                        .addComponent(lbl_height)))
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_add_userLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_add_userLayout.createSequentialGroup()
                                .addComponent(btn_reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_save))
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_reg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_weight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_validate_contact_No, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(panel_add_userLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl_userCode, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_bmicalc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        panel_add_userLayout.setVerticalGroup(
            panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_userLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_customer_code_name)
                    .addComponent(lbl_userCode)
                    .addComponent(lb_bmicalc))
                .addGap(51, 51, 51)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_add_userLayout.createSequentialGroup()
                        .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addGap(36, 36, 36)
                        .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_address))
                        .addGap(32, 32, 32)
                        .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contact)
                            .addComponent(label_validate_contact_No))
                        .addGap(34, 34, 34)
                        .addComponent(date_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_reg_date))
                .addGap(30, 30, 30)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_weight))
                .addGap(34, 34, 34)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_height))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panel_add_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_save))
                .addGap(23, 23, 23))
        );

        tab_home.addTab("", panel_add_user);

        panel_payment.setBackground(new java.awt.Color(215, 186, 242));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Customer Code");

        select_userID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_cus_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cus_name.setText("Name");

        txt_customer_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contact No");

        lbl_last_pay_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_last_pay_date.setText("Last Payment Date");

        lbl_pay_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_pay_amount.setText("Payment Amount");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Pay");

        btn_reset_pay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reset_pay.setText("Reset");
        btn_reset_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_paymentLayout = new javax.swing.GroupLayout(panel_payment);
        panel_payment.setLayout(panel_paymentLayout);
        panel_paymentLayout.setHorizontalGroup(
            panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paymentLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_last_pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_paymentLayout.createSequentialGroup()
                            .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_cus_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel3))
                            .addGap(121, 121, 121)
                            .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_paymentLayout.createSequentialGroup()
                                    .addComponent(btn_reset_pay)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addComponent(select_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date_last_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pay_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbl_pay_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panel_paymentLayout.setVerticalGroup(
            panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paymentLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(select_userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cus_name)
                    .addComponent(txt_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_last_pay_date)
                    .addComponent(date_last_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pay_amount)
                    .addComponent(txt_pay_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(panel_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_reset_pay))
                .addGap(43, 43, 43))
        );

        tab_home.addTab("", panel_payment);

        javax.swing.GroupLayout panel_reportLayout = new javax.swing.GroupLayout(panel_report);
        panel_report.setLayout(panel_reportLayout);
        panel_reportLayout.setHorizontalGroup(
            panel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        panel_reportLayout.setVerticalGroup(
            panel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        tab_home.addTab("", panel_report);

        panel_employee.setBackground(new java.awt.Color(215, 186, 242));

        javax.swing.GroupLayout panel_employeeLayout = new javax.swing.GroupLayout(panel_employee);
        panel_employee.setLayout(panel_employeeLayout);
        panel_employeeLayout.setHorizontalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        panel_employeeLayout.setVerticalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        tab_home.addTab("", panel_employee);

        lbl_home.add(tab_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 630, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(846, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        tab_home.setSelectedIndex(0);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_userActionPerformed
        tab_home.setSelectedIndex(1);
    }//GEN-LAST:event_btn_new_userActionPerformed

    private void btn_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentsActionPerformed
        tab_home.setSelectedIndex(2);
    }//GEN-LAST:event_btn_paymentsActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        tab_home.setSelectedIndex(3);
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_emp_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_detailsActionPerformed
        tab_home.setSelectedIndex(4);
    }//GEN-LAST:event_btn_emp_detailsActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_name.setText(null);
        txt_address.setText(null);
        txt_contact.setText(null);
        date_reg.setDate(null);
        txt_weight.setText(null);
        txt_height.setText(null);
        lb_bmicalc.setText(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_reset_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_payActionPerformed
        select_userID.setSelectedItem(null);
        txt_address.setText(null);
        txt_customer_name.setText(null);
        txt_contact_no.setText(null);
        date_last_pay.setDate(null);
        txt_pay_amount.setText(null);
    }//GEN-LAST:event_btn_reset_payActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String name = txt_name.getText();
        String address = txt_address.getText();
        String contact_No = txt_contact.getText();

        SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MM-yyyy");
        String reg_date = Date_Format.format(date_reg.getDate());
        String weight = txt_weight.getText();
        String height = txt_height.getText();
        String customer_code = lbl_userCode.getText();
        try {
            String sql = "Insert into gym_customer (CUSTOMER_CODE,CUSTOMER_NAME,CUSTOMER_ADDRESS,CUSTOMER_MOBILE_NO,CUSTOMER_REG_DATE,CUSTOMER_WEIGHT,CUSTOMER_HEIGHT,IS_ACTIVE) values(?,?,?,?,?,?,?,1)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, customer_code);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, contact_No);
            pst.setString(5, reg_date);
            pst.setString(6, weight);
            pst.setString(7, height);
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Customer Added Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactActionPerformed

    private void txt_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_contactKeyPressed

    private void txt_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactKeyReleased

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_emp_details;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_new_user;
    private javax.swing.JButton btn_payments;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_reset_pay;
    private javax.swing.JButton btn_save;
    private com.toedter.calendar.JDateChooser date_last_pay;
    private com.toedter.calendar.JDateChooser date_reg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_validate_contact_No;
    private javax.swing.JLabel lb_bmicalc;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_cus_name;
    private javax.swing.JLabel lbl_customer_code_name;
    private javax.swing.JPanel lbl_dashboard;
    private javax.swing.JLabel lbl_height;
    private javax.swing.JPanel lbl_home;
    private javax.swing.JLabel lbl_last_pay_date;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pay_amount;
    private javax.swing.JLabel lbl_reg_date;
    private javax.swing.JLabel lbl_userCode;
    private javax.swing.JLabel lbl_weight;
    private javax.swing.JPanel panel_add_user;
    private javax.swing.JPanel panel_employee;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_payment;
    private javax.swing.JPanel panel_report;
    private javax.swing.JComboBox<String> select_userID;
    private javax.swing.JTabbedPane tab_home;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_contact_no;
    private javax.swing.JTextField txt_customer_name;
    private javax.swing.JTextField txt_height;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pay_amount;
    private javax.swing.JTextField txt_weight;
    // End of variables declaration//GEN-END:variables
}
