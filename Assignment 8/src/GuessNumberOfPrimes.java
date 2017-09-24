/*******************************************************************************
 * File:        GuessNumberOfPrimes.java
 * Programmer:  Uriel Salazar
 * Date:        September 23, 2017
 * Course:      CIS-7
 * Purpose:     find the number of prime numbers in a set by exhaustion
 *******************************************************************************/

//import packages
import java.util.Scanner;
import java.awt.*;
import java.util.ArrayList;

//declare class
public class GuessNumberOfPrimes
{
    //declare main program method
    public static void main(String[] args)
    {
        //declare & initialize variables
        int limit = 0;  //user-defined limit
        int guess = 0;  //user-guessed number of primes
        int count = 0;  //tally for number of primes
        boolean primeCheck = true;

        //declare objects
        Scanner            input  = new Scanner(System.in);
        ArrayList<Integer> primes = new ArrayList<>();

        //prompt user for limit input
        System.out.print("Please enter a whole number: ");

        //input-validation loop 1
        while(input.hasNextInt() == false)
        {
            //fire blank
            input.next();

            //display error message
            Toolkit.getDefaultToolkit().beep();
            System.out.println("\nERROR: invalid input.");
            System.out.print("Please enter a whole number: ");
        }
        //assign user-entered limit
        limit = input.nextInt();

        //prompt user for guess input
        System.out.print("\nHow many prime numbers are there between 0 and "
                         + limit + "? ");

        //input-validation loop 2
        while(input.hasNextInt() == false)
        {
            //fire blank
            input.next();

            //display error message
            Toolkit.getDefaultToolkit().beep();
            System.out.println("\nERROR: invalid input.");
            System.out.print("How many prime numbers are there between 0 and "
                             + limit + "? ");
        }
        //assign user-entered guess
        guess = input.nextInt();

        //calculate number of primes from 0 to the user-defined limit
        for(int i = 2; i <= limit; i++)
        {
            //check if number is divisible by any number
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    primeCheck = false;
                    break;
                }
            }
            if(primeCheck == true)
            {
                //tally prime number and add it to the list
                count++;
                primes.add(i);
            }
            //reset
            primeCheck = true;
        }
        //display total count and the list of prime numbers
        System.out.println("\nPrinting prime numbers...\n");
        for(int c = 0; c < primes.size(); c++)
        {
            System.out.println(primes.get(c));
        }
        //determine if guess is correct
        if(guess == count && (limit == 2))
        {
            System.out.println("\nCongratulations! You're correct!\n\nThere" +
                    " is only " + count + " prime number between 0 and "
                    + limit + "!");
        }
        else if(guess == count)
        {
            System.out.println("\nCongratulations! You're correct!\n\nThere" +
                    " are " + count + " prime numbers between 0 and "
                    + limit + "!");
        }
        else
        {
            System.out.println("\nWrong! You're incorrect.\n\nThere are "
                    + count + " prime numbers between 0 and " + limit + "!");
        }
    }
}
