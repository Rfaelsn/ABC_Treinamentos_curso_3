package com.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp5 {
    private static int numero;
    private int somatorio;

    public int getSomatorio() {
        return this.somatorio;
    }

    public void setSomatorio(int somatorio) {
        this.somatorio = somatorio;
    }

    public static void main(String[] args) {
        List <Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        LambdaApp5 app = new LambdaApp5();
        integers.forEach(x->{
            int y = x/2;
            System.out.println(y);
            numero = 10;
            x += numero;
            app.setSomatorio(app.getSomatorio()+x);
            System.out.println(x);
        });
        System.out.println("\nSoma: "+app.getSomatorio());
    }
}
