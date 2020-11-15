package level_1.lesson_7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {

        Random random = new Random();
        Plate plate = new Plate(100);

        Cat[] arrayCats = new Cat[10];
        for (int i = 0; i < 10; i++) {
            arrayCats[i] = new Cat((i + 1) + "th Cat", random.nextInt(25));
        }

        for (Cat cat : arrayCats){
            cat.eat(plate);
            cat.info();
        }

    }
}
