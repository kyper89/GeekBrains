package level_2.lesson_3;

import java.util.*;

public class SetOfWords {

    public static void main(String[] args) {

        List<String> wordsList = createArray();

        Set<String> wordsSet = new HashSet<>(wordsList);
        System.out.println(wordsSet);
        System.out.println();

        for (String element : wordsSet) {
            System.out.println(String.format("'%s' appears %d times", element, Collections.frequency(wordsList, element)));
        }


    }

    private static ArrayList createArray() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("world");
        arrayList.add("map");
        arrayList.add("java");
        arrayList.add("door");
        arrayList.add("java");
        arrayList.add("map");
        arrayList.add("first");
        arrayList.add("open");
        arrayList.add("close");

        return arrayList;
    }


}
