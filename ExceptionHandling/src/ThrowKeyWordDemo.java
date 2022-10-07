public class ThrowKeyWordDemo {
    public static void main(String[] args){
        try {
            int a = 100/0;
            System.out.println(a);

            //throw new ArithmeticException("My custom message");
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("My custom Exception Message");
            // throw new MyCustomMessage();
            // throw e;
        }
    }
}
