import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedSeconds = 0;

    public StopWatch() {
        setTitle("Simple Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));


        timeLabel = new JLabel("Elapsed Time: 0s", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel, BorderLayout.CENTER);

     
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);


        timer = new Timer(1000, e -> {
            elapsedSeconds++;
            timeLabel.setText("Elapsed Time: " + elapsedSeconds + "s");
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            timer.start();
        } else if (source == stopButton) {
            timer.stop();
        } else if (source == resetButton) {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("Elapsed Time: 0s");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StopWatch());
    }
}

