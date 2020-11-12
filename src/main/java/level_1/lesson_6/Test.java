package level_1.lesson_6;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal("think", "blue", 2);
        Cat cat = new Cat("murzik", "white", 1);
        Dog dog = new Dog("sphere", "white", 1);

        animal.voice();
        cat.voice();
        dog.voice();

    }
}
