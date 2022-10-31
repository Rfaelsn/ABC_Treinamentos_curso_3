package com.aovivo.sisrestaurantedao.dao;


import java.util.ArrayList;
import java.util.List;

import com.aovivo.sisrestaurantedao.model.Cliente;

public class ClienteDAO implements ICrud<Cliente>{

    private static List <Cliente> clientes = new ArrayList<>();

    @Override
    public void create(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void update(int cpf, Cliente cliente) {

        for (int i = 0; i <clientes.size() ; i++) {
            if (cpf == clientes.get(i).getCpf()) {
                clientes.add(i, cliente);
            }
        }
        
    }

    @Override
    public void delete(int cpf) {

        for (int i = 0; i <clientes.size() ; i++) {
            if (cpf == clientes.get(i).getCpf()) {
                clientes.remove(i);
            }
        }
        
    }

    

    
    
}
