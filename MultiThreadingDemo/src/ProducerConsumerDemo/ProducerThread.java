package ProducerConsumerDemo;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable{
    private BlockingQueue<Integer> blockingQueue;

    public ProducerThread(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try{
            int value = 0;
            while (true) {
                blockingQueue.put(value);
                System.out.println("Producer"+value);

                value++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
