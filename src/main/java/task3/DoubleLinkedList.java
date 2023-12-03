package task3;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, String data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == size) {
            add(data);
            return;
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (current.next == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
}