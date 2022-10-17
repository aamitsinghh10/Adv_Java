public class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Runnable r = new MyThread2();
        Thread t = new Thread(r,"My Thread");

        t.start();
        String s = t.getName();
        System.out.println(s);
    }
}
