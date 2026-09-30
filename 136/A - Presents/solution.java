import java.util.*;
 
public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] p = new int[n];
 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            p[x - 1] = i + 1;
        }
 
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        sc.close();
    }
}