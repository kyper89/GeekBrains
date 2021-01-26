package level_3.lesson_7;

import level_3.lesson_7.Annotations.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class MainApp {

    public static void main(String[] args) throws Exception {
        start(TestClass.class);
        start(TestClass_2.class);
    }

    static <T> void start (Class<T> testClass) throws Exception {

        Object obj = testClass.getDeclaredConstructor().newInstance();

        Method methodBeforeSuite = null;
        List<Method> methodsTest = new ArrayList<>();
        Method methodAfterSuite = null;

        Method[] methods = testClass.getDeclaredMethods();
        for (Method m : methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)) {
                if (methodBeforeSuite == null) {
                    methodBeforeSuite = m;
                } else throw new RuntimeException("Метод с аннотацией BeforeSuite описан более одного раза!");
            } else if (m.isAnnotationPresent(AfterSuite.class)) {
                if (methodAfterSuite == null) {
                    methodAfterSuite = m;
                } else throw new RuntimeException("Метод с аннотацией AfterSuite описан более одного раза!");
            } else {
                methodsTest.add(m);
            }
        }

        executeMethod(methodBeforeSuite, obj);
        methodsTest.sort(Comparator.comparingInt(m -> m.getAnnotation(Test.class).priority()));
        for (Method methodTest : methodsTest) {
            executeMethod(methodTest, obj);
        }
        executeMethod(methodAfterSuite, obj);

    }

    static void executeMethod(Method m, Object defaultInstance) throws Exception {
        if (m == null) return;

        if (Modifier.isPrivate(m.getModifiers())) {
            m.setAccessible(true);
        }
        m.invoke(getInstance(m, defaultInstance));
    }

    static Object getInstance(Method method, Object defaultInstance) {
        return Modifier.isStatic(method.getModifiers()) ? null : defaultInstance;
    }

}
