
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class admin extends JFrame{

    public static  String usename;
  
    
    public admin(String username){
        setSize(300, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        JLabel titl = new JLabel("NAME");
        titl.setBounds(125, 0, 50, 50);
        
        JLabel UN = new JLabel("Username: ");
        UN.setBounds(20, 30, 100, 50);
        JTextField UNT = new JTextField(20);
        UNT.setBounds(95, 45, 150, 20);
        
        JLabel PS = new JLabel("Password: ");
        PS.setBounds(20, 60, 100, 50);
        JPasswordField PST = new JPasswordField(20);
        PST.setBounds(95, 75, 150, 20);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(30, 110, 100, 30);
        JButton Log = new JButton("Log-In");
        Log.setBounds(150, 110, 100, 30);
        
        
        add(titl);
        add(UN);
        add(UNT);
        add(PS);
        add(PST);
        
        add(cancel);
        add(Log);
        
        
       Log.addActionListener((ActionEvent e) -> {
          usename = UNT.getText();
          
           //String pass = PST.getText();
           
           if(usename.equals("admin")){
             JOptionPane.showMessageDialog(null, " Successfully Logged-in");
             EmpID m = new EmpID();
               add(m);
            
               
           }
           
           else{
            JOptionPane.showMessageDialog(null, "Error");
           }
            
        });
       
       
       
       cancel.addActionListener((var e) -> {
          if(e.getSource() == cancel){
           System.exit(0);
          }
       });
        
        
       
        
       
    }
    
    
    
    public static void main(String[] args) {
      admin ad = new admin(null);
      ad.setVisible(true);
    }

    
    
}
