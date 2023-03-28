import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsException {
    public void readFile() throws Exception{
        FileReader file = null;
        BufferedReader fileInput = null;

        try{
            file = new FileReader("C:/Users/amits/Documents/Developed a Task Management System .txt");
            fileInput = new BufferedReader(file);

            for(int counter = 0;counter<3;counter++){
                System.out.println(fileInput.readLine());
            }
        }
        //catch(FileNotFoundException e){
        //    System.out.println("Caught file not found Exception"+e.getMessage());
        //}
        finally{
            if(fileInput!=null){
                System.out.println("closing the buffered reader");
                fileInput.close();
            }
            if(file!=null){
                System.out.println("closing the file");
                file.close();
            }
        }
    }
}
