import java.util.ArrayList;
import java.util.List;

class TryCatch{
    public void Write(){
        try{
            List<Integer> list = new ArrayList<>(10);
            list.add(10);
            System.out.println("Entering Try Statement");
            Integer a = list.get(2);
            System.out.println("Value of a is : "+a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Caught IndexOutOfBoundException : "+e.getMessage());
        }
        finally{
            System.out.println("This will always Executed");
        }
    }
}
public class TryCatchDemo {
    public static void main(String[] args){
        TryCatch t = new TryCatch();
        t.Write();
    }
}
