import java.util.*;

public class example {
    public static void main(String srgs[]){
        Stack<Integer> stack =new Stack<>();

        //데이터 삽입

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        // 제일 위에 존재하는 데이터
        System.out.println(stack.peek());

        //데이터 삭제
        System.out.println(stack.pop());

        System.out.println(stack.search(1));
    }
}
