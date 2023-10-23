package java_hw;

/** Program 11
 * WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
 */
public class Program11_PrintNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Numbers divisible by 3 ");
       for(int i=1;i<=100;i++)                                        //Using for loop to achieve multiple actions without code duplicacy
       {

           if (i % 3 == 0)                                        //logic
           {
               System.out.println(i );
           }
       }
       System.out.println("Numbers divisible by 5 ");
       for(int j=1;j<=100;j++)                              //logic
       {

         if(j%5==0)
         {
             System.out.println(j);
         }
       }
    }

}
