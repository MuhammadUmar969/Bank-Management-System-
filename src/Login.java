import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.*;

public class Login extends JFrame {
    public static String anfordb;
    public Connection connect;
    public Login() {

        initComponents();
    }
    void enter(JPanel btn){
        btn.setBackground(new Color(21,79,128));
    }
    void exit(JPanel btn){
        btn.setBackground(new Color(21,103,153));
    }
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        DBMS = new javax.swing.JLabel();
        DBMS1 = new javax.swing.JLabel();
        CreateAccountbtn = new javax.swing.JPanel();
        addacc = new javax.swing.JLabel();
        ForgotPassword = new javax.swing.JPanel();
        fglabel = new javax.swing.JLabel();
        Exit = new javax.swing.JPanel();
        exitlabel = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        LoginProfile = new javax.swing.JLabel();
        loginprofiletext = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Usernametf = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordtf = new javax.swing.JPasswordField();
        signbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SidePanel.setBackground(new java.awt.Color(21, 103, 153));
        SidePanel.setToolTipText("");
        SidePanel.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon("small logo.png")); // NOI18N
        SidePanel.add(logo);
        logo.setBounds(50, 10, 210, 220);

        DBMS.setFont(new java.awt.Font("Microsoft Sans Serif", Font.BOLD, 24)); // NOI18N
        DBMS.setForeground(new java.awt.Color(255, 255, 255));
        DBMS.setText(" DIGITAL BANK");
        SidePanel.add(DBMS);
        DBMS.setBounds(70, 230, 190, 40);

        DBMS1.setFont(new java.awt.Font("Microsoft Sans Serif", Font.BOLD, 24)); // NOI18N
        DBMS1.setForeground(new java.awt.Color(255, 255, 255));
        DBMS1.setText("MANAGEMENT SYSTEM");
        SidePanel.add(DBMS1);
        DBMS1.setBounds(10, 270, 290, 40);

        CreateAccountbtn.setBackground(new java.awt.Color(21, 103, 153));
        CreateAccountbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccountbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               CreateAccount createaccount = new CreateAccount();
               setVisible(false);
               createaccount.setVisible(true);
               dispose();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter(CreateAccountbtn);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit(CreateAccountbtn);
            }
        });

        addacc.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 18));
        addacc.setForeground(new java.awt.Color(255, 255, 255));
        addacc.setIcon(new javax.swing.ImageIcon("addprofile.png"));
        addacc.setText("Create Account");

        javax.swing.GroupLayout CreateAccountbtnLayout = new javax.swing.GroupLayout(CreateAccountbtn);
        CreateAccountbtn.setLayout(CreateAccountbtnLayout);
        CreateAccountbtnLayout.setHorizontalGroup(
                CreateAccountbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CreateAccountbtnLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addacc)
                                .addContainerGap(26, Short.MAX_VALUE))
        );
        CreateAccountbtnLayout.setVerticalGroup(
                CreateAccountbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CreateAccountbtnLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addacc)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(CreateAccountbtn);
        CreateAccountbtn.setBounds(60, 330, 190, 40);

        ForgotPassword.setBackground(new java.awt.Color(21, 103, 153));
        ForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetPassword resetPassword = new ResetPassword();
                setVisible(false);
                resetPassword.setVisible(true);
                dispose();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter(ForgotPassword);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit(ForgotPassword);
            }
        });

        fglabel.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 18)); // NOI18N
        fglabel.setForeground(new java.awt.Color(255, 255, 255));
        fglabel.setIcon(new javax.swing.ImageIcon("forgotpassword.png")); // NOI18N
        fglabel.setText("Forgot Passoward");

        javax.swing.GroupLayout ForgotPasswordLayout = new javax.swing.GroupLayout(ForgotPassword);
        ForgotPassword.setLayout(ForgotPasswordLayout);
        ForgotPasswordLayout.setHorizontalGroup(
                ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ForgotPasswordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ForgotPasswordLayout.setVerticalGroup(
                ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ForgotPasswordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fglabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.add(ForgotPassword);
        ForgotPassword.setBounds(60, 390, 190, 40);

        Exit.setBackground(new java.awt.Color(21, 103, 153));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.exit(0);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter(Exit);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit(Exit);
            }
        });

        exitlabel.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 18));
        exitlabel.setForeground(new java.awt.Color(255, 255, 255));
        exitlabel.setIcon(new javax.swing.ImageIcon("Exit-white.png"));
        exitlabel.setText("Exit");

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
                ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ExitLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exitlabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExitLayout.setVerticalGroup(
                ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitlabel)
                                .addContainerGap())
        );

        SidePanel.add(Exit);
        Exit.setBounds(60, 450, 190, 40);

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        LoginProfile.setIcon(new javax.swing.ImageIcon("login-profile.png"));

        loginprofiletext.setFont(new java.awt.Font("Microsoft Sans Serif", Font.BOLD, 24));
        loginprofiletext.setForeground(new java.awt.Color(21, 103, 153));
        loginprofiletext.setText("WELCOME");

        Username.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14));
        Username.setText("Username :");

        Usernametf.setToolTipText("Enter Username");

        Password.setFont(new java.awt.Font("Microsoft Sans Serif", Font.PLAIN, 14)); // NOI18N
        Password.setText("Password :");

        Passwordtf.setToolTipText("Enter Password");

        signbtn.setIcon(new javax.swing.ImageIcon("sign-in.png")); // NOI18N
        signbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigningButtonActionPerformed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signbtn.setIcon(new ImageIcon("sign-in2.png"));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signbtn.setIcon(new ImageIcon("sign-in.png"));
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
                LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addContainerGap(191, Short.MAX_VALUE)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                                .addComponent(LoginProfile)
                                                .addGap(188, 188, 188))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Username)
                                                        .addComponent(Usernametf, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                        .addComponent(Password)
                                                        .addComponent(Passwordtf))
                                                .addGap(173, 173, 173))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                                .addComponent(signbtn)
                                                .addGap(237, 237, 237))))
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(loginprofiletext)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        LoginPanelLayout.setVerticalGroup(
                LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(LoginProfile)
                                .addGap(75, 75, 75)
                                .addComponent(Username)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Usernametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signbtn)
                                .addContainerGap(87, Short.MAX_VALUE))
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(loginprofiletext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
                BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BasePanelLayout.createSequentialGroup()
                                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BasePanelLayout.setVerticalGroup(
                BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setUndecorated(true);
        pack();
        setLocationRelativeTo(null);
    }

    private void SigningButtonActionPerformed(MouseEvent evt) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");    //This Statment is used to load mysql jdbc driver
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "");    // To Connect with datatbase
            Statement st = connect.createStatement();
            ResultSet r = st.executeQuery("SELECT * FROM logindetails WHERE username='"+Usernametf.getText()+"'");
            while(r.next()) {
                anfordb = r.getString("AccountNo");
                String un = r.getString("username");
                String pswd =  r.getString("password");
                if (un.equals(Usernametf.getText()) && pswd.equals(Passwordtf.getText())) {
                    setVisible(false);
                    NewDashboard dashboard = new NewDashboard();
                    dashboard.setVisible(true);
                    dispose();
                }

                else if("".equals(Usernametf.getText()) && "".equals(Passwordtf.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Username or Password!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Credential !");
                Usernametf.setText("");
                Passwordtf.setText("");
                Usernametf.requestFocus();
            }}
            connect.close();                                                    // Here we close connection of database
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e+"\nCannot Connect With Server \n Please Check Your Internet Connection or Call to Bank");
        }

    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Login login = new Login();
        login.setVisible(true);
    }

    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel CreateAccountbtn;
    private javax.swing.JLabel DBMS;
    private javax.swing.JLabel DBMS1;
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel ForgotPassword;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel LoginProfile;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordtf;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Usernametf;
    private javax.swing.JLabel addacc;
    private javax.swing.JLabel exitlabel;
    private javax.swing.JLabel fglabel;
    private javax.swing.JLabel loginprofiletext;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel signbtn;
}
