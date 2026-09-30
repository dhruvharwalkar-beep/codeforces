import java.util.*;
 
public class main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int common;
            if (a[0] == a[1] || a[0] == a[2]) {
                common = a[0];
            } else {
                common = a[1];
            }
 
            for (int i = 0; i < n; i++) {
                if (a[i] != common) {
                    sb.append(i + 1).append("
");
                    break;
                }
            }
        }
 
        System.out.print(sb);
        sc.close();
    }
}