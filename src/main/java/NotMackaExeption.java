public class NotMackaExeption extends Exception {
    public NotMackaExeption() {
    }

    public NotMackaExeption(String message) {
        super(message);
    }

    public NotMackaExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NotMackaExeption(Throwable cause) {
        super(cause);
    }
}
