package java_hw;

import java.util.Scanner;

/** Program 8
 * Input any alphabet from 'A' to 'F' and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class Program8_CityName
{
    public static void main(String[] args)
       {
           Scanner input = new Scanner(System.in);                                         //Scanner Declaration
           System.out.println("Enter an alphabet (A to F) : ");
           char alphabet = input.next().charAt(0);                                       //Scanner method
           input.close();                                                               //Scanner close statement
           if(alphabet =='A')                                                          //Check if condition
           {
               System.out.println("Aberdeen");
           }
           else if(alphabet =='B')                                                  //Whichever condition is true will execute
           {
               System.out.println("Bombay");
           }
           else if(alphabet =='C')
           {
               System.out.println("Cornwall");
           }
           else if(alphabet =='D')
           {
               System.out.println("Darjeeling");
           }
           else if(alphabet =='E')
           {
               System.out.println("Edinburgh");
           }
           else if(alphabet =='F')
           {
               System.out.println("Florida");
           }
           else                                                     //if no conditions are true, then else body is executed
           {
               System.out.println("Invalid Entry");
           }

       }
}
