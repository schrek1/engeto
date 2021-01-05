package cz.engeto.java.gui.calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorForm extends JFrame {
    private JButton bClearEntry;
    private JButton bClear;
    private JButton nbSeven;
    private JButton nbEight;
    private JButton nbNine;
    private JButton bDivide;
    private JButton nbFour;
    private JButton nbFive;
    private JButton nbSix;
    private JButton bMultiply;
    private JButton nbOne;
    private JButton nbTwo;
    private JButton nbThree;
    private JButton bMinus;
    private JButton bChangeSign;
    private JButton nbZero;
    private JButton bComma;
    private JButton bPlus;
    private JPanel rootPanel;
    private JButton bEquals;
    private JLabel output;

    private String firstNumber;
    private String secondNumber;

    private Operation operation;

    public CalculatorForm() {
        add(rootPanel);
        pack();
        setResizable(false);
        setTitle("Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        bComma.addActionListener(e -> commaButtonClick());
        nbZero.addActionListener(e -> numberButtonClick(0));
        nbOne.addActionListener(e -> numberButtonClick(1));
        nbTwo.addActionListener(e -> numberButtonClick(2));
        nbThree.addActionListener(e -> numberButtonClick(3));
        nbFour.addActionListener(e -> numberButtonClick(4));
        nbFive.addActionListener(e -> numberButtonClick(5));
        nbSix.addActionListener(e -> numberButtonClick(6));
        nbSeven.addActionListener(e -> numberButtonClick(7));
        nbEight.addActionListener(e -> numberButtonClick(8));
        nbNine.addActionListener(e -> numberButtonClick(9));

        bPlus.addActionListener(e -> operationButtonClick(Operation.ADD));
        bMinus.addActionListener(e -> operationButtonClick(Operation.SUBTRACT));
        bMultiply.addActionListener(e -> operationButtonClick(Operation.MULTIPLY));
        bDivide.addActionListener(e -> operationButtonClick(Operation.DIVIDE));

        bEquals.addActionListener(e -> equalsButtonClicked());
    }


    private void equalsButtonClicked() {
        if (firstNumber != null && secondNumber != null && operation != null) {
            double first = Double.parseDouble(firstNumber);
            double second = Double.parseDouble(secondNumber);
            double result = operation.calculate(first, second);

            output.setText(String.valueOf(result));

            firstNumber = null;
            secondNumber = null;
            operation = null;
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


    private void commaButtonClick() {
        if (operation == null) {
            if (firstNumber != null && !firstNumber.contains(".")) {
                firstNumber = firstNumber + ".";
                output.setText(firstNumber);
            }
        } else {
            if (secondNumber != null && !secondNumber.contains(".")) {
                secondNumber = secondNumber + ".";
                output.setText(secondNumber);
            }
        }
    }


}
