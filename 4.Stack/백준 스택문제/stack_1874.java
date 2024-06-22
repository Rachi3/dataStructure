import java.io.*;
import java.util.*;

public class stack_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(reader.readLine());

        
        Stack<Integer>stack=new Stack<>();

        int current=1;
        boolean isPossible=true;
        StringBuilder sb=new StringBuilder();

        
        for(int i=0;i<N;i++)
        {
            int tmp=Integer.parseInt(reader.readLine());
            
            
            while(tmp>=current){
                stack.push(current++);
                sb.append("+\n");
            }
            
            if(stack.peek()==tmp)
            {
                stack.pop();
                sb.append("-\n");
            }
            else
                isPossible=false;
                
            
            
        }

        if(!isPossible)
            System.out.println("NO");
        else
            System.out.println(sb.toString());
    }
}