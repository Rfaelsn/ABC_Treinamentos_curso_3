package com.unidade5.com.abctreinamentos;

import java.nio.file.Paths;
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

    public static void calcularTotalAferido(){
        pagamentos.entrySet()
        .stream()
        .forEach(pagamento -> {
            pagamento.getValue()
            .stream()
            .forEach(curso -> faturamentoTotal += curso.getValorCurso());
        });
        System.out.println("Faturamento total: "+faturamentoTotal);
    }

    public static void ordenarClientes(){
        System.out.println("Clientes:\n");
        pagamentos.entrySet()
        .stream()
        .sorted()
        .forEach(pagamento -> {
            System.out.println(pagamento.getKey());
        });

    }


    public static void main(String[] args) {
        boolean execucao = true;
        String [] opcoes = {"sim","não"};
        while (execucao) {
            //criando sites disponiveis para a venda
            Curso java8 = new Curso(
                1,"Java8 para web", Paths.get("/java8"),200.00f
            );

            Curso javaScript = new Curso(
                2,"JavaScript basico ao avançado", Paths.get("/javascript"),100.00f
            );

            Curso flutter = new Curso(
                3,"flutter: Linguagem mobile híbrida", Paths.get("/flutter"),300.00f
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
                    case "java 8"-> cursos.add(java8);
                    case "javascript"-> cursos.add(javaScript);
                    case "flutter"-> cursos.add(flutter);
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

        calcularTotalAferido();
        ordenarClientes();
    }
}
