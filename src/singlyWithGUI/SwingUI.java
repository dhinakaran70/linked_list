package singlyWithGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUI {
    private static nod_body list = new nod_body();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Linked List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Components
        JTextField inputField = new JTextField(20);
        JTextArea outputArea = new JTextArea(8, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton displayButton = new JButton("Display");

        // Panel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter number:"));
        panel.add(inputField);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(displayButton);
        panel.add(scrollPane);

        // Add action listeners
        addButton.addActionListener(e -> {
            try {
                int value = Integer.parseInt(inputField.getText());
                list.add(value);
                outputArea.setText("Inserted " + value);
                inputField.setText("");
            } catch (NumberFormatException ex) {
                outputArea.setText("Please enter a valid integer.");
            }
        });

        deleteButton.addActionListener(e -> {
            try {
                int value = Integer.parseInt(inputField.getText());
                list.delete(value);
                outputArea.setText("Deleted " + value);
                inputField.setText("");
            } catch (NumberFormatException ex) {
                outputArea.setText("Please enter a valid integer.");
            }
        });

        displayButton.addActionListener(e -> {
            outputArea.setText("Linked List:\n" + list.display());
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}