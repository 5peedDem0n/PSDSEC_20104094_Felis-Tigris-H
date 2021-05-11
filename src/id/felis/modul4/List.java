package id.felis.modul4;

public interface List {
    boolean isEmpty();
    void addFirst (int input);
    void addLast (int input);
    void insertAfter(int key, int input);
    void insertBefore(int key, int input);
    void insert(int index, int input);
    void insertAt(int index, int input);
    void replace(int data1, int data2);
    void remove(int data);
    void removeAt(int index);
    void removeFirst();
    void removeLast();
    void clear();
    void find(int data);
    void printNode();
    int length();
}
