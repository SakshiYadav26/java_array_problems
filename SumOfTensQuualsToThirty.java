import java.util.*;

public class TotalOfTensEqualsToThirties {
  public static void main(String[]args){
    
   System.out.println(totalTensEqualToThirties(new int[]{10,2,10,4,10}));
    
   
    
  }
  
 public static boolean totalTensEqualToThirties(int[]arr){
   
   int exp_sum=30;
   int sum=0;
   
   for(int i=0;i<arr.length;i++){
     if(arr[i]==10){
       sum+=arr[i];
     }
   }
   if(sum== exp_sum){
     return true;
   }
   return false;
   
   
   
 }
  
 


}
    
    

