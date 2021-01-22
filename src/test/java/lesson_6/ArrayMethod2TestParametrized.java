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
public class ArrayMethod2TestParametrized {

    private static ArrayMethods arrayMethods;
    boolean expected;
    int[] actual;

    public ArrayMethod2TestParametrized(boolean expected, int[] actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @BeforeClass
    public static void init() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    public void testMethod1() {
        Assert.assertEquals(expected, arrayMethods.method2(actual));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true,  new int[] {4, 1, 4, 4, 1, 1}},
                {true,  new int[] {4, 1, 4}},
                {false, new int[] {1, 2, 3, 4, 5, 6}},
                {false, new int[] {1, 1, 1}},
                {false, new int[] {4}},
                {false, new int[0]},
                {false, new int[5]},
        });
    }
}