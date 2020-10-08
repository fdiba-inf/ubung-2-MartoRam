package exercise2;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double D=b*b-4*a*c;
        double x1=(-b+Math.sqrt(D))/2*a;
        double x2=(-b-Math.sqrt(D))/2*a;
        if (a!=0)
        {
            if (D>=0)
            {

                System.out.println(x2+", "+x1);
            }
            else
            {
                System.out.println("Imaginary values");
            }
        }
        else if (b!=0)
        {
            System.out.println("X="+x1);
        }
        else if (c!=0)
        {
            System.out.println("No values");
        }
        else
        {
            System.out.println("Many values");
        }
    }
}
