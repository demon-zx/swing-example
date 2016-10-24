package ru.test;

import javax.swing.*;
import java.awt.*;

/**
 * @author Terentjev Dmitry
 *         Date: 24.10.2016
 *         Time: 13:47
 */
public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                MainFrame f = new MainFrame();
                f.setVisible(true);
            }
        });
    }
}
