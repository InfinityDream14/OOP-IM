package staff;

import java.awt.*;
import javax.swing.*;

public class Seat extends MovieDescription {
    
    public void availTime() {
        JPanel timeAvail = new JPanel();
        panel3.add(timeAvail);
        timeAvail.setLayout(null);
        timeAvail.setBackground(Color.blue);
        timeAvail.setBorder(BorderFactory.createLineBorder(Color.black));
        timeAvail.setSize(new Dimension(500,100));
        timeAvail.setBounds(500, 50, 500, 100);
    }
}
