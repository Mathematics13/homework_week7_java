package java_hw;

import java.util.Scanner;

/**Program 13
 * WAP which input any number between 1 to 7 and print the days name MONDAY,TUESDAY ,.....,SUNDAY of the week accordingly by using switch.
 * Note: If number is out of selection Print message "Week contains 1 to 7 days"
 */
public class Program13_NumberOfDays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number ( 1 to 7)  :   ");
        int day = input.nextInt();
        switch(day)
        {
            case 1:
            {
                System.out.println("Sunday is the first day of the week");
                break;
            }
            case 2:
            {
                System.out.println("Monday is the second day of the week");
                break;
            }
            case 3:
            {
                System.out.println("Tuesday is the third day of the week");
                break;
            }
            case 4:
            {
                System.out.println("Wednesday is the fourth day of the week");
                break;
            }
            case 5:
            {
                System.out.println("Thursday is the fifth day of the week");
                break;
            }
            case 6:
            {
                System.out.println("Friday is the sixth day of the week");
                break;
            }
            case 7:
            {
                System.out.println("Saturday  is the last day of the week");
                break;
            }
            default:
            {
                System.out.println("Week contains 1 to 7 days");
            }
        }
    }
}
