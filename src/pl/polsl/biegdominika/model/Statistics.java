package pl.polsl.biegdominika.model;

import java.util.Arrays;
import java.util.List;

/**
 * Class statisctics with constructors of statistics
 * @author Dominika Bieg
 *  @version 1.0.0
 */
public class Statistics {
    
    private final List<Double> data;
    private final Average average;
    private final Median median;
    private final StandardDeviation standardDeviation;
    
/**
 * 
 * @param numbers - list with data from user
 */
    public Statistics(List<Double> numbers) {

        //point the new variable data (avalible for the class)
        this.data = numbers;
        
        //constructors of the specific statistics' classes
         average= new Average(data);
         median = new Median(data);
         standardDeviation = new StandardDeviation(data,average);
    }
    
    /**
     * 
     * @return Arrays.asList(average,median,standardDeviation) - a collection of statistics avalible
     */
    public List<StatisticInterface> listOfStats(){
     return Arrays.asList(average,median,standardDeviation);
}
}
