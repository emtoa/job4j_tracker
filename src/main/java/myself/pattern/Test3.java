package myself.pattern;

public class Test3 {
    public static void main(String[] args) {
        int[][] intarr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] arr : intarr) {
            for (int value : arr) {
                System.out.println(value);
            }
        }
    }
}
