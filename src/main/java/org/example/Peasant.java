package src.main.java.org.example;

import java.util.ArrayList;

public class Peasant extends Npc {

    public Peasant(ArrayList<Npc> group) {
        super(1,  1, 0, new int[]{1,1}, 1, 3, true, false, "");
        super.group = group;
    }
//    public Peasant(String name) {
//        super(1,  1, 0, new int[]{1,1}, 1, 3, true, false, name);
//
//    }
}


// new int[]{1,1} - автоинициализация, создаём массив и заполняем его двумя занчениями (в данном случае мин и макс)