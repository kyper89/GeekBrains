package level_1.lesson_2;

public class SecondApp {

    public static void main(String[] args) {

        int age = 10;
        switch (age) {
            case 6:
                System.out.println("Sad");
                break;
            case 10:
                System.out.println("school");
                break;
            default:
                System.out.println("no data");
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.println(x);
        }

        // бесконечный цикл
        while (true) {
            System.out.println("0");
        }
    }

    public static String chekAge(int age2) {
        switch (age2) {
            case 6: return "Sad";
            case 10: return "school";
            default: return "no data";
        }
    }
}
