package staff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Staff extends JFrame {
    
    public void staff() {
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JPanel movie = new JPanel();
        movie.setLayout(null);
        add(movie);
        movie.setBackground(Color.gray);
        movie.setSize(new Dimension(300,600));
        
        JLabel avlM = new JLabel("AVAILABLE MOVIES");
        movie.add(avlM);
        avlM.setBounds(80, 10, 150, 30);
        
        JPanel movies = new JPanel();
        movies.setLayout(null);
        movie.add(movies);
        movies.setBackground(Color.LIGHT_GRAY);
        movies.setBorder(BorderFactory.createLineBorder(Color.black));
        movies.setSize(new Dimension(280,500));
        movies.setBounds(10, 50, 280, 500);
        JLabel movie1 = new JLabel("Gagamboy");
        movies.add(movie1);
        ImageIcon poster1 = new ImageIcon("movie.png");
        JLabel m1 = new JLabel(poster1);
        movies.add(m1);
        m1.setBounds(20, 60, 100, 100);
        movie1.setBounds(30, 155, 150, 30);
        JLabel movie2 = new JLabel("Gagamboy");
        movies.add(movie2);
        ImageIcon poster2 = new ImageIcon("movie2.png");
        JLabel m2 = new JLabel(poster2);
        movies.add(m2);
        m2.setBounds(160, 60, 100, 100);
        movie2.setBounds(170, 155, 150, 30);
        JLabel movie3 = new JLabel("Gagamboy");
        movies.add(movie3);
        ImageIcon poster3 = new ImageIcon("movie3.png");
        JLabel m3 = new JLabel(poster3);
        movies.add(m3);
        m3.setBounds(20, 213, 100, 100);
        movie3.setBounds(30, 310, 150, 30);
        JLabel movie4 = new JLabel("Gagamboy");
        movies.add(movie4);
        ImageIcon poster4 = new ImageIcon("movie4.png");
        JLabel m4 = new JLabel(poster4);
        movies.add(m4);
        m4.setBounds(160, 213, 100, 100);
        movie4.setBounds(170, 310, 150, 30);
        JLabel movie5 = new JLabel("Gagamboy");
        movies.add(movie5);
        ImageIcon poster5 = new ImageIcon("movie5.png");
        JLabel m5 = new JLabel(poster5);
        movies.add(m5);
        m5.setBounds(20, 366, 100, 100);
        movie5.setBounds(30, 465, 150, 30);
        JLabel movie6 = new JLabel("Gagamboy");
        movies.add(movie6);
        ImageIcon poster6 = new ImageIcon("movie6.png");
        JLabel m6 = new JLabel(poster6);
        movies.add(m6);
        m6.setBounds(160, 366, 100, 100);
        movie6.setBounds(170, 465, 150, 30);
        
        JButton logOut = new JButton("Logout");
        movie.add(logOut);
        logOut.setBounds(75, 560, 150, 30);
        
        m1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        m2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        m3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        m4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        m5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        m6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frm = new JFrame();
                frm.setVisible(true);
                frm.setSize(350, 500);
                frm.setLocationRelativeTo(null);
            }
        });
        
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(logOut.getActionCommand().equals("Logout")){
                    System.out.println("etits");
                    System.exit(0);
                }
            }
        });
    }
}
