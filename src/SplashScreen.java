import java.awt.*;
import javax.swing.*;
public class SplashScreen extends JFrame {

    public SplashScreen() {
        initComponents();
    }

    private void initComponents() {

        bgPanel = new JPanel();
        logo = new JLabel();
        name = new JLabel();
        caption = new JLabel();
        BarText = new JLabel();
        Percentage = new JLabel();
        ProgressBar = new JProgressBar();
        Background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setIconImage(new ImageIcon("logo.png").getImage());

        bgPanel.setBackground(new Color(204, 204, 255));
        bgPanel.setLayout(null);

        logo.setIcon(new ImageIcon("logo.png"));
        Background.add(logo);
        bgPanel.add(logo);
        logo.setBounds(300, 10, 250, 250);

        name.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 36));
        name.setForeground(new Color(255, 255, 255));
        name.setText("DIGITAL BANK MANAGEMENT SYSTEM");
        bgPanel.add(name);
        name.setBounds(60, 260, 720, 60);

        caption.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        caption.setForeground(new Color(255, 255, 255));
        caption.setText("Copyright © 2020-2022 DBMS");
        bgPanel.add(caption);
        caption.setBounds(340, 320, 170, 20);

        BarText.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        BarText.setForeground(new Color(255, 255, 255));
        BarText.setText("Loading...");
        bgPanel.add(BarText);
        BarText.setBounds(10, 470, 150, 15);

        Percentage.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
        Percentage.setForeground(new Color(255, 255, 255));
        Percentage.setText("0%");
        bgPanel.add(Percentage);
        Percentage.setBounds(800, 470, 40, 15);

        ProgressBar.setBackground(new Color(255, 255, 255));
        bgPanel.add(ProgressBar);
        ProgressBar.setBounds(-10, 490, 860, 15);
        ProgressBar.setForeground(Color.CYAN);

        Background.setIcon(new ImageIcon("background.png"));
        bgPanel.add(Background);
        Background.setBounds(0, 0, 844, 528);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(bgPanel, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(bgPanel, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        SplashScreen LoadingWindow = new SplashScreen();
        LoadingWindow.setVisible(true);
        try{
        for(int i=0; i<=100; i++){
                Thread.sleep(40);
                LoadingWindow.Percentage.setText(i+"%");
                if(i==10){
                    LoadingWindow.BarText.setText("Turning On Modules...");
                }
                if(i==20){
                    LoadingWindow.BarText.setText("Loading Modules...");
                }
                if(i==20){
                    Thread.sleep(1000);
                }
                if(i==50){
                    LoadingWindow.BarText.setText("Connecting to Database...");
                }
                if(i==70){
                    LoadingWindow.BarText.setText("Connection Successful...");
                }
                if(i==90){
                    LoadingWindow.BarText.setText("Launching Application...");
                }
                if(i==95){
                    Thread.sleep(1000);
                }
                if(i==98){
                    LoadingWindow.BarText.setText("All Done!");
                }
                LoadingWindow.ProgressBar.setValue(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // Login login = new Login();
         LoadingWindow.setVisible(false);
        // login.setVisible(true);
        // LoadingWindow.dispose();
    }

    private JLabel Background;
    private JLabel BarText;
    private JLabel Percentage;
    private JProgressBar ProgressBar;
    private JPanel bgPanel;
    private JLabel caption;
    private JLabel logo;
    private JLabel name;
}
