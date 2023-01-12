/* This is a Program to interchange the values between two variables */
import java.util.Scanner;
class SwapWithExtraVariable{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Values for a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;a=b;b=c;
        System.out.println("The value of a and b is :"+a+" "+b);
    }
}