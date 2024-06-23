import java.util.*;

public class example {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<10;i++)
            queue.offer(i);

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
