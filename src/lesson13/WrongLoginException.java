package lesson13;

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong Login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}