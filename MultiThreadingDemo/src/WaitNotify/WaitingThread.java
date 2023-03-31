package WaitNotify;

public class WaitingThread implements Runnable{
    public Integer value;
    public WaitingThread(Integer value){
        this.value = value;
    }

    @Override
    public void run() {
        synchronized (value){
            try{
                System.out.println("waiting to get the lock");
                value.wait();
                System.out.println("Waiting thread recieved notification by Notifier Thread");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
