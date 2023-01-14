/* A Program to find the Cost Price of One Item */
import java.util.Scanner;
class CostPrice{
    public static void main(String[] args){
        float sp,p,cp;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of ITEM :");
        num=sc.nextInt();
        System.out.println("Enter the Selling price and profit of"+num+" ITEM :");
        sp=sc.nextFloat();
        p=sc.nextFloat();
        cp=(sp-p)/num;
        System.out.println("The cost price of one item is : "+cp);

    }
}