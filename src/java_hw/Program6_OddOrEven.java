package java_hw;

import java.util.Scanner;

/** Program 6
 * WAP Java program to input any number and find out if it's odd or even
 */

public class Program6_OddOrEven
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);                                 //Scanner Declaration
    System.out.println("Enter any integer number");                        //Asks user to produce input in the form of integer specific
    int a = input.nextInt();                                              //Using nextInt() method of Scanner class
    input.close();                                                       //Scanner class is closed
    if(a%2==0)                                                          //if the condition is true, then if body is executed
    {
        System.out.println("The given number is Even");
    }
    else
    {
        System.out.println("The given number is Odd");              //if the condition is false, else body is executed
    }
    }
}
