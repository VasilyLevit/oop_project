package src.main.java.org.example;

import java.util.ArrayList;

public class XbowmanBuilder {
    private ArrayList<Npc> group;

    public XbowmanBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Xbowman createXbowman() {
        return new Xbowman(group);
    }
}