package com.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonAppV2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação Button");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JButton botao = new JButton("isto é um botão");

        botao.addActionListener(e->{
            JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
        });

        container.add(botao);
        frame.setVisible(true);
    }

}
