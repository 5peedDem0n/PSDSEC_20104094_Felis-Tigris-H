package id.felis.modul4;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked implements List{

    private Node head;
    static Scanner s = new Scanner(System.in);

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addFirst(int input) {

        Node node = new Node();
        node.data = input;

        if (head == null){
            head = node;
            System.out.println("Berhasil memasukkan data " + node.data);
        }else {
            //addFirst
            //(HEAD = INPUT) -> (INPUT.NEXT = HEAD) -> ... -> TAIL
            node.next = head;
            head = node;
            System.out.println("Berhasil memasukkan data " + node.data);
        }
    }

    @Override
    public void addLast(int input) {//PAHAM

        Node node = new Node();
        node.data = input;

        if (head == null){//APAKAH LIST KOSONG?
            head = node;
            System.out.println("Berhasil memasukkan data " + node.data);
        }else {
            Node temp = head;
            //addLast
            //HEAD -> NOW -> TAIL.NEXT = INPUT
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            System.out.println("Berhasil memasukkan data " + node.data);
        }
    }

    @Override
    public void insertAfter(int key, int input) {

        Node node = new Node();
        node.data = input;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.data == key){
                node.next = temp.next;
                temp.next = node;
                found = true;
                System.out.println("Memasukkan data " + node.data + " setelah data " + key + " sukses!");
                break;
            }
            temp = temp.next;
        }while (temp != null);

        if (!found) System.out.println("Data " + key + " tidak ditemukan dalam Node!");
    }

    @Override
    public void insertBefore(int key, int input) {

        Node node = new Node();
        node.data = input;


        try {
            Node temp = head;

            while (temp != null){
                //INSERT BEFORE HEAD
                if ((temp.data == key) && (temp == head)){
                    this.addFirst(input);
                    System.out.println("Memasukkan data " + node.data + " sebelum data " + key + " sukses!");
                    break;
                    //INSERT BEFORE KEY
                } else if (temp.next.data == key)
                    {
                        node.next = temp.next;
                        temp.next = node;
                        System.out.println("Memasukkan data " + node.data + " sebelum data " + key + " sukses!");
                        break;
                    }
                temp = temp.next;
            }
        }catch (Exception e){
            System.out.println("Data " + key + " tidak ditemukan di dalam Node!");
        }
    }

    @Override
    public void insert(int index, int input) {//MEMASUKKAN DATA DI INDEX KE-BERAPA

        Node node = new Node();
        node.data = input;

        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            //JIKA INDEX-NYA AWAL
            if (index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data " + node.data + " berhasil dimasukkan index ke-" + index);
                break;
            }//JIKA DATA KE-INDEX
            else if (i == index - 1){
                node.next = temp.next;
                temp.next = node;
                found = true;
                System.out.println("Data " + node.data + " berhasil dimasukkan index ke-" + index);
                break;
            }//JIKA TIDAK TEPENUHI, SIMPAN NODE DI DEPANNYA
            else {
                temp = temp.next;
                i++;
            }
        }
        if (!found) System.out.println("Index " + index + " out of range!");
    }

    @Override
    public void insertAt(int index, int input) {
        Node node = new Node();
        node.data = input;

        if (index == 0) {
            addFirst(input);
            System.out.println("Data " + node.data + " berhasil dimasukkan index ke-" + index);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            System.out.println("Data " + node.data + " berhasil dimasukkan index ke-" + index);
        }
    }

    @Override
    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null){
            //REPLACE BY DATA
            if (temp.data == data1){
                temp.data = data2;
                found = true;
                System.out.println("Data " + data1 + " berhasil di ganti dengan data " + data2);
                break;
            }
            else temp = temp.next;
        }
        if (!found) System.out.println("Data " + data1 + " tidak ditemukan di dalam Node");
    }

    @Override
    public void remove(int data) {
        try {
            if (data == head.data){
                this.removeFirst();
            }else {
                Node temp = head;
                Node nul = null;
                while (temp.next.data != data) {
                    temp = temp.next;
                }
                nul = temp.next;
                temp.next = nul.next;
                System.out.println("Data " + nul.data + " telah terhapus!");
            }

        }catch (Exception e){
            System.out.println("Data " + data + " tidak ditemukan dalam Node!");
        }
    }

    @Override
    public void removeAt(int index) {
        if (index == 0){
            head = head.next;
            System.out.println("Data " + head.data + " pada index ke-" + index + " telah terhapus!");
        }
        else {
            Node temp = head;
            Node nul = null;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            nul = temp.next;
            temp.next = nul.next;
            System.out.println("Data " + nul.data + " pada index ke-" + index + " telah terhapus!");
        }
    }

    @Override
    public void removeFirst() {
        Node temp = head;
        if (temp != null){
                head = temp.next;//PROSES TINDIH
                temp.next = null;
                temp = null;
            System.out.println("Data pada index ke-0 telah terhapus!");
        }
        else System.out.println("Data kosong!");
    }

    @Override
    public void removeLast() {
        Node temp = head;
        Node nul = null;
        if (temp != null){
                while (temp.next.next != null){//JIKA NEXT TIDAK SAMA DENGAN TAIL
                    temp = temp.next;
                }
                nul = temp.next;
                temp.next = nul.next;
            System.out.println("Data paling terakhir telah terhapus!");

        }else System.out.println("Data kosong!");
    }

    @Override
    public void clear() {
        head = null;
        System.out.println("Data sudah dikosongkan!");
    }

    @Override
    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        //PROSES MENCARI BY DATA
        while (temp != null){
            if (temp.data == data){
                found = true;
                System.out.println(data + " ditemukan pada index ke-" + i);
            }
            i++;
            temp = temp.next;
        }
        if (!found) System.out.println("Data tidak ditemukan!");
    }

    @Override
    public void printNode() {
        Node temp = head;
        //PERULANGAN UNTUK PRINT DATA
        if (temp != null) {
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }else
            System.out.println("Data kosong");
    }

    @Override
    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty()){
            System.out.println("Data kosong!");
        }else
            while (temp != null){//HITUNG TOTAL DATA
                temp = temp.next;
                i++;
            }
        System.out.println("Panjang data : " + i);

        return i;
    }

    public static void main(String[] args) {
        Linked linked = new Linked();

        System.out.println("addFirst\t\t: ");
        linked.addFirst(10);

        System.out.println("addLast\t\t\t: ");
        linked.addLast(20);

        System.out.println("insertAfter\t\t: ");
        linked.insertAfter(10, 15);

        System.out.println("insertBefore\t: ");
        linked.insertBefore(20, 25);

        System.out.println("insertAt\t\t: ");
        linked.insert(2, 30);

        System.out.println("find\t\t\t: ");
        linked.find(25);

        System.out.println("replace\t\t\t: ");
        linked.replace(20, 40);

        System.out.println("remove\t\t\t: ");
        linked.remove(15);

        System.out.println("removeAt\t\t: ");
        linked.removeAt(1);

        System.out.println("removeFirst\t\t: ");
        linked.removeFirst();

        System.out.println("removeLast\t\t: ");
        linked.removeLast();

        System.out.println("clear\t\t\t: ");
        linked.clear();

        System.out.println();
        System.out.println("Print Node\t\t: ");
        linked.printNode();
        linked.length();
    }
}
