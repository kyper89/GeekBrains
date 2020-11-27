package level_2.lesson_2;

public class Main {

    public static final int X = 4;
    public static final int Y = 4;

    public static void main(String[] args) {

        Object[][] array = new Object[][] {
            {1, 2, 3, '0'},
            {-1, 2, -3, 4},
            {-1, 2, 1, 4},
            {1, -2, 3, -4}
        };

        try {
            sumOfArray(array);
        }
        catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void sumOfArray(Object[][] arrayOfValues) {

        if (arrayOfValues.length != X || arrayOfValues[0].length != Y) {
            throw new MyArraySizeException("Array size is not 4x4");
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                try {
                    int value = (int) arrayOfValues[i][j];
                    sum += value;
                }
                catch (ClassCastException e) {
                    throw new MyArrayDataException("Invalid value in [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("The sum of all array elements is " + sum);

    }
}
