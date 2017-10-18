/*******************************************************************************
 * File:       FactorialFibonacci.java
 * Programmer: Uriel Salazar
 * Date:       October 16, 2017
 * Course:     CIS-7
 * Purpose:    Two programs that implement recursion and print the call stack
 ******************************************************************************/

//import packages
import java.util.Scanner;
import java.util.*;

//declare class
public class FactorialFibonacci
{
    /**
     * declare method "factorial"
     * @param n
     */
    public static long factorial(long n, Stack st, int i)
    {
        //push on to stack
        st.push("factorial(" + i + ")\tn = " + n + "\n");

        //call stack
        hitEnter();
        String list = st.toString().replace(",", "").replace("[", "")
                .replace("]", "").replace(" ", "");
        System.out.print(list);
        i++;

        //begin popping off the stack for base case
        if(n <= 1)
        {
            --i;
            int limit = st.size();
            long x = 1;
            for(int j = 0; j < limit; j++)
            {
                if(x != 1)
                {
                    n = n * x;
                    x++;
                }
                else
                {
                    x++;
                }
                if(st.size() != 1)
                {
                    st.pop();
                }
                st.pop();
                --i;
                st.push("factorial(" + i + ")\tn = " + n + "\n");
                hitEnter();
                list = st.toString().replace(",", "").replace("[", "")
                        .replace("]", "").replace(" ", "");
                System.out.print(list);
            }

            return 1;
        }
        else
        {
            return n * factorial((n-1), st, i);
        }
    }

    /**
     * declare method "fibonacci"
     * @param n
     */
    public static long fibonacci(long n, Stack st, int i)
    {
        //push on to stack
        st.push("fibonacci(" + i + ")\tn = " + n + "\n");

        //call stack
        String list = st.toString().replace(",", "").replace("[", "")
                .replace("]", "").replace(" ", "");
        System.out.print(list);
        i++;

        //begin popping off the stack for base case
        if(n == 0)
        {
            int limit = st.size();
            for(int j = 0; j < limit; j++)
            {
                st.pop();
                list = st.toString().replace(",", "").replace("[", "")
                        .replace("]", "").replace(" ", "");
                System.out.print(list + "\n");
            }
            return 0;
        }
        //begin popping off the stack for base case
        else if(n == 1)
        {
            int limit = st.size();
            for(int j = 0; j < limit; j++)
            {
                st.pop();
                list = st.toString().replace(",", "").replace("[", "")
                        .replace("]", "").replace(" ", "");
                System.out.print(list + "\n");
            }
            return 1;
        }
        else
        {
            return fibonacci((n-1), st, i) + fibonacci((n-2), st, i);
        }
    }

    /**
     * declare method "validate"
     * @param t, in
     */
    public static long validate(String t, Scanner in)
    {
        //declare variables
        long num = 0;

        //begin do-while loop
        do
        {
            //prompt user for first input
            System.out.print("Please enter a positive integer: ");
            t = in.nextLine();

            //check for positive integer
            if (t.matches("^[0-9]\\d*$") == true)
            {
                //convert string to integer
                try
                {
                    num = Long.parseLong(t);
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
        }while(t.matches("^[0-9]\\d*$") == false);

        //return validated integer
        return num;
    }

    /**
     * declare method "validateChoice"
     * @param t, in
     */
    public static int validateChoice(String t, Scanner in)
    {
        //declare variables
        int num = 0;

        //begin do-while loop
        do
        {
            //prompt user for first input
            System.out.print("Please enter an input code: ");
            t = in.nextLine();

            //check for positive integer
            if (t.matches("^[1-2]\\d*$") == true)
            {
                //convert string to integer
                try
                {
                    num = Integer.parseInt(t);
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
        }while(t.matches("^[1-2]\\d*$") == false);

        //return validated integer
        return num;
    }

    /**
     * declare method "hitEnter"
     * @param
     */
    public static void hitEnter()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * declare method "main"
     * @param args
     */
    public static void main(String args[])
    {
        //declare variables
        long    number  = 0;
        long    fact    = 0;
        long    fib     = 0;
        int     choice  = 0;
        int     count   = 1;
        String  temp    = "";  //string to match with regex

        //declare objects
        Scanner input = new Scanner(System.in);
        Stack   stack = new Stack();

        //display menu
        System.out.println("     MENU\n  ----------\n" +
                "1. Factorial\n2. Fibonacci\n");

        //call method "validateChoice"
        choice = validateChoice(temp, input);

        //menu
        switch(choice)
        {
            case 1:
                //call method "validate"
                System.out.println("        FACTORIAL\n       -----------");
                number = validate(temp, input);

                //call method "factorial"
                System.out.println("Press ENTER to cycle thorough the call" +
                        " stack:\n");
                fact = factorial(number, stack, count);

                //output results
                System.out.println("\nOUTPUT: " + fact);
                break;
            case 2:
                System.out.println("        FIBONACCI\n       -----------");
                //call method "validate"
                number = validate(temp, input);

                //call method "fibonacci"
                System.out.println("Call stack:\n");
                fib = fibonacci(number, stack, count);

                //output results
                System.out.println("\nOUTPUT: " + fib);
                break;
        }
        //close object
        input.close();
    }
}