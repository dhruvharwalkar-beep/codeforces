import java.util.*;
 
public class main50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
 
            int maxnumbers = Math.min(a1, Math.min(a2, a3));
            int weak = n - maxnumbers;
            System.out.println(weak);
 
        }
 
        sc.close();
    }
}