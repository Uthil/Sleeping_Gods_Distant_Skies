package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class JourneyFrontFrame extends JFrame {

    private final JLabel frontImageLabel;

    public JourneyFrontFrame() {
        setTitle("Journey Log");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Image Display
        frontImageLabel = new JLabel(new ImageIcon("resources/journey_front.jpg"));
        add(frontImageLabel, BorderLayout.CENTER);

        //Load and scale the initial image
        scaleImage();

        // Add a component listener for resizing
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                scaleImage();
            }
        });

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton achievementsButton = new JButton("Achievements");
        JButton journeyBackButton = new JButton("Journey Log Map");
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

    public void scaleImage() {
        String path = "resources/journey_front.jpg";
        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        frontImageLabel.setIcon(new ImageIcon(scaledImage));
    }
}