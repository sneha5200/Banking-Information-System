package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    String pin;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    FastCash(String pin){
        this.pin=pin;
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        JLabel label2=new JLabel("Select Withdrawal Amount");
        label2.setBounds(390,310,700,35);
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,28));
        label1.add(label2);


        btn1=new JButton("Rs. 100");
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(65,125,128));
        btn1.setBounds(270,392,150,35);
        btn1.addActionListener(this);
        label1.add(btn1);

        btn2=new JButton("Rs. 500");
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(65,125,128));
        btn2.setBounds(735,392,150,35);
        btn2.addActionListener(this);
        label1.add(btn2);

        btn3=new JButton("Rs. 1000");
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(65,125,128));
        btn3.setBounds(270,432,150,35);
        btn3.addActionListener(this);
        label1.add(btn3);

        btn4=new JButton("Rs. 2000");
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(65,125,128));
        btn4.setBounds(735,432,150,35);
        btn4.addActionListener(this);
        label1.add(btn4);

        btn5=new JButton("Rs. 5000");
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(65,125,128));
        btn5.setBounds(270,472,150,35);
        btn5.addActionListener(this);
        label1.add(btn5);

        btn6=new JButton("Rs. 10000");
        btn6.setForeground(Color.white);
        btn6.setBackground(new Color(65,125,128));
        btn6.setBounds(735,472,150,35);
        btn6.addActionListener(this);
        label1.add(btn6);

        btn7=new JButton("Back");
        btn7.setForeground(Color.white);
        btn7.setBackground(new Color(65,125,128));
        btn7.setBounds(735,512,150,35);
        btn7.addActionListener(this);
        label1.add(btn7);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new  FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn7){
            setVisible(false);
            new Transaction(pin);
        }else {
            String amount=((JButton)e.getSource()).getText().substring(4);
            Con c=new Con();
            Date date=new Date();
            try {
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin= '"+pin+"'");
            int balance=0;
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
            String num="17";
            if (e.getSource()!=btn7  && balance < Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null,"Insufficient balance");
                return;
            }
            c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdraw','"+amount+"')");
            JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Transaction(pin);
        }
    }
}
