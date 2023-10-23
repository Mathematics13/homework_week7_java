package java_hw;

import java.util.Scanner;

/** Program 2
 * WAP to input any year like (ex 2007 ) and find out if it is leap year or not
 */

public class Program2_LeapYear
{
    public static void main(String[] args)
    {
    Scanner s1 = new  Scanner(System.in);                                       //Scanner declaration
    System.out.println("Enter the four digit integer number ");                //User entering any year specific to integer not decimal in the console
    int y = s1.nextInt();                                                     //Using nextInt method of Scanner
    s1.close();                                                              //Closing the Scanner  to avoid leakage
    if(y%4==0)                                                              // Checking the condition using if else conditional statement
        {
        System.out.println("The given year is the leap year");            //if the condition is true, if body gets executed
        }
    else                                                                //else doesn't have any condition, if the condition is false
       {                                                               //then else body gets executed
        System.out.println("The given year is non-leap year");
       }
    }
}
