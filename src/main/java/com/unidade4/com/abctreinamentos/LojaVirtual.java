package com.unidade4.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class LojaVirtual {
    private static Map <Cliente,Set<Curso>> pagamentos = new HashMap<>();

    public static void main(String[] args) {
        //criando sites disponiveis para a venda
        Curso java8 = new Curso(
            1,"Java8 para web", Paths.get("/java8"),108.02f
        );

        Curso javaScript = new Curso(
            2,"JavaScript basico ao avançado", Paths.get("/javascript"),108.02f
        );

        Curso flutter = new Curso(
            3,"flutter: Linguagem mobile híbrida", Paths.get("/flutter"),108.02f
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
            JOptionPane.showMessageDialog(null, pagamentos);
        }else{
            JOptionPane.showMessageDialog(null, "programa finalizado. nenhum curso foi selecionado!");
        }
    }
}
