package com.unidade4;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String args[]){
        Set<String> lista = new LinkedHashSet<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
    }
}
