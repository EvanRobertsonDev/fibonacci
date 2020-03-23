/*
 * Evan Robertson
 * Fibonacci.java
 * March 23rd 2020
 * This program uses recursion to find what value is at n'th digit in the 
 * fibonacci sequence
 */

package fibonacci;
import javax.swing.*;
/**
 *
 * @author Evan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get input
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer to find its fibonacci number"));
        //find output
        int output = fibonacci(input);
        //display output
        JOptionPane.showMessageDialog(null, "The fibonacci of " + input + " is: " + output);
        
    }
    //Method for finding the fibonacci
    public static int fibonacci(int num) {
        //Return 0 if input results in 0
        if (num == 0) {
            return(0);
        }
        //Use recursion to return the added sum on all number prior to input
        else if (num > 2) {
            return(fibonacci(num-1) + fibonacci(num-2));
        }
        else {
        //return 1 if its the 1st and 2nd digit of the fibonacci sequence
            return(1);
        }
    }
    
}
