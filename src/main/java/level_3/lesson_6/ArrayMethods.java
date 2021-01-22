package level_3.lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethods {

    public int[] method1(int[] arr){

        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] != 4) {
                list.add(arr[i]);
            } else break;
        }

        if (list.size() == arr.length) throw new RuntimeException();

        int[] result = new int[list.size()];
        for (int i = 0, j = list.size() - 1; i < list.size(); i++, j--) {
            result[i] = list.get(j);
        }

        return result;
    }

    public boolean method2(int[] arr){

        boolean containsOne = false;
        boolean containsFour = false;
        for (int element: arr) {
            switch (element) {
                case 1 :
                    containsOne = true;
                    break;
                case 4 :
                    containsFour = true;
                    break;
                default:
                    return false;
            }
        }

        return containsOne && containsFour;
    }
}
