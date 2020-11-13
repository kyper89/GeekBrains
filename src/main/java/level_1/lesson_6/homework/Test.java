package level_1.lesson_6.homework;

public class Test {

    public static void main(String[] args) {

        Animal[] testedAnimals = new Animal[20];
        for (int i = 0, j = 10; i < 10; i++, j++) {
            testedAnimals[i] = new Dog();
            testedAnimals[j] = new Cat();
        }

        for (Animal testedAnimal : testedAnimals) {
            testedAnimal.run(600);
            testedAnimal.swim(100);
            testedAnimal.jump(2);
        }

    }
}
