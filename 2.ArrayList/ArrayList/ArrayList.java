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
           System.out.println("잘못된 주소를 입력하셨습니다.");
           return false;//만약 현재까지 저장된 개수보다 큰 주소에 더하고 싶다하면 오류발생
        }

        for(int i=nowIdx;i>idx;i--)
            obj[i]=obj[i-1];

        obj[idx]=data;
        //미는 작업 필요함 이건 처음에 대입할때도 필요하니 매소드로 따로 구현

        nowIdx++;
        return true;
   }

   public boolean addFirst(Object data){
        return add(0,data);
   }

  

   @Override
   public String toString(){
     String str="[";

     for(int i=0;i<nowIdx;i++)
     {
          str+=obj[i];//자동으로 obj[i].toString() 호출됌
          str+=',';
     }
     return str+"]";
   }

   //remove 관련 매소드 생성


   public Object remove(int idx){
     if(nowIdx==0)
     {
          System.out.println("현재 저장된 데이터가 없습니다!");
          return null;
     }

     if(!(idx>=0&&idx<nowIdx))
     {    
          System.out.println("현재 존재하지 않는 인덱스를 제거하려 하셨어요!");

          return null;//현재 있는 값이 아니면 오류 발생
     }

     Object tmp=obj[idx];

     for(int i=idx;i<nowIdx-1;i++)
          obj[i]=obj[i+1];

     nowIdx--;
     obj[nowIdx]=null;
     return tmp;
   }

   public Object remove(Object data){
     for(int i=0;i<nowIdx;i++)
          if(obj[i]==data)
               return remove(i);//찾는 값이 있다면 remove(idx) 호출 remove(idx) 내부 구조상 인덱스에 +1 해서 전달
     
     return false;//실패시 false 되돌려줌 
   }

   public Object removeFisrt(){
     return remove(0);//첫번째 값 삭제 remove 내부 구조상 +1해서 전달
   }

   public Object removeLast(){
     return remove(nowIdx-1);//마지막 데이터 삭제
   }
}
