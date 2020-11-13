package level_1.lesson_5.homework;

import java.util.Date;
import java.util.Random;

public class Recruitment {

    public static void main(String[] args) {

        Employee employee = new Employee("Karpov Roman Alexandrovich",
                new Date(89,  11,  14),
                new Gender("male"),
                "0102 030405",
                "kyper89@mail.ru",
                "81234567890",
                "012345678901",
                new Unit("The Development centre"),
                new Position("Developer 1C"),
                150000.0f);

        employee.printInfo();

        Employee[] employeesArray = employeesArray(10);
        printEmployeesArray(employeesArray, 40);

    }

    static Employee[] employeesArray(int n) {

        Random random = new Random();

        Employee[] employeesArray = new Employee[n];
        for (int i = 0; i < n; i++) {

            Date birthDate = new Date(random.nextInt(103),  random.nextInt(12),  1 + random.nextInt(28));
            Employee employee = new Employee("Ivanov Ivan",
                    birthDate,
                    new Gender("male"),
                    new Unit("The Development centre"),
                    new Position("Developer 1C"));

            employeesArray[i] = employee;
        }
        return employeesArray;
    }

    static void printEmployeesArray(Employee[] employeesArray, int ageBound) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > ageBound) {
                employeesArray[i].printInfo();
            }
        }
    }

}
