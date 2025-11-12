import java.util.Arrays;

public class copyArray {
    public static void main(String[]args){

        int [] arr1={1,2,3,4};
        int [] ans=copyOfArray(arr1);
        System.out.println(Arrays.toString(ans));
        

    }

    public static int[] copyOfArray(int [] arr){
        int [] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
        
    }
    
}

    // int[] original = {1, 2, 3, 4, 5};
    // int[] copied = new int[original.length];
    // System.arraycopy(original, 0, copied, 0, original.length);
    // Parameters: sourceArray, sourcePosition, destinationArray, destinationPosition, length


    

    // int[] original = {1, 2, 3};
    // int[] copied = Arrays.copyOf(original, original.length);

    // int[] original = {1, 2, 3};
    // int[] copied = original.clone();