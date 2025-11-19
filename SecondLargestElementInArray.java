public class SecondLargestElementInArray {
    public static void main(String[]args){
        System.out.println(secondMaxElement(new int []{2,3,4,5}));

    }

    public static int secondMaxElement(int [] arr){
        int currMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE; 

        for(int i: arr){
            if(max<i){
                currMax=max;
                max=i;

            }
        }
        return currMax;
        
    } 
    
}
