/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.biegdominika.model;

import java.util.List;

/**
 *
 * @author Dominika
 */
public class StandardDeviation implements StatisticInterface {

    private final double standardDeviation;
    private final Average average;
    
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
    
    private double deviation(Double value){
        
        //value from the stream-average from the average class
        double diff = value-average.getAverage();
        //returns the difference of values from data and average raised tot eh power of 2
        return Math.pow(diff, 2);
    }

    //get generated in order to pass the variable to other classes
    public double getStandardDeviation() {
        return standardDeviation;
    }

    
        //methods inserted by implementation of StatisticInterface

    @Override
    public String getName() {
//returning name of the calculated value
    return "Standard Deviation"; 
    }

    @Override
    public String getValue() {
//the double variable must be converted into the string so it can be showed easier
        return String.valueOf(standardDeviation);
    }
    
    
}
