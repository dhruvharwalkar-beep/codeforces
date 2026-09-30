import java.util.*;
 
public class main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int runs = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    runs++;
                }
            }
 
            int answer = runs;
 
            for (int i = 1; i < n - 1; i++) {
                int newRuns = runs;
 
                if (s.charAt(i - 1) != s.charAt(i)) {
                    newRuns--;
                }
 
                if (s.charAt(i) != s.charAt(i + 1)) {
                    newRuns--;
                }
 
                if (s.charAt(i - 1) != s.charAt(i + 1)) {
                    newRuns++;
                }
 
                answer = Math.min(answer, newRuns);
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}