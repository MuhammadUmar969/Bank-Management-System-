

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CreateAccount extends javax.swing.JFrame {
        public static String accountnoforuandp;
    /**
     * Creates new form CreateAccount
     */
    public Connection connect;
    public CreateAccount() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        MobileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DebitNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PIN = new javax.swing.JPasswordField();
        CheckButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 103, 153), 5));

        Heading.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(21, 103, 153));
        Heading.setText("Verify Your Bank Account");

        BackButton.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(153, 153, 153));
        BackButton.setIcon(new javax.swing.ImageIcon("icons8-back-arrow-30.png")); // NOI18N
        BackButton.setText("Go Back");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        LastName.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        MobileNumber.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        MobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNumberActionPerformed(evt);
            }
        });

        jLabel5.setText("Mobile Number");

        AccountNumber.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        AccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Account Number");

        DebitNumber.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        DebitNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitNumberActionPerformed(evt);
            }
        });

        jLabel9.setText("Debit Card Number");

        jLabel10.setText("PIN");

        CheckButton.setBackground(new java.awt.Color(21, 103, 153));
        CheckButton.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 24)); // NOI18N
        CheckButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckButton.setIcon(new javax.swing.ImageIcon("icons8-search-client-30.png")); // NOI18N
        CheckButton.setText("Check Details");
        CheckButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed();
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("icons8-circled-user-male-skin-type-1-2-100 (2).png")); // NOI18N

        CloseButton.setBackground(new java.awt.Color(255, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon("icons8-close-window-30.png")); // NOI18N
        CloseButton.setBorder(null);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(310, 310, 310)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(244, 244, 244)
                                                .addComponent(Heading))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(347, 347, 347)
                                                .addComponent(CheckButton))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(MobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(DebitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addGap(142, 142, 142)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4)
                                                        .addComponent(LastName)
                                                        .addComponent(jLabel10)
                                                        .addComponent(PIN)
                                                        .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))))
                                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BackButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Heading)
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DebitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(CheckButton)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void CheckButtonActionPerformed() {
        String MobileNo = MobileNumber.getText();
        String AccountNo = AccountNumber.getText();
        String DebitCardNo = DebitNumber.getText();
        String PinNo = PIN.getText();
        boolean check = false;
        if (MobileNo.length() == 11) {
            check = true;
            MobileNumber.setBackground(Color.GREEN);
        } else {
            check = false;
            MobileNumber.setBackground(new Color(246, 53, 40));
        }

        if ( AccountNo.length() == 16) {
            check = true;
            AccountNumber.setBackground(Color.GREEN);
        } else {
            check = false;
            AccountNumber.setBackground(new Color(246, 53, 40));
        }

        if (DebitCardNo.length() == 16) {
            check = true;
            DebitNumber.setBackground(Color.GREEN);
        } else {
            check = false;
            DebitNumber.setBackground(new Color(246, 53, 40));
        }

        if (PinNo.length() == 4) {
            check = true;
            PIN.setBackground(Color.GREEN);
        } else {
            check = false;
            PIN.setBackground(new Color(246, 53, 40));
        }
        if (!check) {
            JOptionPane.showMessageDialog(this,"Invalid Credentials\nAccount No(16 digit)\nDebit Card No(16 digit)\n Mobile No(11 digit)\n PIN(4 digit).");
            FirstName.setText("");
            LastName.setText("");
            MobileNumber.setText("");
            AccountNumber.setText("");
            DebitNumber.setText("");
            PIN.setText("");
            FirstName.requestFocus();

        }
        //        Database Connection and queries
        else {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "");

                try {
                    Statement st = connect.createStatement();
                    ResultSet r2 = st.executeQuery("SELECT * FROM logindetails");
                    while(r2.next()){
                        String ac=r2.getString(1);
                        if (ac.equals(AccountNumber.getText())) {
                            JOptionPane.showMessageDialog(null, "You Have Already Created Account please login or Call to Bank");
                            setVisible(false);
                            new Login().setVisible(true);
                            dispose();
                        }

                    }

                    try {
                        Statement pst = connect.createStatement();
                        String query = "INSERT INTO signup(FirstName,LastName,MobileNumber,AccountNumber,DebitNumber,PIN) VALUES('" + FirstName.getText() + "','" + LastName.getText() + "','" + MobileNumber.getText() + "','" + AccountNumber.getText() + "','" + DebitNumber.getText() + "','" + PIN.getText() + "')";
                        pst.executeUpdate(query);
                        Statement st2 = connect.createStatement();
                        String q = "INSERT INTO cards(AccountNo,CreditCardNumber,CreditCardBalance,CreditCardType,DebitCardNo) VALUES('"+AccountNumber.getText()+"','0123456789101112','100000','Gold','"+DebitNumber.getText()+"')";
                        st2.executeUpdate(q);
                        accountnoforuandp = AccountNumber.getText();
                    }catch(Exception e){JOptionPane.showMessageDialog(this,e);
                        dispose();
                    new CreateAccount();
                    }
                    MailVerification Mv = new MailVerification();
                           setVisible(false);
                           dispose();
                           Mv.setVisible(true);
                           FirstName.setText("");
                           LastName.setText("");
                           MobileNumber.setText("");
                           AccountNumber.setText("");
                           DebitNumber.setText("");
                           PIN.setText("");
                           FirstName.requestFocus();


                   }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
            connect.close();
        }

         catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e + "\nWe Cannot Communicate With Server! \n Please Check Your internet Connection or call to bank");
        }
    }
    }


    private void DebitNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void AccountNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void MobileNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField AccountNumber;
    private javax.swing.JLabel BackButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField DebitNumber;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel Heading;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MobileNumber;
    private javax.swing.JPasswordField PIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
