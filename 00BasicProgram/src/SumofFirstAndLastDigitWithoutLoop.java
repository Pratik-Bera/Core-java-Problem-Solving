/* This is a program to find the sum of First and last digit number of a $ digit number without using Loop */
import java.util.Scanner;
class SumofFirstAndLastDigitWithoutLoop{
    public static void main(String[] args){
        int num,sum,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Four Digit Number :");
        num=sc.nextInt();
        n1=num%10;
        num=num/1000;
        sum=n1+num;
        System.out.println("The Sum of First and Fourth Digit number is : "+sum);
    }
}