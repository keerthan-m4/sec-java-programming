public class Q7_ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;

        if (mat.length * mat[0].length != r * c) {
            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }
            return;
        }

        int[][] result = new int[r][c];
        int index = 0;

        for (int[] row : mat) {
            for (int n : row) {
                result[index / c][index % c] = n;
                index++;
            }
        }

        for (int[] row : result) {
            for (int n : row)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}