package level_1.lesson_6;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("mau");
    }

    public void meow() {
        System.out.println("mau mau mau mau");
    }

}
