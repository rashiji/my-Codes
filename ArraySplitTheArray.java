import java.util.Arrays;
public class ArraySplitTheArray {
    public static void main(String [] args) {
        int arr[]= {3,2,3,2,2,2};
       int pair= 0;

        Arrays.sort(arr);
        for(int i=0 ; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1]){
                pair++;
             }
        }
        System.out.println( arr.length/2==pair);

    }
}
   //import java.util.Arrays;

//public class ArraySplitTheArray {
//    public static void main(Dema[] args) {
//        int arr[] = {3, 2, 3, 2, 2, 2};
//        int pair = 0;
//
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                pair++;
//                //i++; // Skip the next element since it's part of the pair
//            }
//        }
//
//        // Check if the array can be split into two equal parts based on pairs
//        System.out.println(arr.length / 2 == pair);
//    }
//}
