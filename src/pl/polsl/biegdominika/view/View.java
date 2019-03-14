/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.biegdominika.view;

import java.util.Scanner;
/**
 *
 * @author Dominika
 */
public class View {

 //method for welcome the user
    public void greeting() {
        System.out.println("Welcome to program calculating some statisical cool stuff" +'\n');
        
    }
    
 // method for asking, saving and displaying input values from the user   
    public String askNumbers() {
       System.out.println("Please type numbers seperated by the space or type end to finish"+'\n');
        Scanner scanner = new Scanner(System.in);
        String userNumbers = scanner.nextLine();
        System.out.println("Your numbers are:"+userNumbers);
        
        return userNumbers;
    }

    //method showing the values of statistics passed by the controller
    public void showStat(String name, String value) {
        System.out.println(name+": "+value);
    }
    // methods alerting any user's mistakes
    public void inputError() {
        System.out.println("Error");
        System.out.println("Check if your input contains only numbers separated with spaces!");
    }

    public void inputException() {
        System.out.println("Error");
        System.out.println("Please check if your numbers are correct and separated by space!");
    }
}