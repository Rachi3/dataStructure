package ArrayList;

public class ArrayList {
    private Object []obj=new Object[100];//처음 실행시 Object 배열 생성
    private int nowIdx=0;//현재 어디까지 저장되어있는지 나타내는 변수생성
    
   public boolean addLast(Object data)
   {
        obj[nowIdx]=data;

        return true;
   }

   public boolean add(int idx,Object data){
        if (idx>nowIdx)
            return false;//만약 현재까지 저장된 개수보다 큰 주소에 더하고 싶다하면 오류발생
        
        obj[idx]=data;

        return true;
   }
}
