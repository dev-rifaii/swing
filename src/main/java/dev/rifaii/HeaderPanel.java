package dev.rifaii;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class HeaderPanel extends JPanel {


    private final LocalDate currentDate;

    public HeaderPanel() {
        this.currentDate = LocalDate.now();
        build();
    }

    private void build() {
        setBackground(Color.YELLOW);
//        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel jLabel = new JLabel(this.currentDate.toString());
        jLabel.setForeground(Color.RED);

        add(jLabel);
    }

}
