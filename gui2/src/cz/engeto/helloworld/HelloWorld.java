package cz.engeto.helloworld;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HelloWorld extends JFrame {
    private JPanel rootPanel;
    private JTextField inputName;
    private JButton buttonGreeting;
    private JTextField outputName;

    private CarFinderService service;

    public HelloWorld() {
        this.service = new CarFinderService();

        add(rootPanel);
        setSize(300, 300);
        setVisible(true);

        buttonGreeting.addActionListener(actionEvent -> {
            String name = inputName.getText();
            String car = service.findCarByName(name);
            outputName.setText(car);
        });
    }
}
