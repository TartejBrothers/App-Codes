import java.awt.*;
import java.applet.*;

public class q6 extends Applet {
    public void paint(Graphics g) {
        // Draw an oval
        g.setColor(Color.red);
        g.fillOval(100, 100, 200, 200);

        g.setColor(Color.blue);
        g.fillRect(300, 100, 200, 200);

        g.setColor(Color.green);
        g.drawLine(100, 100, 300, 300);
    }
}
w