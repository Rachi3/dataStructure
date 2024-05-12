package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.addLast(1);
        list.addFirst("hi");
        list.add(1,"add");
        list.add(4,"add");
        list.addLast("Last");

        System.out.println(list);     
        
        System.out.println(list.indexOf(1));
    }
}
