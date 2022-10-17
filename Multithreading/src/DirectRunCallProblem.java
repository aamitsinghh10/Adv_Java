public class DirectRunCallProblem extends Thread{
    public void run(){

        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        DirectRunCallProblem t1 = new DirectRunCallProblem();
        DirectRunCallProblem t2 = new DirectRunCallProblem();
        t1.run();
        t2.run();
    }
}
