package presentation.swing;

import domain.utilizador.Utilizador;
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



  public SignUp()
  {
      JFrame jFrame = new JFrame();
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jFrame.setLocationRelativeTo(null);
      jFrame.setSize(660, 380);
      jFrame.setTitle("SIGN UP");

      JPanel jPanel = new JPanel(new GridLayout(9, 1));
     JPanel jPanel1 = new JPanel();

      ImageIcon imageIcon = new ImageIcon("C:/Users/User/Music/FinalProject/IMAGE123456.jpg");
      Image img = imageIcon.getImage().getScaledInstance(200, 150, Image.SCALE_AREA_AVERAGING);
      JLabel jLabel = new JLabel(new ImageIcon(img));
      jPanel1.add(jLabel);

      JPanel jPanelBanner = new JPanel(new FlowLayout(FlowLayout.CENTER));
       signUpBanner = new JLabel("SIGN UP");
       signUpBanner.setFont(new Font("Arial", Font.BOLD, 30));
       signUpBanner.setForeground(Color.BLUE);
       jPanelBanner.add(signUpBanner);

       userName= new JLabel("username");
       username = new JTextField();

       senha= new JLabel("Senha");
       senh = new JTextField();

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
      // jFrame.setIconImage(imageIcon.getImage());
       jFrame.setResizable(false);



       signUp.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (e.getSource()==signUp) {
                   String userN = username.getText();
                   String email = emai.getText();
                   String passwor = senh.getText();
                   try {

                       if (userN.isBlank()) {
                           JOptionPane.showMessageDialog(jFrame, "o nome no pode estar vazio");
                          throw  new IllegalArgumentException();

                       }
                       if (email.isBlank()){
                           JOptionPane.showMessageDialog(jFrame, "o email no pode estar vazio");
                           throw new IllegalArgumentException();
                       }
                       if (passwor.isBlank()){
                           JOptionPane.showMessageDialog(jFrame, "a senha  no pode estar  vazia");
                           throw new IllegalArgumentException();
                       }
                   } catch (IllegalArgumentException k) {
                       JOptionPane.showMessageDialog(jFrame, "");
                   }


                   Utilizador utilizador = new Utilizador(userN, passwor, email);
                   UtilizadorUseCases utilizadorUseCases = new UtilizadorUseCases();
                   utilizadorUseCases.SignUp(utilizador.getUsername(), utilizador.getSenha(), utilizador.getEmail());
                   JOptionPane.showMessageDialog(jFrame, "logado com sucesso");


               }
           }
       });


  }

    static void main() {
        new SignUp();
    }
}
