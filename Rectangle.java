/* A Program to Calculate parimeter & area of rectangle */
import java.util.Scanner;
class Rectangle{
    public static void main(String[] args){
        float lenth,breadth,parimeter,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Lenth & Bredth of Rectangle :");
        lenth=sc.nextFloat();
        breadth=sc.nextFloat();
        parimeter=2*(lenth+breadth);
        area=lenth*breadth;
        System.out.println("The area of rectangle is "+area+" and Parimeter is "+parimeter);
    }
}