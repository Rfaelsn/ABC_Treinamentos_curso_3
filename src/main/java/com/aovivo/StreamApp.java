package com.aovivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* <h1>WassabiApp.java</h1>
* <p>
*   Desafio Ordenação sem utilização de Stream.
* </p>
*
* @author Rafael Silva do Nascimento
* @version 1.0
* @since 28-10-2022
*/

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
        String resultFiltro = "";
        for (String funcionario : funcionarios) {
            if (funcionario.startsWith(filtro)) {
                resultFiltro += (funcionario+"\n");
            }
        }
        System.out.println(resultFiltro);
    }

    public static void ordenar(String filtro){
        List <String> resultFiltro = new ArrayList<>();
        for (String funcionario : funcionarios) {
            if (funcionario.startsWith(filtro)) {
                resultFiltro.add(funcionario);
            }
        }
        Collections.sort(resultFiltro);
        System.out.println(resultFiltro);
    }

    public static void contar(String filtro){
        int contElementos = 0;
        for (String funcionario : funcionarios) {
            if (funcionario.startsWith(filtro)) {
                contElementos++;
            }
        }
        System.out.println(contElementos);
    }
}
