package id.felis.modul7;

public class Main {

    public static void main(String[] args) {
        System.out.println("QUEUE LINEAR");

        //Initialising new object of Queue class
        Queue queue = new Queue();

        queue.enqueue(20104094, "Felis", "Banten");
        queue.enqueue(20104090, "Anonymous", "Nowhere");

        System.out.println("Deleted value\t: "
                + queue.dequeue().data.nama);

        System.out.println("Data in queue\t:");
        queue.show();

        System.out.println();

        System.out.println("CIRCULAR QUEUE");

        //Initialising new object of Circular_Queue class
        Circular_Queue cq = new Circular_Queue(5);

        cq.enQueue(20104090, "Anonymous", "Nowhere");
        cq.enQueue(20104094, "Felis", "Banten");

        System.out.println("Deleted value\t: " +
                cq.deQueue().data.nama);

        cq.displayQueue();
    }
}
