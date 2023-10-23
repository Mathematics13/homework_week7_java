package java_hw;

/**Program 19
 * WAP Java Program to calculate the average value of array elements
 */
public class Program19_ArrayAverage
{
    public static void main(String[] args)
    {
        int a[]={67,98,56,54,87,23,89,55};        //Array contains 8 elements size is 8 ,index starts from 0 and ends until 7
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
           sum = sum+a[i];                     //sum+ = a[i];
        }
        int avg=sum/a.length;
        System.out.println("Average of given array elements  :   "  +avg);
    }

}
