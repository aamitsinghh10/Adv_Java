public class CustomMessage {
    public static void main(String[] args){
        try{
            int data = 100/0;
        }catch(Exception e){
            System.out.println("Cannot divided by 0");
        }
    }
}
