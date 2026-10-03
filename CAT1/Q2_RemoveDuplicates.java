public class Q2_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[k++] = nums[i];
        }

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++)
            System.out.print(nums[i] + " ");
    }
}