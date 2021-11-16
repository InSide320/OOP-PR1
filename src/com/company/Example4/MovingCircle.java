package com.company.Example4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class MovingCircle extends JComponent implements ActionListener {
    private  double scale;
    private  Color color;
    private  Timer timer;
    private double x =10;
    private double y =10;
    public MovingCircle(Color color, int delay){
        scale = 1.0;
        timer = new Timer(delay, this);
        this.color = color;
        setPreferredSize(new Dimension(500,500));
    }
    public void start(){
        timer.start();
    }
    public void stop(){
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        repaint();
    }

    @Override
    protected void printComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        int width = 500;
        int height = 500;
        g2d.fillRect(0,0,width,height);
        g2d.setColor(Color.black);
        g2d.drawRect(0,0,width-1,height-1);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.scale(scale,scale);
        x++;
        y++;
        Ellipse2D el = new Ellipse2D.Double(x,y,20,20);
        g2d.fill(el);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Moving Circle");
                JPanel panel = new JPanel();
                final MovingCircle MovingCircleGreen = new MovingCircle(Color.green,20);
                panel.add(MovingCircleGreen);
                frame.getContentPane().add(panel);
                final JButton button =new JButton("Start");
                button.addActionListener(new ActionListener() {
                    private  boolean plusing = false;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(plusing){
                            plusing = false;
                            MovingCircleGreen.stop();
                            button.setText("Start");
                        }else {
                            plusing = true;
                            MovingCircleGreen.start();
                            button.setText("Stop");
                        }
                    }
                });
                panel.add(button);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600,550);
                frame.setVisible(true);
            }
        });
    }
}
