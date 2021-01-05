package cz.engeto.java.gui.progress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import java.awt.HeadlessException;
import java.util.List;

public class ProgressForm extends JFrame {
    private JProgressBar progressBar;
    private JButton bRun;
    private JButton bSwitch;
    private JLabel labelStatus;
    private JPanel rootPanel;

    private boolean state = false;

    private boolean isRunning = false;

    public ProgressForm() {
        add(rootPanel);

        setSize(400, 200);
        setTitle("Progress");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        labelStatus.setText(String.valueOf(state));
        bSwitch.addActionListener(e -> {
            state = !state;
            labelStatus.setText(String.valueOf(state));
        });


        bRun.addActionListener(e -> buttonClick());

    }

    private synchronized void buttonClick() {
        if (!isRunning) {
            isRunning = true;
            progressBar.setValue(0);
            progressBar.setString(null);
            longTaskBadImpl()
//            longTaskGoodImpl();
//            ownImpl();
        }
    }

    private void longTaskBadImpl() {
        for (int i = 1; i <= 10; i++) {
            loadImage();
            int percentCompleted = i * 10;
            progressBar.setValue(percentCompleted);
        }
        progressBar.setString("completed");
    }

    private void ownImpl() {
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                loadImage();
                int percentCompleted = i * 10;
                SwingUtilities.invokeLater(() -> progressBar.setValue(percentCompleted));
            }
        }).start();
    }

    private void longTaskGoodImpl() {
        new SwingWorker<Boolean, Integer>() {
            @Override
            protected void process(List<Integer> chunks) {
                for (Integer chunk : chunks) {
                    progressBar.setValue(chunk);
                }
            }

            @Override
            protected void done() {
                progressBar.setString("completed");
                isRunning = false;
            }

            @Override
            protected Boolean doInBackground() {
                for (int i = 1; i <= 10; i++) {
                    loadImage();
                    int percentCompleted = i * 10;
                    publish(percentCompleted);
                }
                return true;
            }
        }.execute();
    }


    private void loadImage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
