package pl.polsl.biegdominika.model;

/**
 * Interface created to define properties that every statistical object must fullfil 
 * @author Dominika Bieg
 * @version 1.0.0
 */

public interface StatisticInterface {
    /**
     * 
     * @return name of the function
     */
    String getName();
    /**
     * 
     * @return value of the statistics
     */
    String getValue();
}
