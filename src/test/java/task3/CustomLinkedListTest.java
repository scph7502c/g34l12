package task3;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CustomLinkedListTest {

    @ParameterizedTest
    @CsvSource({"Apple, 0", "Banana, 1", "Orange, 2"})
    void testAdd(String data, int index) {
        CustomLinkedList list = new CustomLinkedList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grape");

        list.addAtIndex(data, index);
        assertEquals(data, list.get(index));
    }

    @ParameterizedTest
    @CsvSource({"0, Apple, Orange, Grape", "1, Apple, Banana, Grape", "2, Apple, Banana, Orange"})
    void testRemove(int indexToRemove, String expectedBefore, String expectedRemoved, String expectedAfter) {
        CustomLinkedList list = new CustomLinkedList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grape");

        list.removeAtIndex(indexToRemove);
        assertEquals(expectedBefore, list.get(indexToRemove - 1));
        assertEquals(expectedRemoved, list.get(indexToRemove));
        if (indexToRemove < list.getSize()) {
            assertEquals(expectedAfter, list.get(indexToRemove + 1));
        }
    }


}

