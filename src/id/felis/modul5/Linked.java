package id.felis.modul5;

public class Linked implements Db_LinkedList {

    /*
    DOUBLE LINKED LIST

            HEAD -><- NODE -><- NODE -><- TAIL
     */

    private Node head, tail;

    //Statement, if there is no node
    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    //to add new node and makes it the head
    @Override
    public void addFirst(int input) {
        Node node = new Node(input);

        //if there's no node, then the new node becomes the head and tail
       if (isEmpty()){
           head = node;
           tail = node;
           System.out.println("Data " + input + " berhasil dimasukkan!");
       }else{
           head.kiri = node;
           node.kanan = head;
           head = node;
           System.out.println("Data " + input + " berhasil dimasukkan!");
       }
    }

    //to add new node and makes it the tail
    @Override
    public void addLast(int input) {
        Node node = new Node(input);

        //if there's no node, then the new node becomes the head and tail
        if (isEmpty()){
            head = node;
            tail = node;
            System.out.println("Data " + input + " berhasil dimasukkan!");
        }else{
            tail.kanan = node;
            node.kiri = tail;
            tail = node;
            System.out.println("Data " + input + " berhasil dimasukkan!");
        }
    }

    //the new node will place after a certain node
    // key = certain node
    @Override
    public void insertAfter(int key, int input) {
        Node node = new Node(input);
        Node temp = head;
        boolean found = false;
        int i = 0;
        while(temp != null){
            //if there's only one node or the key = tail, then it will use addLast method
            if ((Object) key == head.data && (Object) key == tail.data){
                this.addLast(input);
                found = true;
                System.out.println("Data " + input +
                        " berhasil dimasukkan setelah data " + key);
                break;
                // if there are more than one nodes
            }else if ((temp.data == (Object) key) && (temp != tail)){
                node.kanan = temp.kanan;
                temp.kanan.kiri = node;
                node.kiri = temp;
                temp.kanan = node;
                found = true;
                System.out.println("Data " + input +
                        " berhasil dimasukkan setelah data " + key);
                break;
            }
            //so the process can travel and check every node
            temp = temp.kanan;
            i++;
        }
        if (!found)
            System.out.println("Data " + key + " tidak ditemukan dalam Node!");
    }

    //to put the new node before a certain node
    // key = a certain node
    @Override
    public void insertBefore(int key, int input) {
        Node node = new Node(input);
        Node temp = head;
        boolean found = false;
        int i = 0;
        while(temp != null){
            //if there's only one node or the key = tail, then it will use addFirst method
            if ((Object) key == head.data && (Object) key == tail.data){
                this.addFirst(input);
                found = true;
                System.out.println("Data " + input +
                        " berhasil dimasukkan sebelum data " + key);
                break;
                //if there are more than one nodes
            }else if (temp.data == (Object) key && temp != tail){
                node.kiri = temp.kiri;
                temp.kiri.kanan = node;
                node.kanan = temp;
                temp.kiri = node;
                found = true;
                break;
            }
            //so the process can travel and check every node
            temp = temp.kanan;
            i++;
        }
        if (!found)
            System.out.println("Data " + key + " tidak ditemukan dalam Node!");
    }

