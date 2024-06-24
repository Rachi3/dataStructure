public class Main {
    
    public static void main(String[] args) {
        customTree T=new customTree(1);

        T.add(1,2);
        T.add(1,3);
        T.add(2,4);
        T.add(2,5);
        T.add(3,6);

        
       
        System.out.println(T.height(2));
    }
}
