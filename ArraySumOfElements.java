import java.util.Scanner;

public class ArraySumOfElements {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={18,5,10,78,9};
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i< arr.length; i++)
        {
            sum= sum+ arr[i];
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }

        }
        System.out.println("sum of indexes: "+sum);
        System.out.println("max value"+max);
        System.out.println("min value"+min);
    }
}
