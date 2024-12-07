package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JourneyFrontFrame extends JFrame {

    public JourneyFrontFrame() {
        setTitle("Journey Front Frame");
        setSize(7008, 4096);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Image Display
        JLabel frontImage = new JLabel(new ImageIcon("resources/journey_front.jpg"));
        add(frontImage, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton achievementsButton = new JButton("Achievements");
        JButton journeyBackButton = new JButton("Journey Back");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(achievementsButton);
        buttonPanel.add(journeyBackButton);
        buttonPanel.add(exitButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        achievementsButton.addActionListener(e -> new AchievementsFrame().setVisible(true));
        journeyBackButton.addActionListener(e -> new JourneyBackFrame().setVisible(true));
        exitButton.addActionListener(e -> System.exit(0));
    }
}