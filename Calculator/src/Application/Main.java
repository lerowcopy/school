package Application;
import ApplicationStyle.Style;
import Other.RunListener;

import javax.script.ScriptEngine;
import javax.swing.*;
import java.awt.*;

public abstract class Main extends JFrame{
    protected static JButton btn0;
    protected static JButton btn1;
    protected static JButton btn2;
    protected static JButton btn3;
    protected static JButton btn4;
    protected static JButton btn5;
    protected static JButton btn6;
    protected static JButton btn7;
    protected static JButton btn8;
    protected static JButton btn9;
    protected static JButton btnPlus;
    protected static JButton btnMinus;
    protected static JButton btnMultiply;
    protected static JButton btnDivide;
    protected static JPanel panel;
    protected static JLabel label;
    protected static JTextField field;
    protected static JButton btnEqual;
    protected static JButton btnClear;
    protected static GridBagConstraints gbc;

    public abstract JButton getBtn0();
    public abstract JButton getBtn1();
    public abstract JButton getBtn2();
    public abstract JButton getBtn3();
    public abstract JButton getBtn4();
    public abstract JButton getBtn5();
    public abstract JButton getBtn6();
    public abstract JButton getBtn7();
    public abstract JButton getBtn8();
    public abstract JButton getBtn9();
    public abstract JButton getBtnPlus();
    public abstract JButton getBtnMinus();
    public abstract JButton getBtnMultiply();
    public abstract JButton getBtnDivide();
    public abstract JButton getBtnEqual();
    public abstract JButton getBtnClear();
    public abstract JPanel getPanel();
    public abstract JTextField getField();
    public abstract ScriptEngine getEngine();

    public abstract GridBagConstraints getGbc();
    protected static ScriptEngine engine;


    static class Window extends JFrame{
        public Window(){

            panel = new JPanel(new GridBagLayout());

            setSize(390, 490);
            setTitle("Calculator");

            BackgroundWindowF.getInstance().createWidgets();
            BackgroundWindowF.getInstance().setSize();
            BackgroundWindowF.getInstance().setFont();
            Style.getInstance().setStyle();

            RunListener rl = new RunListener(field, engine);
            rl.setActionListener();

            BackgroundWindowF.getInstance().placeField();
            panel.add(field, gbc);

            BackgroundWindowF.getInstance().placeButton0();
            panel.add(btn0, gbc);

            BackgroundWindowF.getInstance().placeButton1();
            panel.add(btn1, gbc);

            BackgroundWindowF.getInstance().placeButton2();
            panel.add(btn2, gbc);

            BackgroundWindowF.getInstance().placeButton3();
            panel.add(btn3, gbc);

            BackgroundWindowF.getInstance().placeButton4();
            panel.add(btn4, gbc);

            BackgroundWindowF.getInstance().placeButton5();
            panel.add(btn5, gbc);

            BackgroundWindowF.getInstance().placeButton6();
            panel.add(btn6, gbc);

            BackgroundWindowF.getInstance().placeButton7();
            panel.add(btn7, gbc);

            BackgroundWindowF.getInstance().placeButton8();
            panel.add(btn8, gbc);

            BackgroundWindowF.getInstance().placeButton9();
            panel.add(btn9, gbc);

            BackgroundWindowF.getInstance().placeButtonPlus();
            panel.add(btnPlus, gbc);

            BackgroundWindowF.getInstance().placeButtonMinus();
            panel.add(btnMinus, gbc);

            BackgroundWindowF.getInstance().placeButtonMultiply();
            panel.add(btnMultiply, gbc);

            BackgroundWindowF.getInstance().placeButtonDivide();
            panel.add(btnDivide, gbc);

            BackgroundWindowF.getInstance().placeButtonEqual();
            panel.add(btnEqual, gbc);

            BackgroundWindowF.getInstance().placeButtonClear();
            panel.add(btnClear, gbc);

            getContentPane().add(panel);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
    public static void main(String[] args) {
        Window wnd = new Window();
        wnd.setVisible(true);
    }

}
