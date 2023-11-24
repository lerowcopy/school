package Application;

import Other.RoundedBorder;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;

public class BackgroundWindowF extends Main{
    private static BackgroundWindowF instance = new BackgroundWindowF();

    public static BackgroundWindowF getInstance() {
        return instance;
    }

    @Override
    public JButton getBtn0() {
        return btn0;
    }

    @Override
    public JButton getBtn1() {
        return btn1;
    }

    @Override
    public JButton getBtn2() {
        return btn2;
    }

    @Override
    public JButton getBtn3() {
        return btn3;
    }

    @Override
    public JButton getBtn4() {
        return btn4;
    }

    @Override
    public JButton getBtn5() {
        return btn5;
    }

    @Override
    public JButton getBtn6() {
        return btn6;
    }

    @Override
    public JButton getBtn7() {
        return btn7;
    }

    @Override
    public JButton getBtn8() {
        return btn8;
    }

    @Override
    public GridBagConstraints getGbc() {
        return gbc;
    }

    @Override
    public JButton getBtn9() {
        return btn9;
    }

    @Override
    public JButton getBtnPlus() {
        return btnPlus;
    }

    @Override
    public JButton getBtnMinus() {
        return btnMinus;
    }

    @Override
    public JButton getBtnMultiply() {
        return btnMultiply;
    }

    @Override
    public JButton getBtnDivide() {
        return btnDivide;
    }

    @Override
    public JButton getBtnEqual() {
        return btnEqual;
    }

    @Override
    public JButton getBtnClear() {
        return btnClear;
    }

    @Override
    public JPanel getPanel() {
        return panel;
    }

    @Override
    public JTextField getField(){
        return field;
    }

    @Override
    public ScriptEngine getEngine() {
        return engine;
    }

    protected void createWidgets(){
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnEqual = new JButton("=");
        btnClear = new JButton("C");
        panel = new JPanel(new GridBagLayout());
        field = new JTextField();
        engine = new ScriptEngineManager().getEngineByExtension("js");

        field.setHorizontalAlignment(SwingConstants.RIGHT);
        field.setEditable(false);

        btn0.setBorder(new RoundedBorder(10));
        btn1.setBorder(new RoundedBorder(10));
        btn2.setBorder(new RoundedBorder(10));
        btn3.setBorder(new RoundedBorder(10));
        btn4.setBorder(new RoundedBorder(10));
        btn5.setBorder(new RoundedBorder(10));
        btn6.setBorder(new RoundedBorder(10));
        btn7.setBorder(new RoundedBorder(10));
        btn8.setBorder(new RoundedBorder(10));
        btn9.setBorder(new RoundedBorder(10));
        btnPlus.setBorder(new RoundedBorder(10));
        btnMinus.setBorder(new RoundedBorder(10));
        btnMultiply.setBorder(new RoundedBorder(10));
        btnDivide.setBorder(new RoundedBorder(10));
        btnEqual.setBorder(new RoundedBorder(10));
        btnClear.setBorder(new RoundedBorder(10));
        field.setBorder(new RoundedBorder(10));

    }

    protected void setFont(){
        btn0.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn1.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn2.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn3.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn4.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn5.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn6.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn7.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn8.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btn9.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnPlus.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnMinus.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnMultiply.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnDivide.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnEqual.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        btnClear.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        field.setFont(new Font("TimesNewRoman", Font.BOLD, 40));
    }

    protected void setSize(){
        btn0.setMinimumSize(new Dimension(80, 80));
        btn0.setPreferredSize(new Dimension(80, 80));

        btn1.setMinimumSize(new Dimension(80, 80));
        btn1.setPreferredSize(new Dimension(80, 80));

        btn2.setMinimumSize(new Dimension(80, 80));
        btn2.setPreferredSize(new Dimension(80, 80));

        btn3.setMinimumSize(new Dimension(80, 80));
        btn3.setPreferredSize(new Dimension(80, 80));

        btn4.setMinimumSize(new Dimension(80, 80));
        btn4.setPreferredSize(new Dimension(80, 80));

        btn5.setMinimumSize(new Dimension(80, 80));
        btn5.setPreferredSize(new Dimension(80, 80));

        btn6.setMinimumSize(new Dimension(80, 80));
        btn6.setPreferredSize(new Dimension(80, 80));

        btn7.setMinimumSize(new Dimension(80, 80));
        btn7.setPreferredSize(new Dimension(80, 80));

        btn8.setMinimumSize(new Dimension(80, 80));
        btn8.setPreferredSize(new Dimension(80, 80));

        btn9.setMinimumSize(new Dimension(80, 80));
        btn9.setPreferredSize(new Dimension(80, 80));

        btnPlus.setMinimumSize(new Dimension(80, 80));
        btnPlus.setPreferredSize(new Dimension(80, 80));

        btnMinus.setMinimumSize(new Dimension(80, 80));
        btnMinus.setPreferredSize(new Dimension(80, 80));

        btnMultiply.setMinimumSize(new Dimension(80, 80));
        btnMultiply.setPreferredSize(new Dimension(80, 80));

        btnDivide.setMinimumSize(new Dimension(80, 80));
        btnDivide.setPreferredSize(new Dimension(80, 80));

        btnEqual.setMinimumSize(new Dimension(80, 80));
        btnEqual.setPreferredSize(new Dimension(80, 80));

        btnClear.setMinimumSize(new Dimension(80, 80));
        btnClear.setPreferredSize(new Dimension(80, 80));

        field.setMinimumSize(new Dimension(335, 80));
        field.setPreferredSize(new Dimension(335, 80));
    }

    protected void placeField(){
        gbc = new GridBagConstraints(
                0, 0, 4, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton0(){
        gbc = new GridBagConstraints(
                1, 4, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton1(){
        gbc = new GridBagConstraints(
                0, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton2(){
        gbc = new GridBagConstraints(
                1, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton3(){
        gbc = new GridBagConstraints(
                2, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton4(){
        gbc = new GridBagConstraints(
                0, 2, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton5(){
        gbc = new GridBagConstraints(
                1, 2, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton6(){
        gbc = new GridBagConstraints(
                2, 2, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton7(){
        gbc = new GridBagConstraints(
                0, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton8(){
        gbc = new GridBagConstraints(
                1, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButton9(){
        gbc = new GridBagConstraints(
                2, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonPlus(){
        gbc = new GridBagConstraints(
                0, 4, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonMinus(){
        gbc = new GridBagConstraints(
                2, 4, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonEqual(){
        gbc = new GridBagConstraints(
                3, 4, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonMultiply(){
        gbc = new GridBagConstraints(
                3, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonDivide(){
        gbc = new GridBagConstraints(
                3, 2, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

    protected void placeButtonClear(){
        gbc = new GridBagConstraints(
                3, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                new Insets(3, 3, 3, 3), 0, 0
        );
    }

}
