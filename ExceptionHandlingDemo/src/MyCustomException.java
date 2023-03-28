public class MyCustomException extends Exception {
    MyCustomException(){
        //default constructor
    }
    MyCustomException(String str){
        //parametrized constructor
        super(str);
        System.out.println("My own generated Exception");
    }
}
