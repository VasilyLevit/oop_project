package src.main.java.org.example;

import java.util.ArrayList;

public class Monk extends Npc {
    public Monk(ArrayList<Npc> group) {
        super(12, 7, 0, new int[]{-4, -4}, 30, 5, false, true, "");
        super.group = group;
    }
}
// конструктор монк - вызов конструктора супер класса.
// вызов с параметрами будет передан в кнструктор базового класса и там оно будет инициализировано