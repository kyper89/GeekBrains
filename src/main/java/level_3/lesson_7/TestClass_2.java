package level_3.lesson_7;

import level_3.lesson_7.Annotations.BeforeSuite;
import level_3.lesson_7.Annotations.Test;

public class TestClass_2 {

    boolean test = true;

    public TestClass_2() {
        System.out.println("Конструктор по умолчанию");
    }

    public TestClass_2(boolean test) {
        System.out.println("Второй конструктор");
        this.test = test;
    }

    @BeforeSuite
    public static void method0() {
        System.out.println("BeforeSuite_2");
    }

    @Test
    @BeforeSuite
    public void method00() {
        System.out.println("BeforeSuite_2");
    }

}
