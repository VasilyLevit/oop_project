package src.main.java.org.example;

import java.util.ArrayList;

public class MonkBuilder {
    private ArrayList<Npc> group;

    public MonkBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Monk createMonk() {
        return new Monk(group);
    }
}