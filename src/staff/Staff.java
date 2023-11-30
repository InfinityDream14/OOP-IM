package staff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Staff extends JFrame {
    
    public void staff() {
        setSize(900, 680);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JPanel movie = new JPanel();
        movie.setLayout(null);
        add(movie);
        movie.setBackground(Color.gray);
        movie.setSize(new Dimension(300,680));
        
        JLabel avlM = new JLabel("AVAILABLE MOVIES");
        movie.add(avlM);
        avlM.setFont(new Font("Courier",Font.BOLD,15));
        avlM.setBounds(80, 10, 150, 30);
        
        JPanel movies = new JPanel();
        movies.setLayout(null);
        movie.add(movies);
        movies.setBackground(Color.LIGHT_GRAY);
        movies.setBorder(BorderFactory.createLineBorder(Color.black));
        movies.setSize(new Dimension(280,580));
        movies.setBounds(10, 50, 280, 580);
        
        JLabel movie1 = new JLabel("Parasite");
        movies.add(movie1);
        ImageIcon poster1 = new ImageIcon("m1.png");
        JLabel m1 = new JLabel(poster1);
        movies.add(m1);
        m1.setBounds(20, 15, 100, 140);
        movie1.setBounds(45, 155, 150, 30);
        
        JLabel movie2 = new JLabel("Taxi Driver");
        movies.add(movie2);
        ImageIcon poster2 = new ImageIcon("m2.png");
        JLabel m2 = new JLabel(poster2);
        movies.add(m2);
        m2.setBounds(160, 15, 100, 140);
        movie2.setBounds(180, 155, 150, 30);
        
        JLabel movie3 = new JLabel("Seven");
        movies.add(movie3);
        ImageIcon poster3 = new ImageIcon("m3.png");
        JLabel m3 = new JLabel(poster3);
        movies.add(m3);
        m3.setBounds(20, 185, 100, 140);
        movie3.setBounds(50, 325, 150, 30);
        
        JLabel movie4 = new JLabel("Nope");
        movies.add(movie4);
        ImageIcon poster4 = new ImageIcon("m4.png");
        JLabel m4 = new JLabel(poster4);
        movies.add(m4);
        m4.setBounds(160, 185, 100, 140);
        movie4.setBounds(195, 325, 150, 30);
        
        JLabel movie5 = new JLabel("Memento");
        movies.add(movie5);
        ImageIcon poster5 = new ImageIcon("m5.png");
        JLabel m5 = new JLabel(poster5);
        movies.add(m5);
        m5.setBounds(20, 355, 100, 140);
        movie5.setBounds(45, 495, 150, 30);
        
        JLabel movie6 = new JLabel("Home Alone");
        movies.add(movie6);
        ImageIcon poster6 = new ImageIcon("m6.png");
        JLabel m6 = new JLabel(poster6);
        movies.add(m6);
        m6.setBounds(160, 355, 100, 140);
        movie6.setBounds(175, 495, 150, 30);
        
        JButton logOut = new JButton("Logout");
        movie.add(logOut);
        logOut.setBounds(75, 580, 150, 30);
        
        m1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie1();
            }
        });
        
        m2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie2();
            }
        });
        
        m3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie3();
            }
        });
        
        m4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie4();
            }
        });
        
        m5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie5();
            }
        });
        
        m6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.movie6();
            }
        });
        
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(logOut.getActionCommand().equals("Logout")) {
                    JOptionPane.showMessageDialog(null, "You have logged out successfully", "Logout", JOptionPane.YES_OPTION);
                    System.exit(0);
                }
            }
        });
    }
}
