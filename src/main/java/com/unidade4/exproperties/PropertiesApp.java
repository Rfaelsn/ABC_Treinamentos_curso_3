package com.unidade4.exproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws Exception {
        Properties sites = new Properties();
        sites.loadFromXML(new FileInputStream("D:/beckup/faculdade/5 semestre/netbiss/exercicios/curso03/curso03/src/main/java/com/unidade4/exproperties/site.xml"));
        System.out.println(sites.getProperty("1"));
    }
}
