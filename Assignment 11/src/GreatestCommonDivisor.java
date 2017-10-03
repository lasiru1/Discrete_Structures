/*******************************************************************************
 * File:       GreatestCommonDivisor.java
 * Programmer: Uriel Salazar
 * Date:       October 2, 2017
 * Course:     CIS-7
 * Purpose:    Use a brute force method to calculate the GCD of two numbers.
 ******************************************************************************/

//import packages
import java.util.Scanner;

//declare class
public class GreatestCommonDivisor
{
    //declare method "getMinimum"
    public static int getMinimum(int n1, int n2)
    {
        //declare & initialize variables
        int gcd = 0;

        for(int i = 1; i > numMin; i++)
        {

        }

        //return greatest common divisor
        return gcd;
    }

    //declare main program method
    public static void main(String[] args)
    {
        //declare & initialize variables
        int num1 = 0;
        int num2 = 0;
        int numMin;

        //declare objects
        Scanner input = new Scanner(System.in);

        //prompt user for input
        System.out.print("Please enter an integer: ");
        num1 = input.nextInt();
        System.out.print("\n\nPlease enter another integer: ");
        num2 = input.nextInt();

        numMin = getMinimum(num1, num2);

        System.out.print("The greatest common divisor is: " + numMin);
        }

    }

}
