public class ResolveExceptioninCatch {
    public static void main(String[] args){
        int i=100;
        int j=0;
        int data;
        try{
            data=i/j;
        }
        catch(Exception e){
            //resolving exception in catch block
            System.out.println(i/(j+2));
        }
    }
}
