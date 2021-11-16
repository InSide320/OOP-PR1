package com.company.variant1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame {
    JButton buttonStart = new JButton("Start");
    public GUIForm() {
        super("Вариант №1");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());

        DrawFigure drawFigure = new DrawFigure();
        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(7,3,5,5));
        buttonStart.contains(10,10);
        panel.add(buttonStart);


        add(panel,BorderLayout.CENTER);

        drawFigure.init();
        drawFigure.start();

//        getContentPane().add(drawFigure);

        setVisible(true);
        buttonStart.addActionListener(new buttonClickListener());
    }

    private class buttonClickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
