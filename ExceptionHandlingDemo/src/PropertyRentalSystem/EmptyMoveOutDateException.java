package PropertyRentalSystem;

public class EmptyMoveOutDateException extends Exception{
    private static final long serialVersionUID = 1L;

    public EmptyMoveOutDateException() {
        super();
    }

    public EmptyMoveOutDateException(String message) {
        super(message);
    }

    public EmptyMoveOutDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyMoveOutDateException(Throwable cause) {
        super(cause);
    }

    public EmptyMoveOutDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
