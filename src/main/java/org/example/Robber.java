package src.main.java.org.example;

import java.util.ArrayList;

public class Robber extends Npc {
    public Robber(ArrayList<Npc> group) {
        super(8, 3, 0, new int[]{2, 4}, 10, 6, false, false, "");
        super.group = group;
    }
}
