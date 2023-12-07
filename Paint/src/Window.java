import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.time.Duration;
import java.util.List;
import Instruments.MainInst;
import jdk.jfr.internal.tool.Main;

public class Window extends JFrame {
    protected JButton pen;
    protected JButton sterka;
    public Window() throws InterruptedException {
        setSize(300, 300);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pen = new JButton("pen");
        sterka = new JButton("sterka");


        GridBagConstraints gbc = new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0
        );
        pen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInst.instance.pen_flag = 1;
                MainInst.instance.sterka_flag = 0;
            }
        });
        sterka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInst.instance.pen_flag = 0;
                MainInst.instance.sterka_flag = 1;
            }
        });
        MainInst main = new MainInst();
        add(main, gbc);
        gbc = new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0
        );
        add(pen, gbc);
        gbc = new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0
        );
        add(sterka, gbc);
        Thread potok = new Thread(main);
        potok.start();



    }

    public static void main(String[] args) throws InterruptedException {
        Window wnd = new Window();
        wnd.setVisible(true);
    }
}
