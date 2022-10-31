package com.unidade6;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius Converter");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2,2));
        // container.setLayout(new FlowLayout());
        // container.setLayout(new BorderLayout());

        container.add(new JTextField("0"));
        container.add(new JLabel("Celsius"));
        container.add(new JButton("Convert"));
        container.add(new JTextField("32 Fahrenheit"));
        frame.setVisible(true);
    }
}
