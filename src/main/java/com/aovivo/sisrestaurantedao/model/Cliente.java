
package com.aovivo.sisrestaurantedao.model;
/**
* <h1>Cliente.java</h1>
* <p>
*   Esta é a classe que define os atributos de cliente.
* </p>
*
* @author Rafael Silva do Nascimento
* @version 1.0
* @since 28-10-2022
*/

public class Cliente {
    private String nome;
    private long cpf;
    private String telefone;
    private String endereco;
    private String cardCredito;


    public Cliente() {
    }



    public Cliente(String nome, long cpf, String telefone, String endereco, String cardCredito) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cardCredito = cardCredito;
    }




    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCardCredito() {
        return this.cardCredito;
    }

    public void setCardCredito(String cardCredito) {
        this.cardCredito = cardCredito;
    }




}
