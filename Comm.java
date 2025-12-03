import java.util.*;
import java.util.stream.Collectors;

public class Comm{
    public static void main(String[]args){

        ArrayList<Integer> ans = commonElementsIn3SortedArray(new int[]{1,2,3,4}, new int[]{1,2,3,5,6}, new int[]{1,2,3,8,9});

        System.out.println(ans);


    }

    public  static ArrayList<Integer> commonElementsIn3SortedArray(int[] arr1, int[] arr2, int[] arr3){

        List<Integer> list1 = Arrays.stream(arr1) // Create an IntStream from the int array
                                            .boxed() // Convert primitive int values to Integer objects
                                            .collect(Collectors.toCollection(ArrayList::new)); // Collect into a new ArrayList

        List<Integer> list2 = Arrays.stream(arr2) // Create an IntStream from the int array
                                            .boxed() // Convert primitive int values to Integer objects
                                            .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> list3 = Arrays.stream(arr3) // Create an IntStream from the int array
                                            .boxed() // Convert primitive int values to Integer objects
                                            .collect(Collectors.toCollection(ArrayList::new));


        TreeMap<Integer,Integer> map= new TreeMap<>();

        for(int ele : list1){
            map.put(ele,1);
        }

        for(int ele : list2){
            if(map.containsKey(ele) && map.get(ele)==1){
                map.put(ele, 2);
            }
        }

        for(int ele : list3){
            if(map.containsKey(ele) && map.get(ele)==2){
                map.put(ele, 3);
            }
        }

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int ele : map.keySet()){
            if(map.get(ele)== 3){
                arrList.add(ele);
            }
        }

        return arrList;


    }
}