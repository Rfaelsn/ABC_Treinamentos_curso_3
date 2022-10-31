package com.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        String init [] = {"Brasil","EUA","Portugal"};
        JComboBox<String> comboBox = new JComboBox<>(init);
        container.add(comboBox);
        frame.setVisible(true);
    }
}
