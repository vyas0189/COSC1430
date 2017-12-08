import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.*;

public class Calculator extends JFrame implements ActionListener {
    private static final int NUMBER_OF_DIGITS = 30;

    private JTextField ioField;
    private double result = 0.0;

    public static void main(String[] args) {
        Calculator aCalculator = new Calculator();
        aCalculator.setVisible(true);
    }
     private Calculator(){
        initialize();
    }
    private void initialize(){
        setTitle("Simplified Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,200);
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
        ioField = new JTextField("Enter numbers here.",NUMBER_OF_DIGITS);
        ioField.setBackground(Color.WHITE);
        textPanel.add(ioField);
        add(textPanel,BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);
        JButton subButton = new JButton("-");
        subButton.addActionListener(this);
        buttonPanel.add(subButton);
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        add(buttonPanel,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            assumingCorrectNumberFormats(e);
        }catch (NumberFormatException e2){
            ioField.setText("Error: Reenter Number.");
        }
    }
    private void assumingCorrectNumberFormats(ActionEvent e){
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "+":
                result = result + stringToDouble(ioField.getText());
                ioField.setText(Double.toString(result));
                break;
            case "-":
                result = result - stringToDouble(ioField.getText());
                ioField.setText(Double.toString(result));
                break;
            case "Reset":
                result = 0.0;
                ioField.setText("0.0");
                break;
            default:
                ioField.setText("Unexpected error");
                break;
        }
    }
    private static double stringToDouble(String stringObject){
        return parseDouble(stringObject.trim());
    }
}