/*
import OtherClasses.Balls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Paint extends JPanel implements Runnable, MouseMotionListener {
    protected int xPos;
    private List<Balls> balls;
    private HashMap<Integer, List<Balls>> mapX;
    private HashMap<Integer, List<Balls>> mapY;
    protected boolean running;
    protected int vectorX;
    protected int yPos;
    protected int vectorY;
    public Paint()  {
        super(true);
        balls = new ArrayList<>();
        mapX = new HashMap<Integer, List<Balls>>();
        xPos = 0;
        yPos = 0;
        vectorX = 1;
        vectorY = 1;
        addMouseMotionListener(this);
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
    boolean flag = false;


    @Override
    public void mouseDragged(MouseEvent e) {
        balls.add(new Balls(e.getX() - 10, e.getY() - 10));
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
*/
