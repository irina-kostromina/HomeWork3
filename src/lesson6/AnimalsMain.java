package lesson6;

public class AnimalsMain {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat2.run(500);
        cat1.run(150);
        cat1.swim(200);

        dog1.run(200);
        dog2.swim(15);

        Animal.showAnimalCountCreated();
        Cat.showCountCreated();
        Dog.showCountCreated();
    }
}
