package level_2.lesson_1;

public interface Competitor {

    default boolean run(Obstacle obstacle) {
        int distance = obstacle.getSize();
        boolean success = getRunLimit() >= distance;
        String message = (success) ? "successfully ran" : "was unable to run";
        System.out.printf("%s %s %s\n", this, message, obstacle);
        return success;
    }

    default boolean jump(Obstacle obstacle) {
        int height = obstacle.getSize();
        boolean success = getJumpLimit() >= height;
        String message = (success) ? "jumped over" : "could not jump";
        System.out.printf("%s %s %s\n", this, message, obstacle);
        return success;
    }

    int getRunLimit();

    int getJumpLimit();

}
