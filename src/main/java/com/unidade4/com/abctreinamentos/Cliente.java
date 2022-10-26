package com.unidade4.com.abctreinamentos;


public class Cliente {
    private String cpf;
    private String nome;
    private String email;

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }



    public Cliente() {
    }


    @Override
    public String toString() {
        return "{nome='" + getNome()+"'}";
    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /* Set <Curso> cursos;

    public static void main(String[] args) {
        Curso java8 = new Curso("Java8");
        Curso oracle12c = new Curso("Oracle12c");

        Set <Curso> listaA = new HashSet<>();
        listaA.add(java8);
        listaA.add(oracle12c);
        Set <Curso> listaB = new HashSet<>();
        listaB.add(java8);

        //A - B
        // System.out.println("A - B");
        // listaA.removeAll(listaB);

        //interseção (Elementos comuns as duas listas)
        listaA.retainAll(listaB);
        System.out.println("Interseção entre A e B");
        System.out.println(listaA);

        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();

        cli1.setCursos(listaA);
        cli2.setCursos(listaB);

    } */


    /* public Set<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    } */

}
