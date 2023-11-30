import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Paint extends JPanel implements Runnable, MouseListener {
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
        addMouseListener(this);
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
        for (Balls balls:balls){
            int key = balls.posX - 15;
            if (mapX.get(key) == null){
                mapX.put(key, new ArrayList<Balls>() {
                });
            }
            mapX.get(key).add(balls);
            key = balls.posX + 15;
            if (mapX.get(key) == null){
                mapX.put(key, new ArrayList<Balls>() {
                });
            }
            mapX.get(key).add(balls);

            key = balls.posY - 15;
            if (mapY.get(key) == null){
                mapY.put(key, new ArrayList<Balls>() {
                });
            }
            mapY.get(key).add(balls);
            key = balls.posY + 15;
            if (mapY.get(key) == null){
                mapY.put(key, new ArrayList<Balls>() {
                });
            }
            mapY.get(key).add(balls);
        }
        while (running){
            for (Balls balls: balls){
                balls.posX += balls.dX;
                balls.posY += balls.dY;
                if (balls.posX == getWidth() - 35 || balls.posX == 0){
                    balls.dX *= -1;
                }
                if (balls.posY == getHeight() - 35 || balls.posY == 0){
                    balls.dY *= -1;
                }
            }
            this.repaint();
            this.updateUI();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        balls.add(new Balls(e.getX(), e.getY()));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
