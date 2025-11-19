
import java.util.*;

public class CommonElementInStringArray {
    public static void main(String[]args){

        String[] arr1 ={"aaa","bbb","ccc"};
        String[] arr2 ={"aaa","ddd","ccc"};

        commonElementsInTwoStringArray(arr1,arr2);

        

    }

    public static void commonElementsInTwoStringArray(String[] arr1, String[] arr2) {

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    set.add(arr1[i]);
                    break;

                }

            }
        }
        System.out.println(set.toString());
    }

    


}