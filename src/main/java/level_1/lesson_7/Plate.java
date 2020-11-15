package level_1.lesson_7;

class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }
    void increaseFood(int n) {
        food += n;
    }

    void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

}