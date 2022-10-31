package com.aovivo.sisrestaurantedao.model;

import java.util.ArrayList;
import java.util.List;

/**
* <h1>Entrada.java</h1>
* <p>
*   Esta classe Representa os atributos de produtos da classificação "Entrada" do restaurante.
* </p>
*
* @author Rafael Silva do Nascimento
* @version 1.0
* @since 28-10-2022
*/

public class Entrada extends Produto{

    private static List <Entrada> produtosEntrada = new ArrayList<>();

    static{
        produtosEntrada.add(new Entrada(
            "Salmão em Consumer",
            "Salmão em Consumer com base de purê de Batata doce",
            39.0,
            "Salmao_consumer.jpg"
        ));

        produtosEntrada.add(new Entrada(
            "Lula em Anéis Grelhada",
            "Anéis de lula grelhada em fogo Brando com farofa de polvo",
            41.0,
            "lula_aneis.jpg"
        ));
    }

    public Entrada(String nomeProduto, String descricaoProduto, double precoProduto, String imgProduto) {
        super(nomeProduto, descricaoProduto, precoProduto, imgProduto);
        //TODO Auto-generated constructor stub
    }


    public Entrada() {

    }


    public List<Entrada> getProdutosEntrada() {
        return this.produtosEntrada;
    }

}
