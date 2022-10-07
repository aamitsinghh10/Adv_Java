public class MultipleCatchDemo {
    public static void main(String[] args){
        try{
            int arr[] = new int[10];
            //arr[0] = 20/0;
            //System.out.println(arr[10]);
            String a = null;
            a.charAt(0);
            System.out.println("Try block ends here");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not possible: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access an Array element outside an Array Length: "+e);
        }
        catch(Exception e){
            System.out.println("Any other generic Exception: "+e);
        }
        System.out.println("I am out of try-catch block");
    }
}
