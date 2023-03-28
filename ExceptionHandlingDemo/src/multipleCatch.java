public class multipleCatch {
    public static void main(String[] args) {
        try{
            int[] arr = new int[10];
            arr[10] = 10/0;
            System.out.println("try block ends here");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not possible:"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("cannot access an element outside its length"+e);
        }
        catch(Exception e){
            System.out.println("any other general exception"+e);
        }
        System.out.println("I am out of try-catch block");
    }
}
