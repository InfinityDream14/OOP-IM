
import java.awt.*;
import javax.swing.*;

public class EmpID extends JFrame {

    public EmpID() {
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel admin = new JLabel("ADMIN"); // Elements of panel1 (jp1)
        admin.setFont(new Font("Arial", Font.BOLD, 26));
        admin.setBounds(50, 0, 100, 50);

        JButton button1 = new JButton("SALES");
        button1.setBounds(25, 80, 150, 40);

        JButton button2 = new JButton("STAFFS");
        button2.setBounds(25, 130, 150, 40);

        JButton button3 = new JButton("ADD STAFFS");
        button3.setBounds(25, 180, 150, 40);

        JButton button4 = new JButton("MANAGER");
        button4.setBounds(25, 230, 150, 40);

        JButton button5 = new JButton("ADD MANAGER");
        button5.setBounds(25, 280, 150, 40);

        JButton button6 = new JButton("EDIT EMPLOYEE");
        button6.setBounds(25, 330, 150, 40); // Last element of JP1
        
       
        JLabel EmpID = new JLabel("Employee ID: "); // Employee ID Label
        EmpID.setFont(new Font("Arial", Font.BOLD, 20));
        EmpID.setBounds(50, 50, 250, 50);
        JTextField EmpIDtf = new JPasswordField();
        EmpIDtf.setBounds(180, 60, 200, 30);
        
        
        
        
        
        JLabel name = new JLabel("Name: ");  // Name Label
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(50, 100, 200, 50);
        JTextField nametf = new JTextField(); // Name textfield
        nametf.setBounds(120, 110, 200, 30);
        
        JLabel pos = new JLabel("Position: "); // position label
        pos.setFont(new Font("Arial", Font.BOLD, 20));
        pos.setBounds(25, 140, 200, 50);
        JTextField postf = new JTextField(); // position textfield
        postf.setBounds(120, 150, 200, 30);
        
        JLabel phone = new JLabel("Phone: "); // Phone Label
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setBounds(42, 180, 200, 50);
        JTextField phonetf = new JTextField(); // Phone textfield
        phonetf.setBounds(120, 190, 200, 30);
        
        JLabel email = new JLabel("Email: "); // email label
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(340, 100, 200, 50);
        JTextField emailtf = new JTextField(); // email textfield
        emailtf.setBounds(410, 110, 200, 30);
        
        JLabel Dept = new JLabel("Dept: "); // Dept label
        Dept.setFont(new Font("Arial", Font.BOLD, 20));
        Dept.setBounds(348, 140, 200, 50);
        JTextField Depttf = new JTextField(); // email textfield
        Depttf.setBounds(410, 150, 200, 30);
        
        JButton add = new JButton("Add"); // add button
        add.setBounds(190, 270, 100, 30);
        
        JButton back = new JButton("Back");
        back.setBounds(350, 270, 100, 30);
        
        JPanel jp1 = new JPanel(); // panel 1
        jp1.setLayout(null);
        jp1.add(admin);
        jp1.add(button1);
        jp1.add(button2);
        jp1.add(button3);
        jp1.add(button4);
        jp1.add(button5);
        jp1.add(button6);
        jp1.setBackground(Color.GRAY);
        jp1.setBounds(0, 0, 180, 600); // last part of panel 1

        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.add(EmpID);
        jp2.add(EmpIDtf);
        jp2.add(name);
        jp2.add(nametf);
        jp2.add(pos);
        jp2.add(postf);
        jp2.add(phone);
        jp2.add(phonetf);
        jp2.add(email);
        jp2.add(emailtf);
        jp2.add(Dept);
        jp2.add(Depttf);
        jp2.add(add);
        jp2.add(back);
        jp2.setBackground(Color.WHITE);
        jp2.setBounds(200, 0, 700, 600);
        
        

        add(jp1);
        add(jp2);
    }

    public static void main(String[] args) {
        EmpID eid = new EmpID();
        eid.setVisible(true);
    }
}
