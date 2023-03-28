import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileClass {

    public void readFile() throws Exception{
        FileReader file = null;
        BufferedReader fileInput = null;

        try{
            file = new FileReader("F:\\java-tutorials\\source.txt");
            fileInput = new BufferedReader(file);

            for(int counter=0;counter<3;counter++){
                System.out.println(fileInput.readLine());
            }
        }
        catch (FileNotFoundException e){
            System.err.println("Caught fileNotFoundException: "+e.getMessage());
        }
        finally {
            if(fileInput!=null){
                fileInput.close();
            }
            if(file!=null) {
                file.close();
            }
        }
    }
}
