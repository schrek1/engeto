package cz.engeto.java.gui.hello;

import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class HelloMain {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // optional

        SwingUtilities.invokeLater(() -> new HelloWorldForm().setVisible(true));
    }

}
