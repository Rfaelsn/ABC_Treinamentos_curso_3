package com.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {
    static int numeroValido = 2;
    public static void main(String[] args) {
        int numero = 10;
        List <Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach(x->{
            x += numero+numeroValido;
            /*
            não pode fazer :
            numero = 20;
            */
            System.out.println(x);
        });
    }
}
