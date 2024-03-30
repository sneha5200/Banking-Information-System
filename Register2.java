package bank.information.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register2 extends JFrame  implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;

    JTextField tpan,tac;

    JRadioButton r1,r2,r11,r22;
    JButton next;
    Register2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("PAGE 2 ");
        l1.setFont(new Font("Arial",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Arial",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Arial",Font.BOLD,18));
        l3.setBounds(150,124,100,22);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setFont(new Font("Arial",Font.BOLD,14));
        comboBox.setBackground(new Color(133, 241, 80));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Arial",Font.BOLD,18));
        l4.setBounds(150,174,100,22);
        add(l4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox1=new JComboBox(category);
        comboBox1.setFont(new Font("Arial",Font.BOLD,14));
        comboBox1.setBackground(new Color(133, 241, 80));
        comboBox1.setBounds(350,170,320,30);
        add(comboBox1);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Arial",Font.BOLD,18));
        l5.setBounds(150,224,100,22);
        add(l5);

        String income[]={"Null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox2=new JComboBox(income);
        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
        comboBox2.setBackground(new Color(133, 241, 80));
        comboBox2.setBounds(350,224,320,30);
        add(comboBox2);

        JLabel l6=new JLabel("Education :");
        l6.setFont(new Font("Arial",Font.BOLD,18));
        l6.setBounds(150,274,120,22);
        add(l6);

        String education[]={"under-graduate","post-graduate","graduate","doctrate","Others"};
        comboBox3=new JComboBox(education);
        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
        comboBox3.setBackground(new Color(133, 241, 80));
        comboBox3.setBounds(350,274,320,30);
        add(comboBox3);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Arial",Font.BOLD,18));
        l7.setBounds(150,324,120,22);
        add(l7);

        String occupation[]={"Salaried","Self-employed","Business","Student","Others"};
        comboBox4=new JComboBox(occupation);
        comboBox4.setFont(new Font("Arial",Font.BOLD,14));
        comboBox4.setBackground(new Color(133, 241, 80));
        comboBox4.setBounds(350,324,320,30);
        add(comboBox4);

        JLabel l8=new JLabel("PAN Number :");
        l8.setFont(new Font("Arial",Font.BOLD,18));
        l8.setBounds(150,374,320,22);
        add(l8);

        tpan=new JTextField();
        tpan.setFont(new Font("Arial",Font.BOLD,18));
        tpan.setBounds(350,374,320,22);
        add(tpan);

        JLabel l9=new JLabel("Aadhaar Number :");
        l9.setFont(new Font("Arial",Font.BOLD,18));
        l9.setBounds(150,424,320,22);
        add(l9);

        tac=new JTextField();
        tac.setFont(new Font("Arial",Font.BOLD,18));
        tac.setBounds(350,424,320,22);
        add(tac);

        JLabel l11=new JLabel("Senior Citizen :");
        l11.setFont(new Font("Arial",Font.BOLD,18));
        l11.setBounds(150,474,320,22);
        add(l11);

        r1=new JRadioButton("Yes");
        r1.setBackground(new Color(133, 241, 80));
        r1.setFont(new Font("Arial",Font.BOLD,18));
        r1.setBounds(350,474,100,30);
        add(r1);

        r2=new JRadioButton("N0");
        r2.setBackground(new Color(133, 241, 80));
        r2.setFont(new Font("Arial",Font.BOLD,18));
        r2.setBounds(450,474,100,30);
        add(r2);

        ButtonGroup btn=new ButtonGroup();
        btn.add(r1);
        btn.add(r2);

        JLabel l22=new JLabel("Existing Account :");
        l22.setFont(new Font("Arial",Font.BOLD,18));
        l22.setBounds(150,524,320,22);
        add(l22);

        r11=new JRadioButton("Yes");
        r11.setBackground(new Color(133, 241, 80));
        r11.setFont(new Font("Arial",Font.BOLD,18));
        r11.setBounds(350,524,100,30);
        add(r11);

        r22=new JRadioButton("N0");
        r22.setBackground(new Color(133, 241, 80));
        r22.setFont(new Font("Arial",Font.BOLD,18));
        r22.setBounds(450,524,100,30);
        add(r22);

        ButtonGroup btn1=new ButtonGroup();
        btn1.add(r11);
        btn1.add(r22);

        JLabel l33=new JLabel("Form No :");
        l33.setFont(new Font("Arial",Font.BOLD,18));
        l33.setBounds(570,10,90,30);
        add(l33);

        JLabel l44=new JLabel(formno);
        l44.setFont(new Font("Arial",Font.BOLD,18));
        l44.setBounds(650,10,60,30);
        add(l44);


        next=new JButton("Next ");
        next.setFont(new Font("Arial",Font.BOLD,18));
        next.setForeground(Color.black);
        next.setBackground(Color.yellow);
        next.setBounds(580,620,80,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(770,770);
        getContentPane().setBackground(new Color(133, 241, 80));
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String rel= (String) comboBox.getSelectedItem();
       String cat= (String) comboBox1.getSelectedItem();
       String inc= (String) comboBox2.getSelectedItem();
       String edu= (String) comboBox3.getSelectedItem();
       String occ= (String) comboBox4.getSelectedItem();

       String pan=tpan.getText();
       String addhar=tac.getText();

       String citizen=null;
       if (r1.isSelected()){
           citizen="Yes";
       } else if (r2.isSelected()) {
           citizen="No";
       }

       String account=" ";
       if (r11.isSelected()){
           account="Yes";
       } else if (r22.isSelected()) {
           account="No";
       }

       try {
           if (tpan.getText().equals("")||tac.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Fill all the fields");
           }else {
               Con c1=new Con();
               String q="insert into registertwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+citizen+"','"+account+"')";
               c1.statement.executeUpdate(q);
               new Register3(formno);
               setVisible(false);
           }
       }catch (Exception E){
           E.printStackTrace();
       }
    }
    public static void main(String[] args) {
        new Register2("");
    }


}
