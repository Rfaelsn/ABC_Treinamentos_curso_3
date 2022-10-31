package com.unidade6;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LojaVirtual {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container container = frame.getContentPane();
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCliente = new JMenu("Cliente");

            JMenuItem criarCliente = new JMenuItem("novo");
            JMenuItem consultarCliente = new JMenuItem("Consultar");
            JMenuItem alterarCliente = new JMenuItem("alterar");
            JMenuItem excluirCliente = new JMenuItem("excluir");

            menuCliente.add(criarCliente);
            menuCliente.add(consultarCliente);
            menuCliente.add(alterarCliente);
            menuCliente.add(excluirCliente);

        JMenu menuCursos = new JMenu("Cursos");

            JMenuItem criarCurso = new JMenuItem("novo");
            JMenuItem consultarCurso = new JMenuItem("Consultar");
            JMenuItem alterarCurso = new JMenuItem("alterar");
            JMenuItem excluirCurso = new JMenuItem("excluir");

            menuCursos.add(criarCurso);
            menuCursos.add(consultarCurso);
            menuCursos.add(alterarCurso);
            menuCursos.add(excluirCurso);

        menuBar.add(menuCliente);
        menuBar.add(menuCursos);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
