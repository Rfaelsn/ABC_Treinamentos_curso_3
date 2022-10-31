package com.aovivo.sisrestaurantedao.dao;

import java.util.ArrayList;
import java.util.List;

import com.aovivo.sisrestaurantedao.model.Produto;

public class ProdutoDAO implements ICrud<Produto>{

    private static List<Produto> produtos = new ArrayList<>();

    @Override
    public void create(Produto cliente) {
        produtos.add(cliente);
    }

    @Override
    public void update(int id, Produto produto) {

        for (int i = 0; i <produtos.size() ; i++) {
            if (id == produtos.get(i).getId()) {
                produtos.add(i, produto);
            }
        }
        
    }

    @Override
    public void delete(int id) {

        for (int i = 0; i <produtos.size() ; i++) {
            if (id == produtos.get(i).getId()) {
                produtos.remove(i);
            }
        }
        
    }


    
    
}
