package id.felis.modul8;

public class HashMap<K,V>{

    /*
    SOURCE
    https://www.devglan.com/java8/hashmap-custom-implementation-java
     */

    //Initial default capacity
    private int capacity = 16;

    //Array of Entry object
    private Entry<K,V>[] table;

    public HashMap(){
        table = new Entry[capacity];
    }

    public HashMap(int capacity){
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    public void put (K key, V value){

        int index = index(key);
        Entry newEntry = new Entry(key, value, null);
        if (table[index] == null){
            table[index] = newEntry;
        }
        else {
            Entry<K,V> previousNode = null;
            Entry<K,V> currentNode = table[index];
            while(currentNode != null){
                if (currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext(newEntry);
        }
    }

    public V get(K key){
        V value = null;
        int index = index(key);
        Entry<K,V> entry = table[index];
        while(entry != null){
            if (entry.getKey().equals(key)){
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key){
        int index = index(key);
        Entry previous = null;
        Entry entry = table[index];
        while (entry != null){
            if (entry.getKey().equals(key)){
                if (previous == null){
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                }
                else{
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public boolean containsKey(Object key) {
        if (key == null) {
            if (table[0].getKey() == null) {
                return true;
            }
        }
        int location = Hashing(key.hashCode());
        Entry e = null;
        try {
            e = table[location];
        } catch (NullPointerException ex) {
        }
        if (e != null && e.getKey() == key) {
            return true;
        }
        return false;
    }
    public boolean containsValue(Object value) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getValue() == value) {
                return true;
            }
        }
        return false;
    }

    private int Hashing (int hashCode){
        int location = hashCode % capacity;
        System.out.println("Location : " + location);
        return location;
    }

    public void display(){
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null){
                Entry<K,V> currentNode = table[i];
                while(currentNode != null){
                    System.out.println(String.format("Key is %s and value is %s",
                            currentNode.getKey(), currentNode.getValue()));
                    break;
                }
            }
        }
    }

    private int index(K key){
        if (key == null){
            return 0;
        }
        return Math.abs(key.hashCode()) % capacity;
    }

}