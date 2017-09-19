/*******************************************************************************
 * File:        EvenOrOddInteger.java
 * Programmer:  Uriel Salazar
 * Date:        August 17, 2017
 * Course:      CIS-7
 * Purpose:     Prompts user for integers and determines if it is odd or even.
 *******************************************************************************/

//import packages
import java.util.Scanner;

//declare class
public class EvenOrOddInteger
{
    //declare main program method
    public static void main(String[] args)
    {
        //declare and initialize variables
        int     num = 0;        //assigned integer value after String validated
        String  temp = "";      //placeholder for user input
        boolean initial = true; //checks if initial prompt needs to be repeated
        boolean quit = false;   //true once user enters 'q' or 'Q'

        //declare object
        Scanner input = new Scanner(System.in);

        //begin do-while loop
        do
        {
            //prompt user for input
            if(initial == true)
            {
                System.out.print("Enter \"q\" to exit.\n" +
                        "Please enter an integer: ");
            }

            //assign user input to String
            temp = input.nextLine();

            //validate user input for integers, 'q', and 'Q' only
            if(temp.matches("^[0-9qQ]*$") == false)
            {
                //display invalid input message
                System.out.println("\nPlease enter integers only" +
                        " or \"q\" to exit.");
                System.out.print("\nPlease enter an integer: ");

                //skip initial prompt
                initial = false;
            }

            //validate user input for integers only
            else if (temp.matches("^[0-9]*$") == true)
            {
                //convert string to integer
                try
                {
                    num = Integer.parseInt(temp);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Exception occurred.");
                }

                //determine if integer is odd or even
                if(num % 2 == 0)
                {
                    System.out.println("\n" + num + " is an even number!\n");
                }
                else
                {
                    System.out.println("\n" + num + " is an odd number!\n");
                }

                //don't skip initial prompt
                initial = true;
            }
            else
            {
                //set condition for exiting the loop
                quit = true;
            }

        } while(quit == false);

        //Display exit message
        System.out.println("\nGood-bye!");

        //close Scanner object
        input.close();
    }
}
