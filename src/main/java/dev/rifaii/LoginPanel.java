package dev.rifaii;

import javax.swing.*;
import java.awt.*;

public class LoginPanel {


    public static JPanel build() {
        JPanel loginPanel = new JPanel();
        Dimension maximumSize = new Dimension(300, 50);
        BoxLayout boxLayout = new BoxLayout(loginPanel, BoxLayout.Y_AXIS);
        loginPanel.setLayout(boxLayout);
        loginPanel.setBackground(Color.BLACK);

        JTextField usernameInputField = new JTextField(10);
        usernameInputField.setMaximumSize(maximumSize);
        JTextField passwordInputField = new JTextField(10);
        passwordInputField.setMaximumSize(maximumSize);

        Button button = new Button("Login");
        button.setMaximumSize(new Dimension(100, 35));

        loginPanel.add(usernameInputField);
        loginPanel.add(passwordInputField);
        loginPanel.add(button);

        button.addActionListener(event -> {
            String username = usernameInputField.getText();
            String password = passwordInputField.getText();

            if (!username.isBlank() && !password.isBlank()) {
                try {
                    login(username, password);
                    System.out.println("Logged in!");
                } catch (Exception e) {
                    System.out.println("Bad credentials");
                }
            }
        });

        return loginPanel;
    }

    private static void login(String username, String password) {

    }
}
