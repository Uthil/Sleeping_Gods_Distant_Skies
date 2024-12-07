package ui;

import javax.swing.*;
import java.awt.*;

public class AchievementsFrame extends JFrame {

    public AchievementsFrame() {
        setTitle("Achievements");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Image Display
        JLabel achievementsImage = new JLabel(new ImageIcon("resources/DistantSkies_ACHIEVEMENTS_copy.jpg"));
        add(achievementsImage, BorderLayout.CENTER);

        // Placeholder for more achievements-related features later
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Achievements functionality coming soon!");
        panel.add(label);
        add(panel, BorderLayout.SOUTH);
    }
}