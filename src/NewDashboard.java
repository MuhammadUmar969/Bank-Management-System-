import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class NewDashboard extends javax.swing.JFrame {

    public Connection connect;
    public static String ReciverAccountNo;
    public static String pass;
    public static String EnteredAmount;
    public String AccountNumber = Login.anfordb;
    public NewDashboard() {
        initComponents();
        HomeSectionMethod();
        arrowMethod();
        transactionHistory();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MainBackPanel = new javax.swing.JPanel();
        MenuePanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        HomeArrow = new javax.swing.JLabel();
        TransferPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TransferArrow = new javax.swing.JLabel();
        AccountPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        AccountsArrow = new javax.swing.JLabel();
        CardsPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        CardsArrow = new javax.swing.JLabel();
        ProfilePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ProfileArrow = new javax.swing.JLabel();
        LogOutPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        HeadPanel = new javax.swing.JPanel();
        HeadingText = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        HomeSection = new javax.swing.JPanel();
        NamePlate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BalancePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        HomeAcNumber = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CreditCardPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        CreditCardNumber = new javax.swing.JLabel();
        CreditCardBalance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TransactionPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionTableHome = new javax.swing.JTable();
        ShopPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TransferSection = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        ReciverAccountNumber = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        PayNowButton = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TransactionTable = new javax.swing.JTable();
        CardsSection = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        CCardNumber = new javax.swing.JLabel();
        CCardType = new javax.swing.JLabel();
        CCardCVV = new javax.swing.JLabel();
        CCardBalance = new javax.swing.JLabel();
        CCardRate = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        CCardIssuedDate = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        CCardExpiryDate = new javax.swing.JLabel();
        CreditCard = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        CardHolderName = new javax.swing.JLabel();
        CreditCardNo = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        DCardNumber = new javax.swing.JLabel();
        DCardType = new javax.swing.JLabel();
        DCardCVV = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        DCardIssuedDate = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        DCardExpiryDate = new javax.swing.JLabel();
        BalancePanel2 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        DHolderName = new javax.swing.JLabel();
        TotalBalance1 = new javax.swing.JLabel();
        DebitCardNo = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DNewPin = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        DReEnterPin = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        DChangePinBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CNewPin = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        CReEnterPin = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        CChangePinBtn = new javax.swing.JButton();
        AccountsSection = new javax.swing.JPanel();
        BalancePanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        ACNumber = new javax.swing.JLabel();
        TotalBalance = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        AccountStatus = new javax.swing.JLabel();
        AccountType = new javax.swing.JLabel();
        AccountNumberInBook = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        AccountStatus1 = new javax.swing.JLabel();
        AccountStatus2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        AccountStatus3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        AccountStatus4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        AccountStatus5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        ProfileSection = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ProfileName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        ProfileAccountNo = new javax.swing.JLabel();
        ProfileUsername = new javax.swing.JLabel();
        ProfileAccountType = new javax.swing.JLabel();
        ProfileEmail = new javax.swing.JLabel();
        ProfileAddress = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainBackPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainBackPanel.setPreferredSize(new java.awt.Dimension(1265, 700));

        MenuePanel.setBackground(new java.awt.Color(21, 103, 153));

        HomePanel.setBackground(new java.awt.Color(21, 103, 153));
        HomePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelPanelMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("icons8-home-30.png")); // NOI18N
        jLabel8.setText("Home");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setIconTextGap(10);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        HomeArrow.setIcon(new javax.swing.ImageIcon("icons8-arrow-30.png")); // NOI18N

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
                HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HomeArrow))
        );
        HomePanelLayout.setVerticalGroup(
                HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(HomePanelLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(HomeArrow)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        TransferPanel.setBackground(new java.awt.Color(21, 103, 153));
        TransferPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransferPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransferPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransferPanelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("icons8-data-transfer-30 (2).png")); // NOI18N
        jLabel9.setText("Transfer ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setIconTextGap(10);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        TransferArrow.setIcon(new javax.swing.ImageIcon("icons8-arrow-30.png")); // NOI18N

        javax.swing.GroupLayout TransferPanelLayout = new javax.swing.GroupLayout(TransferPanel);
        TransferPanel.setLayout(TransferPanelLayout);
        TransferPanelLayout.setHorizontalGroup(
                TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransferPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TransferArrow))
        );
        TransferPanelLayout.setVerticalGroup(
                TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransferPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TransferPanelLayout.createSequentialGroup()
                                                .addComponent(TransferArrow)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        AccountPanel.setBackground(new java.awt.Color(21, 103, 153));
        AccountPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountPanelPanelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("icons8-money-bag-rupee-30 (2).png")); // NOI18N
        jLabel10.setText("Account");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setIconTextGap(10);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        AccountsArrow.setIcon(new javax.swing.ImageIcon("icons8-arrow-30.png")); // NOI18N

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
                AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AccountPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccountsArrow))
        );
        AccountPanelLayout.setVerticalGroup(
                AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AccountPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AccountPanelLayout.createSequentialGroup()
                                                .addComponent(AccountsArrow)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        CardsPanel.setBackground(new java.awt.Color(21, 103, 153));
        CardsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CardsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CardsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CardsPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CardsPanelPanelMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("icons8-mastercard-credit-card-30.png")); // NOI18N
        jLabel11.setText("Cards");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setIconTextGap(10);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        CardsArrow.setIcon(new javax.swing.ImageIcon("icons8-arrow-30.png")); // NOI18N

        javax.swing.GroupLayout CardsPanelLayout = new javax.swing.GroupLayout(CardsPanel);
        CardsPanel.setLayout(CardsPanelLayout);
        CardsPanelLayout.setHorizontalGroup(
                CardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CardsPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CardsArrow))
        );
        CardsPanelLayout.setVerticalGroup(
                CardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CardsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(CardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(CardsPanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(CardsArrow)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        ProfilePanel.setBackground(new java.awt.Color(21, 103, 153));
        ProfilePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfilePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfilePanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfilePanelPanelMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("icons8-male-user-30.png")); // NOI18N
        jLabel12.setText("Profile");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setIconTextGap(10);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ProfileArrow.setIcon(new javax.swing.ImageIcon("icons8-arrow-30.png")); // NOI18N

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
                ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ProfileArrow))
        );
        ProfilePanelLayout.setVerticalGroup(
                ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ProfilePanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(ProfileArrow)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        LogOutPanel.setBackground(new java.awt.Color(21, 103, 153));
        LogOutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutPanelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutPanelPanelMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("icons8-logout-rounded-left-30.png")); // NOI18N
        jLabel13.setText("Log Out");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setIconTextGap(10);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout LogOutPanelLayout = new javax.swing.GroupLayout(LogOutPanel);
        LogOutPanel.setLayout(LogOutPanelLayout);
        LogOutPanelLayout.setHorizontalGroup(
                LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogOutPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogOutPanelLayout.setVerticalGroup(
                LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogOutPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout MenuePanelLayout = new javax.swing.GroupLayout(MenuePanel);
        MenuePanel.setLayout(MenuePanelLayout);
        MenuePanelLayout.setHorizontalGroup(
                MenuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TransferPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AccountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CardsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProfilePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogOutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuePanelLayout.setVerticalGroup(
                MenuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuePanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TransferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HeadPanel.setBackground(new java.awt.Color(21, 103, 153));

        HeadingText.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        HeadingText.setForeground(new java.awt.Color(255, 255, 255));
        HeadingText.setText("Home Section");

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
                HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HeadingText)
                                .addGap(503, 503, 503))
        );
        HeadPanelLayout.setVerticalGroup(
                HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeadPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HeadingText)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CenterPanel.setLayout(null);

        HomeSection.setBackground(new java.awt.Color(255, 255, 255));

        NamePlate.setFont(new java.awt.Font("Noto Sans JP", 0, 24)); // NOI18N
        NamePlate.setForeground(new java.awt.Color(31, 132, 255));
        NamePlate.setText("Hello, NameHere!");

        jLabel5.setFont(new java.awt.Font("Noto Sans JP", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Welcome to Digital Bank Management System");

        BalancePanel.setBackground(new java.awt.Color(56, 35, 234));
        BalancePanel.setPreferredSize(new java.awt.Dimension(280, 170));
        BalancePanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Balance");
        BalancePanel.add(jLabel2);
        jLabel2.setBounds(10, 20, 152, 21);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account #");
        BalancePanel.add(jLabel1);
        jLabel1.setBounds(10, 47, 63, 17);

        HomeAcNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HomeAcNumber.setForeground(new java.awt.Color(255, 255, 255));
        HomeAcNumber.setText("123456789012");
        BalancePanel.add(HomeAcNumber);
        HomeAcNumber.setBounds(83, 47, 160, 17);

        BalanceLabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BalanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalanceLabel.setText("Rs 100000");
        BalancePanel.add(BalanceLabel);
        BalanceLabel.setBounds(10, 90, 170, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DBMS Bank");
        BalancePanel.add(jLabel6);
        jLabel6.setBounds(203, 10, 70, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon("image.png")); // NOI18N
        BalancePanel.add(jLabel4);
        jLabel4.setBounds(0, 0, 280, 170);

        CreditCardPanel.setBackground(new java.awt.Color(21, 103, 153));
        CreditCardPanel.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Credit Card Balance");
        CreditCardPanel.add(jLabel16);
        jLabel16.setBounds(10, 20, 172, 21);

        CreditCardNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CreditCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        CreditCardNumber.setText("123");
        CreditCardPanel.add(CreditCardNumber);
        CreditCardNumber.setBounds(20, 50, 180, 17);

        CreditCardBalance.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        CreditCardBalance.setForeground(new java.awt.Color(255, 255, 255));
        CreditCardBalance.setText("Rs 100000");
        CreditCardPanel.add(CreditCardBalance);
        CreditCardBalance.setBounds(10, 90, 170, 50);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(  "icons8-visa-35.png")); // NOI18N
        CreditCardPanel.add(jLabel7);
        jLabel7.setBounds(240, 0, 35, 35);

        jLabel19.setIcon(new javax.swing.ImageIcon("gradient (4).png")); // NOI18N
        CreditCardPanel.add(jLabel19);
        jLabel19.setBounds(0, 0, 280, 170);

        TransactionPanel.setBackground(new java.awt.Color(255, 255, 255));
        TransactionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(205, 205, 205), new java.awt.Color(205, 205, 205)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(16, 156, 202));
        jLabel14.setText("All Last Transaction");

        TransactionTableHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TransactionTableHome.setForeground(new java.awt.Color(0, 0, 255));
        TransactionTableHome.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Account Number", "Amount", "C/D"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TransactionTableHome.setGridColor(new java.awt.Color(220, 220, 220));
        TransactionTableHome.setRowHeight(25);
        TransactionTableHome.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TransactionTableHome);

        javax.swing.GroupLayout TransactionPanelLayout = new javax.swing.GroupLayout(TransactionPanel);
        TransactionPanel.setLayout(TransactionPanelLayout);
        TransactionPanelLayout.setHorizontalGroup(
                TransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransactionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                                        .addGroup(TransactionPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        TransactionPanelLayout.setVerticalGroup(
                TransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransactionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addContainerGap())
        );

        ShopPanel.setBackground(new java.awt.Color(0, 204, 255));
        ShopPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        ShopPanel.setMinimumSize(new java.awt.Dimension(367, 191));
        ShopPanel.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Buy Products From Our Store And Get  ");
        ShopPanel.add(jLabel20);
        jLabel20.setBounds(10, 40, 211, 14);

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Shop With Us");
        ShopPanel.add(jLabel18);
        jLabel18.setBounds(10, 10, 130, 21);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cashback  upto Rs 1000");
        ShopPanel.add(jLabel21);
        jLabel21.setBounds(10, 60, 136, 14);

        jLabel22.setIcon(new javax.swing.ImageIcon("icon8-shopaholic-80.png")); // NOI18N
        ShopPanel.add(jLabel22);
        jLabel22.setBounds(260, 50, 80, 80);

        jLabel23.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DBMS Cart");
        ShopPanel.add(jLabel23);
        jLabel23.setBounds(230, 10, 110, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon("pinkblue1.png")); // NOI18N
        ShopPanel.add(jLabel15);
        jLabel15.setBounds(0, 0, 360, 160);

        javax.swing.GroupLayout HomeSectionLayout = new javax.swing.GroupLayout(HomeSection);
        HomeSection.setLayout(HomeSectionLayout);
        HomeSectionLayout.setHorizontalGroup(
                HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomeSectionLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NamePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CreditCardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BalancePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                .addGroup(HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeSectionLayout.createSequentialGroup()
                                                .addComponent(ShopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(283, 283, 283))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeSectionLayout.createSequentialGroup()
                                                .addComponent(TransactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(204, 204, 204))))
        );
        HomeSectionLayout.setVerticalGroup(
                HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomeSectionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(HomeSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(HomeSectionLayout.createSequentialGroup()
                                                .addComponent(NamePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addGap(44, 44, 44)
                                                .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addComponent(CreditCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(HomeSectionLayout.createSequentialGroup()
                                                .addComponent(TransactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(ShopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(93, Short.MAX_VALUE))
        );


        CenterPanel.add(HomeSection);
        HomeSection.setBounds(0, 0, 1250, 648);

        TransferSection.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(570, 344));
        jPanel6.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("DBMS Pay");
        jPanel6.add(jLabel47);
        jLabel47.setBounds(10, 10, 110, 22);

        jLabel57.setBackground(new java.awt.Color(102, 102, 102));
        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Secure Payment");
        jPanel6.add(jLabel57);
        jLabel57.setBounds(240, 70, 104, 17);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Reciver Account Number");
        jPanel6.add(jLabel66);
        jLabel66.setBounds(130, 130, 150, 15);

        ReciverAccountNumber.setBackground(new java.awt.Color(227, 227, 227));
        ReciverAccountNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ReciverAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReciverAccountNumberActionPerformed(evt);
            }
        });
        jPanel6.add(ReciverAccountNumber);
        ReciverAccountNumber.setBounds(130, 150, 293, 34);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Enter Amount");
        jPanel6.add(jLabel67);
        jLabel67.setBounds(130, 200, 87, 15);

        Amount.setBackground(new java.awt.Color(228, 228, 228));
        Amount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });
        jPanel6.add(Amount);
        Amount.setBounds(130, 220, 293, 34);

        PayNowButton.setBackground(new java.awt.Color(0, 0, 255));
        PayNowButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PayNowButton.setForeground(new java.awt.Color(255, 255, 255));
        PayNowButton.setText("Pay Now");
        PayNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayNowButtonActionPerformed(evt);
            }
        });
        jPanel6.add(PayNowButton);
        PayNowButton.setBounds(200, 280, 160, 34);

        jLabel71.setIcon(new javax.swing.ImageIcon("icons8-security-shield-green-50.png")); // NOI18N
        jPanel6.add(jLabel71);
        jLabel71.setBounds(260, 10, 50, 50);

        jLabel70.setIcon(new javax.swing.ImageIcon("gradient (6).png")); // NOI18N
        jPanel6.add(jLabel70);
        jLabel70.setBounds(0, 0, 570, 344);

        TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Account Number", "Amount", "C/D"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TransactionTable.setRowHeight(25);
        TransactionTable.setSelectionBackground(new java.awt.Color(91, 166, 242));
        TransactionTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TransactionTable);

        javax.swing.GroupLayout TransferSectionLayout = new javax.swing.GroupLayout(TransferSection);
        TransferSection.setLayout(TransferSectionLayout);
        TransferSectionLayout.setHorizontalGroup(
                TransferSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransferSectionLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(114, Short.MAX_VALUE))
        );
        TransferSectionLayout.setVerticalGroup(
                TransferSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransferSectionLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(TransferSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(249, Short.MAX_VALUE))
        );

        CenterPanel.add(TransferSection);
        TransferSection.setBounds(0, 0, 1250, 648);

        CardsSection.setBackground(new java.awt.Color(255, 255, 255));
        CardsSection.setForeground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Credit Card Type  :");

        jLabel49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Card Number        :");

        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("CVV Number         :");

        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("Interest Rate         :");

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Balance                :");

        CCardNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardNumber.setText("1234567897894561");

        CCardType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardType.setText("Platinum");

        CCardCVV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardCVV.setText("123");

        CCardBalance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardBalance.setText("10000");

        CCardRate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardRate.setText("1.2%");

        jLabel58.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(21, 103, 153));
        jLabel58.setText("Credit Card Detail");

        jLabel64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("Card Issued Date  :");

        CCardIssuedDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardIssuedDate.setText("123");

        jLabel65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Card Expiry Date  :");

        CCardExpiryDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CCardExpiryDate.setText("123");

        CreditCard.setBackground(new java.awt.Color(56, 35, 234));
        CreditCard.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Credit Card");
        CreditCard.add(jLabel39);
        jLabel39.setBounds(10, 10, 98, 21);

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon("icons8-chip-card-48 (2).png")); // NOI18N
        CreditCard.add(jLabel40);
        jLabel40.setBounds(10, 50, 50, 30);

        CardHolderName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CardHolderName.setForeground(new java.awt.Color(255, 255, 255));
        CardHolderName.setText("Name");
        CreditCard.add(CardHolderName);
        CardHolderName.setBounds(10, 130, 220, 22);

        CreditCardNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreditCardNo.setForeground(new java.awt.Color(255, 255, 255));
        CreditCardNo.setText("CardNumber");
        CreditCard.add(CreditCardNo);
        CreditCardNo.setBounds(10, 100, 260, 20);

        jLabel43.setIcon(new javax.swing.ImageIcon("icons8-visa-35.png")); // NOI18N
        CreditCard.add(jLabel43);
        jLabel43.setBounds(240, 0, 35, 35);

        jLabel42.setIcon(new javax.swing.ImageIcon("new card.png")); // NOI18N
        CreditCard.add(jLabel42);
        jLabel42.setBounds(0, 0, 280, 170);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel58))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel48)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(CCardType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel50)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(CCardCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel51)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(CCardRate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel49)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(CCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel52)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(CCardBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel65)
                                                                                        .addGap(21, 21, 21)
                                                                                        .addComponent(CCardExpiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel64)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(CCardIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(CreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel58)
                                .addGap(47, 47, 47)
                                .addComponent(CreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel48)
                                        .addComponent(CCardType))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel49)
                                        .addComponent(CCardNumber))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel50)
                                        .addComponent(CCardCVV))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel64)
                                        .addComponent(CCardIssuedDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel65)
                                        .addComponent(CCardExpiryDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CCardBalance)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51)
                                        .addComponent(CCardRate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Credit Card Type  :");

        jLabel60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Card Number        :");

        jLabel61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("CVV Number         :");

        DCardNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DCardNumber.setText("1234567890");

        DCardType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DCardType.setText("Platinum");

        DCardCVV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DCardCVV.setText("123");

        jLabel69.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(21, 103, 153));
        jLabel69.setText("Debit Card Detail");

        jLabel62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Card Issued Date  :");

        DCardIssuedDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DCardIssuedDate.setText("123");

        jLabel63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Card Expiry Date   :");

        DCardExpiryDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DCardExpiryDate.setText("123");

        BalancePanel2.setBackground(new java.awt.Color(56, 35, 234));
        BalancePanel2.setLayout(null);

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Debit Card");
        BalancePanel2.add(jLabel44);
        jLabel44.setBounds(10, 10, 91, 21);

        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon("icons8-chip-card-48.png")); // NOI18N
        BalancePanel2.add(jLabel45);
        jLabel45.setBounds(10, 40, 48, 48);

        DHolderName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DHolderName.setForeground(new java.awt.Color(255, 255, 255));
        DHolderName.setText("Name");
        BalancePanel2.add(DHolderName);
        DHolderName.setBounds(10, 130, 220, 22);

        TotalBalance1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TotalBalance1.setForeground(new java.awt.Color(255, 255, 255));
        TotalBalance1.setIcon(new javax.swing.ImageIcon("icons8-mastercard-logo-48.png")); // NOI18N
        BalancePanel2.add(TotalBalance1);
        TotalBalance1.setBounds(230, 0, 50, 50);

        DebitCardNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DebitCardNo.setForeground(new java.awt.Color(255, 255, 255));
        DebitCardNo.setText("Card Number");
        BalancePanel2.add(DebitCardNo);
        DebitCardNo.setBounds(10, 100, 250, 22);

        jLabel46.setIcon(new javax.swing.ImageIcon("gradient (4).png")); // NOI18N
        BalancePanel2.add(jLabel46);
        jLabel46.setBounds(0, 0, 280, 170);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel69))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(BalancePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addGap(18, 18, 18)
                                                .addComponent(DCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel60)
                                                .addGap(18, 18, 18)
                                                .addComponent(DCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel61)
                                                .addGap(18, 18, 18)
                                                .addComponent(DCardCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel63)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(DCardExpiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel62)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(DCardIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel69)
                                .addGap(44, 44, 44)
                                .addComponent(BalancePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel59)
                                        .addComponent(DCardType))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel60)
                                        .addComponent(DCardNumber))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel61)
                                        .addComponent(DCardCVV))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel62)
                                        .addComponent(DCardIssuedDate))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63)
                                        .addComponent(DCardExpiryDate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Change Debit Card Pin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(21, 103, 153))); // NOI18N

        DNewPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNewPinActionPerformed(evt);
            }
        });

        jLabel53.setBackground(new java.awt.Color(153, 153, 153));
        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Enter New Pin");

        DReEnterPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DReEnterPinActionPerformed(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(153, 153, 153));
        jLabel54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("Re Enter Pin");

        DChangePinBtn.setBackground(new java.awt.Color(21, 103, 153));
        DChangePinBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DChangePinBtn.setForeground(new java.awt.Color(255, 255, 255));
        DChangePinBtn.setText("Change Pin");
        DChangePinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DChangePinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel54)
                                        .addComponent(jLabel53)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(DReEnterPin, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                                .addComponent(DNewPin))
                                        .addComponent(DChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel53)
                                .addGap(5, 5, 5)
                                .addComponent(DNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DReEnterPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)), "Change Credit Card Pin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(21, 103, 153))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        CNewPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNewPinActionPerformed(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(153, 153, 153));
        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Enter New Pin");

        CReEnterPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CReEnterPinActionPerformed(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(153, 153, 153));
        jLabel56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("Re Enter Pin");

        CChangePinBtn.setBackground(new java.awt.Color(21, 103, 153));
        CChangePinBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CChangePinBtn.setForeground(new java.awt.Color(255, 255, 255));
        CChangePinBtn.setText("Change Pin");
        CChangePinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CChangePinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel55)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CReEnterPin, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                                .addComponent(CNewPin))
                                        .addComponent(CChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel55)
                                .addGap(5, 5, 5)
                                .addComponent(CNewPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CReEnterPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CardsSectionLayout = new javax.swing.GroupLayout(CardsSection);
        CardsSection.setLayout(CardsSectionLayout);
        CardsSectionLayout.setHorizontalGroup(
                CardsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CardsSectionLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(CardsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
        );
        CardsSectionLayout.setVerticalGroup(
                CardsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardsSectionLayout.createSequentialGroup()
                                .addGroup(CardsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CardsSectionLayout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48))
        );

        CenterPanel.add(CardsSection);
        CardsSection.setBounds(0, 0, 1162, 654);

        AccountsSection.setBackground(new java.awt.Color(255, 255, 255));

        BalancePanel1.setBackground(new java.awt.Color(56, 35, 234));
        BalancePanel1.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total Balance Available");
        BalancePanel1.add(jLabel30);
        jLabel30.setBounds(10, 10, 201, 21);

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Account #");
        BalancePanel1.add(jLabel38);
        jLabel38.setBounds(10, 47, 63, 17);

        ACNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ACNumber.setForeground(new java.awt.Color(255, 255, 255));
        ACNumber.setText("123456789012");
        BalancePanel1.add(ACNumber);
        ACNumber.setBounds(83, 47, 160, 17);

        TotalBalance.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        TotalBalance.setForeground(new java.awt.Color(255, 255, 255));
        TotalBalance.setText("Rs 100000");
        BalancePanel1.add(TotalBalance);
        TotalBalance.setBounds(10, 90, 190, 50);

        jLabel41.setIcon(new javax.swing.ImageIcon("gradient (4).png")); // NOI18N
        BalancePanel1.add(jLabel41);
        jLabel41.setBounds(0, 0, 280, 170);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 103, 153)));

        jLabel24.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 255));
        jLabel24.setText("Pass Book");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Account Status     :");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Account Type      :");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Account Number  :");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Customer Name   :");

        AccountStatus.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus.setText("Status");

        AccountType.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountType.setForeground(new java.awt.Color(51, 51, 255));
        AccountType.setText("Type");

        AccountNumberInBook.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountNumberInBook.setForeground(new java.awt.Color(51, 51, 255));
        AccountNumberInBook.setText("Account Number");

        CustomerName.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(51, 51, 255));
        CustomerName.setText("name");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Customer Address :");

        Address.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        Address.setForeground(new java.awt.Color(51, 51, 255));
        Address.setText("Address");

        jLabel32.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("DBMS");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Address  :");

        AccountStatus1.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus1.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus1.setText("C-25 Estate Avenue,");

        AccountStatus2.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus2.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus2.setText("SITE, Karachi");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Phone     :");

        AccountStatus3.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus3.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus3.setText("+92(21)38103500 ");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Email       :");

        AccountStatus4.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus4.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus4.setText("digitalbankmanagement@gmail.com");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("ISBN      :");

        AccountStatus5.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        AccountStatus5.setForeground(new java.awt.Color(51, 51, 255));
        AccountStatus5.setText("978-3-16-148410-0");

        jLabel37.setIcon(new javax.swing.ImageIcon("banklogo - Copy.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(344, 344, 344))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel24)
                                                                .addGap(308, 308, 308)
                                                                .addComponent(jLabel37))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel29)
                                                                        .addComponent(jLabel28))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(AccountNumberInBook, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(jLabel31)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel26)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(190, 190, 190)
                                                .addComponent(jLabel32))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel36)
                                                        .addComponent(jLabel35))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(AccountStatus4)
                                                        .addComponent(AccountStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel33))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(AccountStatus3)
                                                        .addComponent(AccountStatus2)
                                                        .addComponent(AccountStatus1))))
                                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel33)
                                                                        .addComponent(AccountStatus1))
                                                                .addGap(30, 30, 30))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(AccountStatus2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel34)
                                                        .addComponent(AccountStatus3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel35)
                                                        .addComponent(AccountStatus4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel36)
                                                        .addComponent(AccountStatus5)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel37))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel25)
                                                        .addComponent(AccountStatus))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel26)
                                                        .addComponent(AccountType))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel28)
                                                        .addComponent(AccountNumberInBook))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel29)
                                                        .addComponent(CustomerName))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel31)
                                                        .addComponent(Address))))
                                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout AccountsSectionLayout = new javax.swing.GroupLayout(AccountsSection);
        AccountsSection.setLayout(AccountsSectionLayout);
        AccountsSectionLayout.setHorizontalGroup(
                AccountsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AccountsSectionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(AccountsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BalancePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(326, Short.MAX_VALUE))
        );
        AccountsSectionLayout.setVerticalGroup(
                AccountsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AccountsSectionLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(BalancePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
        );

        CenterPanel.add(AccountsSection);
        AccountsSection.setBounds(0, 0, 1332, 648);

        ProfileSection.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 0, 102));
        jPanel7.setLayout(null);

        ProfileName.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        ProfileName.setForeground(new java.awt.Color(255, 255, 255));
        ProfileName.setIcon(new javax.swing.ImageIcon("maleicon.png")); // NOI18N
        ProfileName.setText("Your Name Here");
        ProfileName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProfileName.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(ProfileName);
        ProfileName.setBounds(300, 30, 124, 125);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jSeparator1);
        jSeparator1.setBounds(187, 173, 371, 10);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Account Number :");
        jPanel7.add(jLabel73);
        jLabel73.setBounds(190, 210, 121, 20);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Username            :");
        jPanel7.add(jLabel74);
        jLabel74.setBounds(190, 250, 121, 20);

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Account Type      :");
        jPanel7.add(jLabel77);
        jLabel77.setBounds(190, 290, 121, 20);

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Email                   :");
        jPanel7.add(jLabel78);
        jLabel78.setBounds(190, 330, 119, 20);

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Address               :");
        jPanel7.add(jLabel79);
        jLabel79.setBounds(190, 370, 120, 20);

        ProfileAccountNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProfileAccountNo.setForeground(new java.awt.Color(255, 255, 255));
        ProfileAccountNo.setText("jLabel80");
        jPanel7.add(ProfileAccountNo);
        ProfileAccountNo.setBounds(330, 210, 200, 17);

        ProfileUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProfileUsername.setForeground(new java.awt.Color(255, 255, 255));
        ProfileUsername.setText("jLabel81");
        jPanel7.add(ProfileUsername);
        ProfileUsername.setBounds(330, 250, 280, 17);

        ProfileAccountType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProfileAccountType.setForeground(new java.awt.Color(255, 255, 255));
        ProfileAccountType.setText("jLabel84");
        jPanel7.add(ProfileAccountType);
        ProfileAccountType.setBounds(330, 290, 260, 17);

        ProfileEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProfileEmail.setForeground(new java.awt.Color(255, 255, 255));
        ProfileEmail.setText("jLabel85");
        jPanel7.add(ProfileEmail);
        ProfileEmail.setBounds(330, 330, 290, 17);

        ProfileAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProfileAddress.setForeground(new java.awt.Color(255, 255, 255));
        ProfileAddress.setText("jLabel86");
        jPanel7.add(ProfileAddress);
        ProfileAddress.setBounds(330, 370, 340, 17);

        jLabel87.setIcon(new javax.swing.ImageIcon("gradient (7).png")); // NOI18N
        jPanel7.add(jLabel87);
        jLabel87.setBounds(0, 0, 736, 620);

        javax.swing.GroupLayout ProfileSectionLayout = new javax.swing.GroupLayout(ProfileSection);
        ProfileSection.setLayout(ProfileSectionLayout);
        ProfileSectionLayout.setHorizontalGroup(
                ProfileSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileSectionLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(225, Short.MAX_VALUE))
        );
        ProfileSectionLayout.setVerticalGroup(
                ProfileSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileSectionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                                .addContainerGap())
        );

        CenterPanel.add(ProfileSection);
        ProfileSection.setBounds(0, 0, 1162, 648);

        javax.swing.GroupLayout MainBackPanelLayout = new javax.swing.GroupLayout(MainBackPanel);
        MainBackPanel.setLayout(MainBackPanelLayout);
        MainBackPanelLayout.setHorizontalGroup(
                MainBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainBackPanelLayout.createSequentialGroup()
                                .addComponent(MenuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(MainBackPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        MainBackPanelLayout.setVerticalGroup(
                MainBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainBackPanelLayout.createSequentialGroup()
                                .addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MainBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>



//    -------------------+++++++++++++++++++++++=========== Color Change Event,Mehod=============+++++++++++++++++------

    private void HomePanelPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==HomePanel){
            HomePanel.setBackground( new Color(21,79,128));
        }

    }

    private void HomePanelPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==HomePanel){
            HomePanel.setBackground( new Color(21, 103, 153));
        }

    }

    private void TransferPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==TransferPanel){
            TransferPanel.setBackground( new Color(21,79,128));
        }
    }

    private void TransferPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==TransferPanel){
            TransferPanel.setBackground( new Color(21,103,153));
        }
    }

    private void AccountPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==AccountPanel){
            AccountPanel.setBackground( new Color(21,79,128));
        }
    }

    private void AccountPanelPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==AccountPanel){
            AccountPanel.setBackground( new Color(21,103,153));
        }
    }

    private void CardsPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==CardsPanel){
            CardsPanel.setBackground( new Color(21,79,128));
        }
    }

    private void CardsPanelPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==CardsPanel){
            CardsPanel.setBackground( new Color(21,103,153));
        }
    }

    private void ProfilePanelPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==ProfilePanel){
            ProfilePanel.setBackground( new Color(21,79,128));
        }
    }

    private void ProfilePanelPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==ProfilePanel){
            ProfilePanel.setBackground( new Color(21,103,153));
        }
    }

