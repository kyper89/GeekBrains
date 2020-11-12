package level_1.lesson_6;

public class Animal {

    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {
        System.out.println("voice");
    }
}
