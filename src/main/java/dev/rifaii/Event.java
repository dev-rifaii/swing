package dev.rifaii;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Event extends JPanel {

    EventClient eventClient = new EventClient();

    public Event(String type, LocalTime time, String details) {
        Dimension dimension = new Dimension(Integer.MAX_VALUE, 300);
        this.setBackground(null);
        JComboBox<String> eventTypes = new JComboBox<>(new String[]{type});
        JTextField timeInput = new JTextField(time.toString());
        JTextField detailsInput = new JTextField(details);
        //        eventTypes.setBackground(null);
        //        timeInput.setBackground(null);
        //        detailsInput.setBackground(null);

        add(eventTypes);
        add(timeInput);
        add(detailsInput);
    }
}
