import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Smiley Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        SmileyPanel panel = new SmileyPanel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}

class SmileyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background color
        setBackground(Color.WHITE);

        // Set the face color
        g.setColor(Color.YELLOW);

        // Draw the face (a filled oval)
        g.fillOval(100, 100, 200, 200);

        // Set the eye color
        g.setColor(Color.BLACK);

        // Draw the eyes (filled ovals)
        g.fillOval(155, 175, 15, 30);
        g.fillOval(230, 175, 15, 30);

        // Set the mouth color
        g.setColor(Color.BLACK);

        // Draw the mouth (an arc)
        g.drawArc(150, 150, 100, 100, 180, 180);
    }
}
