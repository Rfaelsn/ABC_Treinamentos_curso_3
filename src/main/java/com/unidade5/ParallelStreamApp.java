package com.unidade5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ParallelStreamApp {
    public static void main(String[] args) {
        colecaoStream();
        colecaoParallelStream();
    }

    private static void colecaoParallelStream() {
        List<String> valores = new ArrayList<String>();
        int  max = 1_000_000;
        for (int i = max; i >= 0; i--) {
            valores.add("=>"+i);
        }
        double t0 = System.currentTimeMillis();
        valores.parallelStream()
        .sorted()
        .forEach(System.out::println);
        double t1 = System.currentTimeMillis();
        System.out.println("**********************Tempo de execução: "+((t1-t0)/1000));



    }

    private static void colecaoStream() {
        List<String> valores = new ArrayList<String>();
        int  max = 1_000_000;
        for (int i = max; i >= 0; i--) {
            valores.add("=>"+i);
        }
        double t0 = System.currentTimeMillis();
        valores.stream()
        .sorted()
        .forEach(System.out::println);
        double t1 = System.currentTimeMillis();
        System.out.println("******************** Tempo de execução: "+((t1-t0)/1000));
    }
}
