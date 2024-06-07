public class Main {
    public static void main(String[] args) {
        customLinkedList cLinkedList=new customLinkedList();

        cLinkedList.addFirst(1);
        cLinkedList.addFirst(2);
        cLinkedList.addFirst(3);
        cLinkedList.addFirst(4);
        cLinkedList.addFirst(5);

        cLinkedList.addLast(1);
        cLinkedList.addLast(2);
        cLinkedList.addLast(3);
        cLinkedList.addLast(4);
        cLinkedList.addLast(5);

        cLinkedList.printAll();

        cLinkedList.add(11,"어쩔티비");
        cLinkedList.printAll();

        
    }
    
   
}
