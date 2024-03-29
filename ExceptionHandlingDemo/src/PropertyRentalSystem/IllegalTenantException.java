package PropertyRentalSystem;

public class IllegalTenantException extends Exception{
    private static final long serialVersionUID = 1L;
    public IllegalTenantException(){
        super();
    }
    public IllegalTenantException(String message,Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public IllegalTenantException(String message) {
        super(message);
    }
    public IllegalTenantException(Throwable cause) {
        super(cause);
    }

    public IllegalTenantException(String message, Throwable cause) {
        super(message, cause);
    }

}
