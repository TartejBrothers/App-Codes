import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame {
    private JButton button;
    private JLabel label;

    public q2() {
        // Set the title of the frame
        super("ActionListener Example");
        JFrame frame = new JFrame("Button and Label Example");
        button = new JButton("Click me");
        label = new JLabel("Hello, world!");
        frame.add(button);
        frame.add(label);
        // Create an ActionListener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the button is clicked, change the text of the label
                label.setText("Button was clicked!");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        q2 frame = new q2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}