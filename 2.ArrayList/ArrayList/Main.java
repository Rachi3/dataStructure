package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.addLast(1);
        list.addFirst("hi");
        list.add(1,"add");
        list.add(4,"add");

        System.out.println(list);

        System.out.println(list.removeLast());
        System.out.println(list);
        list.remove("hi");
        System.out.println(list);
        list.removeFisrt();

        System.out.println(list);

    }
}
