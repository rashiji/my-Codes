import java.util.Scanner;

public class EvenOdd {
    public static boolean find(int num) {

        return (num % 2 == 0);

    }

    public static void main(String[] args) {
        System.out.println(" enter the number to check even or odd ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num+" is even number");
            //return "even" ;
        } else {
            System.out.println(num+" is odd number");
            // return "odd";
            find(num);
        }
    }
}