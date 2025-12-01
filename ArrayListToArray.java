import java.util.*;

public class ArrayListToArray {
    public static void main(String[]args){
        printArrayListToArray();

    }
    public static void printArrayListToArray(){
        List<String> list= new ArrayList<>();

        list.add("Mango");
        list.add("apple");
        list.add("guava");
        list.add("grapes");

        String[] str= new String[list.size()];
        list.toArray(str);

        for(String s : str){
            System.out.println(s);
        }

    }
}
