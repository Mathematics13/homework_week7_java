package java_hw;

/** Program 12
 * WAP Java program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Program12_InputValue
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                           //Scanner declaration
        System.out.println("Enter any number (or) alphabet (or) symbol");
        char input = s1.next().charAt(0);                                             //Any char input by user
        s1.close();                                                                  //Scanner closed
        if(Character.isDigit(input))                                                //Predefined method
        {
            System.out.println("The given input is a number");
        }
        else if(Character.isLetter(input))                                        //Predefined method
        {
            System.out.println("The given input is an alphabet");
        }
        else
        {
            System.out.println("The given input is a symbol");
        }
    }
}
