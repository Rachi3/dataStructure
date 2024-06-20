
import java.util.*;

public class arrayStack{
    private int size=0;
    private ArrayList<Object> stack=new ArrayList<>();

    
    public Object push(Object data){
        stack.addFirst(data);
        size++;

        return data;
    }

    public Object pop(){
        Object obj=stack.remove(0);

        size--;
        return obj;
    } 

    public Object peek(){
        return stack.get(0);
    } 

    public boolean isEmpty(){
        if(size==0)
            return true;
        
        return false;
    }

    public int search(Object obj){
        return stack.indexOf(obj);
    }

    @Override
    public String toString(){
        String str="[";

        Iterator<Object> li=stack.iterator();

        while(li.hasNext())
            str+=","+(li.next()).toString();
        
        str+="]";

        return str;
    }
}
