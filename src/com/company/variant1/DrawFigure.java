package com.company.variant1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawFigure extends JApplet {
    @Override
    public void init() {
        super.init();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradientPaint = new GradientPaint(0,0, Color.blue,175,175,Color.green,true);
        g2d.setPaint(gradientPaint);
        //Координати эліпсу
        Ellipse2D.Double circle = new Ellipse2D.Double(10,10,350,350);
        g2d.fill(circle);//Заповнити коліром
        g2d.setPaint(Color.black);//Колір окружності
        g2d.draw(circle);
    }
}
