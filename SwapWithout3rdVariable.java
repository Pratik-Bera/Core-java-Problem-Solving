import java.util.Scanner;
class SwapWithout3rdVariable{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value for a & b :");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a and b is :"+a+" "+b);

    }
}