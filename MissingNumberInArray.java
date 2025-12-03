public class MissingNumberInArray {
    public static void main(String[] args) {

        System.out.println(findMissingNumberInArray(new int[]{1,3,4,5}));
        
    }

    public static int findMissingNumberInArray(int[] arr) {

        int n = arr.length + 1;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        int exp_sum = n * (n + 1) / 2;

        return (exp_sum - sum);

    }

}
