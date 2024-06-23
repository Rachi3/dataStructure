public class Main {
    public static void main(String[] args) {
        customQueue queue=new customQueue();

        queue.offer(15);
        

        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
    }
}
