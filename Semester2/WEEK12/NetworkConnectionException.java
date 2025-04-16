package week_12;

// Custom checked exception for network issues
class NetworkConnectionException extends Exception {
    public NetworkConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}