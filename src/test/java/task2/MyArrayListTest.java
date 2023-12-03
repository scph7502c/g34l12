package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    private MyArrayList list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList();
    }


    @ParameterizedTest
    @CsvSource({
            "10, 20, 30",
            "100, 200, 300"
    })
    void testAddAndGet(Integer first, Integer second, Integer third) {
        list.add(first);
        list.add(second);
        list.add(third);

        assertEquals(first, list.get(0));
        assertEquals(second, list.get(1));
        assertEquals(third, list.get(2));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 30, 1, 40",
            "100, 200, 300, 2, 400"
    })
    void testAddAtIndexAndGet(Integer first, Integer second, Integer third, int index, Integer valueToAdd) {
        list.add(first);
        list.add(second);
        list.add(third);

        list.add(index, valueToAdd);

        assertEquals(valueToAdd, list.get(index));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 30, 1, 20",
            "100, 200, 300, 2, 300"
    })
    void testRemoveAtIndex(Integer first, Integer second, Integer third, int indexToRemove, Integer expectedValue) {
        list.add(first);
        list.add(second);
        list.add(third);

        assertEquals(expectedValue, list.remove(indexToRemove));
    }
}
