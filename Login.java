package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    Login(){
         super("Bank Information System");

         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
         Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(350,10,100,100);
         add(image);


        label1=new JLabel("WELCOME TO BANK");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Arial",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("CARD NUMBER :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        label3=new JLabel("PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        textField=new JTextField(15);
        textField.setBounds(395,190,230,30);
        textField.setFont(new Font("Arial",Font.BOLD,14));
        add(textField);

        passwordField=new JPasswordField(15);
        passwordField.setBounds(395,250,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);

        button1=new JButton("Sign in");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.black);
        button1.setBackground(Color.yellow);
        button1.setBounds(220,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.black);
        button2.setBackground(Color.yellow);
        button2.setBounds(400,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("Register");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.black);
        button3.setBackground(Color.yellow);
        button3.setBounds(250,350,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon i12=new ImageIcon(ClassLoader.getSystemResource("icons/img2.jpg"));
        Image i22=i12.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i32=new ImageIcon(i22);
        JLabel image2=new JLabel(i32);
        image2.setBounds(0,0,850,480);
        add(image2);


         setLayout(null);
         setSize(850,480);
         setLocation(450,200);
         setResizable(false);
         setVisible(true);
    }
    public static void main(String[] args) {
          new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try {
          if (e.getSource()==button1){
              Con c=new Con();
              String cardno=textField.getText();
              String pin=passwordField.getText();
              String q="select * from login where card_no='"+cardno+"'and pin='"+pin+"'";
              ResultSet resultSet= c.statement.executeQuery(q);
              if (resultSet.next()){
                  setVisible(false);
                  new Transaction(pin);
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN Number ");
              }


          } else if (e.getSource()==button2) {
              textField.setText("");
              passwordField.setText("");
          } else if (e.getSource()==button3) {
               new Register();
               setVisible(false);
          }
       }catch (Exception E){
           E.printStackTrace();
       }
    }
}