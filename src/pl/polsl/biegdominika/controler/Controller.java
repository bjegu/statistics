/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.biegdominika.controler;

import java.util.ArrayList;
import java.util.List;
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
    app asks the user for the next numbers to be calculated
    */
    public void run(){
        //call greeting method from class view
        view.greeting();
        while (isRunning){
            //call askNumbers method from class view and save is as a string inputValues
            String inputValues = view.askNumbers();
            //check whether user wants to finish the program
            if (inputValues.contains("end")){
                isRunning = false;
                continue;
            }
            //create collection of input numbers from sting
            List<Double> numbers = covertNumbers(inputValues);
        }
    }

    //method
    private List<Double> covertNumbers(String inputValues) {
        //interface
        List<Double> numbersCoverted = new ArrayList<>();
        //split strings splitted by the space 
        String[] array = inputValues.split(" ");
        for(String value: array){
            
        }
        
    }
}
