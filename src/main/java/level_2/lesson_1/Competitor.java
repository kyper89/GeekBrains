package level_2.lesson_1;

public interface Competitor {

    default boolean run(Competitor competitor, Obstacle obstacle) {
        int distance = obstacle.getSize();
        boolean success = competitor.getRunLimit() >= distance;
        String message = (success) ? "successfully ran" : "was unable to run";
        System.out.printf("%s %s %s\n", competitor, message, obstacle);
        return success;
    }

    default boolean jump(Competitor competitor, Obstacle obstacle) {
        int height = obstacle.getSize();
        boolean success = competitor.getJumpLimit() >= height;
        String message = (success) ? "jumped over" : "could not jump";
        System.out.printf("%s %s %s\n", competitor, message, obstacle);
        return success;
    }

    int getRunLimit();

    int getJumpLimit();

}
