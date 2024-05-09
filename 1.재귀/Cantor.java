import java.util.Scanner;

public class Cantor{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//입력받을 sc선언
        Cantor ct=new Cantor();//ct는 Cantor의 CantorFunc을 사용하기 위함

        while (sc.hasNextInt()) {
            int N=get_3_Squared(sc.nextInt());//x을 입력받고 3의 x제곱수 리턴받아 N에 저장
        
            String CantorStr=ct.CantorFunc("-".repeat(N), N, N);//N만큼 "-"로 된 문자열 저장

            System.out.println(CantorStr);
        }
    }

    public static int get_3_Squared(int number) {
		int result=1;

        for(int i=0;i<number;i++) result*=3;

        return result;
	}

    public String CantorFunc(String str,int N,int base){
        StringBuilder sb=new StringBuilder(str);//setCharAt으로 한글자씩 바꾸기위해 sb선언 및 초기화
        int tmp=base/N;//tmp는 전체 반복횟수
        int x=N/3;//얼만큼 뛸지
        if(N==1)
            return sb.toString();
        else
            {
                for(int i=0;i<tmp;i++)//전체 문자열을 tmp번 쪼개서 각각 중앙을 팔 준비
                    for(int j=x+N*i;j<2*x+N*i;j++){//쪼갠 문자열의 중앙부분을 ' '로 대체
                        sb.setCharAt(j, ' ');
                    }
                    
                    return CantorFunc(sb.toString(), N/3, base);
            }

    }
}

   