package id.felis.modul7;

public class Queue {

    Node front, back;

    boolean isEmpty(){
        return (front == null && back == null);
    }

    void enqueue(int input){
        Node node = new Node(input);

        if (isEmpty()){
            front = node;
            back = node;
        }else{
            back.next = node;
            back = back.next;
        }
    }

    Node dequeue(){
        if (isEmpty()){
            return null;
        }else{
            Node temp = front;
            if (front == back){
                front = back = null;
                return temp;
            }else{
                front = front.next;
                return temp;
            }
        }
    }

    void show(){
        if (!isEmpty()){
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }else
            System.out.println("Queue is empty!");
    }

    void makeEmpty(){
        front = null;
        back = null;
        System.out.println("Queue's data have been emptied");
    }
}
