public class Main {
    public static void main(String[] args) {

        Queue queue = Queue.getInstance();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        queue.delete();

        queue.display();
    }
}