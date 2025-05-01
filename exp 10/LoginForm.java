import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
       
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(4, 2, 10, 10));

       
        JLabel userLabel = new JLabel("Username:");
        userTextField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        passField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        messageLabel = new JLabel("");

        
        add(userLabel);
        add(userTextField);
        add(passLabel);
        add(passField);
        add(new JLabel("")); l
        add(loginButton);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = String.valueOf(passField.getPassword());

        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid credentials.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}
