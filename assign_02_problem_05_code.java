//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int X = input.nextInt();
            boolean isPrime = true;
            if (X < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(X); i++) {
                    if (X % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
    }
}
