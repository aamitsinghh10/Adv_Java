public class TryTohandleWithArrayException {
    public static void main(String[] args){
        try{
            int data = 50/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
