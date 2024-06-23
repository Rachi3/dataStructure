
public class customQueue {
    private QueueNode Head;
    private QueueNode Tail;
    private int size=0;

    public customQueue(){
        Head=new QueueNode();
        Tail=new QueueNode();

        Head.nextNode=Tail;
        Tail.prevNode=Head;
    }

    public void offer(Object value){
        QueueNode newQueue=new QueueNode(value);

        newQueue.nextNode=Head.nextNode;
        Head.nextNode.prevNode=newQueue;

        Head.nextNode=newQueue;
        newQueue.prevNode=Head;

        size++;
    }

    public Object poll(){

        if(isEmpty())
            return null;
            
        QueueNode tmp=Tail.prevNode;

        tmp.prevNode.nextNode=Tail;
        Tail.prevNode=tmp.prevNode;

        tmp.prevNode=null;
        tmp.nextNode=null;

        size--;
        return tmp.obj;
    }

    public Object peek(){
        return Tail.prevNode.obj;
    }

    public boolean isEmpty(){
        return Head.nextNode==Tail?true:false;
    }

    public int size(){
        return size;
    }

    @Override 
    public String toString(){
        String str="[";

        for(QueueNode tmp=Head.nextNode;tmp!=Tail;tmp=tmp.nextNode)
            str+=tmp.obj.toString()+",";

        str+="]";

        return str;
    }
    class QueueNode{
        private Object obj;
        private QueueNode nextNode;
        private QueueNode prevNode;

        QueueNode(){};
        QueueNode(Object obj){
            this.obj=obj;
        }
    }
}
