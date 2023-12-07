package Instruments;
import OtherClasses.Balls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class MainInst extends JPanel implements Runnable {
    public static MainInst instance;
    boolean running = true;
    public int pen_flag = 0;
    public int sterka_flag = 0;
    protected List<Balls> balls = new ArrayList<>();

    public MainInst(){
        instance = this;
        addMouseMotionListener(new Pen());
        addMouseMotionListener(new Sterka());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Balls ball : balls){
            ball.paint(g);
        }
    }

    @Override
    public void run() {
        running = true;
        while (running){
            this.repaint();
            this.updateUI();
        }
    }


}
