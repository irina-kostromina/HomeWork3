package lesson6;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака плывет " + distance + " метров");
        } else {
            System.out.println("Собака больше 10 метров не умеет плыть за раз");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака бежит " + distance + " метров");
        } else {
            System.out.println("Собака больше 500 метров не умеет бегать за раз");
        }
    }

    public static void showCountCreated() {
        System.out.println("Собак было создано: " + dogCount);
    }
}

