import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Balls extends JPanel {
    int posX;
    int posY;
    int dX;
    int dY;
    public Color color;
    Random rand = new Random();
    public Balls(int x, int y){
        posX = x;
        posY = y;
        /*color = new Color(
                rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)
        );*/
        color = Color.BLACK;
        dX = rand.nextInt(2);
        dY = rand.nextInt(2);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillOval(posX, posY, 30, 30);
    }
}
