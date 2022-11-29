package src.main.java.org.example;
import java.util.ArrayList;
/**
 * Базовый класс Npc для персонажа
 */
public abstract class Npc implements BaseInterface {
    int attack;
    int defense;
    int shots;
    int[] damage;
    int health;
    int speed;
    Boolean delivery;
    Boolean magic;
    String name;
    private ArrayList<Npc> group; // список


    /**
     * Конструктор
     * @param attack атака - сила актки - цифровое
     * @param defense защита - уровень защиты - цифровое
     * @param shots выстрелы - цифровое
     * @param damage урон - защита-атаку=повреждение - вибирая между мин и микс - массив из 2х значений
     * @param health здоровье - цифровое
     * @param speed скорость - перемещения - цифровое
     * @param delivery доставка - для крестьянина, который может доставлять стрелы - 2а состояния
     * @param magic магия - владение магией - 2а состояния
     * @param name состояние (мёртв, жив, и т.п.)
     */
    public Npc(int attack, int defense, int shots, int[] damage, int health,  int speed, Boolean delivery, Boolean magic,String name) {
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getShots() {
        return shots;
    }
    public int[] getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public int getSpeed() {
        return speed;
    }
    public Boolean getDelivery() {
        return delivery;
    }
    public Boolean getMagic() {
        return magic;
    }
    public String getName() {
        return name;
    }

//    public int setAttack(int attack) {
//        if (attack >= 0) this.attack = attack;
//    }
//    public int setDefense(int defense) {
//        if (defense >= 0) this.defense = defense;
//    }
//    public int setShots(int shots) {
//        if (shots >= 0) this.shots = shots;
//    }
//    public int setDamage(int[] damage) {
//        this.damage = damage;
//    }
//    public int setHealth(int health) {
//        if (health >= 0) this.health = health;
//    }
//    public int setSpeed(int speed) {
//        if (speed >= 0) this.speed = speed;
//    }
//    public int setDelivery(boolean delivery) {
//        this.delivery = delivery;
//    }
//    public int setMagic(boolean magic) {
//        this.magic = magic;
//    }
//    public int setName(String name) {
//        this.name = name;
//    }

//    @Override // переопределили toString, который наследуется из object
//    public String toString() {
//        return "attack=" + attack + " defense=" + defense + " shots=" + shots + " damage=" + damage[0] + ", " + damage[1]
//                + " health=" + health + " speed=" + speed + " delivery=" + delivery + " magic=" + magic;
//    }

    public String getInfo() {
        return "attack=" + attack + " defense=" + defense + " shots=" + shots + " damage=" + damage[0] + ", " + damage[1]
                + " health=" + health + " speed=" + speed + " delivery=" + delivery + " magic=" + magic;
    }
    @Override
    public void Step() {

    }


}
