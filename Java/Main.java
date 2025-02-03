
import java.awt.*; //using AWt for the mouse events
import java.awt.event.*;

public class Main implements MouseListener {
    Frame frame;
    Label l;

    Main(){
      
        // Creating a frame
        frame = new Frame("MouseListener Example");
      
        // Creating a label
        l = new Label("AURI(1C)-LG-6(121-123)");
      
        // Set the properties of label
        l.setBounds(70, 50, 250, 50);
        l.setAlignment(Label.CENTER);
        l.setFont(new Font("Serif", Font.BOLD, 18));
        l.setForeground(Color.BLACK);
      
        // Add label to the frame
        frame.add(l);
      
        // Now we are adding  MouseListener to the frame
        frame.addMouseListener(this);
      
        // Setting the properties of frame
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // Overriding  the abstract methods of MouseListener
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // When mouse is pressed, a green rectangle is drawn
    public void mousePressed(MouseEvent e){
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(e.getX(), e.getY(), 70, 50);
    }

    public void mouseReleased(MouseEvent e) {}

    // Main Method
    public static void main(String[] args) { new Main(); }
}
