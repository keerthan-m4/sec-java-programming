public class Q18 {
    public static void main(String[] args) {
        int start = 100, end = 1000;

        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}