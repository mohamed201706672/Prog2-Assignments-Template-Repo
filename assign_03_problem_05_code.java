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
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            
            System.out.println(sum);
        }
    }
}
