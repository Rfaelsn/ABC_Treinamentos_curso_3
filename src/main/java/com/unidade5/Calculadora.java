package com.unidade5;

import com.unidade5.com.abctreinamentos.Formula;

public class Calculadora implements Formula {
    public static void main(String[] args){
        IMatematica anonimo = new IMatematica(){

            @Override
            public int somar(int a, int b) {
                return (a+b);
            }

            @Override
            public int subtrair(int a, int b) {
                return (a-b);
            }

            @Override
            public int multiplicar(int a, int b) {
                return (a*b);
            }

            @Override
            public int dividir(int a, int b) {
                return (a/b);
            }

            @Override
            public double exponenciacao(double a, double b) {
                return (Math.pow(a, b));
            }

            @Override
            public double radiciacao(double a, double b) {
                return (Math.pow(a, 1/b));
            }

        };

        System.out.println("tipo do objeto anonimo = "+anonimo.getClass());
        System.out.println("=> "+ anonimo.somar(5, 5));
        System.out.println("=> "+ anonimo.subtrair(6,4));
        System.out.println("=> "+ anonimo.multiplicar(3,4));
        System.out.println("=> "+ anonimo.dividir(10,2));
        System.out.println("=> "+ anonimo.exponenciacao(12,3));
        System.out.println("=> "+ anonimo.radiciacao(7,4));
    }

    @Override
    public double calcular() {

        return 0;
    }
}
