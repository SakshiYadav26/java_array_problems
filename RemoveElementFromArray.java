import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[]args){
        int [] arr1={1,2,3,4};
        int [] arr3=removeSpecificElement(arr1,2);
        System.out.println(Arrays.toString(arr3));

    }
    
    public static int[] removeSpecificElement(int[] arr, int element){
        int j=0;
        int [] arr2=new int[arr.length-1];
        for(int i=0;i<arr.length;i++){

            if(arr[i] == element){
                continue;
            }
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
}
