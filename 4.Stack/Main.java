
public class Main {
    public static void main(String[] args) {
       arrayStack aStack=new arrayStack();

       aStack.push(1);
       aStack.push(2);

       aStack.pop();
       System.out.println(aStack.search(1));

    }
}
