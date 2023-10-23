package java_hw;

/**Program 19
 * WAP Java Program to calculate the average value of array elements
 */
public class Program19_AverageValues
{
    public static void main(String[] args)
    {
       int weight[]=new int[5];
        weight[0] = 56;
        weight[1] = 87;
        weight[2] = 98;
        weight[3] = 32;
        weight[4] = 13;
        int avg =  (weight[0]+  weight[1]+  weight[2]+  weight[3]+  weight[4])/5;
        System.out.println("Average of given array elements  :"  +avg);
    }
}
