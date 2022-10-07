import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileException {
    public static void main(String[] args){

        PrintWriter pw;
        try{
            pw = new PrintWriter("amg.txt");//throw exception
            pw.println("saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("FIle saved Successfully");
    }
}
