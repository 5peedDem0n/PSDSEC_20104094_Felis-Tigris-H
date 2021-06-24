package id.felis.modul6;

public class Stack {

    /*
    STACK
            TOS -> NODE
                   NODE
                   NODE
                   NODE

      TOS = TOP OF STACK
     */

    Node tos;

    //the statement if there's no node
    public boolean isEmpty(){
        return (tos == null);
    }

    //to put new data/node on top of stack
    public void push (int input){
        Node node = new Node(input);
        //if the stack is empty
        if (isEmpty()){
            tos = node;
         //if there's node in stack, then the new node will be tos
         //and old tos will be node.next
        }else{
            node.next = tos;
            tos = node;
        }
    }

    //to take tos in order to use it or remove it
    public void pop(){
        //if the stack isn't empty
        //take the tos and then the node before tos will become tos
        if (!isEmpty()){
            Node temp = tos;
            tos = tos.next;
            temp.next = null;
            System.out.println("Yang di POP: " + temp.data.toString());
         //if the stack is empty
        }else
            System.out.println("Tidak bisa karena stack kosong!");
    }

    //to show all of nodes in stack
    //the structure is vertical
    public void show(){
        if (!isEmpty()){
            Node temp = tos;
            while(temp != null){
                System.out.print(temp.data.toString() + "\n");
                temp = temp.next;
            }
        }else
            System.out.println("Stack kosong!");
    }

    Node top(){
        Node temp = tos;
        return temp;
    }

    //to take and use the tos/node
    Node topAndPop(){
        Node temp = tos;
        this.pop();
        return temp;
    }

    //to clear all of nodes in stack
    void makeEmpty(){
        tos = null;
        System.out.println("Data berhasil dihapus semua!");
    }

    //method to convert biner to decimal
    String binerToDecimal(String bilangan){
        String[] binerReverse = new String[bilangan.length()];
        double resultDecimal = 0;

        int n = 0;
        for (int i = bilangan.length() - 1; i >= 0; i--) {
            binerReverse[n] = String.valueOf(bilangan.charAt(i));
            n++;
        }

        for (int i = 0; i < binerReverse.length; i++) {
            if (Integer.parseInt(binerReverse[i]) == 1){
                resultDecimal += Math.pow(2, i);
            }
        }
        return String.valueOf(resultDecimal);
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        String biner = "";

        stack.push(0);
        stack.push(1);
        stack.push(0);
        stack.push(1);

        //to put biner together
        while(!stack.isEmpty()){
            Node n = stack.topAndPop();
            biner += String.valueOf(n.data);
        }

        if(!biner.equals("")) {
            System.out.println(stack.binerToDecimal(biner));
        }else
            System.out.println("No data!");
    }
}
