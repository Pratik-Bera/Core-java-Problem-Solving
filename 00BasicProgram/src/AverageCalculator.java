/*Sum & Average of 5 number without using loop. */
import java.util.Scanner;
class AverageCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,n4,n5,sum;
        float average;
        System.out.println("Enter marks of Five Subject :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        sum=(n1+n2+n3+n4+n5);
        average=sum/5;
        System.out.println("The Sum of Five Subjects is : "+sum+" and average is : "+average);
        }
}