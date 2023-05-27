package XinYangZhouProject05;

/**
 * A invalid triangle exception class.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class InvalidTriangleException extends Exception {

    /**
     * A constructor of InvalidTriangleException with a message.
     * 
     * @param message The message of the InvalidTriangleException
     */
    public InvalidTriangleException(String message) {
        // Call super constructor with the parameter message.
        super(message);
    }
}