    //to put the new node in a certain index
    @Override
    public void insert(int index, int input) {
        Node node = new Node(input);
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null) {
            //adding at first index
            if (index == 0) {
                this.addFirst(input);
                found = true;
                System.out.println("Data " + node.data +
                        " berhasil dimasukkan pada indeks " + index);
                break;
                //if adding new node between head and tail
            } else if ((i == index - 1) && (temp != tail)) {
                node.kanan = temp.kanan;
                temp.kanan.kiri = node;
                node.kiri = temp;
                temp.kanan = node;
                found = true;
                System.out.println("Data " + node.data +
                        " berhasil dimasukkan pada indeks " + index);
                break;
                //adding at last index
            } else if ((i == index - 1) && (temp == tail)) {
                this.addLast(input);
                found = true;
                System.out.println("Data " + node.data +
                        " berhasil dimasukkan pada indeks " + index);
                break;
            }
            //so the process can travel and check every node
            temp = temp.kanan;
            i++;
        }
        if (!found){
            System.out.println("Indeks " + index +
                    " out of range indeks Node!");
        }
    }

    //to replace the node that already exist with new node
    // data1 = old node
    // data2 = new node
    @Override
    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.data == (Object) data1){
                temp.data = data2;
                found = true;
                System.out.println("Data " + data1 +
                        " berhasil diganti dengan data " + data2);
                break;
            }
            //traveling process
            temp = temp.kanan;
        }
        if (!found){
            System.out.println("Data " + data1 +
                    " tidak ditemukan dalam Node!");
        }
    }

    //to remove a certain data of node
    @Override
    public void remove(int data) {
        try {
            Node temp = head;
            while (temp != null){
                //if the node's position is in the last, use removeLast method
                if ((temp.data == (Object) data) && (temp == tail)){
                    this.removeLast();
                    System.out.println("Data " + data +
                            " berhasil dihapus!");
                    break;
                    //if the position of the node is in the first, use removeFirst
                }else if ((temp.data == (Object) data) && (temp == head)){
                    this.removeFirst();
                    System.out.println("Data " + data +
                            " berhasil dihapus!");
                    break;
                    //if the node's position is between the head and tail
                }else if ((temp.kanan.data == (Object) data) && (temp.kanan != tail)){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data " + data + " berhasil dihapus!");
                    break;
                }
                //travelling process
                temp = temp.kanan;
            }
        }catch (Exception e){
            System.out.println("Data " + data + " tidak ditemukan dalam Node!");
        }
    }

    //to remove a node at certain index
    @Override
    public void removeAt(int index) {
        Node temp = head;
        try {
            int i = 0;
            while (temp != null){
                if (index == 0){
                    this.removeFirst();
                    System.out.println("Data pada indeks " + index
                            + " berhasil dihapus!");
                    break;
                    //when the node's index between head and tail
                }else if ((i == index - 1) && (temp.kanan != tail)){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data pada indeks " + index
                            + " berhasil dihapus!");
                    break;
                }else if ((i == index - 1) && (temp.kanan == tail)){
                    this.removeLast();
                    System.out.println("Data pada indeks " + index + " berhasil dihapus!");
                    break;
                }
                //travelling process
                temp = temp.kanan;
                i++;
            }
        }catch (Exception e){
            System.out.println("Indeks " + index + " out of range index Node!");
        }
    }

    //to remove the node in first position
    @Override
    public void removeFirst() {
        Node temp = head;
        //if there's no node
        if (isEmpty()){
            System.out.println("No data!!");
        }else{
            //if only one node
            if (head == tail){
                head = tail = null;
                //more than one nodes
            }else{
                head = temp.kanan;
                head.kiri = null;
                temp.kanan = null;
                temp = null;
            }
        }
    }

    //to remove the node in last position
    @Override
    public void removeLast() {
        Node temp = tail;
        //if there's no node
        if (isEmpty()){
            System.out.println("No data!!");
        }else{
            //if only one node
            if (tail == head){
                tail = head = null;
                //more than one nodes
            }else{
                tail = temp.kiri;
                tail.kanan = null;
                temp.kiri = null;
                temp = null;
            }
        }
    }

    //to remove all of nodes
    @Override
    public void clear() {
        //if there's no node
        if (isEmpty()){
            System.out.println("Data masih kosong!");
        }else {
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua!");
        }
    }

    //to check if a certain node is exist
    @Override
    public boolean checking(int input) {
        Node temp = head;
        while (temp != null){
            if (temp.data == (Object) input){
                return true;
            }
            temp = temp.kanan;
        }
        return false;
    }

    //to show the nodes from backward
    @Override
    public void showReversed() {
        Node temp = tail;
        if (isEmpty()){
            System.out.println("Data kosong!");
        }else{
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.kiri;
            }
            System.out.println();
        }
    }

    //to show the nodes
    @Override
    public void show() {
        Node temp = head;
        if (isEmpty()){
            System.out.println("No data!!");
        }else{
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.kanan;
            }
            System.out.println();
        }
    }

    //to find a certain node
    @Override
    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null){
            if (temp.data == (Object) data){
                found = true;
                break;
            }
            temp = temp.kanan;
            i++;
        }
        if (found){
            System.out.println(data + " ditemukan pada indeks ke-" + i);
        }else
            System.out.println("Data tidak ditemukan!");
    }

    //to show the length of nodes
    @Override
    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty()){
            System.out.println("Data kosong!");
        }else{
            while(temp != null){
                temp = temp.kanan;
                i++;
            }
        }
        System.out.println("Panjang data : " + i);
        return i;
    }

    public static void main(String[] args){
        Linked linked = new Linked();
        linked.addFirst(15);
        linked.addLast(20);
        linked.insertAfter(15, 30);
        linked.insertBefore(30,40);
        linked.insert(2,50);
        linked.removeLast();
        linked.removeFirst();
        linked.remove(30);
        linked.removeAt(1);
        linked.replace(40,20);

        linked.show();
        linked.showReversed();
        linked.length();
        linked.find(40);
        linked.clear();
        linked.show();
    }
}
