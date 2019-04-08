
package pl.polsl.biegdominika;

import pl.polsl.biegdominika.controler.Controller;

/**
 * Main class initialize running the program with reading parameters
 * @author Dominika Bieg
 * @version 1.0.0
 * 
 */
public class Main {
    
    /**
     *  Method that starts and keeps the program running
     * @param args -arguments for the first using of the program
     */
    public static void main(String args[]){
       new Controller().run(args.length == 0 ? null : args[0]);
    }
    
}
