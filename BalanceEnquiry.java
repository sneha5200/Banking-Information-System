package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;

    JLabel label2;

    JButton btn1;
    public BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        label2=new JLabel("Your current balance is Rs.");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(330,320,700,35);
        label1.add(label2);

        JLabel label3=new JLabel();
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(330,360,400,35);
        label1.add(label3);

        btn1=new JButton("Back");
        btn1.setBounds(735,482,150,35);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        label1.add(btn1);
        btn1.addActionListener(this);

        int balance=0;
        try {
            Con c=new Con();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin= '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }catch (Exception E){
            E.printStackTrace();
        }

        label3.setText(" "+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transaction(pin);
    }
}
