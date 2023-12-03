package task3;



public class DoubleLinkedListTest {

    @Test
    void testEmptyList() {
        DoubleLinkedList list = new DoubleLinkedList();
        assertEquals(0, list.size());
    }

    @ParameterizedTest
    @CsvSource({"A", "A,B", "A,B,C", "A,B,C,D"})
    void testAddElements(String elements) {
        DoubleLinkedList list = new DoubleLinkedList();
        String[] data = elements.split(",");
        for (String datum : data) {
            list.add(datum);
        }
        assertEquals(data.length, list.size());
    }

    @ParameterizedTest
    @CsvSource({"A,0", "A,B,1", "A,B,C,2", "A,B,C,D,3"})
    void testGetElement(String elements, int index) {
        DoubleLinkedList list = new DoubleLinkedList();
        String[] data = elements.split(",");
        for (String datum : data) {
            list.add(datum);
        }
        assertEquals(data[index], list.get(index));
    }

    @ParameterizedTest
    @CsvSource({"A,0", "A,B,1", "A,B,C,2", "A,B,C,D,3"})
    void testRemoveElement(String elements, int index) {
        DoubleLinkedList list = new DoubleLinkedList();
        String[] data = elements.split(",");
        for (String datum : data) {
            list.add(datum);
        }
        list.remove(index);
        assertEquals(data.length - 1, list.size());
    }

    @Test
    void testRemoveFromEmptyList() {
        DoubleLinkedList list = new DoubleLinkedList();
        assertThrows(IllegalStateException.class, () -> list.remove(0));
    }

    @Test
    void testRemoveInvalidIndex() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void testGetInvalidIndex() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void testAddInvalidIndex() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(2, "B"));
    }
}

