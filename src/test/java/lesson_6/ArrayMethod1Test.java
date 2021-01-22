package lesson_6;

import level_3.lesson_6.ArrayMethods;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayMethod1Test {
    private static ArrayMethods arrayMethods;

    @BeforeClass
    public static void init() {
        arrayMethods = new ArrayMethods();
    }

    @Test(expected = RuntimeException.class)
    public void testMethod1_1() {
        arrayMethods.method1(new int[]{1, 2});
    }

    @Test(expected = RuntimeException.class)
    public void testMethod1_2() {
        arrayMethods.method1(new int[0]);
    }

}
