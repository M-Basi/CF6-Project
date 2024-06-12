package gr.aueb.cf.ch15.bankApp.exceptions;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUUID = -123456789L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " not valid");
    }
}
