package engine.exceptions;

public class DBAppException extends Exception {
    public DBAppException() {}
    public DBAppException(String message) {
        super(message);
    }
}
