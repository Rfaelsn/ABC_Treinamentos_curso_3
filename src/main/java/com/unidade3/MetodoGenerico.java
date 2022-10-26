package com.unidade3;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenerico {
    public static <T extends Number> void retornaImpar(List<T> colecaoNumeros){
        List <T> numImpares = new ArrayList<>();
        for (T t : colecaoNumeros) {
            if (t.doubleValue()%2 != 0) {
                numImpares.add(t);
            }
        }

        numImpares.forEach(System.out::println);

    }
    public static void main(String[] args) {
        List <Integer> colecaoNumeros = new ArrayList<>();
        colecaoNumeros.add(4);
        colecaoNumeros.add(1);
        colecaoNumeros.add(2);
        colecaoNumeros.add(3);
        retornaImpar(colecaoNumeros);
    }
}
