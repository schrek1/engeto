package cz.engeto.java.gui.hello;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm extends JFrame {
    private JPanel rootPanel;
    private JTextField textInput;
    private JButton actionButton;
    private JLabel errorMessage;

    public HelloWorldForm() {
        add(rootPanel);
        setSize(400, 200);
        setTitle("Hello world");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        actionButton.addActionListener(actionEvent -> {
            String userName = textInput.getText();
            if (userName == null || userName.isBlank()) {
                errorMessage.setText("Chybi jmeno!");
                errorMessage.setVisible(true);
                textInput.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            } else {
                errorMessage.setVisible(false);
                errorMessage.setText(null);
                textInput.setBorder(null);
                JOptionPane.showMessageDialog(
                        HelloWorldForm.this,
                        "Ahoj " + userName + "!",
                        "Pozdrav",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}
