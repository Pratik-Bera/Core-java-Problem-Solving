/* A Program to Calculate addition of two number. */

import java.util.Scanner;
class Addition{
    public static void main(String[] args){
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        a=sc.nextInt();
        System.out.println("Enter Second Number :");
        b=sc.nextInt();
        result=a+b;
        System.out.println("The addition result is : "+result);
    }
}