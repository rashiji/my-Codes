import java.util.Arrays;
import java.util.Scanner;

public class ArraySeparateZeroOne {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);        /// left side neg right side +ve
        int arr[]={1,-2,3,-4,5,-6,7};
        int i=0,j=0;
        while(i< arr.length){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                j++;
            }
           i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
