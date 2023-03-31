package SynchronisedKeyword;

public class MathUtils {
    //synchronized void getMultiples(int n) {
    public void getMultiples(int n) {
        System.out.println("beginning");
        synchronized(this){
            for (int i = 1; i<=n; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
