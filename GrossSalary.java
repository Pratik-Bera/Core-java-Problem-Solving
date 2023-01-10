/* A Program to Calculate Gross Salary  as per 40% is DA and 20% is hra of Basic Salary */
import java.util.Scanner;
class GrossSalary{
    public static void main(String[] args){
        double bs,da,hra,gs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary :");
        bs=sc.nextFloat();
        da=(bs*40)/100;
        hra=(bs*20)/100;
        gs=(bs+da+hra);
        System.out.println("The Gross Salary is: "+gs);
    }

}