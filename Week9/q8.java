import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class q8 extends Applet {

    private String eventName = "";

    public void init() {
        addMouseListener(new MyMouseAdapter());
    }

    public void paint(Graphics g) {
        // Clear the applet window
        g.clearRect(0, 0, getWidth(), getHeight());

        // Display the event name at the center of the window
        g.drawString(eventName, getWidth() / 2, getHeight() / 2);
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            eventName = "Mouse Clicked";
            repaint();
        }

        public void mousePressed(MouseEvent e) {
            eventName = "Mouse Pressed";
            repaint();
        }

        public void mouseReleased(MouseEvent e) {
            eventName = "Mouse Released";
            repaint();
        }

        public void mouseEntered(MouseEvent e) {
            eventName = "Mouse Entered";
            repaint();
        }

        public void mouseExited(MouseEvent e) {
            eventName = "Mouse Exited";
            repaint();
        }
    }
}
