package src.main.java.org.example;

import java.util.ArrayList;

public class SpearmanBuilder {
    private ArrayList<Npc> group;

    public SpearmanBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Spearman createSpearman() {
        return new Spearman(group);
    }
}