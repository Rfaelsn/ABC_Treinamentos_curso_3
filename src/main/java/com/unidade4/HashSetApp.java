package com.unidade4;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String args[]){
    Set<String> lista = new HashSet<>();
    lista.add("vermelho");
    lista.add("verde");
    lista.add("verde");
    lista.add("amarelo");
    System.out.println(lista);
    }
}
