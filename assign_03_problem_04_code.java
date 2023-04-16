//mohamed hamed 
//20176672
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int sum = 0;
            for (int i = x; y > 0; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    y--;
                }
            }
            
            System.out.println(sum);
        }
    }
}
