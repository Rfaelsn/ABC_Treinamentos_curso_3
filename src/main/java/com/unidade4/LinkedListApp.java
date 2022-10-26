package com.unidade4;

import java.util.LinkedList;


public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList <String> cores = new LinkedList<String>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.removeFirst();
        cores.removeLast();
        System.out.println(cores);
    }
}
