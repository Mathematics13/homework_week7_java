package java_hw;

import java.util.Scanner;
/** Program 16
 * WAP Java program to check if enter number is "POSITIVE", "NEGATIVE" or "ZERO"
 */
public class Program16_CheckNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);                                                  //Scanner Declaration
        System.out.println("Enter any number Positive (or) Negative (or) Zero     ");
        double number =input.nextDouble();                                                     //User input
        input.close();                                                                        //Scanner closed
        if(number>0)                                                                         //logic
        {
            System.out.println("The given number is positive ");
        }
        else if(number<0)                                                               //Whichever condition is true,that body will execute
        {
            System.out.println("The given number is negative");
        }
        else if(number==0)
        {
            System.out.println("The given number is zero");
        }
        else
        {
            System.out.println("The given input is not a number");             //if condition is not true,else body gets executed
        }
    }
}
