package SynchronisedKeyword;

public class Thread2 implements Runnable{
    MathUtils mu;
    public Thread2(MathUtils mu){
        this.mu = mu;
    }
    @Override
    public void run() {
        try{
            mu.getMultiples(5);
        }
        catch (Exception e){
            //throwing exception
            System.out.println("Exception is caught");
        }
    }
}
