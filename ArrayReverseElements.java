import java.util.Scanner;

public class ArrayReverseElements {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={12,45,6,73,3};
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }

        System.out.println(arr[i]);

       /* int temp[]=new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0 ; i--)
        {
            temp[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));*/
    }
}
