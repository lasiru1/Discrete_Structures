/*******************************************************************************
 * File:       PrimeFactorization.java
 * Programmer: Uriel Salazar
 * Date:       October 4, 2017
 * Course:     CIS-7
 * Purpose:    Prints out the prime factorization of a given input number.
 *******************************************************************************/

//import packages
import java.util.Scanner;

//declare class
public class PrimeFactorization
{
    //declare method "getPrimeFactorization"
    public static void getPrimeFactorization(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            //loop while num is divisible by i
            while(n % i == 0)
            {
                //divide the number
                n /= i;

                //print out prime factors
                System.out.print(i + " ");
            }
        }
    }

    //declare main program method
    public static void main(String[] args)
    {
        //declare and initialize variables
        int num = 0;
        String temp = "";

        //declare objects
        Scanner input = new Scanner(System.in);

        //input-validation check
        do
        {
            //prompt user for first input
            System.out.print("Please enter a positive integer: ");
            temp = input.nextLine();

            //check for positive integer
            if (temp.matches("^[1-9]\\d*$") == true)
            {
                //convert string to integer
                try
                {
                    num = Integer.parseInt(temp);
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
        }while(temp.matches("^[1-9]\\d*$") == false);

        //output message and call method
        System.out.println("Prime Factorization:");
        getPrimeFactorization(num);

        //close scanner object
        input.close();
    }
}
