package com.unidade3;

public class UsoGenerics2 {
    public static void main(String[] args) {
        Login<String,String> iob = new Login<>("Rafael","@123");
        iob.showType();
    }
}
