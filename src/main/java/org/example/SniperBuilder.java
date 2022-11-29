package src.main.java.org.example;

import java.util.ArrayList;

public class SniperBuilder {
    private ArrayList<Npc> group;

    public SniperBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Sniper createSniper() {
        return new Sniper(group);
    }
}