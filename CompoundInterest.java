import java.util.Scanner;

public class CompoundInterest {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal , Rate and Time:");
        double pi= sc.nextDouble();
        double rt= sc.nextDouble();
        double ti= sc.nextDouble();
        double C_Interest = pi* Math.pow(1.0+ rt/100.0,ti);
        System.out.println("the compound interest= "+ C_Interest);
        double SI_Interest = (pi*rt*ti)/100;
        System.out.println("the simple interest="+ SI_Interest);
    }
}
