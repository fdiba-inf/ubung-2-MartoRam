package exercise2;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int firstdig=number%10;
        int seconddig=(number%100)/10;
        int thirddig=number/100;
        int SumOfDig=firstdig+seconddig+thirddig;
        System.out.println("Sum of digits: "+SumOfDig);

    }
}
