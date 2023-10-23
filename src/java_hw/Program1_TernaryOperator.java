package java_hw;

/** Program 1
 * WAP Java program that tells us that Input number is odd or even
 * Use ternary operator
 */

import java.util.Scanner;

public class Program1_TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                          //Scanner declaration toa ccept user's input
        System.out.println("Enter the integer");                      //Expecting integer values not decimal from user being specific
        int a = s1.nextInt();                                         //Using Scanner method nextInt
        s1.close();                                                   //Scanner class closed to avoid leakage
        String result = (a % 2 == 0) ? "Even" : "Odd";                //Using ternary operator in one line instead of if-else
        System.out.println("The given number is  " + result);         //Printing the result ,execution
    }
}
