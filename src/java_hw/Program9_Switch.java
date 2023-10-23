package java_hw;

import java.util.Scanner;

/** Program 9
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement)
 * if any other alphabet should be invalid entry
 */
public class Program9_Switch
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                 //Scanner declaration
        System.out.println("Enter any alphabet (A to F) :  ");              //Scanner and String method combined
        char input = s1.next().charAt(0);                                  //First letter is at the index 0
        s1.close();                                                       //Scanner closed
        switch(input )
        {
            case 'A':
            {
                System.out.println("Aberdeen");
                break;
            }
            case 'B':
            {
                System.out.println("Berlin");
                break;
            }
            case 'C':
            {
                System.out.println("Cochin");
                break;
            }
            case 'D':
            {
                System.out.println("Dublin");
                break;
            }
            case 'E':
            {
                System.out.println("Edinburgh");
                break;
            }
            case 'F':
            {
                System.out.println("Florida");
                break;                                           //break to avoid leakage
            }
            default :
            {
                System.out.println("Invalid Entry");
            }
        }
    }
}
