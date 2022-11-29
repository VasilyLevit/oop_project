package src.main.java.org.example;

import java.util.ArrayList;

public class RobberBuilder {
    private ArrayList<Npc> group;

    public RobberBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Robber createRobber() {
        return new Robber(group);
    }
}