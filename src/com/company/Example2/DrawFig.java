package com.company.Example2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class DrawFig extends JApplet {
    public void init(){}
    public void start(){}

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(0,0, Color.red,175,175,Color.yellow,true);
        g2d.setPaint(gradientPaint);
        //Координати эліпсу
        Ellipse2D.Double circle = new Ellipse2D.Double(10,10,350,350);
        g2d.fill(circle);//Заповнити коліром
        g2d.setPaint(Color.red);//Колір окружності
        g2d.draw(circle);
    }
}
