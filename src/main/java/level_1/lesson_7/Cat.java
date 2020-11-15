package level_1.lesson_7;

class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;
    private StringBuilder sb;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (this.appetite < p.getFood()) {
            p.decreaseFood(this.appetite);
            this.satiety = true;
        }
    }

    public void info() {
        sb = new StringBuilder(34);
        sb.append(this.name).append(" the cat is ").append(this.satiety ? "full" : "hungry");
        System.out.println(sb.toString());
    }

}