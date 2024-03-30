package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PinChange extends JFrame implements ActionListener {

    JButton btn1,btn2;

    JPasswordField p1,p2;

    String pin;
    PinChange(String pin){
        this.pin=pin;

        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image image=icon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon icon1=new ImageIcon(image);

        JLabel label1=new JLabel(icon1);
        label1.setBounds(0,0,1550,830);
        add(label1);


        JLabel label2=new JLabel("CHANGE YOUR PIN");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(300,300,400,35);
        label1.add(label2);

        JLabel label3=new JLabel("New PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(300,340,400,35);
        label1.add(label3);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(470,340,350,35);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(p1);

        JLabel label4=new JLabel("Re-Enter New PIN :");
        label4.setForeground(Color.white);
        label4.setFont(new Font("System",Font.BOLD,16));
        label4.setBounds(300,390,400,35);
        label1.add(label4);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(470,390,350,35);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        label1.add(p2);

        btn1=new JButton("CHANGE");
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
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PinChange("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         try {
             String pin1=p1.getText();
             String pin2=p2.getText();

             if (!pin1.equals(pin2)){
                 JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                 return;
             }
             if (e.getSource()==btn1){
                 if (p1.getText().equals("")){
                     JOptionPane.showMessageDialog(null,"Enter new PIN");
                     return;
                 }
                 if (p2.getText().equals("")){
                     JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                     return;
                 }
                 Con c=new Con();
                 String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
                 String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
                 String q3="update registerthree set pin='"+pin1+"' where pin='"+pin+"'";

                 c.statement.executeUpdate(q1);
                 c.statement.executeUpdate(q2);
                 c.statement.executeUpdate(q3);

                 JOptionPane.showMessageDialog(null,"PIN changed successfully");
                 setVisible(false);
                 new Transaction(pin);
             }
             if (e.getSource()==btn2){
                 setVisible(false);
                 new Transaction(pin);
             }
         }catch (Exception E){
             E.printStackTrace();
         }
    }
}
