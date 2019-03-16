
package pl.polsl.biegdominika.model;

import java.util.List;

/**
 * The class responsible for logic of calculating the average
 * @author Dominika Bieg
 * @version 1.0.0
 */
public class Average implements StatisticInterface{
    

    private final double average;
    /**
     * Calculating the value of the average
     * @param data - list of doubles with data typed by the user
     */
    Average(List<Double> data) {

        //stream - calls each next element of the list of OBJECTS and maps them to double
        //operator sum() adds all doubles stremaed from the data collection 
       double sum = data.stream().mapToDouble(d->d).sum();
       int n = data.size();
       //calculating the value of the average
       average = sum/n;
    }

    /**
     * getter generated automatically in order to pass the average variable to other classes
     * @return average - the value of the average caluculated from user's data
     */
    public double getAverage() {
        return average;
    }

    //methods inserted by implementation of StatisticInterface
    /**
     * 
     * @return "Average" as a title of given statistic
     */
    @Override
    public String getName() {
        //returning name of the calculated value
    return "Average";
    }

    /**
     * 
     * @return String.valueOf(average) - the value og the average converted into the string 
     */
    @Override
    public String getValue() {
        //the double variable must be converted into the string so it can be showed easier
        return String.valueOf(average);
    }
    
}
