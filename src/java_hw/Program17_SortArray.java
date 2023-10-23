package java_hw;

import java.util.Arrays;

/** Program 17
 * WAP Java program to sort a numeric array and a string array
 */
public class Program17_SortArray
{
    public static void main(String[] args)
    {
        int age[] = new int[5];                                                              //Numerical Array declaration with size
        age[0] = 65;                                                                        //Array initialisation
        age[1] = 78;
        age[2] = 87;
        age[3] = 34;
        age[4] = 23;
        Arrays.sort(age);                                                               //Sorting the array in ascending order
        System.out.println("Sorted Numeric Array  : "   +Arrays.toString(age));        //Sorted array
        String name[] = new String[4];                                                //String Array declaration with size
        name[0] = "Hello";
        name[1] = "Am";
        name[2] = "Here";
        name[3] = "You";
        Arrays.sort(name);                                                        //Sorting the array in alphabetical order
        System.out.println("Sorted String Array  : "   +Arrays.toString(name));  //Sorted array
    }

}

/* Arrays.toString(int)  returns a string representation of the contents of the specified int array.
The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").*/