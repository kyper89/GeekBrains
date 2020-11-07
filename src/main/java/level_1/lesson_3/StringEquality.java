package level_1.lesson_3;

public class StringEquality {

    public static void main(String[] args) {

        String myFullName = "Roma Karpov";
        System.out.println(myFullName);

        char c = myFullName.charAt(3); // проверять границу!

        String name = "Roma";
        String lastName = "Karpov";
        String newName = name + " " + lastName;

        System.out.println(myFullName == newName); // false  !!!!!!!!!!
        System.out.println(myFullName.equals(newName)); // true   !!!!!!!!!!!

        int a = 123;
        int b = 123;
        System.out.println(a == b); // true

        Integer aa = 123;
        Integer bb = 123;
        System.out.println(aa == bb); // true

        Integer aaa = 1233243464;
        Integer bbb = 1233243464;
        System.out.println(aaa == bbb); // false   !!!!

        Integer aaaa = 1233243464;
        Integer bbbb = 1233243464;
        System.out.println(aaaa.equals(bbbb)); // true   !!!!

    }
}
