package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork {

    private static int counter = 0;
    private static JLabel counterValueView;

    public static void main(String[] args) {
        JFrame mainFrame = initFrame();


        Font font = new Font("Arial", Font.BOLD, 32);


        createCounterView(mainFrame, font);
        createButtons(mainFrame, font);

        mainFrame.setVisible(true);
    }

    private static void createButtons(JFrame mainFrame, Font font) {
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        mainFrame.add(decrementButton, BorderLayout.LINE_START);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        mainFrame.add(incrementButton, BorderLayout.LINE_END);

        JButton refreshButton = new JButton("Очистить");
        mainFrame.add(refreshButton, BorderLayout.PAGE_END);

        JTextField field = new JTextField();
        mainFrame.add(field, BorderLayout.PAGE_START);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValueView.setText(String.valueOf(--counter));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValueView.setText(String.valueOf(++counter));
            }
        });
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                counterValueView.setText(String.valueOf(counter));
                field.setText(null);
            }
        });
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValueView.setText(String.valueOf(field.getText()));
                counter = Integer.parseInt(field.getText());
            }
        });

    }

    private static JFrame initFrame() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Counter");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(300, 300, 400, 200);
        return mainFrame;
    }

    private static void createCounterView(JFrame mainFrame, Font font) {
        counterValueView = new JLabel(getCounterValueAsText());
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setFont(font);
        mainFrame.add(counterValueView, BorderLayout.CENTER);
    }


    private static String getCounterValueAsText() {
        return String.valueOf(counter);
    }
}
