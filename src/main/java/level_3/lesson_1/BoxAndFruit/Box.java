package level_3.lesson_1.BoxAndFruit;

import level_3.lesson_1.BoxAndFruit.Fruit.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruits;

    public Box(T fruit) {
        fruits = new ArrayList<>();
        fruits.add(fruit);
    }

    public void addFruit(T fruit) {
        //есть ли спопоб c помощью обобщений красивее обойти последствия полиформизма "extends Fruit"?
        if (fruits.get(0).getClass().equals(fruit.getClass())) {
                fruits.add(fruit);
            } else {
            System.out.println("Нельзя смешивать фрукты!");
        }
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeightFruit();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void pourOver(Box<T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box" + fruits.toString();
    }

}

