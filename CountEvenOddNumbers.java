import java.util.*;

public class CountEvenAndOddNumbers {

    public static void main(String[]args){
      
      int [] ans=countEvenOddNumbers(new int[]{1,2,3,4,5});
      for(int i: ans){
        System.out.println(i);
      }

    }

    public static int[] countEvenOddNumbers(int[] arr){
        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
       return new int[]{evenCount,oddCount}; 
    }
    
    
}
