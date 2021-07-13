package id.felis.modul9;

public class BinarySearchTree {

    Node root;

    // initial empty tree
    boolean isEmpty(){
        return (root == null);
    }

    //insert a node in BST
    void insert(int input){

        Node node = new Node(input);
        boolean flag = false;

        //tree is empty
        if (isEmpty()){

            root = node;

        }
        else{

            Node temp = root;
            Node parent = null;
            while (temp != null){

                parent = temp;
                if (input < temp.data){

                    temp = temp.left;
                    flag = true;

                }
                else if (input > temp.data){

                    temp = temp.right;
                    flag = true;

                }
                else {

                    System.out.println("Duplikasi data! " +
                            "Data tidak boleh masuk!");
                    break;

                }
            }

            if (flag){

                if (input > parent.data)
                    parent.right = node;

                else if (input < parent.data)
                    parent.left = node;
            }
        }
    }

    // search a specific data in tree
    void find(int look){

        Node temp = root;
        boolean check = false;
        while(temp != null){

            if (look < temp.data){

                temp = temp.left;

            }
            else if (look > temp.data){

                temp = temp.right;

            }
            else if (look == temp.data){

                check = true;
                break;

            }
        }
        if (check){

            System.out.println("Data " + look + " is founded!");

        }
        else

            System.out.println("Data isn't founded!");
    }

    // search a biggest value in tree
    Node findMax(){

        Node temp = root;
        if (isEmpty()){

            return null;

        }
        else{

            while(temp.right != null){

                temp = temp.right;

            }
            return temp;

        }
    }

    // search a lowest value in tree
    Node findMin(){

        Node temp = root;
        if (isEmpty()){

            return null;

        }
        else{

            while(temp.left != null){

                temp = temp.left;

            }
            return temp;
        }
    }

    // delete a certain data in tree
    public void remove(int input){

        if (this.remove(input,root) == null){

            System.out.println("Data " + input +
                    " wasn't in the tree");

        }
        else
            root = this.remove(input,root);
    }

    // recursive delete function
    private Node remove(int input, Node temp){

        if (temp == null){

            return temp;

        }

        if (input < temp.data)
            temp.left = this.remove(input, temp.left);

        else if (input > temp.data)
            temp.right = this.remove(input, temp.right);

        else{

            // node contains only one child
            if (temp.left == null)
                return temp.right;

            else if (temp.right == null)
                return root.left;

            // node has two child
            // get inorder successor (min value in the right subtree)
            temp.data = minValue(temp.right);

            // delete the inorder successor
            temp.right = this.remove(temp.data,temp.right);
        }

        return temp;
    }

    int minValue(Node root){

        int minval = root.data;

        while(root.left != null){

            minval = root.left.data;
            root = root.left;

        }

        return minval;
    }

    //clear all data in tree
    void removeAll(){
        if (isEmpty()){

            System.out.println("Tree is Empty!");

        }
        else{

            root = null;
            System.out.println("All data were removed");

        }
    }

    // rootNode -> Left -> Right
    public void preOrder(Node node){

        if (node == null)
            return;

        // first print root node first
        System.out.print(node.data + " ");

        // then traverse left subtree recursively
        preOrder(node.left);

        //next traverse right subtree recursively
        preOrder(node.right);

    }

    // Left -> rootNode -> Right
    public void inOrder(Node node){

        if (node == null)
            return;

        // first traverse left subtree recursively
        inOrder(node.left);

        // then go for root node
        System.out.print(node.data + " ");

        // next traverse right subtree recursively
        inOrder(node.right);

    }

    // Left -> Right -> rootNode
    public void postOrder(Node node){

        if (node == null)
            return;

        // first traverse left subtree recursivcely
        postOrder(node.left);

        // then traverse right subtree recursively
        postOrder(node.right);

        // now process root node
        System.out.print(node.data + " ");

    }

    // search root or parent
    void findDirectory(int input){

        if (isEmpty()){

            System.out.println("Tree is Empty!");

        }
        else{

            if (this.checking(input) == true){

                Node temp = root;
                while (temp != null){

                    if (input > temp.data){

                        System.out.print(temp.data + " , ");
                        temp = temp.right;

                    }
                    else if (input < temp.data){

                        System.out.print(temp.data + " , ");
                        temp = temp.left;

                    }
                    else if (input == temp.data){

                        System.out.println(input);
                        break;

                    }
                }
            }
            else
                System.out.println("Data weren't in the tree!");
        }
    }

    private boolean checking(int input){

        Node temp = root;
        while(temp != null){

            if (input < temp.data){

                temp = temp.right;

            }
            else if (input > temp.data){

                temp = temp.right;

            }
            else if (input == temp.data){

                return true;

            }
        }
        return false;
    }

    // the sum of leaf in tree
    public int getLeafCount(){

        return this.getLeafCountHelper(root);

    }

    private int getLeafCountHelper(Node data){

        if (data == null){

            return 0;

        }
        else if (data.left == null && data.right == null){

            return 1;

        }
        else{

            return this.getLeafCountHelper(data.left) +
                    this.getLeafCountHelper(data.right);

        }
    }
}
