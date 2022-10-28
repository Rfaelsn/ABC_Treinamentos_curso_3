package com.unidade5.com.abctreinamentos;
@FunctionalInterface
public interface Formula {
    double calcular();

    default double sqrt(int a){
        return Math.sqrt(a);
    }

    default double sqrtX(int a,int b){
        return Math.pow(a, 1/b);
    }
}
