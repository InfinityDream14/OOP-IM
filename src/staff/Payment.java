package staff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Payment extends JFrame {
    
    Payment() {
        setVisible(true);
        setTitle("Payment Method");
        setSize(500, 470);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paymentMethod() {
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(460,320));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(10,20, 460, 320);
        
        JLabel cusID = new JLabel("Customer ID:");
        panel1.add(cusID);
        cusID.setFont(new Font("Courier",Font.BOLD,15));
        cusID.setBounds(30, 30, 200, 30);
        
        JLabel cus_ID = new JLabel("1234567890");
        panel1.add(cus_ID);
        cus_ID.setFont(new Font("Courier",Font.BOLD,15));
        cus_ID.setBounds(160, 30, 200, 30);
        
        JLabel cusName = new JLabel("Customer Name:");
        panel1.add(cusName);
        cusName.setFont(new Font("Courier",Font.BOLD,15));
        cusName.setBounds(30, 60, 200, 30);
        
        JTextField cus_Name = new JTextField(20);
        panel1.add(cus_Name);
        cus_Name.setFont(new Font("Courier",Font.BOLD,15));
        cus_Name.setBounds(160, 60, 100, 30);
        
        JLabel tAmount = new JLabel("Total Amount:");
        panel1.add(tAmount);
        tAmount.setFont(new Font("Courier",Font.BOLD,15));
        tAmount.setBounds(30, 130, 200, 30);
        
        JLabel t_Amount = new JLabel("P1,000");
        panel1.add(t_Amount);
        t_Amount.setFont(new Font("Courier",Font.BOLD,15));
        t_Amount.setBounds(160, 130, 200, 30);
        
        JLabel pMethod = new JLabel("PAYMENT METHOD");
        panel1.add(pMethod);
        pMethod.setFont(new Font("Courier",Font.BOLD,15));
        pMethod.setBounds(160, 170, 150, 30);
        
        JButton card = new JButton("CARD");
        panel1.add(card);
        card.setBounds(80, 220, 90, 50);
        
        JButton gCash = new JButton("GCASH");
        panel1.add(gCash);
        gCash.setBounds(180, 220, 90, 50);
        
        JButton cash = new JButton("CASH");
        panel1.add(cash);
        cash.setBounds(280, 220, 90, 50);
        
        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setLayout(null);
        panel2.setSize(new Dimension(460,50));
        panel2.setBackground(Color.WHITE);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setBounds(10,360, 460, 50);
        
        JButton clear = new JButton("CLEAR");
        panel2.add(clear);
        clear.setBounds(120, 10, 100, 30);
        
        JButton finish = new JButton("FINISH");
        panel2.add(finish);
        finish.setBounds(230, 10, 100, 30);
        
        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (card.getActionCommand().equals("CARD")) {
                    PaymentOption po = new PaymentOption();
                    po.card();
                }
            }
        });
        
        gCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gCash.getActionCommand().equals("GCASH")) {
                    PaymentOption po = new PaymentOption();
                    po.gCash();
                }
            }
        });
        
        cash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cash.getActionCommand().equals("CASH")) {
                    PaymentOption po = new PaymentOption();
                    po.cash();
                }
            }
        });
    }
}
