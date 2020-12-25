package level_2.lesson_5;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        synchronousMethod();
        asynchronousMethod();
    }

    private static void synchronousMethod() {

        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);

        long start = System.currentTimeMillis();
        calculateArray(arr);
        long finish = System.currentTimeMillis();

        System.out.printf("The execution time of the synchronous method is %d ms %n", finish - start);
    }

    private static void asynchronousMethod() throws InterruptedException {

        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);

        long start = System.currentTimeMillis();

        float[] a1 = Arrays.copyOfRange(arr, 0, HALF);
        Thread thread1 = new Thread(() -> calculateArray(a1), "Thread 1");
        thread1.start();

        float[] a2 = Arrays.copyOfRange(arr, HALF, SIZE);
        Thread thread2 = new Thread(() -> calculateArray(a2), "Thread 2");
        thread2.start();

        thread1.join();
        thread2.join();

        long finish = System.currentTimeMillis();

        System.out.printf("The execution time of the asynchronous method is %d ms %n", finish - start);
    }

    private static void calculateArray (float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
