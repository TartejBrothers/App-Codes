import javax.swing.*;

public class q1 extends JFrame {
    public q1() {
        // Set the title of the frame
        super("My Frame");
        // Set the size of the frame
        setSize(300, 300);
        // Set the default close operation for the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add a label to the frame
        JLabel label = new JLabel("Hello, world!");
        add(label);
    }

    public static void main(String[] args) {
        // Create an instance of the MyFrame class
        q1 frame = new q1();
        // Make the frame visible
        frame.setVisible(true);
    }
}