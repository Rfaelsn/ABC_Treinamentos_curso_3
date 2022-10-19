package com.unidade1;

import java.io.IOException;

public class TesteLeitura {
    public static void main(String[] args) {
        //exemplo de  checked exception
        byte bytes [] = new byte[10];
        System.out.println("Digite algo:");
        try {
            System.in.read(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n Eco: "+ new String(bytes));
    }
}
