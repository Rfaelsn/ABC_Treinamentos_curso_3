package com.unidade4.fifa22;

public class Jogador implements Comparable<Jogador>{
    private String nome;
    private Double pontuacao;
    private String clube;
    private String pais;


    public Jogador() {
    }


    public Jogador(String nome, double pontuacao, String clube, String pais) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.clube = clube;
        this.pais = pais;
    }

    @Override
    public int compareTo(Jogador outroJogador) {
        //negativo se o this < pontOutroJog
        //return 0 caso this == pontOutroJog
        // postivo se this > pontOutroJog
        if(this.getPontuacao()>outroJogador.getPontuacao()){
            return -1;
        }else if (this.getPontuacao() == outroJogador.getPontuacao()){
            return 0;
        }else{
            return 1;
        }

    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", pontuacao='" + getPontuacao() + "'" +
            ", clube='" + getClube() + "'" +
            ", pais='" + getPais() + "'" +
            "}";
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getClube() {
        return this.clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
