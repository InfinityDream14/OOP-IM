import java.awt.*;
import javax.swing.*;

public class Staffs extends JFrame {

    public Staffs(){
        
        
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
        
        JButton button7 = new JButton("MOVIES");
         button7.setBounds(25, 380, 150, 40);
        

        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        jp1.add(admin);
        jp1.add(button1);
        jp1.add(button2);
        jp1.add(button3);
        jp1.add(button4);
        jp1.add(button5);
        jp1.add(button6);
         jp1.add(button7);
        jp1.setBackground(Color.RED);
        jp1.setBounds(0, 0, 200, 600);
        
        JLabel label = new JLabel("Staffs");
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setBounds(40, 30, 300, 50);
        
        JTable table1 = new JTable(6,2);
        table1.setBounds(65, 120, 590, 180);
        table1.getColumnModel().getColumn(0).setPreferredWidth(30);
        table1.getColumnModel().getColumn(1).setPreferredWidth(90);
        table1.setRowHeight(0, 30);
        table1.setRowHeight(1, 30);
        table1.setRowHeight(2, 30);
        table1.setRowHeight(3, 30);
        table1.setRowHeight(4, 30);
        table1.setRowHeight(5, 30);
        
        JTextField searchf = new JTextField();
        searchf.setBounds(180, 400, 320, 30);
              
        
        JButton selectbtn = new JButton("Select");
        selectbtn.setBounds(130, 450, 100, 30);
        
         JButton searchbtn = new JButton("Search");
        searchbtn.setBounds(290, 450, 100, 30);
        
        JButton backbtn = new JButton("Back");
        backbtn.setBounds(450, 450, 100, 30);
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.add(table1);
        jp2.add(label);
        jp2.add(searchf);
        jp2.add(selectbtn);
        jp2.add(searchbtn);
        jp2.add(backbtn);
        jp2.setBackground(Color.GRAY);
        jp2.setBounds(180, 0, 700, 600);

        add(jp1);
        add(jp2);
        
        
    }
    
    
    
    public static void main(String[] args) {
        Staffs sts = new Staffs();
        sts.setVisible(true);
    }
    
}
