public class Q19 {
    public static void main(String[] args) {
        int start = 10, end = 50;
        int count = 0;

        System.out.println("Prime numbers:");

        for (int n = start; n <= end; n++) {
            boolean prime = true;

            if (n < 2)
                prime = false;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(n + " ");
                count++;
            }
        }

        System.out.println("\nCount: " + count);
    }
}