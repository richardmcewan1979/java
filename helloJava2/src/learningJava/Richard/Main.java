package learningJava.Richard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("HelloJava2");
        frame.getContentPane().add(new HelloComponent2("hello, Java!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible( true);
    }
}

class HelloComponent2 extends JComponent implements MouseMotionListener
{
    String theMessage;
    int messageX = 125, messageY = 95;

    public HelloComponent2 ( String message) {
        theMessage = message;
        addMouseListener (this);
    }

    private void addMouseListener(HelloComponent2 helloComponent2) {
    }

    public void paintComponent( Graphics g) {

        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged( MouseEvent e){
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved( MouseEvent e) {}
}
