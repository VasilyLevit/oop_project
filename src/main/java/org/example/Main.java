package src.main.java.org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> darkside = new ArrayList<>();
        ArrayList<Npc> lightside = new ArrayList<>();
        darkside.add(new PeasantBuilder().createPeasant());
        darkside.add(new RobberBuilder().createRobber());
        darkside.add(new SniperBuilder().createSniper());
        darkside.add(new WizardBuilder().createWizard());

        lightside.add(new PeasantBuilder().createPeasant());
        lightside.add(new SpearmanBuilder().createSpearman());
        lightside.add(new XbowmanBuilder().createXbowman());
        lightside.add(new MonkBuilder().createMonk());

        darkside.forEach(n -> System.out.println(n));
        lightside.forEach(n -> System.out.println(n));
//      System.out.println(list);
    }
}