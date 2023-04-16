//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Shape2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
 
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n*i; j++) {
                System.out.print(" ");
            }
            // print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // print numbers in decreasing order
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
