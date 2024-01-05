package Yong;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
@SuppressWarnings("all")
public class CalculatorGUI extends JFrame implements ActionListener, KeyListener {
    private JTextField displayField;
    private boolean isResultDisplayed;

    public CalculatorGUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        addKeyListener(this);

        
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.addKeyListener(this);
        add(displayField, BorderLayout.NORTH);

      
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 4));

     
        for (int i = 1; i <= 9; i++) {
            JButton numberButton = new JButton(Integer.toString(i));
            numberButton.addActionListener(this);
            buttonsPanel.add(numberButton);
        }

      
        String[] operators = {"+", "-", "*", "/", "%", "="};
        for (String operator : operators) {
            JButton operatorButton = new JButton(operator);
            operatorButton.addActionListener(this);
            buttonsPanel.add(operatorButton);
        }

       
        add(buttonsPanel, BorderLayout.CENTER);

        
        pack();
        setVisible(true);
        requestFocus();
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        String currentText = displayField.getText();

        
        if (actionCommand.equals("=")) {
            
            try {
                double result = evaluateExpression(currentText);
                displayField.setText(Double.toString(result));
                isResultDisplayed = true;
            } catch (ArithmeticException | IllegalArgumentException ex) {
                displayField.setText("Error");
                isResultDisplayed = true;
            }
        } else {
            if (isResultDisplayed) {
                displayField.setText(actionCommand);
                isResultDisplayed = false;
            } else {
                displayField.setText(currentText + actionCommand);
            }
        }
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        String currentText = displayField.getText();

        
        if (Character.isDigit(keyChar) || "+-*/%=".indexOf(keyChar) >= 0) {
            if (isResultDisplayed) {
                displayField.setText(Character.toString(keyChar));
                isResultDisplayed = false;
            } else {
                displayField.setText(currentText + keyChar);
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        
    }

    public void keyReleased(KeyEvent e) {
       
    }

    private double evaluateExpression(String expression) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new IllegalArgumentException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm(); 
                        else if (eat('-')) x -= parseTerm(); 
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('*')) x *= parseFactor(); 
                        else if (eat('/')) x /= parseFactor(); 
                        else if (eat('%')) x %= parseFactor(); 
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); 
                    if (eat('-')) return -parseFactor(); 

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { 
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { 
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new IllegalArgumentException("Unexpected: " + (char) ch);
                    }

                    return x;
                }
            }.parse();
        } catch (Exception e) {
            throw new ArithmeticException("Invalid expression");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI();
            }
        });
    }
}
