package PropertyRentalSystem;

public class InvalidDurationException extends Exception{
    public InvalidDurationException() {
        super();
    }

    public InvalidDurationException(String message) {
        super(message);
    }

    public InvalidDurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDurationException(Throwable cause) {
        super(cause);
    }

    public InvalidDurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
