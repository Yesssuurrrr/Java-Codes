import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    // Define the components
    TextField display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, equButton, clrButton;
    double num1, num2, result;
    char operator;

    public void init() {
        setLayout(new FlowLayout());
        display = new TextField(16);
        add(display);

        // Create number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            add(numberButtons[i]);
        }

        // Create operator buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equButton = new Button("=");
        clrButton = new Button("C");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equButton);
        add(clrButton);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.charAt(0) == 'C') {
            display.setText("");
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            display.setText(String.valueOf(result));
            num1 = result;
        } else {
            if (!display.getText().equals("")) {
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText("");
            }
        }
    }
}
