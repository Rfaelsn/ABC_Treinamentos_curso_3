package com.unidade4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap<>();
        mapa.put(4, "Rafael");
        mapa.put(2, "Rafael");
        mapa.put(3, "Marcos");
        mapa.put(3, "Rodrigo");
        mapa.put(1, "Sampaio");

        System.out.println(mapa);
    }
}
