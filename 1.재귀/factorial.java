import java.util.Scanner;//입력을 위한 패키지 호출

public class factorial{
    long N;//팩토리얼을 입력받을 정수
    public static void main(String[] args) {
        factorial fT=new factorial();//factorial 객체 설정
       
       Scanner sc=new Scanner(System.in);

       fT.N=sc.nextLong();

       long result=fT.Factorial(fT.N);//팩토리얼의 결과값을 result 지역변수에 저장

       System.out.println(result);
    }

    public long Factorial(long N){
        if(N==0)
            return 1;
        else
            return N*Factorial(N-1);
    }

}