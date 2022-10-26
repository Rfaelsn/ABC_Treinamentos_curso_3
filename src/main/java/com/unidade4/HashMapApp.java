package com.unidade4;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        // mantem a ordem por hash
        Map <Integer,String> mapa = new HashMap<>();
        mapa.put(1, "Rafael");
        mapa.put(2, "Rafael");
        mapa.put(3, "Marcos");
        mapa.put(3, "Rodrigo");
        mapa.put(4, "Sampaio");

        System.out.println(mapa);
    }
}
