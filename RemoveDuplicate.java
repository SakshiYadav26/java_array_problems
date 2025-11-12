public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 3 };

        System.out.println(findDuplicateElement(arr1));

    }

    public static boolean findDuplicateElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                   if (arr[i] == arr[j] && i != j) {
                    return true;
                }
                
            }
        }
        return false;
    }

}
