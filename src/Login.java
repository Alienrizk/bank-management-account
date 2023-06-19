import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField cardTextField, pinTextField;
    JPasswordField pinTexField;
    Login(){
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        // SETTING THE TITLE
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswald", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // SETTING THE LABELS
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 200, 400, 40);
        add(pin);


        // SETTING TEXT FIELDS
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 160, 230, 30);
        // cardTextField.setFont(new Font("Arial", 28));
        add(cardTextField);

        pinTextField = new JTextField();
        pinTextField.setBounds(300, 210, 230, 30);
        add(pinTextField);

        // CREATING BUTTONS
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100,  30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener((java.awt.event.ActionListener) this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100,  30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener((java.awt.event.ActionListener) this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230,  30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener((java.awt.event.ActionListener) this);
        add(signup);

        // SETTING BACKGROUND COLOR
        getContentPane().setBackground(Color.WHITE);

        // SETTING FRAME SIZE AND LOCATION
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == login){

        }else if(ae.getSource() == signup){
            
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}