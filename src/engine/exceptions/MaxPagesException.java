package engine.exceptions;

public class MaxPagesException extends DBAppException{
    public MaxPagesException() {}
    public MaxPagesException(String message) {
        super(message);
    }
}
