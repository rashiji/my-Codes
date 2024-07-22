import java.util.Scanner;

public class Arearect {
    public static void main(String [] args) {
       Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double a= Sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double b= Sc.nextDouble();
        double Area = a*b;
        System.out.println("The area of the rectangle is : "+ (Area));
        double Peri = 2*(a+b);
        System.out.println("The parameter of the rectangle is : "+ (Peri));
    }
    }