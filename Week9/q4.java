import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4 extends JFrame {
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel ageLabel;
    private JTextField ageTextField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel addressLabel;
    private JTextField addressTextField;
    private JLabel phoneNumberLabel;
    private JTextField phoneNumberTextField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JButton submitButton;

    public q4() {
        setTitle("Student Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        ageLabel = new JLabel("Age:");
        ageTextField = new JTextField();
        genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        addressLabel = new JLabel("Address:");
        addressTextField = new JTextField();
        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberTextField = new JTextField();
        emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();
        submitButton = new JButton("Submit");
        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(genderLabel);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(addressLabel);
        add(addressTextField);
        add(phoneNumberLabel);
        add(phoneNumberTextField);
        add(emailLabel);
        add(emailTextField);
        add(submitButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        q4 frame = new q4();

    }
}
