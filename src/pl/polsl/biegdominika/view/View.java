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

 //method for welcome the user :D
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
}