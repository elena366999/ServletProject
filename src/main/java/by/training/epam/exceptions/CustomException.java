package by.training.epam.exceptions;

public class CustomException extends Exception {

    private static final long serialVersionUID = 1L;

    public CustomException() {
    }

    public CustomException(String msg) {
        super(msg);
    }

}