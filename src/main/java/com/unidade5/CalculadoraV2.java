package com.unidade5;

public class CalculadoraV2 {
    public static void main(String[] args) {
        CalculadoraV2 objeto = new CalculadoraV2();
        IMath adicao = (a,b) -> a+b;
        IMath subtracao = (a,b) -> a-b;
        IMath multiplicacao = (a,b) -> a*b;
        IMath divisao = (a,b) -> a/b;
        IMath exponenciacao = (a,b) -> Math.pow(a, b);
        IMath radiciacao = (a,b) -> Math.pow(a, 1/b);

        /* utilizando as expressões */
        System.out.println(objeto.execOperacao(2, 2, adicao));
        System.out.println(objeto.execOperacao(6, 3, subtracao));
        System.out.println(objeto.execOperacao(5, 2, multiplicacao));
        System.out.println(objeto.execOperacao(10, 2, divisao));
        System.out.println(objeto.execOperacao(5, 2, exponenciacao));
        System.out.println(objeto.execOperacao(5, 1, radiciacao));
    }

    public double execOperacao(double a, double b, IMath op) {
        return op.operacao(a, b);
    }
}
