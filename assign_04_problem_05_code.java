//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
 
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j] + j - i;
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
            }
            System.out.println(minSum);
        }
    }
}
