import java.util.*;

public class AvgExcludingMaxMin {
  public static void main(String[]args){
    
    System.out.println(avgExcludingMaxAndMinElements(new int[]{1,2,3,4,5}));
    
  }
  
  public static double avgExcludingMaxAndMinElements(int[] arr){
    if(arr.length < 3){
        return 0; 
    }
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    
    for(int i=0; i<arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];
        }
        sum += arr[i];
    }
    
    return (double)(sum - max - min) / (arr.length - 2);
}


}
    
    

