package com.unidade5;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    public static List <String> funcionarios;
    public static void main(String[] args) {
        funcionarios = new ArrayList<>();
        funcionarios.add("Andreia");
        funcionarios.add("Antônio");
        funcionarios.add("Rodrigo");
        funcionarios.add("Rafael");
        filtrar("A");
        ordenar("A");
        contar("A");
    }

    public static void filtrar(String filtro) {
        funcionarios
        .stream()
        .filter(funcionario-> funcionario.startsWith(filtro))
        .forEach(System.out::println);
    }

    public static void ordenar(String filtro){
        funcionarios
        .stream()
        .sorted()
        .filter(funcionario-> funcionario.startsWith(filtro))
        .forEach(System.out::println);
    }

    public static void contar(String filtro){
        long contFuncionarios = funcionarios
        .stream()
        .filter(funcionario-> funcionario.startsWith(filtro))
        .count();
        System.out.println(contFuncionarios);
    }
}
