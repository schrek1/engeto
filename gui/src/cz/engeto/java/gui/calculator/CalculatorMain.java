package cz.engeto.java.gui.calculator;

import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CalculatorMain {

    public static void main(String[] args) {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // optional

        SwingUtilities.invokeLater(() -> new CalculatorForm().setVisible(true));
    }
}
