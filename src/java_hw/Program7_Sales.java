package java_hw;

import java.util.Scanner;

/**Program 7
 * WAP Java Program input sales id,seller's name,sales amount and salary basic and fid this sales
 *Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7_Sales
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                  //scanner declaration
        System.out.println("Enter the sales id  ");                          //Input from the user
        int id = s1.nextInt();
        System.out.println("Enter the seller's name ");
        String name = s1.next();
        System.out.println("Enter the sales amount  ");
        int amount = s1.nextInt();
        System.out.println("Enter the basic salary  ");
        double salary = s1.nextDouble();
        s1.close();                                                     //Scanner class closed
        System.out.println("     Sales amount  " );
        if(amount >= 50000)                                           //if condition is true, it will get executed
        {
            System.out.println("Commission is 35%");
        }
        else if(amount >= 30000 && amount <50000)                  //else if condition is true, it will get executed
        {
            System.out.println("Commission is 20%");
        }
        else if(amount >= 20000 && amount <30000)
        {
            System.out.println("Commission is 10%");
        }
        else if(amount >= 10000 && amount <20000)
        {
            System.out.println("Commission is 5%");
        }
        else if( amount <10000 && amount >0)
        {
            System.out.println("Commission is 2%");
        }
        else                                              //if no conditions are true, then else body will get executed
        {
            System.out.println("No Commission");
        }
    }
}
