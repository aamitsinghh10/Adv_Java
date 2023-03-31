package VolatileKeyword;

public class ActorThread extends Thread{
    @Override
    public void run() {

        int value = VolatileDemo.SHARED_INT_VAL;

        while(VolatileDemo.SHARED_INT_VAL<5){
            System.out.println("Incrementing value, new value is: "+ (value + 1));
            VolatileDemo.SHARED_INT_VAL = ++value;

            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
