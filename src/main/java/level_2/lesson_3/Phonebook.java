package level_2.lesson_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook extends TreeMap {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Karpov", "1234567890");
        phonebook.add("Karpov", "0987654321");
        phonebook.add("Ivanov", "1987583321");
        phonebook.add("Ivanov", "1987583321"); // дубль для теста


        System.out.println("Karpov - " + phonebook.get("Karpov"));
        System.out.println("Ivanov - " + phonebook.get("Ivanov"));
    }

    public void add(String surname, String number) {

        Set numbers = (Set) this.get(surname);
        if (numbers == null) {
            numbers = new HashSet();
        }

        numbers.add(number);
        this.put(surname, numbers);
    }

}
