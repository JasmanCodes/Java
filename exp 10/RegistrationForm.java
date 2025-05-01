import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameError, emailError, passwordError, confirmPasswordError, statusMessage;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("User Registration");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 3, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameError = new JLabel("");
        nameError.setForeground(Color.RED);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailError = new JLabel("");
        emailError.setForeground(Color.RED);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordError = new JLabel("");
        passwordError.setForeground(Color.RED);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        confirmPasswordError = new JLabel("");
        confirmPasswordError.setForeground(Color.RED);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        statusMessage = new JLabel("");
        statusMessage.setHorizontalAlignment(JLabel.CENTER);

  
        add(nameLabel);
        add(nameField);
        add(nameError);

        add(emailLabel);
        add(emailField);
        add(emailError);

        add(passwordLabel);
        add(passwordField);
        add(passwordError);

        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(confirmPasswordError);

        add(new JLabel("")); 
        add(registerButton);
        add(new JLabel("")); 

        add(statusMessage);
        add(new JLabel(""));
        add(new JLabel(""));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        nameError.setText("");
        emailError.setText("");
        passwordError.setText("");
        confirmPasswordError.setText("");
        statusMessage.setText("");

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        boolean valid = true;

        if (name.isEmpty()) {
            nameError.setText("Name is required.");
            valid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email is required.");
            valid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email format.");
            valid = false;
        }

        if (password.isEmpty()) {
            passwordError.setText("Password is required.");
            valid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmPasswordError.setText("Please confirm password.");
            valid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPasswordError.setText("Passwords do not match.");
            valid = false;
        }

        if (valid) {
            statusMessage.setForeground(new Color(0, 128, 0)); // Dark green
            statusMessage.setText("Registration successful!");
        } else {
            statusMessage.setForeground(Color.RED);
            statusMessage.setText("Please correct the errors above.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}
