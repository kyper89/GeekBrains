package level_2.lesson_1;

public abstract class Obstacle {
    protected int size;

    public Obstacle(int size) {
        this.size = size;
    }

    public abstract boolean overcomeObstacle(Competitor competitor);

    public int getSize() {
        return this.size;
    }
}
