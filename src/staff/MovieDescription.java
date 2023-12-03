package staff;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

public class MovieDescription extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JLabel mDescription = new JLabel("MOVIE DETAILS");
    JLabel title = new JLabel("Title:");
    JLabel director = new JLabel("Director:");
    JLabel duration = new JLabel("Duration:");
    JLabel genre = new JLabel("Genre:");
    JLabel timeAvail = new JLabel("TIME AVAILABLE");
    JLabel seatsav = new JLabel("Seats Available");
    JButton backBtn = new JButton("Back");
    JButton time1 = new JButton();
    JButton time2 = new JButton();
    Staff stf= new Staff();
    JButton conf = new JButton("Proceed to payment");
    JButton st = new JButton();
    ButtonGroup bg1 = new ButtonGroup();
    JTextField jtf = new JTextField(2);
    ImageIcon sicon = new ImageIcon("seat.png");
    JRadioButton jr = new JRadioButton();
    public int ctr=0;
    
    public void Moviedes() {
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
        title.setBounds(55, 330, 100, 30);
        panel2.add(director);
        director.setBounds(55, 360, 100, 30);
        panel2.add(duration);
        duration.setBounds(55, 390, 100, 30);
        panel2.add(genre);
        genre.setBounds(55, 420, 100, 30);
        
        backBtn.addActionListener(this);
        
        panel3.setLayout(null);
        add(panel3);
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setSize(new Dimension(300,600));
        panel3.setBounds(300, 0, 484, 600);
        
        panel4.setLayout(null);
        panel3.add(panel4);
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel4.setSize(new Dimension(465,50));
        panel4.setBounds(10, 10, 465, 50);
        panel4.add(timeAvail);
        timeAvail.setFont(new Font("Courier",Font.BOLD,13));
        timeAvail.setBounds(50, 13, 150, 25);
        
        panel5.setLayout(null); //simula dito yung para sa panel ng seats
        panel3.add(panel5);
        seatsav.setBounds(190, 10, 150, 25);
        panel5.add(seatsav);
        panel5.setBackground(Color.LIGHT_GRAY);
        panel5.setBorder(BorderFactory.createLineBorder(Color.black));
        panel5.setSize(new Dimension(465,430));
        panel5.setBounds(10, 65, 465, 430);
        
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        fl.setVgap(12);
        fl.setHgap(35);
        panel6.setLayout(fl); //para sa footer
        panel3.add(panel6);
        JLabel not = new JLabel("Number of Tickets: ");
        not.setFont(new Font("Courier",Font.BOLD,15));
        jtf.setEditable(false);
        panel6.add(not);
        panel6.add(jtf);
        panel6.setBackground(Color.LIGHT_GRAY);
        panel6.setBorder(BorderFactory.createLineBorder(Color.black));
        panel6.setSize(new Dimension(465,50));
        panel6.setBounds(10, 500, 465, 50);
        panel6.add(conf);
        time1.addActionListener(this);
        time2.addActionListener(this);
        
        conf.addActionListener(this);
    }
    public void seatarr(){
        FlowLayout f = new FlowLayout(FlowLayout.LEFT);
        JPanel sofb =new JPanel();
        sofb.setBackground(Color.LIGHT_GRAY);
        sofb.setBorder(BorderFactory.createLineBorder(Color.black));
        sofb.setSize(new Dimension(435,360));
        sofb.setBounds(15, 55, 435, 360);
        f.setHgap(22);
        f.setVgap(28);
        sofb.setLayout(f);
        panel5.add(sofb);
        for(int i =1; i<37; i++){
            jr.setSize(20,10);
            String cn="";
            if(i>9){
                cn = Integer.toString(i);
            }
            else
                cn = "0" + Integer.toString(i);
            jr = new JRadioButton(cn,sicon);
            //bg1.add(jr);
            sofb.add(jr);
            jr.addActionListener(this);
        }
 
    } //ito gumagawa ng 40 buttons
    
    public void movie1() {
        ImageIcon p1 = new ImageIcon("movie1.png");
        JLabel movie1 = new JLabel(p1);
        panel2.add(movie1);
        movie1.setBounds(30, 0, 220, 360);
        
        JLabel t1 = new JLabel("Parasite");
        panel2.add(t1);
        t1.setBounds(140, 330, 200, 30);
        
        JLabel dir1 = new JLabel("Bong Joon-ho");
        panel2.add(dir1);
        dir1.setBounds(140, 360, 200, 30);
        
        JLabel dur1 = new JLabel("2:12:00");
        panel2.add(dur1);
        dur1.setBounds(140, 390, 200, 30);
        
        JLabel g1 = new JLabel("Thriller");
        panel2.add(g1);
        g1.setBounds(140, 420, 200, 30);
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("1:00 PM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("3:00 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }
    
    public void movie2() {
        ImageIcon p2 = new ImageIcon("movie2.png");
        JLabel movie2 = new JLabel(p2);
        panel2.add(movie2);
        movie2.setBounds(30, 0, 220, 360);
        
        JLabel t2 = new JLabel("Taxi Driver");
        panel2.add(t2);
        t2.setBounds(140, 330, 200, 30);
        
        JLabel dir2 = new JLabel("Martin Scorses");
        panel2.add(dir2);
        dir2.setBounds(140, 360, 200, 30);
        
        JLabel dur2 = new JLabel("1:54:00");
        panel2.add(dur2);
        dur2.setBounds(140, 390, 200, 30);
        
        JLabel g2 = new JLabel("Neo-noir");
        panel2.add(g2);
        g2.setBounds(140, 420, 200, 30);
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("3:30 PM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("5:30 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }
    
    public void movie3() {
        ImageIcon p3 = new ImageIcon("movie3.png");
        JLabel movie3 = new JLabel(p3);
        panel2.add(movie3);
        movie3.setBounds(30, 0, 220, 360);
        
        JLabel t3 = new JLabel("Seven");
        panel2.add(t3);
        t3.setBounds(140, 330, 200, 30);
        
        JLabel dir3 = new JLabel("David Fincher");
        panel2.add(dir3);
        dir3.setBounds(140, 360, 200, 30);
        
        JLabel dur3 = new JLabel("2:07:00");
        panel2.add(dur3);
        dur3.setBounds(140, 390, 200, 30);
        
        JLabel g3 = new JLabel("Crime");
        panel2.add(g3);
        g3.setBounds(140, 420, 200, 30);
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("10:30 AM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("12:30 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }
    
    public void movie4() {
        ImageIcon p4 = new ImageIcon("movie4.png");
        JLabel movie4 = new JLabel(p4);
        panel2.add(movie4);
        movie4.setBounds(30, 0, 220, 360);
        
        JLabel t4 = new JLabel("Nope");
        panel2.add(t4);
        t4.setBounds(140, 330, 200, 30);
        
        JLabel dir4 = new JLabel("Jordan Peele");
        panel2.add(dir4);
        dir4.setBounds(140, 360, 200, 30);
        
        JLabel dur4 = new JLabel("2:10:00");
        panel2.add(dur4);
        dur4.setBounds(140, 390, 200, 30);
        
        JLabel g4 = new JLabel("Horror");
        panel2.add(g4);
        g4.setBounds(140, 420, 200, 30);
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("5:00 PM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("7:00 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }
    
    public void movie5() {
        ImageIcon p5 = new ImageIcon("movie5.png");
        JLabel movie5 = new JLabel(p5);
        panel2.add(movie5);
        movie5.setBounds(30, 0, 220, 360);
        
        JLabel t5 = new JLabel("Memento");
        panel2.add(t5);
        t5.setBounds(140, 330, 200, 30);
        
        JLabel dir5 = new JLabel("Christopher Nolan");
        panel2.add(dir5);
        dir5.setBounds(140, 360, 200, 30);
        
        JLabel dur5 = new JLabel("1:53:00");
        panel2.add(dur5);
        dur5.setBounds(140, 390, 200, 30);
        
        JLabel g5 = new JLabel("Mystery");
        panel2.add(g5);
        g5.setBounds(140, 420, 200, 30);
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("11:30 AM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("1:30 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }
    
    public void movie6() {
        ImageIcon p6 = new ImageIcon("movie6.png");
        JLabel movie6 = new JLabel(p6);
        panel2.add(movie6);
        movie6.setBounds(30, 0, 220, 360);
        
        JLabel t6 = new JLabel("Home Alone");
        panel2.add(t6);
        t6.setBounds(140, 330, 200, 30);
        
        JLabel dir6 = new JLabel("Chris Columbus");
        panel2.add(dir6);
        dir6.setBounds(140, 360, 200, 30);
        
        JLabel dur6 = new JLabel("1:43:00");
        panel2.add(dur6);
        dur6.setBounds(140, 390, 200, 30);
        
        JLabel g6 = new JLabel("Comedy");
        
        panel2.add(backBtn);
        backBtn.setBounds(100, 460, 80, 25);
        
        panel4.add(time1);
        time1.setText("2:00 PM");
        time1.setBounds(200, 10, 100, 30);
        panel4.add(time2);
        time2.setText("4:00 PM");
        time2.setBounds(320, 10, 100, 30);
        
        seatarr();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Back")) {
            setVisible(false);
        }
        if(e.getSource()== time1){
            time1.setBackground(Color.WHITE);
            time2.setBackground(null);
        }
        if(e.getSource()== time2){
            time2.setBackground(Color.WHITE);
            time1.setBackground(null);
        }
       
        AbstractButton src = (AbstractButton)e.getSource();
        String lm = src.getText();
      if (containsNumber(lm)&& !(csc(lm))&& !(src.getBackground()== Color.CYAN)) {
            this.ctr++;
            src.setBackground(Color.cyan);
        }
      else if(src.getBackground()== Color.CYAN){
          src.setBackground(Color.WHITE);
          this.ctr--;
      }
      if(e.getSource()== conf){
            String sctr = Integer.toString(ctr);
            jtf.setText(sctr);
            int input = JOptionPane.showOptionDialog(null, "Total Tickets "+ ctr, "Order Confirmation", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(input == JOptionPane.OK_OPTION){
                stf.ctg = this.ctr;
                setVisible(false);
            }
            else if (input == JOptionPane.CANCEL_OPTION){
                
            }
        }

    }
    public static boolean containsNumber(String buttonText) {
        return buttonText.matches(".*\\d+.*");
    }
    public static boolean csc(String buttonText) {
        // Regular expression to check if the button text contains any special character
        Pattern specialCharacterPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = specialCharacterPattern.matcher(buttonText);
        return matcher.find();
    }
        

}