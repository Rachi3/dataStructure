import java.util.Scanner;

public class palindrome {
    int cnt=0;//호출 횟수를 셀 변수
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        palindrome pL=new palindrome();
        int flag,N=sc.nextInt();
        String str;
        
        for(int i=0;i<N;i++)
        {
            str=sc.next();
            flag=pL.isPalindrome(str);
            System.out.printf("%d %d\n",flag,pL.cnt);
            pL.cnt=0;
        }
    }

    public int isPalindrome(String str){
        cnt++;

        if(str.length()<=1)
            return 1;//문자열의 글자가 1개거나 0개라면 종료
        if(str.charAt(0)==str.charAt(str.length()-1))
            return isPalindrome(str.substring(1,str.length()-1));
            //만약 맨 처음과 마지막 문자가 같다면 짤라서 다음검사
        else
            return 0;
    }
}
