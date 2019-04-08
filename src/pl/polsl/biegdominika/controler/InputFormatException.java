
package pl.polsl.biegdominika.controler;

/**
 * Class with extended class exception (basic class of exceptions)
 *
 * @author Dominika Bieg
 * @version 1.0
 */
public class InputFormatException extends Exception {
    
    /**
     * the string of input values typed by the user
     */
    String inputValues;

    /**
     * Handling the exception on inputValues
     * @param inputValues 
     */
    InputFormatException(String inputValues) {
        this.inputValues = inputValues;
    }

    
}
