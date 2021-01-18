package level_3.lesson_1.BoxAndFruit;

import level_3.lesson_1.BoxAndFruit.Fruit.Apple;
import level_3.lesson_1.BoxAndFruit.Fruit.Fruit;
import level_3.lesson_1.BoxAndFruit.Fruit.Orange;

public class App {

    public static void main(String[] args) {

        Box<Apple> appleBox= new Box<>(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox= new Box<>(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());

        Box<Orange> orangeBox2= new Box<>(new Orange());
        orangeBox2.addFruit(new Orange());
        System.out.println(orangeBox2.getWeight());

        Box<Fruit> fruitBox= new Box<>(new Apple());
        fruitBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());
        System.out.println(fruitBox.getWeight());

        System.out.printf("%s %b %s\n", appleBox,  appleBox.compare(orangeBox), orangeBox);
        System.out.printf("%s %b %s\n", appleBox,  appleBox.compare(fruitBox),  fruitBox);
        System.out.printf("%s %b %s\n", orangeBox, orangeBox.compare(fruitBox), fruitBox);

        orangeBox.pourOver(orangeBox2);
        System.out.println(orangeBox2.getWeight());
    }
}
