package VolatileKeyword;

public class ObserverThread extends Thread{

    @Override
    public void run() {
        int value = VolatileDemo.SHARED_INT_VAL;
        while(value<5){

            if(value != VolatileDemo.SHARED_INT_VAL){
                System.out.println("value got changed, new value is: "+VolatileDemo.SHARED_INT_VAL);
                value = VolatileDemo.SHARED_INT_VAL;
            }
        }
    }
}
