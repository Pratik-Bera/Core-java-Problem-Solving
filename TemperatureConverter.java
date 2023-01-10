/* Fahrenheit to Celsius Calculator. */
import java.util.Scanner;
class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float fahrenheit,celsius;
        System.out.println("Enter The Number in fahrenheit :");
        fahrenheit=sc.nextFloat();
        celsius=((fahrenheit-32)*5)/9;  // Fx : C/5=(f-32)/9
        System.out.println("The value in Celsius is : "+celsius);
    }
}