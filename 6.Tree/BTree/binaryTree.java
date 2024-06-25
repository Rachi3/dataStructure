package BTree;

import java.util.*;

public class binaryTree {
    int size;
    binaryNode root;
    
    binaryTree(int value){
        root=new binaryNode(value);
    }

    private binaryNode search(binaryNode root,int key){
        if(root==null||root.value==key)
            return root;

        binaryNode foundNode=null;

        foundNode=search(root.left,key);
            
        if(foundNode==null)
            foundNode=search(root.right,key);
        
        return foundNode;
    }
    public binaryNode search(int key){
        return search(root, key);
    }

    public void addLeft(int nodeValue,int key)
    {
        binaryNode b=search(nodeValue);
        if(b.left!=null)
        {
            System.out.println("이미 왼쪽 노드가 채워졌습니다.");
            return;
        }

        b.left=new binaryNode(key);
        b.left.parent=b;
    }

    public void addRight(int nodeValue,int key)
    {
        binaryNode b=search(nodeValue);

        if(b.right!=null)
        {
            System.out.println("이미 오른쪽 노드가 채워졌습니다.");
            return;
        }

        b.right=new binaryNode(key);
        b.right.parent=b;
    }

    private void preOrder(binaryNode root){
        if(root==null)
            return;

        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void preOrder(){
        preOrder(root);
    }//도움을 위한 매소드

    private void postOrder(binaryNode root){
        if(root==null)
            return ;

        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root);
    }

    public void postOrder(){
        postOrder(root);
    }
    

    private void levelOrder(binaryNode root){
        Queue<binaryNode> queue=new LinkedList<>();

        if(root!=null)
            queue.add(root);

        while(!queue.isEmpty())
        {
            binaryNode T=queue.poll();
                
            System.out.println(T);

            if(T.left!=null)
                queue.add(T.left);

            if(T.right!=null)
                queue.add(T.right);
        }
    }

    public void levelOrder(){
        levelOrder(root);
    }

    class binaryNode{
        int value;
        private binaryNode left,right,parent;

        binaryNode(int value){
            this.value=value;
        }

        
        public boolean isRoot(){
            return this.parent==null?true:false;
        }

        @Override
        public String toString(){
            if(this==null)
                return "빈 노드 입니다.";

            String str="[ 노드 value : "+String.valueOf(value);

            if(!isRoot())
                str+=" , 부모 노드 : "+String.valueOf(parent.value);
            
            if(left!=null)
                str+=" , 왼쪽 : "+String.valueOf(left.value);

            if(right!=null)
                str+= " , 오른쪽 : "+String.valueOf(right.value);
                

            return str+"]";
        }
    }
}
