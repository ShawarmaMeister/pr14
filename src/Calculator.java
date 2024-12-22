import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field;
    JButton addButton, subtractButton, multiplyButton, divideButton;

    public Calculator() {
        setTitle("Калькулятор");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Первое число:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Второе число:"));
        num2Field = new JTextField();
        add(num2Field);

        addButton = new JButton("Сложить");
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("Вычесть");
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new JButton("Умножить");
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("Разделить");
        divideButton.addActionListener(this);
        add(divideButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        }

        JOptionPane.showMessageDialog(this, "Результат: " + result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}