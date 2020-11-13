package level_1.lesson_6.homework;

import java.util.Random;

abstract class Animal {

    static Random random = new Random();

    String name;
    int runLimit, swimLimit, jumpLimit;

    Animal(int runLimit, int jumpLimit) {
        this.runLimit = 200 + random.nextInt(runLimit);
        this.jumpLimit = 1 + random.nextInt(jumpLimit);
    }

    final void run(int distance) {
        System.out.println(this.name + " run " + distance + ": " + (distance < this.runLimit ? "success" : "failure"));
    }

    final void swim(int distance) {
        System.out.println(this.name + " swim " + distance + ": " + (distance < this.swimLimit ? "success" : "failure"));
    }

    final void jump(int distance) {
        System.out.println(this.name + " jump " + distance + ": " + (distance < this.jumpLimit ? "success" : "failure"));
    }

}
