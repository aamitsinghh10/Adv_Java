package JoinDemo;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(),"thread1");
        Thread thread2 = new Thread(new MyThread(),"thread2");
        Thread thread3 = new Thread(new MyThread(),"thread3");

        thread1.start();

        try{
            thread1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
        try{
            thread2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        thread3.start();
        try{
            thread3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All the threads have finished their execution");
    }
}
