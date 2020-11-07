package level_1.lesson_3;

public class FormattedOutput {

    public static void main(String[] args) {
        printData(30, "Roma", 150.22);
        printData(1, "Ivan", 100.22);
        printData(999, "Anton", 15959.22);
    }

    public static void printData(int age, String name, double zp) {
        System.out.printf("Возраст %5d, Имя %18s, зп:%.1f\n", age, name, zp);
    }

}
