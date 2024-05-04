import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fibonacci fib=new fibonacci();

        int N=fib.fibonacci(sc.nextInt());

        System.out.println(N);
    }

    public int fibonacci(int N){
        if(N==0||N==1)
            return N;
        else
            return fibonacci(N-1)+fibonacci(N-2);
    }
}
