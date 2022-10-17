public class DirectInvokeThread{
    public static void main(String[] args){
        Thread t = new Thread("My first thread");
        t.start();
        String s = t.getName();
        System.out.println(s);
    }
}
