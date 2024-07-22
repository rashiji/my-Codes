import java.util.Scanner;

public class AreaOfTriangleHerons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length :");
        double l = sc.nextDouble();
        System.out.println("enter the breadth :");
        double b = sc.nextDouble();
        System.out.println("enter the height :");
        double h = sc.nextDouble();
        double s = (l+b+h)/2.0d;
        double Area= Math.sqrt(s*(s-l)*(s-b)*(s-h));
        System.out.println("the area of triangle =" + Area);
    }

}
