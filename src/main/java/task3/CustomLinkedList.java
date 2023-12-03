package task3;

public class CustomLinkedList {
    private Node head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void addAtIndex(String data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == size) {
            add(data);
            return;
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }


    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node nodeToRemove = current.next;
            current.next = nodeToRemove.next;

            if (nodeToRemove.next != null) {
                nodeToRemove.next.prev = current;
            }
        }
        size--;
    }


    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        // Metoda main do testów
    }
}
