package ui;

import javax.swing.*;
import java.awt.*;

public class JourneyBackFrame extends JFrame {

    public JourneyBackFrame() {
        setTitle("Journey Back");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Image Display
        JLabel backImage = new JLabel(new ImageIcon("resources/journey_back.jpg"));
        add(backImage, BorderLayout.CENTER);

        // Placeholder for map-related features later
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Journey Back functionality coming soon!");
        panel.add(label);
        add(panel, BorderLayout.SOUTH);
    }
}