
package pl.polsl.biegdominika.controler;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.biegdominika.model.StatisticInterface;
import pl.polsl.biegdominika.model.Statistics;
import pl.polsl.biegdominika.view.View;

/**
 * 
 * @author Dominika Bieg
 * @version 1.0.0
 * The controller class - responsible for control flow of information and input control
 */
public class Controller {

    /**
     * the condition of running the program
     */
    private boolean isRunning = true;
    /**
     * initialization of the viwew during the initialization of the controller
     */
    private final View view = new View();
    
   /**
    * public method run() - start running the app and keeps the program running
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
            
             //chceckin the input given by the user, 
            //changing all double(and more) spaces into single space
            if (inputValues.contains("  ")) {
                inputValues = inputValues.trim().replaceAll("\\s+", " ");
            }
            //check input with regular expression for numbers, minuses, dot or space only
            if (!inputValues.matches("^[0-9 .-]+$")) {
                view.inputError();
            } else {
                try {

                    //create collection of input numbers from sting
                    List<Double> numbers = convertNumbers(inputValues);
                    System.out.println(numbers);
                    //constructor = create new statistics object
                    Statistics statistics = new Statistics(numbers);
                    //for each avalible statistic call its displaying in view
                    for (StatisticInterface stat : statistics.listOfStats()) {
                        view.showStat(stat.getName(), stat.getValue());
                    }
                } catch (NumberFormatException e) {
                       view.inputException();
                }
            }

        }
    }

    /**
     * method which convert sring with numbers splitted by space given by the user to a collection of double numbers
     * 
     * @param inputValues
     * @return numbersConverted - collection of double numbers given by the user 
     * @throws NumberFormatException 
     */
    private List<Double> convertNumbers(String inputValues) throws NumberFormatException {
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
