package java_hw;

/**Program 18
 * WAP Java Program to sum values of an array
 */

public class Program18_Sum
{
    public static void main(String[] args)
    {
       int a[] = new int[5];                //Array declaration with fixed size
        a[0] = 8;                          //Array initialisation
        a[1] = 10;
        a[2] = 6;
        a[3] = 5;
        a[4] = 20;

        int sum=0;                    //Initialize sum=0 as GV to be used in local
       for(int i=0;i<a.length;i++)  //Inside for loop ,should have i for iteration
       {
          sum += a[i];            //x+=y means x=x+y in the same way
       }
        System.out.println("Sum of the values of an array   " +sum);
    }
}
