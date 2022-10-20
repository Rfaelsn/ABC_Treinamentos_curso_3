package com.unidade3;

public class Stats <T extends Number>{
    T [] num;

    public Stats(T[] num) {
        super();
        this.num = num;
    }

    double media(){
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            soma += num[i].doubleValue();
        }

        return soma/(num.length);
    }

    public static void main(String[] args) {
        Double teste1 []= {9.0,3.0,9.0,3.0};
        Stats<Double> teste = new Stats<>(teste1);
        System.out.println(teste.media());
    }

}
