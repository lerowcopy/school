import javax.swing.*;
import java.awt.*;
import java.time.Duration;

public class Window extends JFrame {

    public Window() throws InterruptedException {
        setSize(300, 300);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0
        );

        Paint paint = new Paint();
        add(paint, gbc);
        Thread potok = new Thread(paint);
        potok.start();



    }

    public static void main(String[] args) throws InterruptedException {
        Window wnd = new Window();
        wnd.setVisible(true);
    }
}
