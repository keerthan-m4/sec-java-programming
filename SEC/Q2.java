public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}