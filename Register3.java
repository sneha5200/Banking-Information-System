package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Register3 extends JFrame implements ActionListener {

    JRadioButton radio11,radio12,radio13,radio14;

    JCheckBox box1,box2,box3,box4,box5,box6;

    JButton submit,cancel;

    String formno;
    Register3(String formno){

        this.formno=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel label1=new JLabel("Page 3");
        label1.setFont(new Font("Arial",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);

        JLabel label2=new JLabel("Account Details");
        label2.setFont(new Font("Arial",Font.BOLD,22));
        label2.setBounds(300,60,600,40);
        add(label2);

        JLabel label3=new JLabel("Account Type :");
        label3.setFont(new Font("Arial",Font.BOLD,18));
        label3.setBounds(100,124,150,22);
        add(label3);

        radio11=new JRadioButton("Saving Account");
        radio11.setFont(new Font("Arial",Font.BOLD,14));
        radio11.setBounds(120,160,150,20);
        radio11.setBackground(Color.ORANGE);
        add(radio11);

        radio12=new JRadioButton("Fixed Deposit Account");
        radio12.setFont(new Font("Arial",Font.BOLD,14));
        radio12.setBounds(290,160,300,20);
        radio12.setBackground(Color.ORANGE);
        add(radio12);

        radio13=new JRadioButton("Current Account");
        radio13.setFont(new Font("Arial",Font.BOLD,14));
        radio13.setBounds(120,190,150,20);
        radio13.setBackground(Color.ORANGE);
        add(radio13);

        radio14=new JRadioButton("Recurring Deposit Account");
        radio14.setFont(new Font("Arial",Font.BOLD,14));
        radio14.setBounds(290,190,300,20);
        radio14.setBackground(Color.ORANGE);
        add(radio14);

        ButtonGroup group=new ButtonGroup();
        group.add(radio11);
        group.add(radio12);
        group.add(radio13);
        group.add(radio14);

        JLabel label4=new JLabel("Card Number :");
        label4.setFont(new Font("Arial",Font.BOLD,18));
        label4.setBounds(100,260,200,25);
        add(label4);

        JLabel label5=new JLabel("(Your 16-digit Card Number)");
        label5.setFont(new Font("Arial",Font.BOLD,12));
        label5.setBounds(100,290,200,25);
        add(label5);

        JLabel label6=new JLabel("XXXX-XXXX-XXXX-4841");
        label6.setFont(new Font("Arial",Font.BOLD,18));
        label6.setBounds(330,260,250,30);
        add(label6);

        JLabel label7=new JLabel("(It would appear on atm card/cheque book and statement)");
        label7.setFont(new Font("Arial",Font.BOLD,12));
        label7.setBounds(330,290,500,20);
        add(label7);

        JLabel label8=new JLabel("PIN :");
        label8.setFont(new Font("Arial",Font.BOLD,18));
        label8.setBounds(100,330,200,30);
        add(label8);

        JLabel label9=new JLabel("XXXX");
        label9.setFont(new Font("Arial",Font.BOLD,18));
        label9.setBounds(330,330,200,30);
        add(label9);

        JLabel label10=new JLabel("(4-digit password)");
        label10.setFont(new Font("Arial",Font.BOLD,12));
        label10.setBounds(100,360,200,20);
        add(label10);

        JLabel label11=new JLabel("Services Required :");
        label11.setFont(new Font("Arial",Font.BOLD,18));
        label11.setBounds(100,410,200,30);
        add(label11);

        box1=new JCheckBox("ATM CARD");
        box1.setBackground(Color.ORANGE);
        box1.setFont(new Font("Arial",Font.BOLD,16));
        box1.setBounds(100,460,200,30);
        add(box1);

        box2=new JCheckBox("Internet Banking");
        box2.setBackground(Color.ORANGE);
        box2.setFont(new Font("Arial",Font.BOLD,16));
        box2.setBounds(330,460,200,30);
        add(box2);

        box3=new JCheckBox("Mobile Banking");
        box3.setBackground(Color.ORANGE);
        box3.setFont(new Font("Arial",Font.BOLD,16));
        box3.setBounds(100,510,200,30);
        add(box3);

        box4=new JCheckBox("Email Alert");
        box4.setBackground(Color.ORANGE);
        box4.setFont(new Font("Arial",Font.BOLD,16));
        box4.setBounds(330,510,200,30);
        add(box4);

        box5=new JCheckBox("Cheque Book");
        box5.setBackground(Color.ORANGE);
        box5.setFont(new Font("Arial",Font.BOLD,16));
        box5.setBounds(100,560,200,30);
        add(box5);

        box6=new JCheckBox("E-Statement");
        box6.setBackground(Color.ORANGE);
        box6.setFont(new Font("Arial",Font.BOLD,16));
        box6.setBounds(330,560,200,30);
        add(box6);

        JCheckBox box7=new JCheckBox("I hereby declare that the above entered details correct to the best of my knowledge.",true);
        box7.setBackground(Color.ORANGE);
        box7.setFont(new Font("Arial",Font.BOLD,12));
        box7.setBounds(100,620,600,20);
        add(box7);

        JLabel label12=new JLabel("Form No :");
        label12.setFont(new Font("Arial",Font.BOLD,18));
        label12.setBounds(600,10,100,30);
        add(label12);

        JLabel label13=new JLabel(formno);
        label13.setFont(new Font("Arial",Font.BOLD,18));
        label13.setBounds(690,10,100,30);
        add(label13);

        submit=new JButton("Submit");
        submit.setFont(new Font("Arial",Font.BOLD,14));
        submit.setForeground(Color.black);
        submit.setBackground(Color.yellow);
        submit.setBounds(250,660,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Arial",Font.BOLD,14));
        cancel.setForeground(Color.black);
        cancel.setBackground(Color.yellow);
        cancel.setBounds(420,660,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.ORANGE);
        setSize(800,770);
        setLocation(360,40);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      String atype=null;
      if (radio11.isSelected()){
          atype="Saving Account";
      } else if (radio12.isSelected()) {
          atype="Fixed Deposit Account";
      } else if (radio13.isSelected()) {
          atype="Current Account";
      } else if (radio14.isSelected()) {
          atype="Recurring Deposit Account";
      }
        Random random=new Random();
        long first7=(random.nextLong()%9000000l)+1409963000000000l;
        String crdno=""+Math.abs(first7);

        long first4=(random.nextLong()%9000l)+1000l;
        String pin=""+Math.abs(first4);

        String fac=" ";
        if (box1.isSelected()){
            fac+="ATM CARD";
        } else if (box2.isSelected()) {
            fac+="Internet Banking";
        } else if (box3.isSelected()) {
            fac+="Mobile Banking";
        } else if (box4.isSelected()) {
            fac+="Email Alert";
        } else if (box5.isSelected()) {
            fac+="Cheque Book";
        } else if (box6.isSelected()) {
            fac+="E-Statement";
        }


       try {
        if (e.getSource()==submit){
            if (atype.equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else {
               Con c1=new Con();
               String q1="insert into registerthree values('"+formno+"','"+atype+"','"+crdno+"','"+pin+"','"+fac+"')";
               String q2="insert  into login values('"+formno+"','"+crdno+"','"+pin+"')";
               c1.statement.executeUpdate(q1);
               c1.statement.executeUpdate(q2);
               JOptionPane.showMessageDialog(null,"Card Number :"+crdno+"\n Pin :"+pin);
               new Deposit(pin);
               setVisible(false);
          }
        } else if (e.getSource()==cancel) {
            System.exit(0);
        }
       }
       catch (Exception E){
        E.printStackTrace();
     }

    }

    public static void main(String[] args) {
        new Register3(" ");
    }

}
