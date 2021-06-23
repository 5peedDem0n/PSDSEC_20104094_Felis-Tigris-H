package id.felis.modul5;

public interface Db_LinkedList {
    boolean isEmpty();
    void addFirst (int input);
    void addLast (int input);
    void insertAfter (int key, int input);
    void insertBefore (int key, int input);
    void insert (int index, int input);
    void replace (int data1, int data2);
    void remove (int data);
    void removeAt (int index);
    void removeFirst ();
    void removeLast ();
    void clear ();
    boolean checking (int input);
    void showReversed ();
    void show ();
    void find (int data);
    int length ();
}
