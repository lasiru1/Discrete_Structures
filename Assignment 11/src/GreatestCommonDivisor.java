/*******************************************************************************
 * File:       GreatestCommonDivisor.java
 * Programmer: Uriel Salazar
 * Date:       October 2, 2017
 * Course:     CIS-7
 * Purpose:    Use a brute force method to calculate the GCD of two numbers.
 ******************************************************************************/

//import packages
import java.util.Scanner;
import java.awt.*;

//declare class
public class GreatestCommonDivisor
{
    //declare method "getMinimum"
    public static int getGCD(int n1, int n2)
    {
        //declare & initialize variables
        int min = 0;
        int divisor = 0;

        //determine the lesser value between the two inputs
        min = Math.min(n1, n2);

        //loop to check for gcd
        for(int i = 1; i <= min ; i++)
        {
            if((n1 % i == 0) && (n2 % i == 0))
            {
                divisor = i;
            }
        }
        //return greatest common divisor
        return divisor;
    }

    //declare main program method
    public static void main(String[] args) {
        //declare & initialize variables
        String temp1 = "";
        String temp2 = "";
        int num1 = 0;
        int num2 = 0;
        int numMin = 0;
        int gcd = 0;

        //declare objects
        Scanner input = new Scanner(System.in);

        //first input-validation check
        do
        {
            //prompt user for first input
            System.out.print("Please enter a positive integer: ");
            temp1 = input.nextLine();

            //check for positive integer
            if (temp1.matches("^[1-9]\\d*$") == true)
            {
                //convert string to integer
                try
                {
                    num1 = Integer.parseInt(temp1);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Exception occurred.");
                }
                System.out.print("\n");
            }
            else
            {
                System.out.println("\nERROR: Invalid input.");
            }
        }while(temp1.matches("^[1-9]\\d*$") == false);

        //second validation check
        do
        {
            //prompt user for second input
            System.out.print("Please enter another positive integer: ");
            temp2 = input.nextLine();

            //check for positive integer
            if (temp2.matches("^[1-9]\\d*$") == true)
            {
                //convert string to integer
                try
                {
                    num2 = Integer.parseInt(temp2);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Exception occurred.");
                }
                System.out.print("\n");
            }
            else
            {
                System.out.println("\nERROR: Invalid input.");
            }
        }while(temp2.matches("^[1-9]\\d*$") == false);

        //call method "findGCD"
        gcd = getGCD(num1, num2);

        //print results
        System.out.print("Input: " + num1 + ", " + num2 + "\n");
        System.out.print("\nThe greatest common divisor is: " + gcd);

        //close scanner object
        input.close();
    }
}
