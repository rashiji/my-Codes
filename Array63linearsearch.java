public class Array63linearsearch {
    public static void main(String [] args) {
        int arr[]={7,4,58,5,9};
        int key=5;
        int index=-1;
      /*  for(int i= 0;i<arr.length; i++){
            if (arr[i]==key){
                index= i;   // linear search
                break;
            }


        }*/
        int start=0, end=arr.length-1;   //// not completed
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                index=mid;
                break;

            }
            if(arr[mid]>key){
            }
        }
    }
}
