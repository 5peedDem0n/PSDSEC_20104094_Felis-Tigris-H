package id.felis.modul7;

public class Queue {

    //Declaring class variables
    Node front, rear;

    // Method for conditioning if queue is empty
    boolean isEmpty(){
        return (front == null && rear == null);
    }

    // Method to insert a new element in queue
    void enqueue(int nim, String nama, String alamat){
        Siswa siswa = new Siswa(nim, nama, alamat);
        Node node = new Node(siswa);

        if (isEmpty()){
            front = node;
            rear = node;
        }else{
            rear.next = node;
            rear = rear.next;
        }
    }

    // Method to take data from queue
    Node dequeue(){
        if (isEmpty()){
            return null;
        }else{
            Node temp = front;
            if (front == rear){
                front = rear = null;
                return temp;
            }else{
                front = front.next;
                return temp;
            }
        }
    }

    //Method to show the elements of queue
    void show(){
        if (!isEmpty()){
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data.nim + " ");
                System.out.print(temp.data.nama + " ");
                System.out.print(temp.data.alamat + " ");
                temp = temp.next;
                System.out.println();
            }
            System.out.println();
        }else
            System.out.println("Queue is empty!");
    }

    //to clear all of data in queue
    void makeEmpty(){
        front = null;
        rear = null;
        System.out.println("Queue's data have been emptied");
    }

}
