public class NestedTryDemo {
    public static void main(String[] args){
        try{
            try{
                try{
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                }
                catch(NullPointerException e){//ArrayIndexOutOfBoundsException
                    System.out.println("Exception at Block 3");
                    throw e;
                }
            }
            catch(StringIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException
                System.out.println("Exception at Block 2");
                throw e;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception at Block 1");
        }
    }
}
