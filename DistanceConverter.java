/*Program to Convert Distance KM to meters , feet , inches & Centimeters */
import java.util.Scanner;
class DistanceConverter{
    public static void main(String[] args){
        double km,m,feet,inch,cm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in KM :");
        km=sc.nextFloat();
        m=km*1000;
        cm=m*100;
        inch=cm/2.54;
        feet=inch/12;
        System.out.println("The "+km+" km Distance in meter is : "+m+"km");
        System.out.println("The "+km+" km Distance in Centimeter is : "+cm+"cm");
        System.out.println("The "+km+" km Distance in inchs is : "+inch+"inch");
        System.out.println("The "+km+" km Distance in feets is : "+feet+"feet");
    }
}