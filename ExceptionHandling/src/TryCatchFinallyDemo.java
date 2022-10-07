import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class WriterHelper{
    public void readFile() throws IOException{
        FileReader file = null;
        BufferedReader fileInput = null;

        try{
            file = new FileReader("E:\\sample.txt");
            fileInput = new BufferedReader(file);

            for(int counter=0;counter<3;counter++){
                System.out.println(fileInput.readLine());
            }
        }
        catch(FileNotFoundException e){
            System.err.println("Caught FileNotFoundException :"+e.getMessage());
        }
        finally{
            if(fileInput!=null){
                System.out.println("closing the Buffered Reader");
                fileInput.close();
            }
            if(file!=null){
                System.out.println("closing the file Reader");
                file.close();
            }
        }
    }
}
public class TryCatchFinallyDemo {
    public static void main(String[] args){
        WriterHelper wt = new WriterHelper();
        try{
            wt.readFile();
        }
        catch(IOException e){
            e.getStackTrace();
        }
    }
}
