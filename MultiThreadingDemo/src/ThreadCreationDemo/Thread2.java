package ThreadCreationDemo;

public class Thread2 implements Runnable {//extends A implements Runnable, int1, int2, int3
    @Override
    public void run() {
        try{
            System.out.println("Thread 2 is running");
        }
        catch(Exception e){
            System.out.println("Exception raised in thread2"+e);
        }
    }
}
