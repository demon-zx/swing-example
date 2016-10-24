package ru.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Terentjev Dmitry
 *         Date: 24.10.2016
 *         Time: 13:53
 */
public class MainFrame extends JMainFrame {

    private final ActionListener simpleHandler = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number = new Random().nextInt(1000);
            add(number,"Имя "+number);
        }
    };

    public void add(int number, String name){
        Object[] row = {number,name};
        mainModel.addRow(row);
    }

    public MainFrame(){

        btnSimple.addActionListener(simpleHandler);
    }
}
