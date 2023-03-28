import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args) {
        fileClass fl = new fileClass();
        try{
            fl.readFile();
        }
        catch (IOException e){
            e.getStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
