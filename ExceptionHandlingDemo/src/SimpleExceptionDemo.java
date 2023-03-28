public class SimpleExceptionDemo {
    public static void main(String[] args) throws MyCustomException {
        // try {
        int a = 100;
        System.out.println(a);
       //}
        //catch (ArithmeticException e){
        //    throw new ArithmeticException("my custom exception message");
        //}
        throw new MyCustomException("my custom messaage");
    }
}
