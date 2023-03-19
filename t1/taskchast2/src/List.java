import org.w3c.dom.ls.LSOutput;

public class List {
    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void pushEnd(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.setNext(temp);
            temp.setPrev(tail);
        }
        tail = temp;
    }

    public void pushFirst(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else {

            head.setPrev(temp);
            temp.setNext(head);

        }
        head = temp;
    }    //очередь

    public int peekQueue() {
        return head.getData();
    }

    public void pollQueue() {
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
    }


    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            System.out.print(" -> ");
            temp = temp.getNext();
        }
    }

    //стек
    public void popStack() {
        if (head.getNext() == null) {
            tail = null;
        } else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
    }

    public int peekStack() {
        return tail.getData();
    }




}