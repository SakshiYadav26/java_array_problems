public class SecondSmallestElement {
    public static void main(String[]args){
        System.out.println(secondSmallestElement(new int[]{1,2,3,4}));
        

    }

    public static int secondSmallestElement(int [] arr){
        int currMin=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i : arr){
            if(min>i){
                currMin=min;
                min=i;
            }else if (i < min && i != currMin) {
                
                min = i;
            }
            
        }
        return min;
    }
    
}
