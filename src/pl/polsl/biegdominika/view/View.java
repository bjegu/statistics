
package pl.polsl.biegdominika.view;

import java.util.Scanner;
/**
 * 
 * @author Dominika Bieg
 * @version 1.0.0
 */
public class View {

 /**
  * method welcoming the user
  */
    public void greeting() {
        System.out.println("Welcome to program calculating some statistical cool stuff" +'\n');
        
    }
    
 /**
  * Method for asking, saving and displaying input values from the user 
  * @return userNumbers - user input in string format
  */  
    public String askNumbers() {
       System.out.println("Please type in numbers seperated by the space or end to finish"+'\n');
        Scanner scanner = new Scanner(System.in);
        String userNumbers = scanner.nextLine();
        
        return userNumbers;
    }

    /**
     * method showing the values of statistics passed by the controller
     * @param name - name of shown statistic
     * @param value - value of shown statistic
     */
    public void showStat(String name, String value) {
        System.out.println(name+": "+value);
    }

    /**
     * methods alerting any user's mistakes
     */
    public void inputError() {
        System.out.println("Error");
        System.out.println("Check if your input contains only numbers separated with spaces!");
    }
/**
     * methods alerting any user's mistakes
     */
    public void inputException() {
        System.out.println("Error");
        System.out.println("Please check if your numbers are correct and separated by space!!");
    }
}