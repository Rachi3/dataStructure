import java.io.*;
import java.util.*;
//stack_10828
public class stack_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());

        Stack<Integer> s=new Stack<>();
        
        String[] cmd;

        for(int i=0;i<N;i++)
        {
            cmd=reader.readLine().split(" ");

          
            if(cmd[0].equals("push"))
            {
                s.push(Integer.parseInt(cmd[1]));
            }
            else if(cmd[0].equals("top")){
                if(s.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(s.peek());
            }
            else if(cmd[0].equals("pop"))
            {
                if(s.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(s.pop());
            }
            else if(cmd[0].equals("empty"))
                System.out.println(s.isEmpty()?1:0);
            else if(cmd[0].equals("size"))
                System.out.println(s.size());
                
        }
    }
}
