package java_hw;

import java.util.Scanner;

/** Program 10
 * Java program to input any two numbers and ask user to enter their symbol(+,-,/,*)
 * Find addition,Subtraction ,Multiplication and division
 * according to their symbol using if else
 */
public class Program10_Arithmetic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);                                                           //Scanner declaration
        System.out.println("Enter the first number    :  ");
        double a = input.nextDouble();                                                                  //User input
        System.out.println("Enter the second  mumber  :  ");
        double b = input.nextDouble();
        System.out.println("Enter the Arithmetic Operation to be performed   ( + - * / )  :  ");
        char symbol = input.next().charAt(0);                                                       //Scanner method .String method
        input.close();                                                                             //Scanner closed
        double sum = a+b;                                                                         //Logic
        double sub = a-b;
        double mul = a*b;
        double div = a/b;
        if(symbol=='+')                                                                     //Any one condition whichever is true will get executed
        {
            System.out.println("Addition of two numbers           :  "  +sum);
        }
        else if(symbol=='-')
        {
            System.out.println("Subtraction  of two numbers       :  "  +sub);
        }
        else if(symbol=='*')
        {
            System.out.println("Multiplication  of two numbers    :  "  +mul);
        }
        else if(symbol=='/')
        {

            System.out.println("Division of two numbers           :  "  +div);
        }
         else
         {
             System.out.println(" No Arithmetic Operations ");               //If no condition is executed then else body is executed
         }
    }
}
