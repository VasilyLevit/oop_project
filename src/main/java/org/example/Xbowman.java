package src.main.java.org.example;

import java.util.ArrayList;

public class Xbowman extends Npc {
    public Xbowman(ArrayList<Npc> group) {
        super(6, 3, 16, new int[]{2, 3}, 10, 4, false, false, "");
        super.group = group;
    }
}
