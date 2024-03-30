package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    String pin;
    Transaction(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        JLabel label2=new JLabel("Please select your transaction");
        label2.setBounds(390,290,700,35);
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,28));
        label1.add(label2);

        btn1=new JButton("Deposit");
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(65,125,128));
        btn1.setBounds(270,392,150,35);
        btn1.addActionListener(this);
        label1.add(btn1);

        btn2=new JButton("Cash Withdrawal");
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(65,125,128));
        btn2.setBounds(735,392,150,35);
        btn2.addActionListener(this);
        label1.add(btn2);

        btn3=new JButton("Fast Cash");
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(65,125,128));
        btn3.setBounds(270,432,150,35);
        btn3.addActionListener(this);
        label1.add(btn3);

        btn4=new JButton("Mini Statement");
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(65,125,128));
        btn4.setBounds(735,432,150,35);
        btn4.addActionListener(this);
        label1.add(btn4);

        btn5=new JButton("PIN Change");
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(65,125,128));
        btn5.setBounds(270,472,150,35);
        btn5.addActionListener(this);
        label1.add(btn5);

        btn6=new JButton("Balance Enquiry");
        btn6.setForeground(Color.white);
        btn6.setBackground(new Color(65,125,128));
        btn6.setBounds(735,472,150,35);
        btn6.addActionListener(this);
        label1.add(btn6);

        btn7=new JButton("Exit");
        btn7.setForeground(Color.white);
        btn7.setBackground(new Color(65,125,128));
        btn7.setBounds(735,512,150,35);
        btn7.addActionListener(this);
        label1.add(btn7);

        btn8=new JButton("Fund Transfer");
        btn8.setForeground(Color.white);
        btn8.setBackground(new Color(65,125,128));
        btn8.setBounds(270,512,150,35);
        btn8.addActionListener(this);
        label1.add(btn8);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Transaction("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==btn7) {
            System.exit(0);
        } else if (e.getSource()==btn2) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource()==btn6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==btn3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource() == btn5) {
            new PinChange(pin);
            setVisible(false);
        } else if (e.getSource()==btn4) {
            new Mini(pin);
        } else if (e.getSource()==btn8) {
            new FundTransfer(pin);
            setVisible(false);
        }
    }
}
