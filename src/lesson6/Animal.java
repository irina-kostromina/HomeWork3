package lesson6;

public abstract class Animal {

    private static int animalCount = 0;
    public Animal() {
        animalCount++;
    }

    public void swim(int distance) {
        System.out.println("Не умею плавать..");
    }

    public abstract void run(int distance);

    public static void showAnimalCountCreated() {
        System.out.println("Животных было создано: " + animalCount);
    }
}
