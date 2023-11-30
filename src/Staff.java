

import java.awt.*;
import javax.swing.*;


public class Staff extends JFrame {
     FlowLayout fl = new FlowLayout();
     JPanel pl = new JPanel();
     JFrame f = new JFrame();
     JLabel lb1 = new JLabel("ROBINSON");
     JLabel lb2 = new JLabel("ROBINSON MALOLOS");
     JLabel lb3 = new JLabel("DATE:");
     JTextField d= new JTextField();
     JLabel lb4 = new JLabel("TIME:");
     JTextField t= new JTextField();
     JLabel lb5 = new JLabel("CASHIER:");
     JTextField c= new JTextField();
     JLabel lb6 = new JLabel("MOVIE");
     JTextField m= new JTextField();
     JLabel lb7 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
     JLabel lb8 = new JLabel("GENRA");
     JTextField g= new JTextField();
     JLabel lb9 = new JLabel("TICKET NO.");
     JTextField tn= new JTextField();
     JLabel lb10 = new JLabel("SEAT NO.");
     JTextField sn= new JTextField();
     JLabel lb11 = new JLabel("TOTAL");
     JTextField tal= new JTextField();
     JLabel lb12 = new JLabel("CASH");
     JTextField cs= new JTextField();
     JLabel lb13 = new JLabel("CHANGE");
     JTextField ch= new JTextField();
     JLabel lb14 = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
     JLabel lb15 = new JLabel("CINEMA");
     
     void frame(){
        //frame
        f.setTitle("MOVIE RECEIPT");
        f.setSize(900, 639);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        //panel
        f.add(pl);
        pl.setLayout(null);
        pl.add(lb1);
        lb1.setBounds(410, 0, 500, 30);
        lb1.setFont(new Font("Ariel",Font.BOLD,25));
        pl.add(lb2);
        lb2.setBounds(410, 25, 200, 30);
        pl.add(lb3);
        pl.add(d);
        d.setBounds(95, 61, 30, 15);
        lb3.setBounds(60, 55, 200, 30);
        pl.add(lb4);
        pl.add(t);
        lb4.setBounds(60, 75, 30, 15);
        t.setBounds(95, 75, 30, 15);
        pl.add(lb5);
        pl.add(c);
        c.setBounds(115, 90, 100, 17);
        lb5.setBounds(60, 85, 200, 30);
        pl.add(lb6);
        pl.add(m);
        m.setBounds(710, 110, 100, 20);
        lb6.setBounds(45, 110, 200, 30);
        lb6.setFont(new Font("Ariel",Font.BOLD,15));
        pl.add(lb7);
        lb7.setBounds(0, 118, 915, 30);
        lb7.setFont(new Font("Ariel",Font.BOLD,30));
        pl.add(lb8);
        pl.add(g);
       g.setBounds(710, 140, 100, 17);
        lb8.setBounds(10, 135, 400, 30);
        pl.add(lb9);
        pl.add(tn);
        tn.setBounds(710, 155, 100, 17);
        lb9.setBounds(10, 150, 400, 30);
        pl.add(lb10);
        pl.add(sn);
        sn.setBounds(710, 165, 100, 17);
        lb10.setBounds(10, 165, 400, 30);
        pl.add(lb11);
        pl.add(tal);
        tal.setBounds(710, 310, 100, 17);
        lb11.setBounds(5, 310, 400, 30);
        pl.add(lb12);
        pl.add(cs);
        cs.setBounds(710, 325, 100, 17);
        lb12.setBounds(5, 325, 400, 30);
        pl.add(lb13);
        pl.add(ch);
        ch.setBounds(710, 340, 100, 17);
        lb13.setBounds(5, 340, 400, 30);
        pl.add(lb14);
        lb14.setBounds(0, 350, 915, 30);
        lb14.setFont(new Font("Ariel",Font.BOLD,30));
        pl.add(lb15);
        lb15.setBounds(295, 450, 400, 80);
        lb15.setFont(new Font("Ariel",Font.BOLD,70));
        
       
        
        
     }
    
     
    public static void main(String[] args) {
        Staff s= new Staff();
        s.frame();
        
    
       
    }
    
}
