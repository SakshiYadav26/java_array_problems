import java.util.*;

public class DiffBtwMaxMinElements {

    public static void main(String[]args){
      
      System.out.println(diffMaxMinValue(new int[]{1,2,3,4,5}));
      
    }
    
    public static int diffMaxMinValue(int[] arr){
      
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      
      
      for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
          max=arr[i];
        }
      }
      
      for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
          min=arr[i];
        }
      }
      
      return (max-min);
      
      
    }
    
    
}
