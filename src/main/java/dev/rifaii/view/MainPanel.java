package dev.rifaii.view;

import dev.rifaii.Event;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MainPanel extends JPanel {

    private JPanel eventsPanel;

    public static JPanel mainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.add(buildHeader());
        mainPanel.add(buildEvents(List.of(
            new dev.rifaii.Event("Test", LocalTime.now(), "Test"),
            new dev.rifaii.Event("Test", LocalTime.now(), "Test"),
            new dev.rifaii.Event("Test", LocalTime.now(), "Test"),
            new dev.rifaii.Event("Test", LocalTime.now(), "Test")
        )));

        return mainPanel;
    }

    private static JPanel buildHeader() {
        JPanel header = new JPanel();
        header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1000));
        header.setBackground(null);
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JTextField dateField = new JTextField(14);
        dateField.setText(LocalDate.now().toString());
        header.add(dateField);

        JButton searchButton = new JButton("Go");
        header.add(searchButton);

        return header;
    }

    private static JPanel buildEvents(List<Event> events) {
        JPanel eventsPanel = new JPanel(new GridBagLayout());
        eventsPanel.setSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        eventsPanel.setBackground(null);

        var gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        for (Event event : events) {
            eventsPanel.add(event, gbc);
            gbc.gridy++;
        }

        JButton save = new JButton("Save");
        eventsPanel.add(save, gbc);

        return eventsPanel;
    }
}
