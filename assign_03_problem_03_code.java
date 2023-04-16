//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(count + " ");
            System.out.print(count + 1 + " ");
            System.out.print(count + 2 + " ");
            System.out.print("PUM\n");
            count += 4;
        }
    }
}
