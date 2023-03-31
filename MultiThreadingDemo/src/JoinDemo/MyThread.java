package JoinDemo;

public class MyThread implements Runnable{
    @Override
    public void run() {
        //Thread thread = Thread.currentThread();
        System.out.println("Thread running, name of the thread is:"+Thread.currentThread().getName());

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread ended, name of the thread is:"+Thread.currentThread().getName());
    }
}
