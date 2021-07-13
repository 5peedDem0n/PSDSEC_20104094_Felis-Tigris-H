package id.felis.modul9;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int delete;

        bst.insert(20);
        bst.insert(15);
        bst.insert(30);
        bst.insert(25);
        bst.insert(35);

        bst.inOrder(bst.root);
        System.out.println();

        bst.postOrder(bst.root);
        System.out.println();

        bst.preOrder(bst.root);
        System.out.println();

        bst.find(30);

        System.out.println("max value : " + bst.findMax().data);

        System.out.println("min value : " + bst.findMin().data);

        delete = 30;
        bst.remove(delete);
        System.out.println("remove " + delete + " from tree");

        bst.preOrder(bst.root);
        System.out.println();

        bst.findDirectory(35);

        System.out.println("the sum of leaf in tree : " +
                bst.getLeafCount());
    }
}
