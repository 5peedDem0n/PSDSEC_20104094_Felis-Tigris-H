package id.felis.modul8;

public class Main<K,V> {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Computer");
        hm.put(2, "OS");
        hm.put(3, "Device Driver");
        System.out.println(hm.get(1));
        hm.containsKey(3);
        System.out.println(hm.containsValue("Device Driver"));
        hm.remove(2);
        hm.display();
    }


}
