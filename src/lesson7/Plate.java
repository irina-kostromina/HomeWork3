package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean canSatiety(int appetite) {
        return food >= appetite;
    }

    public void decriesFood(int appetite) {
        food = food - appetite;

        if (food < 0) {
            food = 0;
        }
    }

    public void increaseFood(int add) {
        food = add + food;
    }

    public void info() {
        System.out.println("[" + food + "]");
    }

}
