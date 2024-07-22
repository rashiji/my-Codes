import java.util.Scanner;

public class CircumferenceAndAreaOFCircle {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius:");
        double rad = sc.nextDouble();
        System.out.println("circumference=" + 2*Math.PI*rad);
        System.out.println("Area=" + Math.PI*Math.pow(rad,2));
    }
}
