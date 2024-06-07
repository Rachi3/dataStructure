public class Main {
    public static void main(String[] args) {
        customLinkedList cLinkedList=new customLinkedList();

        String str=new String("어쩔티비");

        strChange(str, "ㅋㅋㄹㅃㅃ");

        System.out.println(str);
    }
    
    public static void strChange(String str,String strChange){
        str=strChange;
    }
}
