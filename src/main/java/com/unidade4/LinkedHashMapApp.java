package com.unidade4;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        //ordena de acordo com a inserção dos dados
        Map <Integer,String> mapa = new LinkedHashMap<>();
        mapa.put(4, "Rafael");
        mapa.put(2, "Rafael");
        mapa.put(3, "Marcos");
        mapa.put(3, "Rodrigo");
        mapa.put(1, "Sampaio");

        System.out.println(mapa);
    }
}
