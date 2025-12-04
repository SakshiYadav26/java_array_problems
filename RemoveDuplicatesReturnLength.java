import java.util.*;

public class TotalOfTensEqualsToThirties {
  public static void main(String[]args){
   System.out.println(RemoveDuplicatesArrayElements(new int[]{1,2,2,3,4,5,5}));
    
  
  }
  
  public static int RemoveDuplicatesArrayElements(int[]arr){
    HashSet<Integer> set= new HashSet<>();
    
    for(int i : arr){
      set.add(i);
    }
    
    System.out.println(set);
    
    return set.size();
  }
  
  
  
  
 
  
 


}
    
    

