package com.unidade6;

import javax.swing.JOptionPane;

public class DialogApp {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
            null, "iniciando aplicação","Instalação concluída",JOptionPane.INFORMATION_MESSAGE
        );

        String nome = JOptionPane.showInputDialog(
            "Digite o seu Nome"
        );

        int resposta  = JOptionPane.showConfirmDialog(
            null, "O nome "+nome+" foi inserido. Deseja Salvar ?"
        );

        JOptionPane.showMessageDialog(
            null, "Resposta: "+resposta
        );

    }
}
