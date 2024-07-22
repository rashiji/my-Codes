import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            int nums = sc.nextInt();
            arr[i] = nums;
        }
        // Output array
        int k =4;
        for (int i =0 ; i<k ; i++)
        {
            int temp = arr[0];
            for (int j=0; j<size-1 ; j++)
            {
                arr[j]=arr[j+1];

            }
            arr[size-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
