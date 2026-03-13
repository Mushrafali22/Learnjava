package Practice;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Binarytreetraversal {
    Node root;

    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }

    void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        Binarytreetraversal tree=new Binarytreetraversal();

        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        System.out.println("PreOrder : ");
        tree.preOrder(tree.root);

        System.out.println("/ninOrder : ");
        tree.inOrder(tree.root);

        System.out.println("/npostOrder : ");
        tree.postOrder(tree.root);
    }
}

