
package com.unidade1;
public class TesteExcecao {
    public static void main(String[] args) {
        try {
            int i = 50;
            i  = i/0;
            System.out.println("o resultado é "+ i);
            Object c = null;
            System.out.println("O resultado é:" + c.toString());
        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
