public class ArrayPlusOne {
    public static void main(String [] args) {

        int arr[] = {4,3,2,1};

        for(int i= arr.length-1 ; i>=0 ; i--)
        {
            if (arr[i]<9)
            {
                arr[i]++;
            }
            else {
                arr[i] = 0;
            }
        }
        for(int j : arr){
            System.out.print( j + " ");
        }
        System.out.println();
        int arr2[]=new int[arr.length+1];
        arr2[0]=1;
        for(int j : arr2)
        {
            System.out.print( j + " ");
        }



    }
}
