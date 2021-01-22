package lesson_6;

import level_3.lesson_6.ArrayMethods;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayMethod1TestParametrized {

    private static ArrayMethods arrayMethods;
    int[] expected;
    int[] actual;

    public ArrayMethod1TestParametrized(int[] expected, int[] actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @BeforeClass
    public static void init() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    public void testMethod1() {
        Assert.assertArrayEquals(expected, arrayMethods.method1(actual));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[] {5, 6}, new int[] {4, 4, 4, 4, 5, 6}},
                {new int[] {5, 6}, new int[] {1, 2, 3, 4, 5, 6}},
                {new int[] {1, 6}, new int[] {4, 1, 6}},
                {new int[0]      , new int[] {4}},
        });
    }
}