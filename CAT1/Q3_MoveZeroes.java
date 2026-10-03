public class Q3_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int index = 0;

        for (int n : nums) {
            if (n != 0)
                nums[index++] = n;
        }

        while (index < nums.length)
            nums[index++] = 0;

        for (int n : nums)
            System.out.print(n + " ");
    }
}