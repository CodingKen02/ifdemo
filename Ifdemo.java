/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifdemo;
import java.util.Scanner;
/**
 *
 * @author codingken
 */
public class Ifdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner 
        Scanner input = new Scanner(System.in);
        
        // declare variables
        int num1;
        
        // prompt the user to enter a numer
        System.out.print("Please enter a number: ");
        num1 = input.nextInt();
        
        // if greater than 50, print a statement
        if (num1 > 50)
        {
            System.out.println("Awesome score!");
        }
        else {
            System.out.println("Try again!");
        }
    }
    
}
