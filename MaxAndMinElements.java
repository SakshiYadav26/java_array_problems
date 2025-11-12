public class MaxAndMinElements {
    public static void main(String[]args){
        int [] arr1={1,9,0,2};
        System.out.println(minElement(arr1));
        System.out.println(maxElement(arr1));
        

    }

    public static int minElement(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length;i++){

            if(min > arr[i]){
                min = arr[i];

            }
           
        }
        return min;
        
    }

    public static int maxElement(int[] arr){
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max= arr[i];
            }
        }
        return max;
        
    }
    
}
