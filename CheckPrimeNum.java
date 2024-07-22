import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int count=0;           //edge case 1 is non prime number
            for (int i = 1; i<=n ; i++) {
                if (n%i==0)
                {
                    count++;
                }
            }
        System.out.println(count==2 ? "prime" : "Non Prime");
    }
}
