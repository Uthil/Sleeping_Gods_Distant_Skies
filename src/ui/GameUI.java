// File: src/ui/GameUI.java
package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI {

    public static void main(String[] args) {
        // Start the application with the Journey Front Frame
        SwingUtilities.invokeLater(() -> new JourneyFrontFrame().setVisible(true));
    }
}