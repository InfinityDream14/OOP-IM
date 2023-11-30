package staff;

import java.awt.*;
import javax.swing.*;

public class MovieDescription extends JFrame {
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel mDescription = new JLabel("MOVIE DETAILS");
    JLabel title = new JLabel("Title:");
    JLabel director = new JLabel("Director:");
    JLabel duration = new JLabel("Duration:");
    JLabel genre = new JLabel("Genre:");
    
    MovieDescription() {
        setVisible(true);
        setSize(800, 600);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
        panel1.setLayout(null);
        add(panel1);
        panel1.setBackground(Color.gray);
        panel1.setSize(new Dimension(300,600));
        
        panel1.add(mDescription);
        mDescription.setFont(new Font("Courier",Font.BOLD,15));
        mDescription.setBounds(90, 10, 150, 30);
        
        panel2.setLayout(null);
        panel1.add(panel2);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setSize(new Dimension(280,500));
        panel2.setBounds(10, 50, 280, 500);
        
        panel2.add(title);
        title.setBounds(55, 340, 100, 30);
        panel2.add(director);
        director.setBounds(55, 370, 100, 30);
        panel2.add(duration);
        duration.setBounds(55, 400, 100, 30);
        panel2.add(genre);
        genre.setBounds(55, 430, 100, 30);
    }
    public void movie1() {
        ImageIcon p1 = new ImageIcon("movie1.png");
        JLabel movie1 = new JLabel(p1);
        panel2.add(movie1);
        movie1.setBounds(30, 0, 220, 360);
        
    }
    
    public void movie2() {
        ImageIcon p2 = new ImageIcon("movie2.png");
        JLabel movie2 = new JLabel(p2);
        panel2.add(movie2);
        movie2.setBounds(30, 0, 220, 360);
    }
    public void movie3() {
        ImageIcon p3 = new ImageIcon("movie3.png");
        JLabel movie3 = new JLabel(p3);
        panel2.add(movie3);
        movie3.setBounds(30, 0, 220, 360);
    }
    public void movie4() {
        ImageIcon p4 = new ImageIcon("movie4.png");
        JLabel movie4 = new JLabel(p4);
        panel2.add(movie4);
        movie4.setBounds(30, 0, 220, 360);
    }
    public void movie5() {
        ImageIcon p5 = new ImageIcon("movie5.png");
        JLabel movie5 = new JLabel(p5);
        panel2.add(movie5);
        movie5.setBounds(30, 0, 220, 360);
    }
    public void movie6() {
        ImageIcon p6 = new ImageIcon("movie6.png");
        JLabel movie6 = new JLabel(p6);
        panel2.add(movie6);
        movie6.setBounds(30, 0, 220, 360);
    }
}