/* A program to calculate the amount to pay in a shop. There is always 5% off 
but if you purchased above 1000 rupee then you will get 10% Off on price.*/

import java.util.Scanner;
class ExpencesAndDiscount{
    public static void main(String[] args){
        int qty;
        double dis=5.0,rate,price_before_discount,price_to_pay;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the rate and Quentity of purchased item :");
        rate=sc.nextFloat();
        qty=sc.nextInt();
        price_before_discount=qty*rate;
        System.out.println("The total price is without discount : "+price_before_discount);
        if(price_before_discount>1000){
            System.out.println("Your amount is greter then 1000.");
            System.out.println("so you will get 10% Off.");
            dis=10;
        }
        else{
            System.out.println("You will get 5% Off.");
        }
        dis=(price_before_discount*dis)/100;
        System.out.println(" Your discount amount is :"+dis);
        price_to_pay=price_before_discount-dis;
        System.out.println("You have the amount to pay : "+price_to_pay);

        


        
    }

}