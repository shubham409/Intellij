package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class  Main  {
    public static void main(String[] args) {
        new Addsub();
    }
}
class Addsub extends Frame implements ActionListener{
    TextField tf1,tf2,tf3;
    Button plusbt,minusbt;
    Addsub() {
        plusbt = new Button();
        minusbt = new Button();
        plusbt.setBounds(100, 400, 100, 50);
        minusbt.setBounds(300, 400, 100, 50);
        plusbt.setLabel("PLUS");
        minusbt.setLabel("MINUS");

        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf1.setBounds(100, 100, 100, 50);
        tf2.setBounds(300, 100, 100, 50);
        tf3.setBounds(200, 200, 150, 50);
        setSize(600,600);
        plusbt.addActionListener(this);
        minusbt.addActionListener(this);
        add(plusbt);add(minusbt);
        add(tf1);add(tf2);add(tf3);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try {
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            if (e.getSource() == plusbt)
                tf3.setText(String.valueOf(i1 + i2));
            else
                tf3.setText(String.valueOf(i1 - i2));
        }
        catch (Exception E) {
            tf3.setText("Please Enter Only Integer ");
        }
    }
}
