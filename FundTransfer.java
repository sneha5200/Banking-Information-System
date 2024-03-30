package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FundTransfer extends JFrame implements ActionListener {

    String pin;

    JTextField acc1,acc2,amount;

    JButton btn1,btn2;

    FundTransfer(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        JLabel label2=new JLabel("ACCOUNT TO ACCOUNT FUND TRANSFER");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(410,280,400,35);
        label1.add(label2);

        JLabel account1=new JLabel("Account 1 :");
        account1.setBounds(300,340,110,20);
        account1.setFont(new Font("System",Font.BOLD,16));
        account1.setForeground(Color.white);
        label1.add(account1);

        acc1=new JTextField();
        acc1.setBackground(new Color(65,125,128));
        acc1.setForeground(Color.white);
        acc1.setBounds(415,337,350,30);
        acc1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(acc1);


        JLabel account2=new JLabel("Account 2 :");
        account2.setBounds(300,390,110,20);
        account2.setFont(new Font("System",Font.BOLD,16));
        account2.setForeground(Color.white);
        label1.add(account2);

        acc2=new JTextField();
        acc2.setBackground(new Color(65,125,128));
        acc2.setForeground(Color.white);
        acc2.setBounds(415,390,350,30);
        acc2.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(acc2);


        JLabel amt=new JLabel("Amount :");
        amt.setBounds(300,462,110,20);
        amt.setFont(new Font("System",Font.BOLD,16));
        amt.setForeground(Color.white);
        label1.add(amt);

        amount=new JTextField();
        amount.setBackground(new Color(65,125,128));
        amount.setBounds(415,460,200,30);
        amount.setForeground(Color.white);
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(amount);




        btn1=new JButton("Fund Transfer");
        btn1.setBounds(730,462,150,35);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.setFont(new Font("System",Font.BOLD,16));
        label1.add(btn1);
        btn1.addActionListener(this);


        btn2=new JButton("BACK");
        btn2.setBounds(730,508,150,35);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        label1.add(btn2);
        btn2.addActionListener(this);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new FundTransfer("");
    }
    @Override
        public void actionPerformed(ActionEvent e) {
        String acc11=acc1.getText();
        String acc22=acc2.getText();
        String amount12=amount.getText();

            if (e.getSource()==btn1){
                  if (acc1.getText().equals("") || acc2.getText().equals("") || amount.getText().equals("")){
                      JOptionPane.showMessageDialog(null,"Please fill all the fields");
                  }else{
                      JOptionPane.showMessageDialog(null,"This facility is currently not available due to some technical error");
                  }
            }
            if (e.getSource()==btn2){
                setVisible(false);
                new Transaction(pin);
            }
    }
}



