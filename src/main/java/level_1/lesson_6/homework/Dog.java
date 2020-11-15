package level_1.lesson_6.homework;

class Dog extends Animal {

    static int counter;

    Dog() {
        super(1000, 3);
        this.swimLimit = 50 + random.nextInt(100);
        counter++;
        this.name = "Dog №" + counter;
    }
}
