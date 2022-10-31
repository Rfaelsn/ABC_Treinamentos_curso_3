package com.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFAppV2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Primeira Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        JTextField tf = new JTextField("Digite aqui");
        tf.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
        });


        container.add(tf,BorderLayout.NORTH);
        frame.setVisible(true);
    }

}
