
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[]args){

        int [] arr1={1,9,0,2};
        int [] arr2=reverseArray(arr1);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] reverseArray(int[] arr){
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;
        
    }

}
    

