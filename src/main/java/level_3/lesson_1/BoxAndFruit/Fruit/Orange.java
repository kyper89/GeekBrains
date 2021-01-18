package level_3.lesson_1.BoxAndFruit.Fruit;

public class Orange extends Fruit{

    public static final float WEIGHT = 1.5f;

    @Override
    public float getWeightFruit() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "Orange{}";
    }
}
