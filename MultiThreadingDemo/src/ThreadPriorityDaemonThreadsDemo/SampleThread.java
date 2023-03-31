package ThreadPriorityDaemonThreadsDemo;

public class SampleThread implements Runnable{
    private String name;
    public SampleThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Inside run method "+name);
    }
}
