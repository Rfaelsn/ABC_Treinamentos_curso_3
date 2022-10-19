package com.unidade1;

public class Teste {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //exemplo de unchecked exception
        int i = 0;
        String frases[] = {"um", "dois", "três"};
        while (i < 4) {
            {
                System.out.println(frases[i]);
                //System.out.println("erro de acesso a posicao do vetor");
                i++;

            }
        }
    }
}
