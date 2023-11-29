import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.logging.Logger;

public class Paint extends JPanel implements Runnable {
    protected int xPos;
    protected boolean running;
    protected int vectorX;
    protected int yPos;
    protected int vectorY;
    public Paint()  {
        super(true);
        xPos = 0;
        yPos = 0;
        vectorX = 1;
        vectorY = 1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(xPos, yPos, 45, 45);
    }

    @Override
    public void run() {
        running = true;

        while (running){
            xPos += vectorX;
            yPos += vectorY;
            if (xPos == getWidth() - 35){
                vectorX = -1;
            }
            else  if (xPos == 0){
                vectorX = 1;
            }
            if (yPos == getHeight() - 35){
                vectorY = -1;
            }
            else if (yPos == 0){
                vectorY = 1;
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
}
