package level_1.lesson_5.homework;

public class Gender {
    String description;

    public Gender(String description) {
        if (description.equals("male") || description.equals("female")) {
            this.description = description;
        }
    }
}
