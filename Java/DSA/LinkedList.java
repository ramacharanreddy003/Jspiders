package DSA;

public class LinkedList {

    Node head;
    int count = 0;

    public void add(Object ele) {
        Node n = new Node(ele);

        if (head == null) {
            head = n;
            count++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void addFirst(Object ele) {
        Node n = new Node(ele);
        n.next = head;
        head = n;
        count++;
    }

    public void addLast(Object ele) {
        add(ele);
    }

    public void addIndex(Object ele, int index) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(ele);
            return;
        }

        if (index == size()) {
            addLast(ele);
            return;
        }

        Node n = new Node(ele);
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;
        count++;
    }

    public void set(Object ele, int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.ele = ele;
    }

    public boolean contains(Object ele) {

        Node temp = head;

        while (temp != null) {
            if (temp.ele.equals(ele)) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void removeFirst() {

        if (head == null) {
            throw new RuntimeException("List is Empty");
        }

        head = head.next;
        count--;
    }

    public void remove(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        count--;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.ele);
            temp = temp.next;
        }
    }
}