/*This Is a code to find Sum of it's Digit of a five digit number without using loops */
import java.util.Scanner;
public class SumofItsDigitWithoutLoop {
    public static void main(String[] args){
        long num,n1,n2,n3,n4,sum;
        System.out.println("Enter a Five Digits Number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        n1=num%10;
        num=num/10;
        n2=num%10;
        num=num/10;
        n3=num%10;
        num=num/10;
        n4=num%10;
        num=num/10;
        sum=n1+n2+n3+n4+num;
        System.out.println("the Sum of digits of number is : "+sum);
    }
}