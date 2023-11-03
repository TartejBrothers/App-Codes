import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class q7 extends Applet {

    public void paint(Graphics g) {
        int row, col;
        int x, y;

        for (row = 0; row < 8; row++) {
            for (col = 0; col < 8; col++) {
                x = col * 50; // Adjust the square size as needed
                y = row * 50;

                if ((row + col) % 2 == 0) {
                    g.setColor(Color.white);
                } else {
                    g.setColor(Color.black);
                }

                g.fillRect(x, y, 50, 50);
            }
        }
    }
}
