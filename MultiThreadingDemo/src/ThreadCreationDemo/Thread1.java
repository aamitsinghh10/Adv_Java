package ThreadCreationDemo;

public class Thread1 extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("ThreadCreationDemo.Thread1 is running");
        }
        catch (Exception e){
            System.out.println("Exception raised in thread1"+e);
        }
    }
}