//=============================================== Logout Evnt Method ========================================================

    private void LogOutPanelMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new Login().setVisible(true);
        dispose();
    }

    private void LogOutPanelPanelMouseEntered(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==LogOutPanel){
            LogOutPanel.setBackground( new Color(21,79,128));
        }
    }

    private void LogOutPanelPanelMouseExited(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==LogOutPanel){
            LogOutPanel.setBackground( new Color(21,103,153));
        }
    }

//    ================================================= Home Button Mouse Click Event ====================================

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==HomePanel){

            HomeSection.setVisible(true);
            TransferSection.setVisible(false);
            AccountsSection.setVisible(false);
            CardsSection.setVisible(false);
            ProfileSection.setVisible(false);
            HeadingText.setText("Home Section");
            HomeSectionMethod();
            HomeArrow.setVisible(true);
            TransferArrow.setVisible(false);
            AccountsArrow.setVisible(false);
            CardsArrow.setVisible(false);
            ProfileArrow.setVisible(false);
            transactionHistory();
        }
    }

    //    ================================================= Transfer/Transaction Button Mouse Click Event ====================================

    private void TransferPanelMouseClicked(java.awt.event.MouseEvent evt) {
        if(TransferPanel==evt.getSource()){

            HomeSection.setVisible(false);
            TransferSection.setVisible(true);
            AccountsSection.setVisible(false);
            CardsSection.setVisible(false);
            ProfileSection.setVisible(false);
            HeadingText.setText("Transfer Money");

            HomeArrow.setVisible(false);
            TransferArrow.setVisible(true);
            AccountsArrow.setVisible(false);
            CardsArrow.setVisible(false);
            ProfileArrow.setVisible(false);
            transactionHistory();
        }
    }

    //    ================================================= Account Button Mouse Click Event ====================================

    private void AccountPanelMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==AccountPanel){

            HomeSection.setVisible(false);
            TransferSection.setVisible(false);
            AccountsSection.setVisible(true);
            CardsSection.setVisible(false);
            ProfileSection.setVisible(false);
            HeadingText.setText("My Account");

            HomeArrow.setVisible(false);
            TransferArrow.setVisible(false);
            AccountsArrow.setVisible(true);
            CardsArrow.setVisible(false);
            ProfileArrow.setVisible(false);

            AccountsSectionMethod();
        }
    }

    //    ================================================= Cards Button Mouse Click Event ====================================

    private void CardsPanelMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==CardsPanel){

            HomeSection.setVisible(false);
            TransferSection.setVisible(false);
            AccountsSection.setVisible(false);
            CardsSection.setVisible(true);
            ProfileSection.setVisible(false);
            HeadingText.setText("Cards Detail");

            HomeArrow.setVisible(false);
            TransferArrow.setVisible(false);
            AccountsArrow.setVisible(false);
            CardsArrow.setVisible(true);
            ProfileArrow.setVisible(false);

            CardsSectionMethod();
        }
    }

