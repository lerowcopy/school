package OtherClasses;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Balls extends JPanel {
    int posX;
    int posY;
    int dX;
    int dY;
    public Color colorBalls;
    Random rand = new Random();
    public Balls(int x, int y, Color color){
        posX = x;
        posY = y;
        /*color = new Color(
                rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)
        );*/
        colorBalls = color;
        dX = rand.nextInt(2);
        dY = rand.nextInt(2);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(colorBalls);
        g.fillOval(posX, posY, 30, 30);
    }
}

