package com.unidade4.fifa22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fifa22 {
    public static void main(String[] args) {
        List <Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador("Rafael",485.5,"Barcelona","Brasil"));
        jogadores.add(new Jogador("Cristiano",380.5,"Juventus","Portugal"));
        jogadores.add(new Jogador("Messi",385.5,"PSG","Argentina"));
        jogadores.add(new Jogador("Neymar",295.5,"PSG","Brasil"));
        jogadores.add(new Jogador("Mbappé",285.5,"PSG","França"));
        jogadores.add(new Jogador("Yago picachu",2.5,"Paysandu","Brasil"));


        Collections.sort(jogadores);
        System.out.println("=================================Placar========================================");

        for (int i = 0; i < 5; i++) {
            System.out.println(jogadores.get(i));
        }

        System.out.println("===============================================================================");

    }
}
