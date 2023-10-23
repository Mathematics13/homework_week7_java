package java_hw;

/**Program 20
 * WAP Java Program to test if an array contains a specific value
 */
public class Program20_TestArray
{
    public static void main(String[] args)
    {
        int a[] = {6, 9, 8, 5, 2, 3, 4};                                //Array declaration and initialisation
        int sv = 4;                                                    //Specific value
        boolean found = false;                                        //To declare and initialise found in boolean
        for (int num : a)
        {
            if (num == sv)                                         //if the entered number is the specific value
            {
                found = true;
            }
        }
        if (found)
        {
            System.out.println("The array contains the value  " + sv);
        }
        else
        {
            System.out.println("The array does not contain the value  " + sv);
        }
    }
}
