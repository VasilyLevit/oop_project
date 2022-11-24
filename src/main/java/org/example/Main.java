package src.main.java.org.example;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> list = new ArrayList<>();
        list.add(new Peasant());
        list.add(new Robber());
        list.add(new Sniper());
        list.add(new Wizard());
        list.add(new Spearman());
        list.add(new Xbowman());
        list.add(new Monk());

        list.forEach(n -> System.out.println(n));
//      System.out.println(list);
    }
}