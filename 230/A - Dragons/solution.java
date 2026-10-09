import java.util.*;
 
public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[][] power = new int[n][2];
        boolean bl = true;
 
        for (int i = 0; i < n; i++) {
            power[i][0] = sc.nextInt();
            power[i][1] = sc.nextInt();
        }
 
        Arrays.sort(power, (a, b) -> Integer.compare(a[0], b[0]));
 
        for (int i = 0; i < n; i++) {
            if (s > power[i][0]) {
                s += power[i][1];
            } else {
                bl = false;
                break;
            }
        }
 
        System.out.println(bl ? "YES" : "NO");
    }
 
    public static void main(String[] args) {
        solve();
    }
}