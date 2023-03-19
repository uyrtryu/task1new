public class Node {
    public int getData() {
        return data;
    }

    private int data;

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    private Node next;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    private Node prev;//ссылка на предидущий элемент

    public Node(int data) {
        this.data = data;
    }
}