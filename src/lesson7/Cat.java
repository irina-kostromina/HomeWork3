package lesson7;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plateForFood) {
        if (plateForFood.canSatiety(appetite)) {
            plateForFood.decriesFood(appetite);
            satiety = true;
        }
    }
    public void info() {
        System.out.println("[" + name + ", " + appetite + ", " + satiety + "]");
    }

    public boolean isSatiety() {
        return satiety;
    }
}
