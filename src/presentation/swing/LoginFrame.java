package presentation.swing;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
     private JLabel banner;
    private JTextField txtUsername;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnGoToSignUp;

    private JButton login;

    public LoginFrame() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("LOGIN");
        jFrame.setSize(660, 380);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);



        JPanel jPanel1 = new JPanel(new FlowLayout(1));
        banner = new JLabel("LOGIN");
        banner.setFont(new Font("Arial",Font.BOLD, 28));
        banner.setForeground(Color.red);
        jPanel1.add(banner);

        JPanel panel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("C:/Users/User/Music/FinalProject/Captura de ecrã 2026-11-13 203435.png");
        Image img = imageIcon.getImage().getScaledInstance(300, 340, Image.SCALE_SMOOTH);
        JLabel jLabel = new JLabel(new ImageIcon(img));
        panel.add(jLabel, BorderLayout.CENTER);

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel.add(new JLabel("nao tem conta ?"));
        btnGoToSignUp = new JButton("Sign Up");
        btnGoToSignUp.setBackground(Color.red);
        jPanel.add(btnGoToSignUp);

        JPanel principal = new JPanel(new GridLayout(7, 1));
        principal.add(jPanel1);
        principal.add(new JLabel("username"));
        txtUsername = new JTextField();
        principal.add(txtUsername);
        principal.add(new JLabel("senha"));
        txtSenha = new JPasswordField(2);
        principal.add(txtSenha);
        JPanel sub= new JPanel(new FlowLayout(FlowLayout.LEFT));
        login= new JButton("Entrar");
        login.setPreferredSize(new Dimension(76,40));
        login.setBackground(Color.GREEN.brighter());
        sub.add(login);
        principal.add(sub);
        principal.add(jPanel);

        JPanel principal1 = new JPanel(new BorderLayout());
        principal1.add(principal, BorderLayout.CENTER);
        principal1.add(panel, BorderLayout.WEST);

        jFrame.setVisible(true);

        jFrame.add(principal1);

    }

    static void main() {
        new LoginFrame();
    }
}