package level_1.lesson_6;

public class Polymorph {

    public static void main(String[] args) {

        Animal animal = new Animal("an", "s", 0);
        Animal catAnimal = new Cat("cat", "s", 0);
        Animal dogAnimal = new Dog("dog", "w", 1);

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = catAnimal;
        animals[2] = dogAnimal;

        for (Animal anAnimal : animals){
            anAnimal.voice();
            if (anAnimal instanceof Cat) {

                Cat cat = (Cat) anAnimal;
                cat.meow();
                // ||
                ((Cat) anAnimal).meow();

            }
        }

    }
}
