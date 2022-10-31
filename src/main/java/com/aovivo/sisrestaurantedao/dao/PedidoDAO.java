package com.aovivo.sisrestaurantedao.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aovivo.sisrestaurantedao.model.Cliente;
import com.aovivo.sisrestaurantedao.model.Produto;

public class PedidoDAO implements ICrud <Map <Cliente,List<Produto>>> {
    
    private Map <Cliente,List<Produto>> pedidos = new HashMap<>();

    public void createPedido(Cliente cliente, List<Produto> produtos) {
        pedidos.put(cliente, produtos);
    
    }
    

    @Override
    public void create(Map pedido) {
        
        
    }
    
    @Override
    public void update(int id, Map pedido) {
        pedido.get(pedido);
        
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }


    
    
}
