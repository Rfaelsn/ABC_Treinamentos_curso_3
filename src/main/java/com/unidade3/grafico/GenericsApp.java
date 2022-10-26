package com.unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {
    public static void main(String[] args) {
        List <Shape>shape = new ArrayList();
        shape.add(new Circle());
        shape.add(new Rectangle());

        /*Esta implementação está incorreta. a alternativa seria usar cast. ou
         * criar um list de retangulos ou um objeto shape para receber e depois
         * passar para o objeto
         */
        // Rectangle retangulo = shape.get(1);
        List <?> lista = shape;
    }
}
