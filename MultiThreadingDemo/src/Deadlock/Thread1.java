package Deadlock;

public class Thread1 implements Runnable{

    private Class1 obj1;
    private Class2 obj2;

    public Thread1(Class1 obj1, Class2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("thread1 got lock on obj1, waiting to get lock on obj2");
            synchronized (obj2){
                System.out.println("thread1 got lock on obj2 also");
            }
        }
    }
}
