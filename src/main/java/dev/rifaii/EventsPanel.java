package dev.rifaii;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class EventsPanel extends JPanel {

    private final LocalDate date;
    private final List<Event> events;

    public EventsPanel(LocalDate date, List<Event> events) {
        this.date = date;
        this.events = events;

        setBackground(Color.DARK_GRAY);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        build();
    }

    private void build() {
        JLabel dateLabel = new JLabel(this.date.toString());
        dateLabel.setForeground(Color.GREEN);
        add(dateLabel);
        events.forEach(event -> {
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Test"});
            add(comboBox);
        });
    }

}
