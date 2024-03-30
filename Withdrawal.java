package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    JTextField textField;

    JButton btn1,btn2;

    String pin;
     Withdrawal(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        JLabel label2=new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(410,280,700,35);
        label1.add(label2);

        JLabel label3=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(410,320,400,35);
        label1.add(label3);


        textField=new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(405,370,350,35);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(textField);

        btn1=new JButton("WITHDRAWAL");
        btn1.setBounds(730,462,150,35);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
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
        new Withdrawal("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1) {
            try {
                String amount = textField.getText();
                Date date = new Date();

                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Transaction(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }

        }
        if (e.getSource()==btn2){
            setVisible(false);
            new Transaction(pin);
        }
    }
}
