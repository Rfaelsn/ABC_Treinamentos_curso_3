package com.unidade6;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2,1));
        container.add(new JLabel("isto é um rótulo !"));
        frame.setVisible(true);
    }

}
