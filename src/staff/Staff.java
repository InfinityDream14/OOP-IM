package staff;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Staff extends JFrame {
    
    Staff() {
        setSize(900, 680);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void movies() {
        JPanel left = new JPanel();
        left.setLayout(null);
        add(left);
        left.setBackground(Color.GRAY);
        left.setSize(new Dimension(300,680));
        left.setBounds(0, 0, 300, 680);
        
        JLabel avlM = new JLabel("AVAILABLE MOVIES");
        left.add(avlM);
        avlM.setFont(new Font("Courier",Font.BOLD,15));
        avlM.setBounds(80, 10, 150, 30);
        
        JPanel movies = new JPanel();
        movies.setLayout(null);
        left.add(movies);
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
        left.add(logOut);
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
     
    public void ticklist() {
        JPanel middle = new JPanel();
        middle.setLayout(null);
        add(middle);
        middle.setBackground(Color.DARK_GRAY);
        middle.setSize(new Dimension(300,680));
        middle.setBounds(300, 0, 300, 680);
        
        JLabel tl = new JLabel("TICKET LIST");
        middle.add(tl);
        tl.setBounds(90, 0, 300, 50);
        tl.setFont(new Font("Ariel",Font.BOLD,20));
        tl.setForeground(Color.WHITE);
        
        JPanel tlist = new JPanel();
        tlist.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        middle.add(tlist);
        tlist.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tlist.setBackground(Color.WHITE);
        tlist.setSize(new Dimension(280,530));
        tlist.setBounds(10, 50, 280,530);
        
        JPanel ticketno = new JPanel();
        ticketno.setLayout(new FlowLayout());
        tlist.add(ticketno);
        ticketno.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ticketno.setBackground(Color.red);
        ticketno.setSize(200, 100);
        
        
        
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.LEFT, 40,10));
        middle.add(footer);
        footer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        footer.setBackground(Color.WHITE);
        footer.setSize(new Dimension(280,50));
        footer.setBounds(10, 580, 280,50);
        JButton clr = new JButton("CLEAR");
        JButton ctn = new JButton("CONTINUE");
        footer.add(clr);
        footer.add(ctn);
        
    }
    
    public void inticlist(){
        
    }
    public void receipt() {
        JPanel right = new JPanel();
        right.setLayout(null);
        add(right);
        right.setBackground(Color.GRAY);
        right.setSize(new Dimension(300,680));
        right.setBounds(600, 0, 300, 680);
        
        JPanel resibo = new JPanel();
        resibo.setLayout(null);
        right.add(resibo);
        resibo.setBackground(Color.WHITE);
        resibo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resibo.setSize(new Dimension(260,420));
        resibo.setBounds(10, 90, 260, 420);
        
        JLabel rob1 = new JLabel("ROBINSON");
        resibo.add(rob1);
        rob1.setBounds(75, 10, 200, 30);
        rob1.setFont(new Font("Ariel",Font.BOLD,20));
        
        JLabel rob2 = new JLabel("ROBINSON PLACE MALOLOS");
        resibo.add(rob2);
        rob2.setBounds(45, 30, 200, 30);
        
        JLabel date = new JLabel("DATE:");
        resibo.add(date);
        date.setBounds(10, 65, 100, 30);
        
        JLabel time = new JLabel("TIME:");
        resibo.add(time);
        time.setBounds(10, 85, 100, 30);
        
        JLabel cashier = new JLabel("CASHIER:");
        resibo.add(cashier);
        cashier.setBounds(10, 105, 100, 30);
        
        JLabel mTitle = new JLabel("MOVIE:");
        resibo.add(mTitle);
        mTitle.setFont(new Font("Ariel",Font.BOLD,15));
        mTitle.setBounds(20, 145, 200, 30);
        
        JLabel seat = new JLabel("SEAT#");
        resibo.add(seat);
        seat.setFont(new Font("Ariel",Font.BOLD,15));
        seat.setBounds(190, 145, 200, 30);
        
        JPanel square = new JPanel();
        square.setLayout(null);
        resibo.add(square);
        square.setBackground(Color.WHITE);
        square.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        square.setSize(new Dimension(220,120));
        square.setBounds(20, 170, 220, 120);
        
        JLabel price = new JLabel("PRICE");
        square.add(price);
        price.setBounds(5, 5, 100, 30);
        
        JLabel ticket = new JLabel("TICKET NO.");
        square.add(ticket);
        ticket.setBounds(5, 25, 100, 30);
        
        JLabel tax1 = new JLabel("TAX");
        square.add(tax1);
        tax1.setBounds(5, 45, 100, 30);
        
        JLabel tax2 = new JLabel("TAX ULET");
        square.add(tax2);
        tax2.setBounds(5, 65, 100, 30);
        
        JLabel total = new JLabel("TOTAL");
        square.add(total);
        total.setBounds(5, 85, 100, 30);
        
        JLabel reserve = new JLabel("RESERVE SEATING");
        resibo.add(reserve);
        reserve.setBounds(20, 290, 150, 30);
        
        JLabel info = new JLabel("BUYERS INFORMATION:");
        resibo.add(info);
        info.setBounds(20, 310, 150, 30);
        
        JLabel name = new JLabel("Name:_________________________");
        resibo.add(name);
        name.setBounds(20, 330, 300, 30);
        
        JLabel address = new JLabel("Address:_______________________");
        resibo.add(address);
        address.setBounds(20, 350, 300, 30);
        
        JLabel tin = new JLabel("TIN:___________________________");
        resibo.add(tin);
        tin.setBounds(20, 370, 300, 30);
    }
}