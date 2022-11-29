package src.main.java.org.example;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> darkside = new ArrayList<>();
        ArrayList<Npc> lightside = new ArrayList<>();
        darkside.add(new Peasant());
        darkside.add(new Robber());
        darkside.add(new Sniper());
        darkside.add(new Wizard());

        lightside.add(new Peasant());
        lightside.add(new Spearman());
        lightside.add(new Xbowman());
        lightside.add(new Monk());

        darkside.forEach(n -> System.out.println(n));
        lightside.forEach(n -> System.out.println(n));
//      System.out.println(list);
    }
}