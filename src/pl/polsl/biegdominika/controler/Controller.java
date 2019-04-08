package pl.polsl.biegdominika.controler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import pl.polsl.biegdominika.model.StatisticInterface;
import pl.polsl.biegdominika.model.Statistics;
import pl.polsl.biegdominika.view.View;

/**
 *
 * @author Dominika Bieg
 * @version 1.0.0 The controller class - responsible for control flow of
 * information and input control
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
     *
     * @param firstValue numbers values for the first algorithm iteration
     */
    public void run(String firstValue) {
        //call greeting method from class view
        view.greeting();
        while (isRunning) {
            //call askNumbers method from class view and save is as a string inputValues
            String inputValues = Objects.nonNull(firstValue) ? firstValue : view.askNumbers();
            firstValue = null;

            //check whether user wants to finish the program
            if (inputValues.contains("end")) {
                isRunning = false;
                continue;
            }

            //chceckin the input given by the user, 
            //changing all double(and more) spaces into single space
            inputValues = inputValues.trim().replaceAll("\\s+", " ");
            try {
                //check input with regular expression for numbers, minuses, dot or space only
                if (!inputValues.matches("^[0-9 .-]+$")) {
                    throw new InputFormatException(inputValues);
                }
                //create collection of input numbers from sting
                List<Double> numbers = convertNumbers(inputValues);
                System.out.println(numbers);
                //constructor = create new statistics object
                Statistics statistics = new Statistics(numbers);
                //for each avalible statistic call its displaying in view
                statistics.listOfStats().
                        stream().forEach((stat) -> {
                            view.showStat(stat.getName(), stat.getValue());
                        });
            } catch (InputFormatException e) {
                view.inputException();
            }

        }
    }

    /**
     * method which convert sring with numbers splitted by space given by the
     * user to a collection of double numbers
     *
     * @param inputValues
     * @return numbersConverted - collection of double numbers given by the user
     * @throws InputFormatException
     */
    private List<Double> convertNumbers(String inputValues) throws InputFormatException {
        //interface creating the collection (constructor)
        List<Double> numbersConverted = new ArrayList<>();
        try {
            //split strings splitted by the space 
            Arrays.asList(inputValues.split(" "))
                    .stream()
                    .map(Double::parseDouble)
                    .forEach(numbersConverted::add);
        } catch (NumberFormatException a) {
            throw new InputFormatException(inputValues);
        }
        return numbersConverted;

    }
}
