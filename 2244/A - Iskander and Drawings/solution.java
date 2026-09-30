import java.util.Scanner;
 
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            String s = sc.next();
 
            int ans = 0;
            int cnt = 0;
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    cnt++;
                } else {
                    ans = Math.max(ans, (cnt + 1) / 2);
                    cnt = 0;
                }
            }
 
 
            ans = Math.max(ans, (cnt + 1) / 2);
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}