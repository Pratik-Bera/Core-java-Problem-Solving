/* Calculate the Area & Circumference of Circle */
import java.util.Scanner;
class Circle{
    public static void main(String[] args){
        double radius,area,circumference;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        radius=sc.nextDouble();
        area=3.14*(Math.pow(radius,2));
        circumference=(2*3.14*radius);
        System.out.println(" The area of Circle is : "+area+ " and the Circumference is : "+circumference);
    }
}