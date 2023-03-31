package ProducerConsumerDemo;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable{
    private BlockingQueue<Integer> blockingQueue;

    public ConsumerThread(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try{
            while (true) {
                int value = blockingQueue.take();
                System.out.println("Consumer"+value);

                value++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
