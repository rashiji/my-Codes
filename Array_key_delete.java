import java.util.Scanner;

public class Array_key_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Enter the key you want to delete:");
        int key = sc.nextInt();
        int index = -1;

        // Find the index of the key in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Create a new array with size one less than the original array
            int newarr[] = new int[arr.length - 1];

            // Copy elements from the original array to the new array
            int newIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newarr[newIndex++] = arr[i];
                }
            }

            System.out.println("New array after deletion:");
            for (int num : newarr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid key. Element not found in the array.");
        }
    }
}