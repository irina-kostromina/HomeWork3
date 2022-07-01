package lesson6;

public class Cat extends Animal {

    private static int catCount = 0;

    public Cat() {
        super();
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот бежит " + distance + " метров");
        } else {
            System.out.println("Кот больше 200 метров не умеет бегать за раз");
        }
    }

    public static void showCountCreated() {
        System.out.println("Котов было создано: " + catCount);
    }
}