

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
        if(index>size)
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
        else if(index<size&&index>0)
        {
            Node base=node(index);
            Node newNode=new Node(obj);
        
            if(base!=null)
            { 
            base.prevNode.nextNode=newNode;
            newNode.prevNode=base.prevNode;//another Node부터 연결

            base.prevNode=newNode;
            newNode.nextNode=base;
            }
        }
       else{
        System.out.println("해당 인덱스는 존재하지 않습니다.");
        return;
       }
    
    }

    public void printAll(){
        int i=0;
        for(Node tmp=Head.nextNode;tmp.nextNode!=null;tmp=tmp.nextNode,i++)
            System.out.println(i+" 번째 데이터 : "+tmp.data);
    }//임시로 출력 매소드

    //remove 기능들 구현

    //모든 변수 조회 기능 구현

    //특정 변수 찾기 기능 구현
    
}
