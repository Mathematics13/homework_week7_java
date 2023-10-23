package java_hw;

/**Program 3
 * WAP Java Program to input Student Name,Roll No and three subjects Math,Science and English Marks
 * Print the MarkSheet in the given format
 */

public class Program3_MarkSheet
{
    public static void main(String[] args)
    {
        String name = "Jay";
        int num = 8;
        int math = 98;
        int sci = 90;
        int eng = 85;
        int total = math + sci + eng;
        int percentage = total / 3;
        if (percentage >= 35 && percentage < 50)
        {
            System.out.println("Pass and the Grade is C");
        }
        else if (percentage >= 80)
        {
            System.out.println("A+");
        }
        else if (percentage >= 60 && percentage < 80)
        {
            System.out.println("A");
        }
        else if (percentage >= 50 && percentage < 60)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("Fail");
        }
        System.out.println("                         Mark Sheet                                         ");
        System.out.println("Name                        :          " +                               name);
        System.out.println("Roll No                     :          " +                                num);
        System.out.println("Subjects                    :          " +                            "Marks");
        System.out.println("Math                        :          " +                               math);
        System.out.println("Science                     :          " +                                sci);
        System.out.println("English                     :          " +                                eng);
        System.out.println("Total                       :          " +                              total);
        System.out.println("Percentage                  :          " +                         percentage);
        System.out.println("Result                      :          " +                             "Pass");
        System.out.println("Grade                       :          " +                               "A+");
    }
}
/* Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and
if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
And print Mark Sheet in following format*/

