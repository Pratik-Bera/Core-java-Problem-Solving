/*A Program to revarse of a 5 digit Number Without using Loop  */
import java.util.Scanner;
class RevarseWithoutLoop{
    public static void main(String[] args){
        int num,n1,n2,n3,n4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Five Digits Number :");
        num=sc.nextInt();
        n1=num%10;
        num=num/10;
        n2=num%10;
        num=num/10;
        n3=num%10;
        num=num/10;
        n4=num%10;
        num=num/10;
        long rev_num1=((((((((n1*10)+n2)*10)+n3)*10)+n4)*10)+num);
        long rev_num2=((n1*10000)+(n2*1000)+(n3*100)+(n4*10)+num);
        System.out.println(" Formula 1 :The Reverse Number is : "+rev_num1);
        System.out.println(" Formula 2 :The Reverse Number is : "+rev_num2);

    }
}