package com.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPFApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        JPasswordField pwf = new JPasswordField();
        container.add(pwf,BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
