package com.unidade3;

public class UsoGenerics {
    public static void main(String[] args) {
        ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
        iob.showType();
        ExemploGenerics<String> sob = new ExemploGenerics<>("Rafael");
        sob.showType();

    }
}
