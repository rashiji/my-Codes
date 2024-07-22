import java.util.Scanner;

public class ArraySEcondMax {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={18,5,10, 78,65, 89};
        int max=Math.max(arr[0],arr[1]);
        int Smax= Math.min(arr[0],arr[1]);
        for (int i=0; i< arr.length; i++)
        {
            if (arr[i]>max){
                Smax= max;
                max= arr[i];
            } else if (arr[i]>Smax ){
                Smax=arr[i];
            }

        }
        System.out.println(Smax);
    }
}
