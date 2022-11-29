package src.main.java.org.example;

import java.util.ArrayList;

public class Spearman extends Npc {
    public Spearman(ArrayList<Npc> group) {
        super(4, 5, 0, new int[]{1, 3}, 10, 4, false, false, "");
        super.group = group;
    }
}
