public class Q20 {
    public static void main(String[] args) {
        int num = 25;
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * place;
            place *= 10;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }
}