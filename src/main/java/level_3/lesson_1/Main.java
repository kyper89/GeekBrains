package level_3.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] arr = new Object[] {1, "i", 'j', 4.0, 3f};

        for (Object o : arr) {
            System.out.println(o);
        }

        swapElements(arr, 2, 4);
        System.out.println();

        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println(arrayToArrayList(arr));

    }

    private static void swapElements(Object[] arr, int i, int j) {

        try {
            Object iElement = arr[i];
            Object jElement = arr[j];
            arr[i] = jElement;
            arr[j] = iElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Переданные параметры находятся за границами массива");
        }

    }

    private static ArrayList<Object> arrayToArrayList(Object[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
