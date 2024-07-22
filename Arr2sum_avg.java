import java.util.Scanner;

public class Arr2sum_avg {
    public static void main(String [] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the " + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();                            // correction needed
        }
        double sum =0;
        for (int i =0; 1<arr.length; i++){
            sum=sum=arr[i];

        }
        System.out.println("sum="+ sum);
        System.out.println("avg="+ sum/n);
    }
}

