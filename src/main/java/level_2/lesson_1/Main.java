package level_2.lesson_1;

public class Main {
    public static void main(String[] args) {

        Competitor[] arrCompetitors = new Competitor[3];
        arrCompetitors[0] = new Human("Roman", 500, 1);
        arrCompetitors[1] = new Cat("Murka", 100, 2);
        arrCompetitors[2] = new Robot("R2D2", 999999999, 0);

        Obstacle[] arrObstacles = new Obstacle[4];
        arrObstacles[0] = new Wall(1);
        arrObstacles[1] = new Treadmill(300);
        arrObstacles[2] = new Wall(2);
        arrObstacles[3] = new Treadmill(800);

        for (Competitor comp : arrCompetitors) {
            for (Obstacle obs : arrObstacles) {
                if (!obs.overcomeObstacle(comp)) {
                    break;
                }
            }
            System.out.println();
        }

    }
}
