package com.aovivo.sisrestaurantedao.dao;


public interface ICrud <T> {
    
    public void create(T entidade);

    public void update (int id, T entidade);

    public void delete(int id);


}
