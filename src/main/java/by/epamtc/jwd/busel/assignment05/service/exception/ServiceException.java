package by.epamtc.jwd.busel.assignment05.service.exception;

public class ServiceException extends Exception {
    private static final long serialVersionUID = 3660013819041752815L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
