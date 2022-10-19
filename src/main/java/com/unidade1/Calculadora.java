package com.unidade1;

import java.util.Scanner;

public class Calculadora {
    public static void dividir (double num1,double num2) throws ArithmeticException {
        System.out.println(num1/num2);
    }

    public static void main(String[] args) throws DivisaoPorZeroException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor valor");
        double num2 = entrada.nextDouble();
        try{
            dividir(num1,num2);
        }catch (ArithmeticException e){
            throw new DivisaoPorZeroException();
        }
    }
}
