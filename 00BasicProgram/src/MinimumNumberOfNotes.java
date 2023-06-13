/* A Program to Calculate the minimum number of notes needed to fulfill the amout N(N means random number)
 * There are available notes of 2000,500,200,100,50,10,5,2,1.
  */
import java.util.Scanner;
class MinimumNumberOfNotes{
    public static void main(String[] args){
        long value,amount,note2000,note500,note200,note100,note50,note10,note5,note2,note1,total_number_of_notes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount :");
        amount=sc.nextLong();
        value=amount;
        note2000=amount/2000;
        amount=amount%2000;
        note500=amount/500;
        amount=amount%500;
        note200=amount/200;
        amount=amount%200;
        note100=amount/100;
        amount=amount%100;
        note50=amount/50;
        amount=amount%50;
        note10=amount/10;
        amount=amount%10;
        note5=amount/5;
        amount=amount%5;
        note2=amount/2;
        amount=amount%2;
        note1=amount/1;
        total_number_of_notes=note2000+note500+note200+note100+note50+note10+note5+note2+note1;
        System.out.println("To fulfill amount of "+value+" You need minimum notes of :");
        System.out.println("Note of 2000 : "+note2000);
        System.out.println("Note of 500 : "+note500);
        System.out.println("Note of 200 : "+note200);
        System.out.println("Note of 100 : "+note100);
        System.out.println("Note of 50 : "+note50);
        System.out.println("Note of 10 : "+note10);
        System.out.println("Note of 5 : "+note5);
        System.out.println("Note of 2 : "+note2);
        System.out.println("Note of 1 : "+note1);
        System.out.println("So Total minimum number of note needed : "+total_number_of_notes);
        //System.out.println("Done");
    }
}