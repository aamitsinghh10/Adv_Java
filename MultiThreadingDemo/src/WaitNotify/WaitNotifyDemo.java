package WaitNotify;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Integer value = Integer.valueOf(0);

        Thread waitingThread = new Thread(new WaitingThread(value));
        waitingThread.start();

        Thread notifierThread = new Thread(new NotifierThread(value));
        notifierThread.start();
    }
}
