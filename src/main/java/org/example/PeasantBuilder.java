package src.main.java.org.example;

import java.util.ArrayList;

public class PeasantBuilder {
    private ArrayList<Npc> group;

    public PeasantBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Peasant createPeasant() {
        return new Peasant(group);
    }
}