package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MathUtils {
    Lock locker = new ReentrantLock();
    public void getMultiples(int n) {

        try {
            locker.lock();
            for (int i = 1; i <= n; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }finally {
            locker.unlock();
        }
    }
}
