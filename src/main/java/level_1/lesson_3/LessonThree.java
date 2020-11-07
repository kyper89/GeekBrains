package level_1.lesson_3;

import java.util.Scanner;

public class LessonThree {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //консоль
        System.out.println("это консоль");
        Scanner in = new Scanner(System.in);

        String wholeLine = in.nextLine();
        System.out.println("you: " + wholeLine);

        int wordOnly = in.nextInt();
        System.out.println("you: " + wordOnly);

        System.out.println();

        in.close();
    }

    /**
     *
     * @param min
     * @param max
     * @return
     */
    static int getValue(int min, int max) {
        int result;
        do {
            System.out.println("введите число от: " + min + " до " + max);
            result = in.nextInt();
        } while (result < min || result > max);

        return result;
    }
}
