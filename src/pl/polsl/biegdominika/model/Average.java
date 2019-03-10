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
public class Average implements StatisticInterface{
    

    private final double average;
    Average(List<Double> data) {

        /*
        stream - calls each next element of the list of OBJECTS and maps them to double
        operator sum() adds all doubles stremaed from the data collection 
        */
       double sum = data.stream().mapToDouble(d->d).sum();
       int n = data.size();
       
       average = sum/n;
    }

    //getter generated automatically in order to pass the average variable to other classes
    public double getAverage() {
        return average;
    }

    //methods inserted by implementation of StatisticInterface
    @Override
    public String getName() {
        //returning name of the calculated value
    return "Average";
    }

    @Override
    public String getValue() {
        //the double variable must be converted into the string so it can be showed easier
        return String.valueOf(average);
    }
    
}
