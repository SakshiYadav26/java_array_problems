public class EqualArrays {
    public static void main(String[] args) {
        System.out.println(equalElementArrays(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }));

    }

    public static boolean equalElementArrays(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    return true;
                }

            }

        }
        return false;
    }

}
