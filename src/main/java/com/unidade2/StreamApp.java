package com.unidade2;

import java.io.FileInputStream;

import javax.swing.JOptionPane;

public class StreamApp {
    public static void byteStream() throws Exception{
        FileInputStream entrada = new FileInputStream("C:/Users/PFPA/Documents/cursos_alura/abc_treinamentos/src/main/java/com/unidade2/dados.txt");
        int contator = 0;
        while ((entrada.read()) != -1) {
            contator++;
        }
        System.out.println("o número de caracteres é igual a " + contator);
        entrada.close();
    }

    public static void caracterStream(char letra) throws Exception {
        FileInputStream entrada = new FileInputStream("C:/Users/PFPA/Documents/cursos_alura/abc_treinamentos/src/main/java/com/unidade2/dados.txt");
        int contator = 0;
        int c;
        while ((c = entrada.read()) != -1) {
            if (c == letra) {
                contator++;
            }
        }
        System.out.println("o número de vezes que o caractere \'" + letra + "\' se repetiu foi igual a:" + contator);
        entrada.close();
    }

    public static void main(String[] args) {
        try {
            byteStream();
            System.out.println("informe a letra a ser encontrada");
            char selectLetra = (char) System.in.read();
            caracterStream(selectLetra);   
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
