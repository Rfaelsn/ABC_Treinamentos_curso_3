package com.unidade4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List <String> cores = new ArrayList<String>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Verde");
        cores.add("Amarelo");
        Collections.sort(cores);
        System.out.println(cores);
    }
}
