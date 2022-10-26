package com.unidade4;

import java.util.ArrayList;
import java.util.List;

public class AdicionarElementos {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        double t1 = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            lista.add("Texto_"+i);
        }
        double t2 = System.currentTimeMillis();
        System.out.println(lista);
        System.out.println(((t2-t1)/1000)+"ms");
    }
}
