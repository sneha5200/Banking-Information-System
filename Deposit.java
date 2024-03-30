package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;

    JTextField textField;

    JButton btn1,btn2;

    Deposit(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);

        JLabel label2=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(410,280,400,35);
        label1.add(label2);

        textField=new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(415,330,350,35);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(textField);

        btn1=new JButton("DEPOSIT");
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
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount=textField.getText();
            Date date=new Date();

            if (e.getSource()==btn1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
                }else {
                    Con c=new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transaction(pin);
                }
            } else if (e.getSource()==btn2) {
                setVisible(false);
                new Transaction(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
