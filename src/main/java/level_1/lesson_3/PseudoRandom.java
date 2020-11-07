package level_1.lesson_3;

import java.util.Random;

public class PseudoRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(10);
        System.out.println(rnd);

    }
}
