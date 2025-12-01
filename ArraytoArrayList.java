
import java.util.*;

public class ArraytoArrayList {
    public static void main(String[]args){
       arrayToArraylistMethod(new String[]{"Hi","bye","cool"});
    }

    public static void arrayToArraylistMethod(String[] str){
        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(str));

        System.out.println(arrayList);
        
        

    }
    
}
