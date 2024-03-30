package bank.information.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Register extends JFrame implements ActionListener {
    Random random=new Random();

    long firstFour=(random.nextLong() % 9000L) + 1000L ;

    String first=" "+Math.abs(firstFour);

    JTextField textName,fatherName,textEmail,tAddress,tCity,tPinCode,tState;

    JDateChooser dateChooser;

    JRadioButton radio1,radio2,marital1,marital2,marital3;

    JButton bNext;
    Register(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Arial",Font.BOLD,28));
        add(label1);


        JLabel label2=new JLabel("PAGE 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setForeground(Color.black);
        label2.setBounds(330,60,600,40);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setForeground(Color.black);
        label3.setBounds(290,90,600,40);
        add(label3);


        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Arial",Font.BOLD,18));
        labelName.setBounds(100,190,100,20);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Arial",Font.BOLD,14));
        textName.setBounds(270,180,400,25);
        add(textName);


        JLabel labelfName=new JLabel("Father's Name:");
        labelfName.setFont(new Font("Arial",Font.BOLD,18));
        labelfName.setBounds(100,230,200,25);
        add(labelfName);

        fatherName=new JTextField();
        fatherName.setFont(new Font("Arial",Font.BOLD,14));
        fatherName.setBounds(270,230,400,25);
        add(fatherName);

        JLabel DOB=new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Arial",Font.BOLD,18));
        DOB.setBounds(100,280,200,25);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(270,280,400,25);
        add(dateChooser);

        JLabel labelGender=new JLabel("Gender :");
        labelGender.setFont(new Font("Arial",Font.BOLD,18));
        labelGender.setBounds(100,320,200,25);
        add(labelGender);

        radio1=new JRadioButton("Male");
        radio1.setFont(new Font("Arial",Font.BOLD,14));
        radio1.setBackground(new Color(44, 222, 206));
        radio1.setBounds(300,318,60,30);
        add(radio1);

        radio2=new JRadioButton("Female");
        radio2.setFont(new Font("Arial",Font.BOLD,14));
        radio2.setBackground(new Color(44, 222, 206));
        radio2.setBounds(420,318,90,30);
        add(radio2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        JLabel labelEmail=new JLabel("E-mail :");
        labelEmail.setFont(new Font("Arial",Font.BOLD,18));
        labelEmail.setBounds(100,350,200,25);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Arial",Font.BOLD,14));
        textEmail.setBounds(270,349,400,25);
        add(textEmail);

        JLabel lmaritalStatus=new JLabel("Marital Status :");
        lmaritalStatus.setFont(new Font("Arial",Font.BOLD,18));
        lmaritalStatus.setBounds(100,385,200,25);
        add(lmaritalStatus);

        marital1=new JRadioButton("Married ");
        marital1.setFont(new Font("Arial",Font.BOLD,14));
        marital1.setBackground(new Color(44, 222, 206));
        marital1.setBounds(300,385,90,30);
        add(marital1);

        marital2=new JRadioButton("Unmarried");
        marital2.setFont(new Font("Arial",Font.BOLD,14));
        marital2.setBackground(new Color(44, 222, 206));
        marital2.setBounds(410,385,100,30);
        add(marital2);

        marital3=new JRadioButton("Other");
        marital3.setFont(new Font("Arial",Font.BOLD,14));
        marital3.setBackground(new Color(44, 222, 206));
        marital3.setBounds(530,385,90,30);
        add(marital3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(marital1);
        buttonGroup1.add(marital2);
        buttonGroup1.add(marital3);

        JLabel lAddress=new JLabel("Address :");
        lAddress.setFont(new Font("Arial",Font.BOLD,18));
        lAddress.setBounds(100,420,200,25);
        add(lAddress);

        tAddress=new JTextField();
        tAddress.setFont(new Font("Arial",Font.BOLD,14));
        tAddress.setBounds(270,420,400,25);
        add(tAddress);

        JLabel lCity=new JLabel("City :");
        lCity.setFont(new Font("Arial",Font.BOLD,18));
        lCity.setBounds(100,467,200,25);
        add(lCity);

        tCity=new JTextField();
        tCity.setFont(new Font("Arial",Font.BOLD,14));
        tCity.setBounds(270,467,400,25);
        add(tCity);

        JLabel lPinCode=new JLabel("Pin Code :");
        lPinCode.setFont(new Font("Arial",Font.BOLD,18));
        lPinCode.setBounds(100,512,200,25);
        add(lPinCode);

        tPinCode=new JTextField();
        tPinCode.setFont(new Font("Arial",Font.BOLD,14));
        tPinCode.setBounds(270,512,400,25);
        add(tPinCode);

        JLabel lState=new JLabel("State :");
        lState.setFont(new Font("Arial",Font.BOLD,18));
        lState.setBounds(100,560,200,25);
        add(lState);

        tState=new JTextField();
        tState.setFont(new Font("Arial",Font.BOLD,14));
        tState.setBounds(270,560,400,25);
        add(tState);

        bNext=new JButton("Next ");
        bNext.setFont(new Font("Arial",Font.BOLD,18));
        bNext.setForeground(Color.black);
        bNext.setBackground(Color.yellow);
        bNext.setBounds(580,620,80,30);
        bNext.addActionListener(this);
        add(bNext);



        getContentPane().setBackground(new Color(44, 222, 206));
        setLayout(null);
        setSize(770,770);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Register();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String formNo=first;
        String name=textName.getText();
        String fname=fatherName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (radio1.isSelected()){
            gender="Male";
        } else if (radio2.isSelected()) {
            gender="Female";
        }
        String email=textEmail.getText();
        String lmarital=null;
        if (marital1.isSelected()){
            lmarital="Married";
        } else if (marital2.isSelected()) {
            lmarital="UnMarried";
        } else if (marital3.isSelected()) {
            lmarital="Other";
        }
        String address=tAddress.getText();
        String city=tCity.getText();
        String pinCode=tPinCode.getText();
        String state=tState.getText();

        try {
            if (textName.getText().equals("") || fatherName.getText().equals("") || tAddress.getText().equals("") || tCity.getText().equals("") || tPinCode.getText().equals("") || tState.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                Con con1=new Con();
                String q = "insert into Register values('" + formNo + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + lmarital + "','" + address + "','" + city + "','" + pinCode + "','" + state + "')";
                con1.statement.execute(q);
                new Register2(first);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
