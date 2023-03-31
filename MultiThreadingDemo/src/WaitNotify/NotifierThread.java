package WaitNotify;

public class NotifierThread implements Runnable{
    public Integer value;
    public NotifierThread(Integer value){
        this.value = value;
    }

    public void run() {
        synchronized (value){
            try{
                Thread.sleep(1000);
                System.out.println("Notifier thread begins notifying the waiting threads...");
                value.notify();
                System.out.println("Notifier thread finished notifying the waiting threads");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
