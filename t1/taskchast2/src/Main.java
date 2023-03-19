public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.pushFirst(1);
        list.pushEnd(2);
        list.pushEnd(3);
        list.pushEnd(4);
        list.pushEnd(5);
        list.pushEnd(6);

        list.pushFirst(100);
        list.pushEnd(2222);
        list.popStack();
        System.out.println(list.peekStack());
        System.out.println(list.peekQueue());
        list.pollQueue();

        list.peekQueue();

        list.printQueue();
        System.out.println();
        list.printQueue();


    }
}