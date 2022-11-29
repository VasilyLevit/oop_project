package src.main.java.org.example;

import java.util.ArrayList;

public class WizardBuilder {
    private ArrayList<Npc> group;

    public WizardBuilder setGroup(ArrayList<Npc> group) {
        this.group = group;
        return this;
    }

    public Wizard createWizard() {
        return new Wizard(group);
    }
}