//    ================================================= Profile Button Mouse Click Event ====================================

    private void ProfilePanelMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getSource()==ProfilePanel){

            HomeSection.setVisible(false);
            TransferSection.setVisible(false);
            AccountsSection.setVisible(false);
            CardsSection.setVisible(false);
            ProfileSection.setVisible(true);
            HeadingText.setText("My Profile");

            HomeArrow.setVisible(false);
            TransferArrow.setVisible(false);
            AccountsArrow.setVisible(false);
            CardsArrow.setVisible(false);
            ProfileArrow.setVisible(true);
            ProfileSection();
        }
    }

    private void DNewPinActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DReEnterPinActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//    ============================================== Debit Card Pin Change Event =======================================


    private void DChangePinBtnActionPerformed(java.awt.event.ActionEvent evt) {

        boolean DPL = DPasswordLenght();
        boolean DPC = DPasswordcheck();
        if(DPL && DPC)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
                String query = "update signup set PIN=? where AccountNumber='" + AccountNumber + "' ";
                PreparedStatement pst = connect.prepareStatement(query);
                pst.setString(1, DNewPin.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Pin Change Successfully !");
                DNewPin.setText("");
                DReEnterPin.setText("");
                DReEnterPin.setBackground(Color.WHITE);
                DNewPin.setBackground(Color.WHITE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    private void CNewPinActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CReEnterPinActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//============================================== Credit Card Pin Change Event =======================================

    private void CChangePinBtnActionPerformed(java.awt.event.ActionEvent evt) {


        boolean CPL = CPasswordLenght();
        boolean CPC =CPasswordcheck();
        if(CPL && CPC)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
                String query = "update cards set CreditCardCVV=? where AccountNo='" + AccountNumber + "' ";
                PreparedStatement pst = connect.prepareStatement(query);
                pst.setString(1, CNewPin.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Pin Change Successfully !");
                CNewPin.setText("");
                CReEnterPin.setText("");
                CReEnterPin.setBackground(Color.WHITE);
                CNewPin.setBackground(Color.WHITE);
                connect.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    private void ReciverAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//    =========================================== Pay Now Button Event in Transfer Section ===================================

    private void PayNowButtonActionPerformed(java.awt.event.ActionEvent evt) {

        boolean Checker;

        String userEnterAC= ReciverAccountNumber.getText();
        EnteredAmount = Amount.getText();
        if(ReciverAccountNumber.getText().length()==16 && ReciverAccountNumber.getText().matches("^[0-9]*$")){
            Checker=true;
            ReciverAccountNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            ReciverAccountNumber.setBackground(new Color(246, 53, 40));
            JOptionPane.showMessageDialog(null,"Account Number Is InValid and not found bank customer");
        }
        if(Amount.getText().length()<=7 && Amount.getText().matches("^[0-9]*$")){
            Checker=true;
            Amount.setBackground(Color.GREEN);
        }
        if(!"".equals(Amount.getText()) && !"0".equals(Amount.getText())){
            Checker=true;
            Amount.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            Amount.setBackground(new Color(246, 53, 40));
            JOptionPane.showMessageDialog(null,"Please Enter Valid Amount or between 1 to 1000000");
        }
        if(Checker){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
                String query = "Select * from logindetails where AccountNo=? ";
                PreparedStatement pst = connect.prepareStatement(query);
                pst.setString(1, ReciverAccountNumber.getText());
                ResultSet rs = pst.executeQuery();
                if( (rs.next()) && (!userEnterAC.equals(AccountNumber)) ) {
                    ReciverAccountNumber.setBackground(Color.GREEN);
                    ReciverAccountNo = ReciverAccountNumber.getText();
                    PayMoney();
                    transactionHistory();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Account Number");
                    ReciverAccountNumber.setBackground(new Color(246, 53, 40));
                }
                connect.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

//    --------------------------------------------------------- TRANSACTION SECTION Pay Money Function ----------------------------------------

    public void PayMoney(){



        Box box = Box.createHorizontalBox();

        JLabel jl = new JLabel("Password: ");
        box.add(jl);

        JPasswordField jpf = new JPasswordField(16);
        box.add(jpf);

        int button = JOptionPane.showConfirmDialog(null, box, "Enter your password", JOptionPane.OK_CANCEL_OPTION);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
//                  Getting sender password from table
            String query = "SELECT logindetails.*, signup.* FROM logindetails INNER JOIN signup ON logindetails.AccountNo=signup.AccountNumber WHERE logindetails.AccountNo='"+AccountNumber+"' ";
            String query2 = "Select logindetails.*, signup.* FROM logindetails INNER JOIN signup ON logindetails.AccountNo=signup.AccountNumber WHERE logindetails.AccountNo='" +ReciverAccountNo+ "' ";
            PreparedStatement pst = connect.prepareStatement(query);
            PreparedStatement pst2 = connect.prepareStatement(query2);
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            if(rs.next()){
                pass = rs.getString("password");

                String SenderBalance;
                String ReciverBalance;

                String SenderEmail = rs.getString("Email");

                if (button == JOptionPane.OK_OPTION) {
                    char[] input = jpf.getPassword();
                    String enteredPass = String.valueOf(input);
                    if(enteredPass.equals(pass)) {

                        SenderBalance = rs.getString("Balance");

                        if(rs2.next()){

                            ReciverBalance= rs2.getString("Balance");

                            String ReciverEmail = rs2.getString("Email");

                            float senderAmount,enteredAmount,ReciverAmount;
                            senderAmount = Float.parseFloat(SenderBalance);
                            enteredAmount = Float.parseFloat(EnteredAmount);
                            ReciverAmount = Float.parseFloat(ReciverBalance);

                            if( senderAmount >= enteredAmount){
                                Float SenderBalanceSubstraction = senderAmount-enteredAmount;
                                Float ReciverAmountAddition = enteredAmount+ReciverAmount;
                                System.out.println(ReciverAmountAddition);
                                String SenderBalanceUpdate = Float.toString(SenderBalanceSubstraction);
                                String ReciverAmountUpdate = Float.toString(ReciverAmountAddition);

                                try {
                                    String query3 = " update signup set Balance='"+SenderBalanceUpdate+"' where AccountNumber='" + AccountNumber + "' ";
                                    String query4 = " update signup set Balance='"+ReciverAmountUpdate+"' where AccountNumber='" + ReciverAccountNo + "' ";

                                    PreparedStatement pst3 = connect.prepareStatement(query3);
                                    PreparedStatement pst4 = connect.prepareStatement(query4);
                                    pst3.execute();
                                    pst4.execute();


//

//                                      Transaction History Quireis Start From Here

                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                                    String Date = sdf.format(new Date(122, Calendar.JUNE,23));
                                    String Debit = "Debited";
                                    String Credit = "Credited";

                                    String query5 = "Insert into TransactionHistory(Date, AccountNumber, Amount, CreditDebit) Values ('"+Date+"', '"+AccountNumber+"', '"+enteredAmount+"', '"+Debit+"')";
                                    String query6 = "Insert into TransactionHistory(Date, AccountNumber, Amount, CreditDebit) Values ('"+Date+"', '"+ReciverAccountNo+"', '"+enteredAmount+"', '"+Credit+"')";
                                    PreparedStatement pst5 = connect.prepareStatement(query5);
                                    PreparedStatement pst6 = connect.prepareStatement(query6);
                                    pst5.execute();
                                    pst6.execute();

//                                        Sender Side Email
                                    try {
                                        Mail.send(SenderEmail,"Amount Debited From Account","<h1>Amount Debited From Your Account</h1> <p>Rs "+enteredAmount+" Debited From Your Account. If you don't perform this please call on 123</p>");

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        JOptionPane.showMessageDialog(null, e);

                                    }

//                                        Sender Side Email

                                    try {
                                        Mail.send(ReciverEmail," A/C '"+ReciverAccountNo+"' Amount Credited On Your Account ","<h1>New Amount Credited On Your Account </h1> <p>Rs "+enteredAmount+" Credited on Your Account. Your Total Balance is "+ ReciverAmountUpdate+"</p>");

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        JOptionPane.showMessageDialog(null, e);

                                    }
                                    JOptionPane.showMessageDialog(null,"Transaction Successfully !");
                                    ReciverAccountNumber.setText("");
                                    ReciverAccountNumber.setBackground(Color.WHITE);
                                    Amount.setText("");
                                    Amount.setBackground(Color.WHITE);

                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null,e);
                                }

                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Insufficient balance in your account please check");
                                Amount.setText("");
                            }
                        }

                    }
                    else{

                        JOptionPane.showMessageDialog(null, "Invalid Password");
                    }
                }
            }

            connect.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }



    }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Transaction History Method +++++++++++++++++++++++++++++++++++
    public void transactionHistory(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            String query = "Select * from TransactionHistory where AccountNumber='"+AccountNumber+"' ";
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel)TransactionTable.getModel();
            DefaultTableModel tableModelHome = (DefaultTableModel)TransactionTableHome.getModel();
            tableModel.setRowCount(0);
            tableModelHome.setRowCount(0);
            while(rs.next()){

                String SenderDate = rs.getString("Date");
                String SenderAc = rs.getString("AccountNumber");
                String Senderamount = rs.getString("Amount");
                String SenderDebit = rs.getString("CreditDebit");

                String SenderTableData[] ={SenderDate, SenderAc, Senderamount, SenderDebit};

                tableModel = (DefaultTableModel)TransactionTable.getModel();
                tableModelHome = (DefaultTableModel)TransactionTableHome.getModel();
                tableModel.addRow(SenderTableData);
                tableModelHome.addRow(SenderTableData);
            }
            connect.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    //    ++++++++++++++++++++++++++++++++++++++++++++++++ Navigator Arrow Method ++++++++++++++++++++++++++++++++++++++++++++++++
    public void arrowMethod(){

        HomeArrow.setVisible(true);
        TransferArrow.setVisible(false);
        AccountsArrow.setVisible(false);
        CardsArrow.setVisible(false);
        ProfileArrow.setVisible(false);
    }

//    ------------------------------------------------------ HOME SECTION --------------------------------------------------

    public void HomeSectionMethod(){
        HomeSection.setVisible(true);
        TransferSection.setVisible(false);
        AccountsSection.setVisible(false);
        CardsSection.setVisible(false);
        ProfileSection.setVisible(false);
        HeadingText.setText("Home Section");
        HomeArrow.setVisible(true);
        TransferArrow.setVisible(false);
        AccountsArrow.setVisible(false);
        CardsArrow.setVisible(false);
        ProfileArrow.setVisible(false);
        transactionHistory();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            String query = "SELECT signup.AccountNumber, cards.CreditCardNumber, cards.CreditCardBalance, signup.Balance, signup.FirstName FROM cards INNER JOIN signup ON cards.AccountNo=signup.AccountNumber WHERE signup.AccountNumber= '"+AccountNumber+"' ";
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){

                String name,balance,CreditBalance,CreditNumber;
                String ReplaceCreditNo;
                name=rs.getString("FirstName");
                NamePlate.setText("Hello, "+name+" !");

                HomeAcNumber.setText(rs.getString("AccountNumber"));

                balance = rs.getString("Balance");
                BalanceLabel.setText("Rs "+balance);

                CreditNumber = rs.getString("CreditCardNumber");
                CreditCardNumber.setText(CreditNumber);

                CreditBalance = rs.getString("CreditCardBalance");
                CreditCardBalance.setText("Rs "+CreditBalance);

            }

            connect.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

//    --------------------------------------------------------- Account Section --------------------------------------------

    public void AccountsSectionMethod(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            String query = "SELECT * from signup where AccountNumber= '"+AccountNumber+"' ";
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                AccountStatus.setText( rs.getString("Account_Status") );
                AccountType.setText( rs.getString("Account_Type") );
                AccountNumberInBook.setText( rs.getString("AccountNumber") );
                CustomerName.setText( (rs.getString("FirstName"))+" "+(rs.getString("LastName")) );
                Address.setText( rs.getString("Address") );
                TotalBalance.setText( "Rs "+rs.getString("Balance") );
                ACNumber.setText( rs.getString("AccountNumber") );

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //-------------------------------------------------- CARDS SECTION ----------------------------------------------------------
    public void CardsSectionMethod(){


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            String query = "SELECT cards.*, signup.* FROM cards INNER JOIN signup ON cards.AccountNo=signup.AccountNumber WHERE cards.AccountNo= '"+AccountNumber+"'  ";
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                CreditCardNo.setText(rs.getString("CreditCardNumber"));
                CardHolderName.setText(rs.getString("FirstName")+" "+rs.getString("LastName"));
                CCardType.setText(rs.getString("CreditCardType"));
                CCardNumber.setText(rs.getString("CreditCardNumber"));
                CCardIssuedDate.setText(rs.getString("CreditCardIssued"));
                CCardExpiryDate.setText(rs.getString("CreditCardExpiry"));
                CCardBalance.setText("Rs "+ rs.getString("CreditCardBalance"));
                CCardCVV.setText(rs.getString("CreditCardCVV"));
                CCardRate.setText(rs.getString("CreditCardInterestRate"));

                DebitCardNo.setText(rs.getString("DebitCardNo"));
                DHolderName.setText(rs.getString("FirstName")+" "+rs.getNString("LastName"));
                DCardType.setText(rs.getString("DebitCardType"));
                DCardNumber.setText(rs.getString("DebitCardNo"));
                DCardIssuedDate.setText(rs.getString("DebitIssuedDate"));
                DCardExpiryDate.setText(rs.getString("DebitCardExpiry"));
                DCardCVV.setText(rs.getString("DebitCardCVV"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }

    //++++++++++++++++++++++++++++++++++++ Debit Card Password Lenght and Character Check Mehnod ++++++++++++++++++++++++++++++++
    public boolean DPasswordLenght(){
        String password = DNewPin.getText();
        if( password.length() == 4 && password.matches("^[0-9]*$")){
            DNewPin.setBackground(Color.GREEN);
            return true;
        }
        else{

            JOptionPane.showMessageDialog(null,"Please Enter Valid PIN of 4 Characters and Only NUMBER ");
            DNewPin.setBackground(new Color(246, 53, 40));
            return false;
        }

    }

    //    Second Mehod To Check Password And Condition For Debit Card Pin Change
    public boolean DPasswordcheck(){
        String password = DNewPin.getText();
        String repass = DReEnterPin.getText();

        if(password.equals(repass) && !" ".equals(repass)){

            DReEnterPin.setBackground(Color.GREEN);
            return true;
        }
        else if("".equals(repass)){

            JOptionPane.showMessageDialog(null,"Re Enter PIN");
            DReEnterPin.setBackground(new Color(246, 53, 40));
            return false;
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Same PIN");
            DReEnterPin.setBackground(new Color(246, 53, 40));
            return false;
        }

    }

    //++++++++++++++++++++++++++++++++++++ Credit Card Password Lenght and Character Check Mehnod ++++++++++++++++++++++++++++++++
    public boolean CPasswordLenght(){
        String password = CNewPin.getText();
        if( password.length() == 4 && password.matches("^[0-9]*$")){
            CNewPin.setBackground(Color.GREEN);
            return true;
        }
        else{

            JOptionPane.showMessageDialog(null,"Please Enter Valid PIN of 4 Characters");
            CNewPin.setBackground(new Color(246, 53, 40));
            return false;
        }

    }

    //     Second Mehod To Check Password And Condition For Credit Card Pin Change
    public boolean CPasswordcheck(){
        String password = CNewPin.getText();
        String repass = CReEnterPin.getText();

        if(password.equals(repass) && !" ".equals(repass)){

            CReEnterPin.setBackground(Color.GREEN);
            return true;
        }
        else if("".equals(repass)){

            JOptionPane.showMessageDialog(null,"Re Enter PIN");
            CReEnterPin.setBackground(new Color(246, 53, 40));
            return false;
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Same PIN");
            CReEnterPin.setBackground(new Color(246, 53, 40));
            return false;
        }

    }

//---------------------------------------------------------- PROFILE SECTION -----------------------------------------------

    public void ProfileSection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            String query = "SELECT logindetails.*, signup.* FROM logindetails INNER JOIN signup ON logindetails.AccountNo=signup.AccountNumber WHERE logindetails.AccountNo= '"+AccountNumber+"' ";
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                ProfileName.setText(rs.getNString("FirstName")+" "+rs.getNString("LastName"));
                ProfileAccountNo.setText(rs.getNString("AccountNo"));
                ProfileUsername.setText(rs.getNString("Username"));
                ProfileAccountType.setText(rs.getNString("Account_Type"));
                ProfileEmail.setText(rs.getNString("Email"));
                ProfileAddress.setText(rs.getNString("Address"));

            }
            connect.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

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
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel ACNumber;
    private javax.swing.JLabel AccountNumberInBook;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JLabel AccountStatus;
    private javax.swing.JLabel AccountStatus1;
    private javax.swing.JLabel AccountStatus2;
    private javax.swing.JLabel AccountStatus3;
    private javax.swing.JLabel AccountStatus4;
    private javax.swing.JLabel AccountStatus5;
    private javax.swing.JLabel AccountType;
    private javax.swing.JLabel AccountsArrow;
    private javax.swing.JPanel AccountsSection;
    private javax.swing.JLabel Address;
    private javax.swing.JTextField Amount;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JPanel BalancePanel;
    private javax.swing.JPanel BalancePanel1;
    private javax.swing.JPanel BalancePanel2;
    private javax.swing.JLabel CCardBalance;
    private javax.swing.JLabel CCardCVV;
    private javax.swing.JLabel CCardExpiryDate;
    private javax.swing.JLabel CCardIssuedDate;
    private javax.swing.JLabel CCardNumber;
    private javax.swing.JLabel CCardRate;
    private javax.swing.JLabel CCardType;
    private javax.swing.JButton CChangePinBtn;
    private javax.swing.JTextField CNewPin;
    private javax.swing.JTextField CReEnterPin;
    private javax.swing.JLabel CardHolderName;
    private javax.swing.JLabel CardsArrow;
    private javax.swing.JPanel CardsPanel;
    private javax.swing.JPanel CardsSection;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel CreditCard;
    private javax.swing.JLabel CreditCardBalance;
    private javax.swing.JLabel CreditCardNo;
    private javax.swing.JLabel CreditCardNumber;
    private javax.swing.JPanel CreditCardPanel;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JLabel DCardCVV;
    private javax.swing.JLabel DCardExpiryDate;
    private javax.swing.JLabel DCardIssuedDate;
    private javax.swing.JLabel DCardNumber;
    private javax.swing.JLabel DCardType;
    private javax.swing.JButton DChangePinBtn;
    private javax.swing.JLabel DHolderName;
    private javax.swing.JTextField DNewPin;
    private javax.swing.JTextField DReEnterPin;
    private javax.swing.JLabel DebitCardNo;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel HeadingText;
    private javax.swing.JLabel HomeAcNumber;
    private javax.swing.JLabel HomeArrow;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel HomeSection;
    private javax.swing.JPanel LogOutPanel;
    private javax.swing.JPanel MainBackPanel;
    private javax.swing.JPanel MenuePanel;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JButton PayNowButton;
    private javax.swing.JLabel ProfileAccountNo;
    private javax.swing.JLabel ProfileAccountType;
    private javax.swing.JLabel ProfileAddress;
    private javax.swing.JLabel ProfileArrow;
    private javax.swing.JLabel ProfileEmail;
    private javax.swing.JLabel ProfileName;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JPanel ProfileSection;
    private javax.swing.JLabel ProfileUsername;
    private javax.swing.JTextField ReciverAccountNumber;
    private javax.swing.JPanel ShopPanel;
    private javax.swing.JLabel TotalBalance;
    private javax.swing.JLabel TotalBalance1;
    private javax.swing.JPanel TransactionPanel;
    private javax.swing.JTable TransactionTable;
    private javax.swing.JTable TransactionTableHome;
    private javax.swing.JLabel TransferArrow;
    private javax.swing.JPanel TransferPanel;
    private javax.swing.JPanel TransferSection;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration
}
