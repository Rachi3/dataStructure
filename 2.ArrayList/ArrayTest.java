import java.util.*;

public class ArrayTest{
    public static void main(String[] args) {
        ArrayTest at=new ArrayTest();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        numbers.add(15);

        int []arr={1,2,3,4};
        System.out.println(numbers);
        System.out.println(list);

        list.add(2,4);
        System.out.println(list);

        list.add(4,7);//없는 index참조시 데이터 추가 못함
        System.out.println(list);
        // numbers.addAll(arr);//배열은 추가불가
        // numbers.addAll(list);

        System.out.println("Iterator로 실행");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            //Integer i = iterator.next();

            int i =iterator.next();

            System.out.println(i);
`
            if(i == 1)
                iterator.remove();
        }

        System.out.println("for-each로 실행");
        for(int i:list){
            System.out.println(i);
        }

        System.out.println(list);
    }
}