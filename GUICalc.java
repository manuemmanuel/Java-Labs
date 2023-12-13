/*Java program that works as a simple calculator. Arrange Buttons for digits and
the + - * % operations properly. Add a text field to display the result. Handle any possible
exceptions like divide by zero. Use Java Swing.*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GUICalc extends JFrame implements ActionListener {
    JButton numberButtons[] = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    int operand1, operand2;
    char operator;
    JTextField resultField;

    GUICalc() {
        JFrame frame = new JFrame("GUI CALCULATOR");
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 5));

        for (int i = 9; i >= 0; i--) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        clearButton = new JButton("C");
        buttonPanel.add(clearButton);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        addButton = new JButton("+");
        buttonPanel.add(addButton);
        addButton.addActionListener(this);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[1]);
        subtractButton = new JButton("-");
        buttonPanel.add(subtractButton);
        subtractButton.addActionListener(this);
        buttonPanel.add(numberButtons[0]);
       
        multiplyButton = new JButton("x");
        buttonPanel.add(multiplyButton);
        multiplyButton.addActionListener(this);
        divideButton = new JButton("%");
        buttonPanel.add(divideButton);
        divideButton.addActionListener(this);
        equalsButton = new JButton("=");
        buttonPanel.add(equalsButton);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        resultField = new JTextField(20);
        resultField.setPreferredSize(new Dimension(100, 50));

        add(buttonPanel, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);

        setVisible(true);
        setSize(300, 350);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == clearButton) {
            operand1 = operand2 = 0;
            resultField.setText("");
        } else if (clickedButton == equalsButton) {
            operand2 = Integer.parseInt(resultField.getText());
            evaluate();
            resultField.setText(String.valueOf(operand1));
            operand1 = 0; // Reset operand1 for future calculations
        } else {
            boolean isOperator = false;
            if (clickedButton == addButton) {
                operator = '+';
                isOperator = true;
            }
            if (clickedButton == subtractButton) {
                operator = '-';
                isOperator = true;
            }
            if (clickedButton == multiplyButton) {
                operator = 'x';
                isOperator = true;
            }
            if (clickedButton == divideButton) {
                operator = '%';
                isOperator = true;
            }

            if (!isOperator) {
                for (int i = 0; i < 10; i++) {
                    if (clickedButton == numberButtons[i]) {
                        String currentText = resultField.getText();
                        currentText += i;
                        resultField.setText(currentText);
                    }
                }
            } else {
                operand1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

    void evaluate() {
        switch (operator) {
            case '+':
                operand1 += operand2;
                break;
            case '-':
                operand1 -= operand2;
                break;
            case 'x':
                operand1 *= operand2;
                break;
            case '%':
                if (operand2 != 0) {
                    operand1 %= operand2;
                } else {
                    resultField.setText("Error: Divide by zero");
                }
                break;
        }
    }

    public static void main(String[] args) {
        new GUICalc();
    }
}
