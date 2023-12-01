package staff;

import java.awt.*;
import javax.swing.*;

public class PaymentOption extends JFrame{
    
    PaymentOption() {
        setVisible(true);
        setTitle("Payment Method");
        setSize(200, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    public void card() {
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(180,150));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(2,5, 180, 150);
    }
    
    public void gCash() {
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(180,150));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(2,5, 180, 150);
    }
    
    public void cash() {
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(null);
        panel1.setSize(new Dimension(180,150));
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBounds(2,5, 180, 150);
    }
}
