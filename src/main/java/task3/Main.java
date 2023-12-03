package task3;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList customList = new CustomLinkedList();

        customList.add("Apple");
        customList.add("Banana");
        customList.add("Orange");
        customList.add("Grapes");

        System.out.println("Size of the list: " + customList.getSize());

        System.out.println("Element at index 2: " + customList.get(2));

        customList.addAtIndex("Kiwi", 1);

        System.out.println("Size of the list after insertion: " + customList.getSize());
        System.out.println("Element at index 1 after insertion: " + customList.get(1));

        customList.removeAtIndex(3);

        System.out.println("Size of the list after removal: " + customList.getSize());
        System.out.println("Element at index 3 after removal: " + customList.get(3));
    }
}


