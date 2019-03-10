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
public class Statistics {
    
    private final List<Double> data;
    private final Average average;
    private final Median median;
    private final StandardDeviation standardDeviation;
    
//constructor
    public Statistics(List<Double> numbers) {

        //point the new variable data (avalible for the class)
        this.data = numbers;
        
        //constructors of the specific statistics' classes
         average= new Average(data);
         median = new Median(data);
         standardDeviation = new StandardDeviation(data,average);
    }
    
}
