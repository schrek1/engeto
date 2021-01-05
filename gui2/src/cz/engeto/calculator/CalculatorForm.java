package cz.engeto.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorForm extends JFrame {
    private JPanel rootPanel;
    private JButton CEButton;
    private JButton cButton;
    private JButton bDivide;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton bMultiply;
    private JButton a4Button;
    private JButton a1Button;
    private JButton bSwichSign;
    private JButton a5Button;
    private JButton a6Button;
    private JButton bMinus;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton bComma;
    private JButton bPlus;
    private JButton bEquals;
    private JLabel output;

    private String firstNumber, secondNumber;

    private Operation operation;

    public CalculatorForm() {
        add(rootPanel);
        pack();
        setResizable(false);
        setTitle("Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        bComma.addActionListener(e -> commaButtonClick());

        a0Button.addActionListener(e -> numberButtonClick(0));
        a1Button.addActionListener(e -> numberButtonClick(1));
        a2Button.addActionListener(e -> numberButtonClick(2));
        a3Button.addActionListener(e -> numberButtonClick(3));
        a4Button.addActionListener(e -> numberButtonClick(4));
        a5Button.addActionListener(e -> numberButtonClick(5));
        a6Button.addActionListener(e -> numberButtonClick(6));
        a7Button.addActionListener(e -> numberButtonClick(7));
        a8Button.addActionListener(e -> numberButtonClick(8));
        a9Button.addActionListener(e -> numberButtonClick(9));

        bDivide.addActionListener(e -> operationButtonClick(Operation.DIVIDE));
        bMultiply.addActionListener(e -> operationButtonClick(Operation.MULTIPLY));
        bPlus.addActionListener(e -> operationButtonClick(Operation.ADD));
        bMinus.addActionListener(e -> operationButtonClick(Operation.SUBTRACT));

        bEquals.addActionListener(e -> equalButtonClicked());
    }

    private void commaButtonClick() {
        if (operation == null) {
            if (firstNumber == null) {
                firstNumber = "0.";
            }

            if (!firstNumber.contains(".")) {
                firstNumber = firstNumber + ".";
                output.setText(firstNumber);
            }
        } else {
            if (secondNumber == null) {
                secondNumber = "0.";
                return;
            }

            if (!secondNumber.contains(".")) {
                secondNumber = secondNumber + ".";
                output.setText(secondNumber);
            }
        }
    }

    private void equalButtonClicked() {
        if (firstNumber != null && operation != null && secondNumber != null) {
            double first = Double.parseDouble(firstNumber);
            double second = Double.parseDouble(secondNumber);
            double result = operation.calculate(first, second);

            output.setText(String.valueOf(result));

            firstNumber = null;
            operation = null;
            secondNumber = null;
        }
    }

    private void operationButtonClick(Operation operation) {
        if (firstNumber != null) {
            this.operation = operation;
            output.setText("");
        }
    }

    private void numberButtonClick(int value) {
        if (operation == null) {
            firstNumber = firstNumber != null ? firstNumber + value : String.valueOf(value);
            output.setText(firstNumber);
        } else {
            secondNumber = secondNumber != null ? secondNumber + value : String.valueOf(value);
            output.setText(secondNumber);
        }
    }
}
