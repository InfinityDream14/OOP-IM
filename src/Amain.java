
import java.awt.*;
import javax.swing.*;

public class Amain extends JFrame {

    public Amain() {

        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel admin = new JLabel("ADMIN");
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
        button6.setBounds(25, 330, 150, 40);

        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        jp1.add(admin);
        jp1.add(button1);
        jp1.add(button2);
        jp1.add(button3);
        jp1.add(button4);
        jp1.add(button5);
        jp1.add(button6);
        jp1.setBackground(Color.GRAY);
        jp1.setBounds(0, 0, 200, 600);
        
        
        
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(Color.WHITE);
        jp2.setBounds(200, 0, 700, 600);

        add(jp1);
        add(jp2);
    }

    public static void main(String[] args) {
        Amain am = new Amain();
        am.setVisible(true);
    }

}
