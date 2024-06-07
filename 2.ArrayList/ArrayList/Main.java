package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.addLast(1);
        list.addFirst("hi");
        list.add(1,"add");
        
        list.addLast("Last");

        ArrayList.ListIterator li = list.ListIterator();
        //반복문 대신 반복작업을 하기위해 Iterator 객체 사용함
        //이 객체는 ArrayList안에 존재하는 또다른 클래스
        //list객체안에 ListIterator()매소드 호출하여 반환받음
        
        
        
        li.add("cheeze");
        while(li.hasNext())
        {
            System.out.println(li.Next());
        }

    }
}
