import java.util.Arrays;

public class InsertAnElement{
    public static void main(String[]args){

        int[] arr1={1,2,3,4,5};
        int[] arr2=insertAnElementInArray(arr1, 6, 4);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] insertAnElementInArray(int[] arr, int element, int index){

        int[] newArr=new int[arr.length+1];
        for(int i=0;i<=index-1;i++){
            newArr[i]=arr[i];
        }
        newArr[index]=element;

        for(int i=index;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }

        return newArr;
        
    }
}