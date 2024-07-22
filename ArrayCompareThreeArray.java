import java.util.Scanner;

public class ArrayCompareThreeArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" enter the size of the elements");
        int size = sc.nextInt();

        int arr1[] = new  int[size];
        int arr2[] = new  int[size];
        int arr3[] = new  int[size];

        System.out.println("enter the elements of 1st arry");
        for (int i=0 ; i<arr1.length ; i++)
        {
            int input = sc.nextInt();
            arr1[i]=input;
        }
        System.out.println("enter the elements of 2nd arry");
        for (int i=0 ; i<arr2.length ; i++)
        {
            int input = sc.nextInt();
            arr2[i]=input;
        }
        System.out.println("enter the elements of 3rd arry");
        for (int i=0 ; i<arr3.length ; i++)
        {
            int input = sc.nextInt();
            arr3[i]=input;
        }

        for (int i = 0 ; i<size-1 ; i++)
        {
            for (int j=0 ; j<size-1 ; j++)
            {
                for (int k=0 ; k<size-1 ; k++)
                {

                    if (arr1[i]==arr2[j] && arr2[j]==arr3[k])
                        System.out.println("the common element is :"+ arr1[i]);
                     else
                        System.out.println("no match found");
                }
            }
        }
    }
}
