import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class customLinkedList {
    private Node Head;
    private Node Tail;
    private int size=0;//저장된 노드의 개수 나타냄

    private class Node{
        //1. 데이터를 저장 가능해야함
        //2. 다음 노드를 가르켜야함 단 포인터는 없음;; 되게 불편하네
        private Object data;
        private Node nextNode;//남들은 참조 불가
        private Node prevNode;

        public Node(){
            this.data=null;
            this.nextNode=null;
            this.prevNode=null;
        }

        public Node(Object input){
            this.data=input;
            this.nextNode=null;
            this.prevNode=null;
        }

        @Override
        public String toString(){
            return String.valueOf(this.data);
        }
    }

    customLinkedList(){
        Head=new Node();
        Tail=new Node();

        Head.nextNode=Tail;
        Tail.prevNode=Head;
    }

    //add기능들 구현
    public void addFirst(Object obj){
        Node newNode=new Node(obj);

        Head.nextNode.prevNode=newNode;
        newNode.nextNode=Head.nextNode;//another Node부터 연결

        Head.nextNode=newNode;
        newNode.prevNode=Head;

        size++;
    }

    public void addLast(Object obj){
        Node newNode=new Node(obj);

        Tail.prevNode.nextNode=newNode;
        newNode.prevNode=Tail.prevNode;//another Node부터 연결

        Tail.prevNode=newNode;
        newNode.nextNode=Tail;

        size++;
    }

    private Node node(int index){
        if(index>size||index<0)
            return null;

        Node tmp=Head;

        for(int i=0;i<=index;i++)
            tmp=tmp.nextNode;

        return tmp;
    }//i번째 노드 반환하기 

    public void add(int index,Object obj){
        if(index==0)
            addFirst(obj);
        else if(index==size)
            addLast(obj);
        else
        {
            Node base=node(index);
            Node newNode=new Node(obj);
        
            
            base.prevNode.nextNode=newNode;
            newNode.prevNode=base.prevNode;//another Node부터 연결

            base.prevNode=newNode;
            newNode.nextNode=base;
            
            size++;
        }
       
    
    }

    @Override
    public String toString(){
        String str="{\n";
        int i=0;

        for(Node tmp=Head.nextNode;tmp!=Tail;tmp=tmp.nextNode,i++)
            str+=String.format("[%d 번째 노드의 데이터 : %s]\n",i,tmp.data);
        
            str+="}";

        return str;
    }
        
    
    public Node removeFisrt(){
        if(size==0)
            return null;

        Node tmp=Head.nextNode;

        Head.nextNode=tmp.nextNode;
        tmp.nextNode.prevNode=Head;
        size--;
        return tmp;
    }

    public Node removeLast(){
        if(size==0)
            return null;

        Node tmp=Tail.prevNode;

        Tail.prevNode=tmp.prevNode;
        tmp.prevNode.nextNode=Tail;
        size--;
        return tmp;
    }


    public Node remove(int index){
        if(index==size)
            return removeFisrt();
        else if(index==size)
            return removeLast();
        else{
            Node tmp=Head.nextNode;
            for(int i=0;i<index;i++)
                tmp=tmp.nextNode;

            tmp.prevNode.nextNode=tmp.nextNode;
            tmp.nextNode.prevNode=tmp.prevNode;

            size--;

            return tmp;
        }
    }
    //remove 기능들 구현

    public int size(){
        return size;
    }

    public boolean contains(Object obj){
        for(Node tmp=Head;tmp!=Tail;tmp=tmp.nextNode)
            if(tmp.data==obj)
                return true;

        return false;
    }

    public Object get(int idx){
        Node tmp=node(idx);
        return tmp.data;
    }

    public int indexOf(Object data){
        int i=0;
        for(Node tmp=Head.nextNode;tmp!=Tail;tmp=tmp.nextNode,i++){
            if(tmp.data==data)
                return i;
        }

        return -1;
    }

    public LinkedIterator LinkedIterator(){
     return new LinkedIterator();
   }

    //이터레이터 구현

    class LinkedIterator{
        Node iteratorNode;

        LinkedIterator(){
            iteratorNode=Head;
        }

        public boolean hasNext(){
            if(iteratorNode.nextNode!=null)
                return true;

            return false;
        }

        public boolean hasPrev(){
            if(iteratorNode.prevNode!=null)
                return true;

            return false;
        }

        public Object next(){
            
            iteratorNode=iteratorNode.nextNode;

            return iteratorNode.data;
        }

        public Object prev(){
            Node tmp=iteratorNode;
            iteratorNode=iteratorNode.prevNode;

            return tmp.data;
        }

        public void add(Object obj){
            Node newNode=new Node(obj);

            iteratorNode.prevNode.nextNode=newNode;
            newNode.prevNode=iteratorNode.prevNode;


            iteratorNode.prevNode=newNode;
            newNode.nextNode=iteratorNode;

            iteratorNode=iteratorNode.prevNode;
            size++;
        }

        public Object remove(){
            Node tmp=iteratorNode;

            iteratorNode.prevNode.nextNode=iteratorNode.nextNode;
            iteratorNode.nextNode.prevNode=iteratorNode.prevNode;

            iteratorNode=iteratorNode.nextNode;

            tmp.nextNode=null;
            tmp.prevNode=null;

            return tmp;
        }
    }

    
    
}
