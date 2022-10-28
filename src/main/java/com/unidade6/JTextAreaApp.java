package com.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class JTextAreaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        JTextArea ta = new JTextArea("Digite aqui");
        container.add(ta,BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
