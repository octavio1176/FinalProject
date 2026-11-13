package presentation.swing;
import domain.utilizador.UtilizadorRepository;
import infrastruture.database.UtilizadorDb;
import usecases.utilizador.UtilizadorUseCases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUp extends JFrame {

    private  JLabel userName;
    private JTextField username;
    private  JLabel senha;
    private JTextField senh;
    private  JLabel email;
    private JTextField emai;
    private JButton signUp;
    private JLabel ihaveAccout;
    private JButton login;
    private JLabel signUpBanner;
    private ImageIcon imageIcon;
    private JLabel jLabel;
   private UtilizadorRepository utilizadorRepository;




  public SignUp() {

      JFrame jFrame = new JFrame();
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jFrame.setLocationRelativeTo(null);
      jFrame.setSize(660, 380);
      jFrame.setTitle("SIGN UP");

      JPanel jPanel = new JPanel(new GridLayout(9, 1));
      JPanel jPanel1 = new JPanel();



      ImageIcon imageIcon =new ImageIcon("C:/Users/User/Music/FinalProject/Captura de ecrã 2026-11-13 205016.png");
      Image img = imageIcon.getImage().getScaledInstance(300, 340, Image.SCALE_SMOOTH);
      JLabel jLabel = new JLabel(new ImageIcon(img));
      jPanel1.add(jLabel, BorderLayout.CENTER);

      JPanel jPanelBanner = new JPanel(new FlowLayout(FlowLayout.CENTER));
       signUpBanner = new JLabel("SIGN UP");
       signUpBanner.setFont(new Font("Arial", Font.BOLD, 30));
       signUpBanner.setForeground(Color.BLUE);
       jPanelBanner.add(signUpBanner);

       userName= new JLabel("username");
       username = new JTextField();

       senha= new JLabel("Senha");
       senh = new JPasswordField();

       email= new JLabel("Email");
       emai = new JTextField();


       JPanel jPanelButao = new JPanel(new FlowLayout(FlowLayout.LEFT));
       signUp = new JButton("SignUp");
       signUp.setBackground(Color.GREEN.darker());
       jPanelButao.add(signUp);



       JPanel subPainel = new JPanel(new FlowLayout(FlowLayout.LEFT));
       ihaveAccout = new JLabel("i've an  acconunt");
       login = new JButton("Login");
       login.setForeground(Color.RED.brighter());
       subPainel.add(ihaveAccout);
       subPainel.add(login);

       jPanel.add(jPanelBanner);
       jPanel.add(userName);
       jPanel.add(username);
       jPanel.add(email);
       jPanel.add(emai);
       jPanel.add(senha);
       jPanel.add(senh);
       jPanel.add(jPanelButao);
       jPanel.add(subPainel);

      JPanel principal = new JPanel(new BorderLayout());

      principal.add(jPanel, BorderLayout.CENTER);

      principal.add(jPanel1, BorderLayout.WEST);
       jFrame.setVisible(true);
       jFrame.add(principal);
       jFrame.setResizable(false);

       signUp.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (e.getSource()==signUp) {
                   String userN = username.getText();
                   String email = emai.getText();
                   String passwor = senh.getText();
                   utilizadorRepository = new UtilizadorDb();
                   UtilizadorUseCases utilizadorUseCases = new UtilizadorUseCases(utilizadorRepository);

                   try {
                      utilizadorUseCases.SignUp(userN, email, passwor);
                       JOptionPane.showMessageDialog(jFrame, "Registado com sucesso");
                   } catch (IllegalArgumentException ex) {
                       JOptionPane.showMessageDialog(jFrame, ex.getMessage());

                       JOptionPane.showMessageDialog(jFrame, "Erro ao aceder a base de dados");
                   }
               }
               }

       });

       login.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new LoginFrame().setVisible(true);
               SignUp.this.dispose();

           }
       });
  }

    static void main() {
        new SignUp();
    }
}
