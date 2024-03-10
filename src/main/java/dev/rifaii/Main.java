package dev.rifaii;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(900, 900);

        JPanel header = new HeaderPanel();
        JPanel jPanel = new EventsPanel(LocalDate.now(), List.of(new Event()));
        header.add(jPanel);
        jFrame.setContentPane(header);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}