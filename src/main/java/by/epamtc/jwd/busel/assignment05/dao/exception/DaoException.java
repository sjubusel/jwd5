package by.epamtc.jwd.busel.assignment05.dao.exception;

public class DaoException extends Exception {
    private static final long serialVersionUID = 6392746202657029495L;

    public DaoException() {
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(Throwable cause) {
        super(cause);
    }
}
