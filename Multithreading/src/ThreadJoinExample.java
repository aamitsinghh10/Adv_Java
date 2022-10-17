class ThreadJoin extends Thread{
    public void run(){
        for(int i=1;i<2;i++){
            try{
                Thread.sleep(500);
                System.out.println("Current Thread name is:"+Thread.currentThread().getName());
            }
            catch(Exception e){
                System.out.println("An uncaught Error Occurred:"+e);
            }
            System.out.println(i);
        }
    }
}
public class ThreadJoinExample{
    public static void main(String[] args){
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();
        try{
            System.out.println("Current Thread name is :"+Thread.currentThread().getName());
            t1.join();
        }
        catch(Exception e){
            System.out.println("Caught Exception :"+e);
        }

        t2.start();
        try{
            System.out.println("Current Thread name is :"+Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception e){
            System.out.println("Uncaught Exception:"+e);
        }
        t3.start();
    }
}
