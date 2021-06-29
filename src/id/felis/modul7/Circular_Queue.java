
package id.felis.modul7;

import java.util.ArrayList;

public class Circular_Queue {

    //Declaring the class variables
    private int size, front, rear;


    //Declaring array list of integer type
    private ArrayList<Node> queue = new ArrayList<Node>();

    //Constructor
    Circular_Queue(int size){
        this.size = size;
        this.front = this.rear = -1;
    }

    //Method to insert a new element in the queue
    public void enQueue(int nim, String nama, String alamat){
        Siswa siswa = new Siswa(nim, nama, alamat);
        Node node = new Node(siswa);

        //Condition if queue is full
        if ((front == 0 && rear == size - 1) ||
            (rear == (front - 1) % (size - 1)))
        {
            System.out.println("Queue is Full");
        }

        //Condition for empty queue
        else if (front == -1){
            front = 0;
            rear = 0;
            queue.add(rear, node);
        }

        else if (rear == size - 1 && front != 0)
        {
            rear = 0;
            queue.set(rear, node);
        }

        else{
            rear = (rear + 1);

        //Adding a new element if
        if (front <= rear)
        {
            queue.add(rear, node);
        }

        //Else updating old value
        else {

            queue.set(rear, node);
        }
    }
}

    //Function to dequeue an element
    public Node deQueue(){

        Node temp;

        //Condition for empty queue
        if (front == -1){

            System.out.print("Queue is Empty");

            //Return -1 in case of empty queue
            return null;
        }

        temp = queue.get(front);

        //Condition for only one element
        if (front == rear){
            front = -1;
            rear = -1;
        }

        else if (front == size - 1){

            front = 0;
        }
        else{

            front = front + 1;
        }

        //Return the dequeue element
        return temp;
    }

    //Method to display the elements of queue
    public void displayQueue(){

        //Condition for empty queue
        if (front == -1){
            System.out.print("Queue is Empty");
        }

        //If rear has not crossed the max size
        //or queue rear is still greater then front
        System.out.println("Elements in the " +
                "circular queue are: ");

        if (rear >= front){

            //Loop to print elements from front to rear
            for (int i = front; i <= rear; i++) {
                Node temp = queue.get(i);
                System.out.print(temp.data.nim + " ");
                System.out.print(temp.data.nama + " ");
                System.out.print(temp.data.alamat + " ");
            }
            System.out.println();
        }

        //If rear crossed the max index and
        // indexing has started in loop
        else{

            //Loop for printing elements from
            //0th index till rear position
            for (int i = 0; i <= rear; i++) {
                Node temp = queue.get(i);
                System.out.print(temp.data.nim + " ");
                System.out.print(temp.data.nama + " ");
                System.out.print(temp.data.alamat + " ");
            }
            System.out.println();
        }
    }
}