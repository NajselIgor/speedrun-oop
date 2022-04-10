public class NotPesExeption extends Exception {
    public NotPesExeption() {
    }

    public NotPesExeption(String message) {
        super(message);
    }

    public NotPesExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPesExeption(Throwable cause) {
        super(cause);
    }
}
