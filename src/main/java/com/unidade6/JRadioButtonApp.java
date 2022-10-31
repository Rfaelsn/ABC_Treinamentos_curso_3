package com.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        ButtonGroup btnGroup = new ButtonGroup();

        JRadioButton rb = new JRadioButton("Pequeno",true);
        btnGroup.add(rb);
        container.add(rb);

        rb = new JRadioButton("Médio",true);
        btnGroup.add(rb);
        container.add(rb);

        rb = new JRadioButton("Grande",true);
        btnGroup.add(rb);
        container.add(rb);

        frame.setVisible(true);
    }
}
