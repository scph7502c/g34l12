package task1;

import java.util.*;

public class NameListOperations {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));

        Set<String> uniqueNames = removeDuplicates(names);
        System.out.println("Lista bez duplikatów: " + uniqueNames);

        List<String> reversedNames = reverseList(names);
        System.out.println("\nElementy w odwrotnej kolejności: " + reversedNames);

        replaceName(names, "Anna", "Joanna");
        System.out.println("\nElementy po zmianie : Anna -> Joanna: " + names);
    }

    private static Set<String> removeDuplicates(List<String> list) {
        return new LinkedHashSet<>(list);
    }

    private static List<String> reverseList(List<String> list) {
        List<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    private static void replaceName(List<String> list, String oldName, String newName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldName)) {
                list.set(i, newName);
            }
        }
    }
}