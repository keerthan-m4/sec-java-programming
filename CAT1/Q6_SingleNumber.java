public class Q6_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int result = 0;

        for (int n : nums)
            result ^= n;

        System.out.println("Single Number: " + result);
    }
}