package dev.rifaii;

import dev.rifaii.view.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.add(MainPanel.mainPanel());
        mainFrame.setSize(900, 900);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}