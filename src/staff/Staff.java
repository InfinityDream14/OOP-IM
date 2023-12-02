package staff;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Staff extends JFrame implements ActionListener{
    
    public void mainframe() {
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
                md.Moviedes();
                md.movie1();
            }
        });
        
        m2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.Moviedes();
                md.movie2();
            }
        });
        
        m3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.Moviedes();
                md.movie3();
            }
        });
        
        m4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.Moviedes();
                md.movie4();
            }
        });
        
        m5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.Moviedes();
                md.movie5();
            }
        });
        
        m6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MovieDescription md = new MovieDescription();
                md.Moviedes();
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
    
        //declaration para sa ticket list
        JLabel stno = new JLabel("0");
        final JPanel tlist = new JPanel();
        JButton get = new JButton();
        
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
        
        middle.add(tlist);
        tlist.setLayout(new FlowLayout(FlowLayout.CENTER,0,5));
        //tlist.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //tlist.setBackground(Color.WHITE);
        tlist.setPreferredSize(new Dimension(260,900));
        tlist.setBounds(10, 50, 280,530);
        JScrollPane scrollPane = new JScrollPane(tlist);
        scrollPane.setMinimumSize(new Dimension(10, 10));
        scrollPane.setPreferredSize(new Dimension(285,300));
        scrollPane.setBounds(8, 50, 285, 530);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setOpaque(false);
        middle.add(scrollPane);
        
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.LEFT, 14,10));
        middle.add(footer);
        footer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //footer.setBackground(Color.WHITE);
        footer.setOpaque(false);
        footer.setSize(new Dimension(280,50));
        footer.setBounds(10, 580, 280,50);
        JButton clr = new JButton("CLEAR");
        JButton ctn = new JButton("CONTINUE");
        JButton shw = new JButton("LIST");
        footer.add(shw);
        footer.add(clr);
        footer.add(ctn);
        MovieDescription md = new MovieDescription();
        
        shw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()== shw) {
                int i =1;
                //ticklist();
                receipt();
                while(i<=md.ctr){
                    String newn = Integer.toString(i);
                    stno.setText(newn);
                    inticlist(stno);
                    prntrct();
                    i++;
                    stno = new JLabel();
                }
                }
            }
        });
        
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()== clr) {
                }
            }
        });
        ctn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ctn.getActionCommand().equals("CONTINUE")) {
                    Payment p = new Payment();
                    p.paymentMethod();
                }
            }
        });

    }
    
    public void inticlist(JLabel stno){
        JLabel tid = new JLabel("MV202301");
        JLabel mt = new JLabel("Parasite");
        JLabel sn = new JLabel("S"+stno.getText());
        JLabel am = new JLabel("249");
        
        JPanel ticketno = new JPanel();
        ticketno.setLayout(null);
        tlist.add(ticketno);
        ticketno.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ticketno.setBackground(Color.WHITE);
        ticketno.setPreferredSize(new Dimension(248, 110));
        JLabel mid = new JLabel("Ticket ID:");
        JLabel mit = new JLabel("MOV title:");
        JLabel stn = new JLabel("Seat No:");
        JLabel amt = new JLabel("Amount:");
        mid.setBounds(110, 10, 80, 20);
        mit.setBounds(110, 30, 80, 20);
        stn.setBounds(110, 50, 80, 20);
        amt.setBounds(110, 70, 80, 20);
        ticketno.add(mid);
        ticketno.add(mit);
        ticketno.add(amt);
        ticketno.add(stn);
        
        tid.setBounds(180, 10, 80, 20);
        mt.setBounds(180, 30, 80, 20);
        sn.setBounds(180, 50, 80, 20);
        am.setBounds(180, 70, 80, 20);
        ticketno.add(tid);
        ticketno.add(mt);
        ticketno.add(am);
        ticketno.add(sn);
        
        JPanel numtl =new JPanel();
        ticketno.add(numtl);
        numtl.setLayout(new FlowLayout(FlowLayout.CENTER,1,-7));
        numtl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numtl.setBackground(Color.BLACK);
        numtl.setPreferredSize(new Dimension(89, 100));
        numtl.setBounds(10, 10, 89, 89);
        stno.setFont(new Font("Ariel",Font.BOLD,80));
        stno.setForeground(Color.WHITE);
        numtl.add(stno);
        
    }
    
    public void setter(){
        Staff f = new Staff();
        f.ticklist();
        f.inticlist(stno);
    }
        JPanel right = new JPanel();
    public void receipt() {
        right.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        add(right);
        right.setBackground(Color.GRAY);
        right.setPreferredSize(new Dimension(300,2975));
        right.setBounds(600, 0, 300, 680);
        JScrollPane scrollPane = new JScrollPane(right);
        scrollPane.setMinimumSize(new Dimension(10, 10));
        scrollPane.setPreferredSize(new Dimension(285,680));
        scrollPane.setBounds(600, 0, 285, 680);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setOpaque(false);
        add(scrollPane);
    }
    
    public void prntrct(){
        JPanel resibo = new JPanel();
        resibo.setLayout(null);
        right.add(resibo);
        resibo.setBackground(Color.WHITE);
        //resibo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resibo.setPreferredSize(new Dimension(260,420));
        //resibo.setBounds(10, 90, 260, 420);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}