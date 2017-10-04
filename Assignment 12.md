# Assignment 12

Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
10/04/2017

### Prompt:

Add Euclid's Algorithm to Assignment 11 and observe the difference in computation time.

### Solution:

```java
/*******************************************************************************
 * File:       GreatestCommonDivisor.java
 * Programmer: Uriel Salazar
 * Date:       October 2, 2017
 * Course:     CIS-7
 * Purpose:    Find the GCD using brute force and Euclid's algorithm.
 ******************************************************************************/

//import packages
import java.util.Scanner;

//declare class
public class GreatestCommonDivisor
{
    //declare method "getBruteForceGCD"
    public static long getBruteForceGCD(long n1, long n2)
    {
        //declare & initialize variables
        long min = 0;
        long divisor = 0;

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

    //declare method "euclidAlgorithm"
    public static long euclidAlgorithm(long a, long b)
    {
        //declare variables
        long min = 0;

        //determine the lesser value between the two inputs
        min = Math.min(a, b);

        if(min == 0)
        {
            return a;
        }
        else
        {
            return euclidAlgorithm(b, (a % b));
        }
    }

    //declare main program method
    public static void main(String[] args)
    {
        //declare & initialize variables
        String      temp1 = "";
        String      temp2 = "";
        long        num1 = 0;
        long        num2 = 0;
        long        gcd = 0;
        long  startTime = 0;
        long  duration = 0;

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
                    num1 = Long.parseLong(temp1);
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
                    num2 = Long.parseLong(temp2);
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

        //start recording computation time
        startTime = System.nanoTime();

        //call method "getBruteForceGCD"
        gcd = getBruteForceGCD(num1, num2);

        //get total computation time
        duration = System.nanoTime() - startTime;

        //print results
        System.out.print("Input: " + num1 + ", " + num2 + "\n\n");
        System.out.print("\nUSING BRUTE FORCE\n-----------------" +
                "\nThe greatest common divisor is: " + gcd + "\n");
        System.out.println("Total computation time: " + duration + " ns\n\n");

        //start recording computation time
        startTime = duration = 0;
        startTime = System.nanoTime();

        //call method "euclidAlgorithm"
        gcd = euclidAlgorithm(num1, num2);

        //get total computation time
        duration = System.nanoTime() - startTime;

        //print results
        System.out.print("\nUSING EUCLID'S ALGORITHM" +
                "\n------------------------" + "\nThe greatest common divisor" +
                "is: " + gcd + "\n");
        System.out.println("Total computation time: " + duration + " ns\n\n");

        //close scanner object
        input.close();


    }
}

```

### Output:

<img src="https://i.imgur.com/E249ZqM.png" width="1000" />

End Assignment 12