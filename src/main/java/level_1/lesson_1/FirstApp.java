package level_1.lesson_1;

/**
 * commit
 */
public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte aByteValue = 10;
        System.out.println("aByteValue = " + aByteValue);

        aByteValue = 20;
        System.out.println("aByteValue = " + aByteValue);

        byte a = 10;
        byte b = 20;
        int c = 0;

        int sum = a + b;
        int mod = a % b;

        System.out.println(mod);

        System.out.println("4/3=" + (4/3)*2);

        c += 10;
        c -= 10;
        c *= 10;
        c /= 10;

        int day = 12345;
        day %= 365;

    }

    /*
        +
        -
        *
        /
        % - остаток от деления
     */

    /*
        [тип]  [название переменной] = [значение]
        byte (8 bit): -128 : 127           | 00 00 00 00
        short (16 bit): -32768 : 32767
        int (32 bit): 2 900 000 000
        long (64 bit): mnoga (ochen)

        float (32) -
        double (64) -

         char

         boolean: true / false
     */
}
