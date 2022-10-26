package com.unidade4.com.abctreinamentos;

import java.nio.file.Path;

public class Curso {

    private int cdCurso;
    private String nomeCurso;
    private Path url;
    private float valorCurso;



    public Curso(int cdCurso, String nomeCurso, Path url, float valorCurso) {
        this.cdCurso = cdCurso;
        this.nomeCurso = nomeCurso;
        this.url = url;
        this.valorCurso = valorCurso;
    }




    public Curso() {
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNomeCurso() + "'" +
            "}";
    }


    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCdCurso() {
        return this.cdCurso;
    }

    public void setCdCurso(int cdCurso) {
        this.cdCurso = cdCurso;
    }

    public float getValorCurso() {
        return this.valorCurso;
    }

    public void setValorCurso(float valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Path getUrl() {
        return this.url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }






}
