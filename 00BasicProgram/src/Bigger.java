/* This is the program to find Bigger number between two integer numbers. */
import java.util.Scanner;
class Bigger{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two Numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
            System.out.println("The both number is Same. It is : "+a);
        else if(a>b)
            System.out.println(a+" is Bigger then "+b+" .");
        else
            System.out.println(b+" is Bigger then "+a+" .");
    }

}