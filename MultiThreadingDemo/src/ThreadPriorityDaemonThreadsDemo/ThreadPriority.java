package ThreadPriorityDaemonThreadsDemo;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SampleThread("thread1"));
        Thread thread2 = new Thread(new SampleThread("thread2"));
        Thread thread3 = new Thread(new SampleThread("thread3"));

        System.out.println("thread1 priority : "+thread1.getPriority());
        System.out.println("thread2 priority : "+thread2.getPriority());
        System.out.println("thread3 priority : "+thread3.getPriority());

        thread1.setPriority(3);
        thread2.setPriority(6);
        thread3.setPriority(9);

        System.out.println("thread1 new priority : "+thread1.getPriority());
        System.out.println("thread2 new priority : "+thread2.getPriority());
        System.out.println("thread3 new priority : "+thread3.getPriority());

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Currently running thread : "+Thread.currentThread().getName());
        System.out.println("Main thread Priority : "+Thread.currentThread().getPriority());

        thread1.setDaemon(true);
        System.out.println("new thread1 priority after making it daemon is");
    }
}
