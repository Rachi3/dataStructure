import java.io.*;
import java.util.*;

public class stack_9012{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(reader.readLine());
        Boolean isPossible;

        for(int i=0;i<N;i++)
        {
            Stack<Integer> stack =new Stack<>();
            String str=reader.readLine();

            isPossible=true;

            for(char c:str.toCharArray())
            {
                if(c=='(')
                    stack.push(1);
                else if(c==')')
                {
                    if(stack.isEmpty())
                        {
                            isPossible=false;
                            break;
                        }
                    stack.pop();
                }
            }

            if(!isPossible||!stack.isEmpty())
                System.out.println("NO");
            else    
                System.out.println("YES");
        }
    }
}