package level_2.lesson_1;

public class Human implements Competitor {

    private String name;
    private int runLimit;
    private int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String toString() {
        return "Human " + name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

}
