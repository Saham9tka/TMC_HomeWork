package lesson13;

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong Password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}