import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.time.Duration;
import java.util.List;
import Instruments.MainInst;
import com.sun.tools.javac.Main;

public class Window extends JFrame {
    protected JButton pen;
    public Window() throws InterruptedException {
        setSize(300, 300);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pen = new JButton("pen");

        GridBagConstraints gbc = new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0
        );
        MainInst main = new MainInst();
        add(main, gbc);
        Thread potok = new Thread(main);
        potok.start();



    }

    public static void main(String[] args) throws InterruptedException {
        Window wnd = new Window();
        wnd.setVisible(true);
    }
}
