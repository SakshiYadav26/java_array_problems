public class PairWithGivenSum {
    public static void main(String[]args){
        findPairWithGivenSum(10);

    }

    public static void findPairWithGivenSum(int number){
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,10};

        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr1[i]+arr2[j] == number){
                    System.out.println(arr1[i]+" + "+arr2[j]+" = "+number);
   
                }
            }
        }
   
    }   
}
 