package level_2.lesson_1;

public class Treadmill extends Obstacle {

    public Treadmill(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return this.size + "m on a treadmill";
    }

    @Override
    public boolean overcomeObstacle(Competitor competitor) {
        return competitor.run(competitor,this);
    }
}
