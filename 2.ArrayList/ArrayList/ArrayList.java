package ArrayList;

public class ArrayList {
    private Object []obj=new Object[100];//처음 실행시 Object 배열 생성
    private int nowIdx=0;//현재 어디까지 저장되어있는지 나타내는 변수생성
    
   public boolean addLast(Object data)
   {
        obj[nowIdx]=data;
        nowIdx++;
        return true;
   }

   public boolean add(int idx,Object data){
        if (idx>nowIdx){
           System.out.println("Wrong index!");
           return false;//만약 현재까지 저장된 개수보다 큰 주소에 더하고 싶다하면 오류발생
        }
        pushData(idx);
        obj[idx]=data;
        //미는 작업 필요함 이건 처음에 대입할때도 필요하니 매소드로 따로 구현

        nowIdx++;
        return true;
   }

   public boolean addFirst(Object data){
        pushData(0);
        obj[0]=data;

        nowIdx++;
        return true;
   }

   private boolean pushData(int idx)
   {
        //원하는 idx부터 마지막까지 땡겨줘야함

        for(int i=nowIdx;i>idx;i--)
            obj[i]=obj[i-1];

        return true;
   }

   public void printList(){
        for(int i=0;i<nowIdx;i++)
            System.out.println(obj[i]);//wrapper class로 인해서 자동으로 알맞은 출력방식으로 toString이 오버라이딩됌.
   }
}
