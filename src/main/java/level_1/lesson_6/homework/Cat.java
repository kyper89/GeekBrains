package level_1.lesson_6.homework;

class Cat extends Animal {

    static int counter;

    Cat() {
        super(500, 4);
        this.swimLimit = 0;
        counter++;
        this.name = "Cat №" + counter;
    }
}
