 import javax.swing.*;
 import java.awt.*;
public class PBO {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator - Fajar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
      
        frame.setLayout(new BorderLayout());

        JTextField displayField = new JTextField();
        frame.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 6));

        String[] buttons = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String text : buttons) {
            buttonPanel.add(new JButton(text));
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
