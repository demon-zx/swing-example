package ru.test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author Terentjev Dmitry
 *         Date: 24.10.2016
 *         Time: 13:47
 */
public class JMainFrame extends JFrame {

    public static void main(String[] args) {
        JMainFrame f = new JMainFrame();
        f.setVisible(true);
    }

    private JPanel cp = new JPanel();
    protected JButton btnScan = new JButton("Сканировать");
    protected JButton btnSimple = new JButton("Добавить");
    protected JTable tMain;
    protected DefaultTableModel mainModel;

    public JMainFrame(){
        Dimension size = new Dimension(800,640);
        setMinimumSize(size);
        setPreferredSize(size);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(cp);
        cp.setLayout(new BorderLayout());

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,5));

        cp.add(buttons,BorderLayout.SOUTH);

        buttons.add(btnScan);
        buttons.add(btnSimple);
        String[] mainHeader = {"Номер","Название"};
        mainModel = new DefaultTableModel(mainHeader,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tMain = new JTable(mainModel);

        JScrollPane spMain = new JScrollPane(tMain);

        cp.add(spMain,BorderLayout.CENTER);
    }
}
