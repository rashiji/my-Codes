//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayRotation {
//
//    public static void main(Dema[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        // Input array elements
//        for (int i = 0; i < size; i++) {
//            int nums = sc.nextInt();
//            arr[i] = nums;
//        }
//
//        // Perform left rotation by one position
//
//        int temp = arr[0];
//        for (int i = 0; i < size-1; i++) {
//            arr[i]=arr[i+1];
//        }
//
//        arr[size - 1] = temp;
//
//        // Print the rotated array
//        System.out.println(Arrays.toString(arr));
//        }
//    }
