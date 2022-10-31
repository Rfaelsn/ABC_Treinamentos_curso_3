package com.aovivo.abctreinamentos;

import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import javax.swing.JOptionPane;

public class LojaVirtual {
    private static Map <Cliente,Set<Curso>> pagamentos = new HashMap<>();
    private static double faturamentoTotal = 0;

    public static void listarCursos(Set<Curso>cursos){
        //referência de método
        cursos.forEach(System.out::println);

        // lambda
        /* cursos.forEach(
            curso ->{
                System.out.println(
                    curso.getNomeCurso()+"|| valor: "+curso.getValorCurso()+"R$"
                );
            }
        ); */
    }

    public static void calcularTotalAuferido(){
        pagamentos.entrySet()
        .stream()
        .forEach(pagamento -> {
            pagamento.getValue()
            .stream()
            .forEach(curso -> faturamentoTotal += curso.getValorCurso());
        });
        System.out.println("Faturamento total: "+faturamentoTotal+"\n");
    }

    public static void ordenarClientes(){
        System.out.println("Clientes:\n");
        pagamentos.entrySet()
        .stream()
        .sorted((p1, p2) -> p1.getKey().getNome().compareTo(p2.getKey().getNome()))
        .forEach(p -> System.out.println(p.getKey().getNome()));
    }

    public static void ordenarClientesPorTotalPedido(){
        System.out.println("Clientes:\n");
        pagamentos.entrySet()
        .stream()
        .map(cliente_pagamento -> cliente_pagamento.getKey().getTotalGasto())
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
    }


    public static void main(String[] args) {
        boolean execucao = true;
        String [] opcoes = {"sim","não"};
        while (execucao) {
            //criando sites disponiveis para a venda
            Curso java8 = new Curso(
                1,"Java8 para web", Paths.get("/java8"),200.00
            );

            Curso javaScript = new Curso(
                2,"JavaScript basico ao avançado", Paths.get("/javascript"),100.00
            );

            Curso flutter = new Curso(
                3,"flutter: Linguagem mobile híbrida", Paths.get("/flutter"),300.00
            );

            //cadastrando cliente
            Cliente cliente = new Cliente();

            cliente.setNome(
                JOptionPane.showInputDialog("Digite o seu nome:")
            );

            cliente.setCpf(
                JOptionPane.showInputDialog("Digite o seu cpf:")
            );

            cliente.setEmail(
                JOptionPane.showInputDialog("Digite o seu email:")
            );


            //seleção de cursos:
            boolean continuar = true;
            String selectCurso;
            String listaCurso[] = {"java 8","javascript","flutter","finalizar"};
            Set<Curso> cursos = new HashSet<Curso>();
            while (continuar) {
                selectCurso = (String) JOptionPane.showInputDialog(
                    null, "Selecione a Categoria de Produto",
                    null, JOptionPane.QUESTION_MESSAGE, null,
                    listaCurso, null
                );

                switch (selectCurso) {
                    case "java 8"->{
                        cursos.add(java8);
                        cliente.setTotalGasto(java8.getValorCurso());
                    }
                    case "javascript"->{
                        cursos.add(javaScript);
                        cliente.setTotalGasto(javaScript.getValorCurso());
                    }
                    case "flutter"->{
                        cursos.add(flutter);
                        cliente.setTotalGasto(flutter.getValorCurso());
                    }
                    case "finalizar"->{
                        continuar=false;
                    }
                }
            }

            if (cursos.size()>0) {
                pagamentos.put(cliente, cursos);
                Consumer<Set<Curso>> Consumer = LojaVirtual::listarCursos;
                Consumer.accept(cursos);

            }else{
                JOptionPane.showMessageDialog(null, "programa finalizado. nenhum curso foi selecionado!");
            }

            execucao = JOptionPane.showOptionDialog(
                null, "deseja inserir mais um produto ?", "titulo",JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, opcoes , null
            )  == JOptionPane.YES_OPTION;

            /* if (execucao == false) {
                calcularTotalAferido();
                ordenarClientes();
            } */
        }

        calcularTotalAuferido();
        ordenarClientes();
        ordenarClientesPorTotalPedido();
    }
}
