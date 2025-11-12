public class ReturnIndexOfArray{
    public static void main(String[]args){

        int [] arr1={1,2,3,4,5,6};

        int ans=returnIndexOfElement(arr1, 5);
        System.out.println(ans);

    }

    public static int returnIndexOfElement(int[] arr, int element){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return 0;
    }
}