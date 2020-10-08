package exercise2;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r=input.nextInt();
        double c=2*r*Math.PI;
        double a=r*r*Math.PI;
        System.out.println("Circumference= "+c);
        System.out.print("Area= "+a);
    }
}
