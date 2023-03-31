package VolatileKeyword;

public class VolatileDemo {
    static volatile int SHARED_INT_VAL = 0;

    public static void main(String[] args) {

        new ObserverThread().start();
        new ActorThread().start();
    }
}
