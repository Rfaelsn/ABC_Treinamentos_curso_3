package com.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTFApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        JTextField tf = new JTextField("Digite aqui");
        container.add(tf,BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
