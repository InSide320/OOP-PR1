package com.company;

import com.company.variant1.DrawFigure;
import com.company.variant1.GUIForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Example#1
            /*
                MyTimerTask myTimerTask = new MyTimerTask();
                Timer myTimer = new Timer();

                    //Встановлює початкову паузу протягом 1 секунди,
                    //а потім повторює завдання кожні пів секунди
                myTimer.schedule(myTimerTask,1000,500);
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException exc){
                    System.out.println(exc.getMessage());
                }
                myTimer.cancel();
             */

        //Example#2
        /*
            JFrame frame = new JFrame("Приклад");
            DrawFig appl = new DrawFig();
            appl.init();
            appl.start();
            frame.getContentPane().add(appl);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,400);
            frame.setVisible(true);
         */

        //Example 3
        /*

         */
        GUIForm guiForm = new GUIForm();
        JFrame frame = new JFrame("Figure");
        DrawFigure drawFigure = new DrawFigure();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.getContentPane().add(drawFigure);
    }
}
