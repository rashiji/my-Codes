import java.util.Scanner;

public class Palindrone {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,temp=n;
        while (n!=0){
            int last = n%10;
            rev= rev*10 + last;
            n=n/10;

        }
        if(rev==temp)
        System.out.println("palindrome number");
        else
            System.out.println("non palindrome number");
    }
}
