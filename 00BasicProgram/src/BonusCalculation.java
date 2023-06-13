/*A tiny program to calculate Bonus of employee which is 10 prercent of salary for each year of employee and max 50 percent*/
import java.util.Scanner;
class BonusCalculation{
    public static void main(String[] agrs){
        int salary,joining_year,current_year,working_year;
        float bonus_percent=0,tot,bonus;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary :");
        salary=sc.nextInt();
        System.out.println("Enter the joining year :");
        joining_year=sc.nextInt();
        System.out.println("Enter the current year :"); //also you can set it to the current year by initial value.
        current_year=sc.nextInt();
        working_year=current_year-joining_year;
        if(working_year<0){
            System.out.println("You are entering wrong data about year.");
        }
        else{
            if(working_year>5){
                bonus_percent=5;
            }
            else{
                bonus_percent=10*working_year;
            }
            // System.out.println(working_year);
            // System.out.println(bonus_percent);
            bonus=(salary*bonus_percent)/100;
            System.out.println("Your bonus money is "+bonus);
            tot=salary+bonus;
            System.out.println("You will get total "+tot);
        }        
    }
}