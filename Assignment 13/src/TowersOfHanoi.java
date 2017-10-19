/*******************************************************************************
 * File:       TowersOfHanoi.java
 * Programmer: Uriel Salazar
 * Date:       October 18, 2017
 * Course:     CIS-7
 * Purpose:    Demonstrate recursion using a simulation of Towers of Hanoi
 ******************************************************************************/

//import packages
import java.io.IOException;
import java.util.*;

//declare class
public class TowersOfHanoi
{
    //declare global variables
    public static int disks;
    public static Stack<Integer>[] tower = new Stack[4];

    /**
     * declare method "printBoard"
     */
    public static void printBoard()
    {
        System.out.println("  1  |  2  |  3");
        System.out.println("---------------");
        for(int i = (disks - 1); i >= 0; i--)
        {
            //declare variables
            String d1 = " ";
            String d2 = " ";
            String d3 = " ";

            //assign string values of disks on towers
            try
            {
                d1 = String.valueOf(tower[1].get(i));
            }
            catch (Exception e)
            {

            }
            try
            {
                d2 = String.valueOf(tower[2].get(i));
            }
            catch(Exception e)
            {

            }
            try
            {
                d3 = String.valueOf(tower[3].get(i));
            }
            catch (Exception e)
            {

            }
            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
        }
        System.out.println();
    }

    /**
     * declare method "fillStack"
     */
    public static void fillStack(int n)
    {
        //push all disks onto stack
        for (int x = n; x > 0; x--)
        {
            tower[1].push(x);
        }

        //display game state
        printBoard();
        hitEnter();
        clearScreen();

        //call method to solve
        hanoiAlgorithm(n, 1, 2, 3);
    }

    /**
     * declare method "hanoiAlgorithm"
     */
    public static void hanoiAlgorithm(int d, int start, int middle,
                                      int end)
    {
        //base case
        if (d > 0)
        {
            //recursive case
            hanoiAlgorithm((d-1), start, end, middle);

            //move disk from one tower to another
            int x = tower[start].pop();
            tower[end].push(x);
            System.out.println("\nMove disk " + x + " from Tower " + start +
                    " to Tower " + end + "\n");

            //display game state
            printBoard();
            hitEnter();
            clearScreen();

            //second recursive case
            hanoiAlgorithm((d-1), middle, start, end);
        }
    }

    /**
     * declare method "validate"
     */
    public static int validate(String t, Scanner in)
    {
        //declare variables
        int num = 0;

        //begin do-while loop
        do
        {
            //prompt user for first input
            System.out.print("Please enter the number of disks: ");
            t = in.nextLine();

            //check for positive integer
            if (t.matches("^[0-9]\\d*$") == true)
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
        }while(t.matches("^[0-9]\\d*$") == false);

        //return validated integer
        return num;
    }

    /**
     * declare method "hitEnter"
     */
    public static void hitEnter()
    {
        System.out.print("Press ENTER to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * declare method "clearScreen"
     */
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * declare main program method "main"
     */
    public static void main(String[] args)
    {
        //declare variables
        String  temp    =   "";
        int number = 0;

        //declare objects
        Scanner input = new Scanner(System.in);
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();

        //prompt user for input using method call
        number = validate(temp, input);
        disks = number;
        fillStack(number);

        //close object
        input.close();
    }
}









