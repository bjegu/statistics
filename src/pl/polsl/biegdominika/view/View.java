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

    public void greeting() {
        System.out.println("Welcome to program calculating some statisical cool stuff" +'\n');
        

//To change body of generated methods, choose Tools | Templates.
    }

    public String askNumbers() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Please type numbers seperated by the space"+'\n');
        Scanner scanner = new Scanner(System.in);
        String userNumbers = scanner.next();
        System.out.println("Your numbers are:"+userNumbers);
        
        return userNumbers;
    }
