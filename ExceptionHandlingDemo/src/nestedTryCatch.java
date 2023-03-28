public class nestedTryCatch {
    public static void main(String[] args) {
        try{ //block-1
            try{  //block-2
                try{  //block-3
                    int[] arr = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array Index out of bound in block 3");
                    throw e;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index out of bound in block 2");
                throw e;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound in block 1");
            throw e;
        }
    }
}
