package Instruments;


import OtherClasses.Balls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Pen extends JPanel implements MouseMotionListener {
    public Pen (){

    }
    @Override
    public void mouseDragged(MouseEvent e) {
        if (MainInst.instance.pen_flag == 1){
            MainInst.instance.balls.add(new Balls(e.getX() - 10, e.getY() - 10, Color.BLACK));
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
