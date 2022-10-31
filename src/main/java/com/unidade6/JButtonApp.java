package com.unidade6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.event.WindowListener;

public class JButtonApp extends JFrame implements ActionListener, WindowListener {

    public UIManager.LookAndFeelInfo looks[];

    public static void main(String[] args) {
        JButtonApp frame = new JButtonApp();
        frame.setTitle("Aplicação Button");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JButton botao = new JButton("isto é um botão");

        botao.addActionListener(frame);
        frame.addWindowListener(frame);

        container.add(botao);

        //L&F
        frame.looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(frame.looks[3].getClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Finalizando aplicação");
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }
}
