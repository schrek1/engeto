package cz.engeto.java.gui.progress;

import cz.engeto.java.gui.hello.HelloWorldForm;

import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class ProgressMain {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, InterruptedException {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // optional

        SwingUtilities.invokeLater(() -> new ProgressForm().setVisible(true));
    }

}
