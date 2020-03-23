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
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer to find its fibonacci number"));
        int output = fibonacci(input);
        JOptionPane.showMessageDialog(null, "The fibonacci of " + input + " is: " + output);
        
    }
    public static int fibonacci(int num) {
        if (num == 0) {
            return(0);
        }
        else if (num > 2) {
            return(fibonacci(num-1) + fibonacci(num-2));
        }
        else {
            return(1);
        }
    }
    
}
