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
public class Median implements StatisticInterface{

    private final double median;
    Median(List<Double> data) {

        //sort data from the smallest to the biggest value
        data.sort((a, b) -> a.compareTo(b));
        int n = data.size();
       
        //check wheter the size of a data collection is even or odd number,
        //then calculate the median 
        if (n%2==0){
         double x1=data.get(n/2);
         double x2=data.get((n/2)-1);
         median=(x1+x2)/2;
       }
        else{
            median=data.get((n/2)-1);
        }
    }

    public double getMedian() {
        return median;
    }

        //methods inserted by implementation of StatisticInterface

    @Override
    public String getName() {
  //returning name of the calculated value
    return "Median";    
    }

    @Override
    public String getValue() {
//the double variable must be converted into the string so it can be showed easier
        return String.valueOf(median);
    }
    
}
