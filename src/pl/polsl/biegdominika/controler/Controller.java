/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.biegdominika.controler;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.biegdominika.model.StatisticInterface;
import pl.polsl.biegdominika.model.Statistics;
import pl.polsl.biegdominika.view.View;

/**
 *
 * @author Dominika
 */
public class Controller {

    private boolean isRunning = true;
    // initialization of the viwew during the initialization of the controller
    private final View view = new View();
    /*
     public method - start running the app
     and keeps the program running
     */

    public void run() {
        //call greeting method from class view
        view.greeting();
        while (isRunning) {
            //call askNumbers method from class view and save is as a string inputValues
            String inputValues = view.askNumbers();
            //check whether user wants to finish the program
            if (inputValues.contains("end")) {
                isRunning = false;
                continue;
            }
            //check input with regular expression for only numerical , dot or space
            if (!inputValues.matches("^[0-9 .]+$")) {
                view.inputError();
            } else {
                //create collection of input numbers from sting
                List<Double> numbers = convertNumbers(inputValues);
                System.out.println(numbers);
                //constructor = create new statistics object
                Statistics statistics = new Statistics(numbers);
                //for each avalible statistic call its displaying in view
                for (StatisticInterface stat : statistics.listOfStats()) {
                    view.showStat(stat.getName(), stat.getValue());
                }
            }
        }
    }

    //method which should convert sring with nymbers splitted by space to a collection of doubles numbers
    private List<Double> convertNumbers(String inputValues) {
        //interface creating the collection (constructor)
        List<Double> numbersConverted = new ArrayList<>();
        //split strings splitted by the space 
        String[] array = inputValues.split(" ");
        //converting string value to separated double values (parseDouble) and adding it to the colleciton numbersConverted (add)
        for (String value : array) {
            numbersConverted.add(Double.parseDouble(value));
        }
        return numbersConverted;
    }

}
