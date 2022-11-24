package src.main.java.org.example;

public class Monk extends Npc {
    public Monk() {
        super(12, 7, 0, new int[]{-4, -4}, 30, 5, false, true, "");
    }
}
// конструктор монк - вызов конструктора супер класса.
// вызов с параметрами будет передан в кнструктор базового класса и там оно будет инициализировано