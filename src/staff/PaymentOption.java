package staff;

//import staff.Account;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaymentOption extends JFrame {
    PaymentOption() {
        setVisible(true);
        setTitle("Payment Method");
        setSize(300, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    
    public void card() {
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
        int bdo_balance = 1000;
        int total = 996;
        
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(okBtn.getActionCommand().equals("OK") && card_num.getText().equals(bdo_num)) {
                    String sc = (String) card_type.getSelectedItem();
                    int total = 996;
                    int balance = 5000;
                    int sukli = balance - total;
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
    
    public void gCash() {
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
        
        String gcash_num = "09221009650";
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(okBtn.getActionCommand().equals("OK") && wallet_num.getText().equals(gcash_num)) {
                    String sc = (String) wallet_type.getSelectedItem();
                    int total = 996;
                    int balance = 5000;
                    int sukli = balance - total;
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
    
    public void cash() {
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
                    int total = 996;
                    int cash = Integer.parseInt(cash_num.getText());
                    int sukli = cash - total;
                    JOptionPane.showMessageDialog(null, "Successfull, your change is " + sukli, "Payment Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }
}
