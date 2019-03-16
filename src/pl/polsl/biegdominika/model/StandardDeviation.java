
package pl.polsl.biegdominika.model;

import java.util.List;

/**
 * Class responsible for logic and calculating value of standard deviation
 * @author Dominika Bieg
 * @version 1.0.0
 */
public class StandardDeviation implements StatisticInterface {

    private final double standardDeviation;
    private final Average average;
    /**
     * Constructor
     * @param data - list of doubles with value typed by the user
     * @param average - the value of the average calculated in class average
     */
    StandardDeviation(List<Double> data, Average average) {

      //field created in order to use value of the average in method deviation
        this.average = average;
      //calculate the deviation by streaming each number and maping them
      //according to formula defined in method deviation located in class StandardDeviation
      //then sum all elements of the collection
       double sum = data.stream().mapToDouble(this::deviation).sum();
       int n = data.size();
       
       //uses a square root from math libary and calculates the value of standard deviation
       standardDeviation= Math.sqrt(sum/n);
        
    }
    /**
     * method calcuating the deviation - first part of calculating the standard deviaiton
     * @param value - single value from list od values inserted by the user
     * @return Math.pow(diff, 2) - the value of the deviation rised to the power of 2
     */
    private double deviation(Double value){
        
        //value from the stream-average from the average class
        double diff = value-average.getAverage();
        //returns the difference of values from data and average raised tot eh power of 2
        return Math.pow(diff, 2);
    }
/**
 * getter generated in order to pass the variable to other classes
 * @return standardDeviation - the value of calucated standardDeviation
 */
    public double getStandardDeviation() {
        return standardDeviation;
    }

    
//methods inserted by implementation of StatisticInterface
    /**
     * @return "Standard Deviation" - the name of calucated statistic
     */
    @Override
    public String getName() {
//returning name of the calculated value
    return "Standard Deviation"; 
    }
/**
 * 
 * @return String.valueOf(standardDeviation) - the value of standard deviation converted into the string so it can be showed easier
 */
    @Override
    public String getValue() {
        return String.valueOf(standardDeviation);
    }
    
    
}
