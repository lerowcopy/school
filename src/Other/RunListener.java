package Other;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Application.BackgroundWindowF;

public class RunListener {
    private JTextField field;
    private ScriptEngine engine;
    private BackgroundWindowF bwf = new BackgroundWindowF();
    public RunListener (JTextField field, ScriptEngine engine){
        this.field = field;
        this.engine = engine;
    }

    ActionListener alBtn0 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "0");
        }
    };
    ActionListener alBtn1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "1");
        }
    };
    ActionListener alBtn2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "2");
        }
    };
    ActionListener alBtn3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "3");
        }
    };
    ActionListener alBtn4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "4");
        }
    };
    ActionListener alBtn5 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "5");
        }
    };
    ActionListener alBtn6 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "6");
        }
    };
    ActionListener alBtn7 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "7");
        }
    };
    ActionListener alBtn8 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "8");
        }
    };
    ActionListener alBtn9 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "9");
        }
    };
    ActionListener alBtnPlus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "+");
        }
    };
    ActionListener alBtnMinus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "-");
        }
    };
    ActionListener alBtnMultiply = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "*");
        }
    };
    ActionListener alBtnDivide = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "/");
        }
    };
    ActionListener alBtnEqual = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                field.setText(engine.eval(field.getText()).toString());
            } catch (ScriptException ex) {
                field.setText("ERROR");
            }
        }
    };
    ActionListener alBtnClear = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText("");
        }
    };

    public void setActionListener(){
        bwf.getBtn0().addActionListener(alBtn0);
        bwf.getBtn1().addActionListener(alBtn1);
        bwf.getBtn2().addActionListener(alBtn2);
        bwf.getBtn3().addActionListener(alBtn3);
        bwf.getBtn4().addActionListener(alBtn4);
        bwf.getBtn5().addActionListener(alBtn5);
        bwf.getBtn6().addActionListener(alBtn6);
        bwf.getBtn7().addActionListener(alBtn7);
        bwf.getBtn8().addActionListener(alBtn8);
        bwf.getBtn9().addActionListener(alBtn9);
        bwf.getBtnPlus().addActionListener(alBtnPlus);
        bwf.getBtnMinus().addActionListener(alBtnMinus);
        bwf.getBtnDivide().addActionListener(alBtnDivide);
        bwf.getBtnMultiply().addActionListener(alBtnMultiply);
        bwf.getBtnEqual().addActionListener(alBtnEqual);
        bwf.getBtnClear().addActionListener(alBtnClear);

    }
}
