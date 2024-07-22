import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicateElement {
    public static void main(String [] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new  int[size];

        for (int i=0 ; i<arr.length ; i++)
        {
            int input = sc.nextInt();
             arr[i]=input;
        }
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }

            }
        }
    }
}


