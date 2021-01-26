package level_3.lesson_7;

import level_3.lesson_7.Annotations.AfterSuite;
import level_3.lesson_7.Annotations.BeforeSuite;
import level_3.lesson_7.Annotations.Test;

public class TestClass {

    @BeforeSuite
    private void method0() {
        System.out.println("BeforeSuite");
    }

    @Test(priority = 8)
    protected void method1() {
        System.out.println("8");
    }

    @Test(priority = 1)
    void method2() {
        System.out.println("1");
    }

    @Test
    private void method3() {
        System.out.println("5");
    }

    @Test(priority = 2)
    void method4() {
        System.out.println("2");
    }

    @Test
    private void method5() {
        System.out.println("5");
    }

    @AfterSuite
    void method00() {
        System.out.println("AfterSuite");
    }
}
