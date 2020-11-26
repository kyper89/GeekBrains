package level_2.lesson_1;

public class Wall extends Obstacle {

    public Wall(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return "a wall " + this.size + "m high";
    }

    @Override
    public boolean overcomeObstacle(Competitor competitor) {
        return competitor.jump(this);
    }
}
