public class customLinkedList {
    private Node Head;
    private Node Tail;
    private int size=0;//저장된 노드의 개수 나타냄

    private class Node{
        //1. 데이터를 저장 가능해야함
        //2. 다음 노드를 가르켜야함 단 포인터는 없음;; 되게 불편하네
        private Object data;
        private Node nextNode;//남들은 참조 불가
            
        public Node(){
            this.data=null;
            this.nextNode=null;
        }

        public Node(Object input){
            this.data=input;
            this.nextNode=null;
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
        Tail.nextNode=null;//Tail은 항상 마지막 값이니 null
    }

    
}
