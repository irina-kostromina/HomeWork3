package lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 100);
        Cat cat2 = new Cat("Марс", 50);
        Cat cat3 = new Cat("Пушок", 20);
        Plate plate1 = new Plate(200);

        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        for (int i = 0; i < 3; i++) {
            cats[i].eat(plate1);
            cats[i].info();
        }
        plate1.info();
    }
}