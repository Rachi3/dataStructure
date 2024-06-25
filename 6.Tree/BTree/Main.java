package BTree;

public class Main {
    public static void main(String[] args) {
        binaryTree bTree=new binaryTree(1);

        bTree.addLeft(1, 2);
        bTree.addRight(1, 3);

        bTree.addLeft(2, 4);
        bTree.addRight(2, 5);

        bTree.addLeft(3, 6);
        bTree.addRight(3, 7);
        //bTree.preOrder();
        //bTree.postOrder();
        bTree.levelOrder();
    }
}
