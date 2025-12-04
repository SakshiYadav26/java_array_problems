import java.util.*;

public class ArrayExcludingZeroAndMinusOne {
  public static void main(String[]args){
    
    System.out.println(arrayExcludingZeroMinusOne(new int[]{1,2,3}));
    
   
    
  }
  
  public static boolean arrayExcludingZeroMinusOne(int[] arr){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0 || arr[i]== -1){
        return true;
      }
    }
    return false;
  }
  
 


}
    
    

