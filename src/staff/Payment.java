package staff;

import front.Login;
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
    }
    
    public void paymentMethod(String tot) {
        Staff s = new Staff();
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
        
        JLabel cus_ID = new JLabel("CM202301");
        panel1.add(cus_ID);
        cus_ID.setFont(new Font("Courier",Font.BOLD,15));
        cus_ID.setBounds(160, 30, 200, 30);
        
        JLabel tAmount = new JLabel("Total Amount:");
        panel1.add(tAmount);
        tAmount.setFont(new Font("Courier",Font.BOLD,15));
        tAmount.setBounds(30, 130, 200, 30);
        
        JLabel t_Amount = new JLabel();
        t_Amount.setText("₱ "+ tot);
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
        
//        JButton clear = new JButton("CLEAR");
//        panel2.add(clear);
//        clear.setBounds(120, 10, 100, 30);
        
        JButton finish = new JButton("FINISH");
        panel2.add(finish);
        finish.setBounds(160, 10, 100, 30);
        
        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (card.getActionCommand().equals("CARD")) {
                    Payment p = new Payment();
                    p.card(tot);
                }
            }
        });
        
        gCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gCash.getActionCommand().equals("GCASH")) {
                    Payment p = new Payment();
                    p.gCash(tot);
                }
            }
        });
        
        cash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cash.getActionCommand().equals("CASH")) {
                    Payment p = new Payment();
                    p.cash(tot);
                }
            }
        });

        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (finish.getActionCommand().equals("FINISH")) {
                    setVisible(false);
                }
            }
        });
    }
    
    public void paymentoption() {
        setVisible(true);
        setTitle("Payment Method");
        setSize(300, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    
    public void card(String tot) {
        setVisible(true);
        setTitle("Payment Method");
        setSize(300, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(260,160));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(10,20, 260, 120);
        
        JLabel cardType = new JLabel("Card Type");
        cardType.setBounds(35,10, 100, 30);
        panel1.add(cardType);
        String card[] = {"BDO", "Master Card", "Land Bank", "Visa Card"}; 
        JComboBox card_type = new JComboBox(card);
        panel1.add(card_type);
        card_type.setBounds(100,15, 140, 25);
        
        JLabel cardNum = new JLabel("Card Number");
        cardNum.setBounds(15,40, 100, 30);
        panel1.add(cardNum);
        JTextField card_num = new JTextField(15);
        panel1.add(card_num);
        card_num.setBounds(100,45, 140, 25);
        
        JButton okBtn = new JButton("OK");
        panel1.add(okBtn);
        okBtn.setBounds(75,80, 100, 25);
        
        String bdo_num = "012-345-012";
        
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(okBtn.getActionCommand().equals("OK") && card_num.getText().equals(bdo_num)) {
                    String sc = (String) card_type.getSelectedItem();
                    int balance = 5000;
                    int sukli = balance - Integer.parseInt(tot);
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
    
    public void gCash(String tot) {
        setVisible(true);
        setTitle("Payment Method");
        setSize(300, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(200,120));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(10,20, 260, 120);
        
        JLabel walletType = new JLabel("E-Wallet Type");
        walletType.setBounds(15,10, 100, 30);
        panel1.add(walletType);
        String wallet[] = {"Gcash", "Paypal", "Maya", "Pioneer"}; 
        JComboBox wallet_type = new JComboBox(wallet);
        panel1.add(wallet_type);
        wallet_type.setBounds(100,15, 140, 25);
        
        JLabel num = new JLabel("Number");
        num.setBounds(45,40, 100, 30);
        panel1.add(num);
        JTextField wallet_num = new JTextField(15);
        panel1.add(wallet_num);
        wallet_num.setBounds(100,45, 140, 25);
        
        JButton okBtn = new JButton("OK");
        panel1.add(okBtn);
        okBtn.setBounds(75,80, 100, 25);
        
        String gcash_num = "09100319025";
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(okBtn.getActionCommand().equals("OK") && wallet_num.getText().equals(gcash_num)) {
                    String sc = (String) wallet_type.getSelectedItem();
                    int balance = 5000;
                    int sukli = balance - Integer.parseInt(tot);
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
    
    public void cash(String tot) {
        setVisible(true);
        setTitle("Payment Method");
        setSize(300, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(180,150));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(10,20, 260, 120);
        
        JLabel cNum = new JLabel("Cash Amount");
        panel1.add(cNum);
        cNum.setBounds(40,20, 95, 50);
        JTextField cash_num = new JTextField(20);
        panel1.add(cash_num);
        cash_num.setBounds(120,32, 100, 25);
        
        JButton okBtn = new JButton("OK");
        panel1.add(okBtn);
        okBtn.setBounds(75,80, 100, 25);
        
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(okBtn.getActionCommand().equals("OK")) {
                    
                    int cash = Integer.parseInt(cash_num.getText());
                    int sukli = cash - Integer.parseInt(tot);
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
}