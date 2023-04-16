//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
 
        for (int i = 1; i <= 12; i++) {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
