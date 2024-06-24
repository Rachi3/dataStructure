package normalTree;

import normalTree.*;

public class Main {
    
    public static void main(String[] args) {
        customTree T=new customTree(1);

        T.add(1,2);
        T.add(1,3);
        T.add(2,4);
        T.add(2,5);
        T.add(3,6);

        
       
        System.out.println(T.height(4));
        System.out.println(T.child(1));

        System.out.println("preOrder");
        T.preOrder(T.root);

        System.out.println("postOrder");
        T.postOrder(T.root);

        System.out.println("levelOrder");
        T.levelOrder(T.root);
    }
}
