package java_hw;

import java.util.Scanner;

/**Program 5
 * WAP to input employee id,name,basic salary then find HRA,TA,DA,PF and Gross salary
 * Print in the given format
 */
public class Program5_SalarySlip
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                                //Scanner Declaration
        System.out.println("Enter the  four digits Employee id    :  ");
        int a= s1.nextInt();
        System.out.println("Enter the Employee Name               :  ");
        String b=s1.next();
        System.out.println("Enter the Basic Salary                :  ");
        double c=s1.nextDouble();
        s1.close();                                                                     //Scanner is closed
        double h = (c*10)/100;                  //HRA                                     Logic
        double d =  (c*8)/100;                 //DA                                       Mentioned in the Question
        double t =  (c*9)/100;                //TA
        double p =  (c*20)/100;              //PF
        double g= c+h+t+d-p;                //Gross Salary
        System.out.println("           Salary Slip                               "); //Print statements
        System.out.println("Employee id         :  "                            +a);
        System.out.println("Employee Name       :  "                            +b);
        System.out.println("Basic Salary        :  "                            +c);
        System.out.println("HRA 10%             :  "                            +h);
        System.out.println("TA   8%             :  "                            +t);
        System.out.println("DA   9%             :  "                            +d);
        System.out.println("PF - 20&            :  "                            +p);
        System.out.println("Gross Salary        :  "                            +g);
    }
}

   /* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
        HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
         Gross salary = basic salary + HRA + TA + DA –PF Print in following format   */
