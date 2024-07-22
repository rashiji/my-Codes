import java.util.Scanner;

public class Array_Add_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 20, 5, 78, 30};
        System.out.println("Enter the position and element: ");
        int position = sc.nextInt();
        int element = sc.nextInt();

        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newarr[i] = arr[i];
        }
        newarr[position] = element;

        for (int i = position + 1; i < newarr.length; i++) {
            newarr[i] = arr[i - 1];
        }

        System.out.println("Array after insertion:");
        for (int num : newarr) {
            System.out.print(num + " ");
        }
    }
}
