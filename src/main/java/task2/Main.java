package task2;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        System.out.println("Is list empty? " + list.isEmpty());

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println("Size of the list: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        list.add(1, 7);

        System.out.println("Size of the list after insertion: " + list.size());
        System.out.println("Element at index 1 after insertion: " + list.get(1));

        Integer removedElement = list.remove(2);
        System.out.println("Removed element at index 2: " + removedElement);
        System.out.println("Size of the list after removal: " + list.size());
    }
}